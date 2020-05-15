package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BatchApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("http://localhost:8008")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val batchCancelPerSecond = config.getDouble("performance.operationsPerSecond.batchCancel") * rateMultiplier * instanceMultiplier
    val batchClosePerSecond = config.getDouble("performance.operationsPerSecond.batchClose") * rateMultiplier * instanceMultiplier
    val batchCreatePerSecond = config.getDouble("performance.operationsPerSecond.batchCreate") * rateMultiplier * instanceMultiplier
    val batchSignedResultPerSecond = config.getDouble("performance.operationsPerSecond.batchSignedResult") * rateMultiplier * instanceMultiplier
    val batchStatusPerSecond = config.getDouble("performance.operationsPerSecond.batchStatus") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val batchCancelHEADERFeeder = csv(userDataDirectory + File.separator + "batchCancel-headerParams.csv").random
    val batchCancelPATHFeeder = csv(userDataDirectory + File.separator + "batchCancel-pathParams.csv").random
    val batchCloseHEADERFeeder = csv(userDataDirectory + File.separator + "batchClose-headerParams.csv").random
    val batchClosePATHFeeder = csv(userDataDirectory + File.separator + "batchClose-pathParams.csv").random
    val batchCreateHEADERFeeder = csv(userDataDirectory + File.separator + "batchCreate-headerParams.csv").random
    val batchSignedResultHEADERFeeder = csv(userDataDirectory + File.separator + "batchSignedResult-headerParams.csv").random
    val batchSignedResultPATHFeeder = csv(userDataDirectory + File.separator + "batchSignedResult-pathParams.csv").random
    val batchStatusHEADERFeeder = csv(userDataDirectory + File.separator + "batchStatus-headerParams.csv").random
    val batchStatusPATHFeeder = csv(userDataDirectory + File.separator + "batchStatus-pathParams.csv").random

    // Setup all scenarios

    
    val scnbatchCancel = scenario("batchCancelSimulation")
        .feed(batchCancelHEADERFeeder)
        .feed(batchCancelPATHFeeder)
        .exec(http("batchCancel")
        .httpRequest("POST","/file/${batchId}/cancel")
        .header("apikey","${apikey}")
)

    // Run scnbatchCancel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbatchCancel.inject(
        rampUsersPerSec(1) to(batchCancelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(batchCancelPerSecond) during(durationSeconds),
        rampUsersPerSec(batchCancelPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbatchClose = scenario("batchCloseSimulation")
        .feed(batchCloseHEADERFeeder)
        .feed(batchClosePATHFeeder)
        .exec(http("batchClose")
        .httpRequest("POST","/file/batch/${batchId}/close")
        .header("apikey","${apikey}")
)

    // Run scnbatchClose with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbatchClose.inject(
        rampUsersPerSec(1) to(batchClosePerSecond) during(rampUpSeconds),
        constantUsersPerSec(batchClosePerSecond) during(durationSeconds),
        rampUsersPerSec(batchClosePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbatchCreate = scenario("batchCreateSimulation")
        .feed(batchCreateHEADERFeeder)
        .exec(http("batchCreate")
        .httpRequest("POST","/file/batch")
        .header("apikey","${apikey}")
        .header("user_agent","${user_agent}")
        .header("user-data","${user-data}")
        .header("rule","${rule}")
)

    // Run scnbatchCreate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbatchCreate.inject(
        rampUsersPerSec(1) to(batchCreatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(batchCreatePerSecond) during(durationSeconds),
        rampUsersPerSec(batchCreatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbatchSignedResult = scenario("batchSignedResultSimulation")
        .feed(batchSignedResultHEADERFeeder)
        .feed(batchSignedResultPATHFeeder)
        .exec(http("batchSignedResult")
        .httpRequest("GET","/file/batch/${batchId}/certificate")
        .header("apikey","${apikey}")
)

    // Run scnbatchSignedResult with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbatchSignedResult.inject(
        rampUsersPerSec(1) to(batchSignedResultPerSecond) during(rampUpSeconds),
        constantUsersPerSec(batchSignedResultPerSecond) during(durationSeconds),
        rampUsersPerSec(batchSignedResultPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnbatchStatus = scenario("batchStatusSimulation")
        .feed(batchStatusHEADERFeeder)
        .feed(batchStatusPATHFeeder)
        .exec(http("batchStatus")
        .httpRequest("GET","/file/batch/${batchId}")
        .header("apikey","${apikey}")
)

    // Run scnbatchStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnbatchStatus.inject(
        rampUsersPerSec(1) to(batchStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(batchStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(batchStatusPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
