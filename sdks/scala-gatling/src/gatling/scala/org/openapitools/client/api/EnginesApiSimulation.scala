package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class EnginesApiSimulation extends Simulation {

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
    val engineDisablePerSecond = config.getDouble("performance.operationsPerSecond.engineDisable") * rateMultiplier * instanceMultiplier
    val engineEnablePerSecond = config.getDouble("performance.operationsPerSecond.engineEnable") * rateMultiplier * instanceMultiplier
    val enginePinPerSecond = config.getDouble("performance.operationsPerSecond.enginePin") * rateMultiplier * instanceMultiplier
    val engineUnpinPerSecond = config.getDouble("performance.operationsPerSecond.engineUnpin") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val engineDisableHEADERFeeder = csv(userDataDirectory + File.separator + "engineDisable-headerParams.csv").random
    val engineDisablePATHFeeder = csv(userDataDirectory + File.separator + "engineDisable-pathParams.csv").random
    val engineEnableHEADERFeeder = csv(userDataDirectory + File.separator + "engineEnable-headerParams.csv").random
    val engineEnablePATHFeeder = csv(userDataDirectory + File.separator + "engineEnable-pathParams.csv").random
    val enginePinHEADERFeeder = csv(userDataDirectory + File.separator + "enginePin-headerParams.csv").random
    val enginePinPATHFeeder = csv(userDataDirectory + File.separator + "enginePin-pathParams.csv").random
    val engineUnpinHEADERFeeder = csv(userDataDirectory + File.separator + "engineUnpin-headerParams.csv").random
    val engineUnpinPATHFeeder = csv(userDataDirectory + File.separator + "engineUnpin-pathParams.csv").random

    // Setup all scenarios

    
    val scnengineDisable = scenario("engineDisableSimulation")
        .feed(engineDisableHEADERFeeder)
        .feed(engineDisablePATHFeeder)
        .exec(http("engineDisable")
        .httpRequest("POST","/admin/engine/${engineId}/disable")
        .header("apikey","${apikey}")
)

    // Run scnengineDisable with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnengineDisable.inject(
        rampUsersPerSec(1) to(engineDisablePerSecond) during(rampUpSeconds),
        constantUsersPerSec(engineDisablePerSecond) during(durationSeconds),
        rampUsersPerSec(engineDisablePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnengineEnable = scenario("engineEnableSimulation")
        .feed(engineEnableHEADERFeeder)
        .feed(engineEnablePATHFeeder)
        .exec(http("engineEnable")
        .httpRequest("POST","/admin/engine/${engineId}/enable")
        .header("apikey","${apikey}")
)

    // Run scnengineEnable with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnengineEnable.inject(
        rampUsersPerSec(1) to(engineEnablePerSecond) during(rampUpSeconds),
        constantUsersPerSec(engineEnablePerSecond) during(durationSeconds),
        rampUsersPerSec(engineEnablePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnenginePin = scenario("enginePinSimulation")
        .feed(enginePinHEADERFeeder)
        .feed(enginePinPATHFeeder)
        .exec(http("enginePin")
        .httpRequest("POST","/admin/engine/${engineId}/pin")
        .header("apikey","${apikey}")
        .header("type","${type}")
)

    // Run scnenginePin with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnenginePin.inject(
        rampUsersPerSec(1) to(enginePinPerSecond) during(rampUpSeconds),
        constantUsersPerSec(enginePinPerSecond) during(durationSeconds),
        rampUsersPerSec(enginePinPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnengineUnpin = scenario("engineUnpinSimulation")
        .feed(engineUnpinHEADERFeeder)
        .feed(engineUnpinPATHFeeder)
        .exec(http("engineUnpin")
        .httpRequest("POST","/admin/engine/${engineId}/unpin")
        .header("apikey","${apikey}")
        .header("type","${type}")
)

    // Run scnengineUnpin with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnengineUnpin.inject(
        rampUsersPerSec(1) to(engineUnpinPerSecond) during(rampUpSeconds),
        constantUsersPerSec(engineUnpinPerSecond) during(durationSeconds),
        rampUsersPerSec(engineUnpinPerSecond) to(1) during(rampDownSeconds)
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
