package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class YaraApiSimulation extends Simulation {

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
    val yaraPackageGeneratePerSecond = config.getDouble("performance.operationsPerSecond.yaraPackageGenerate") * rateMultiplier * instanceMultiplier
    val yaraPackageStatusPerSecond = config.getDouble("performance.operationsPerSecond.yaraPackageStatus") * rateMultiplier * instanceMultiplier
    val yaraSourcesGetPerSecond = config.getDouble("performance.operationsPerSecond.yaraSourcesGet") * rateMultiplier * instanceMultiplier
    val yaraSourcesPutPerSecond = config.getDouble("performance.operationsPerSecond.yaraSourcesPut") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val yaraPackageGenerateHEADERFeeder = csv(userDataDirectory + File.separator + "yaraPackageGenerate-headerParams.csv").random
    val yaraPackageStatusHEADERFeeder = csv(userDataDirectory + File.separator + "yaraPackageStatus-headerParams.csv").random
    val yaraSourcesGetHEADERFeeder = csv(userDataDirectory + File.separator + "yaraSourcesGet-headerParams.csv").random
    val yaraSourcesPutHEADERFeeder = csv(userDataDirectory + File.separator + "yaraSourcesPut-headerParams.csv").random

    // Setup all scenarios

    
    val scnyaraPackageGenerate = scenario("yaraPackageGenerateSimulation")
        .feed(yaraPackageGenerateHEADERFeeder)
        .exec(http("yaraPackageGenerate")
        .httpRequest("PUT","/yara/generate")
        .header("apikey","${apikey}")
)

    // Run scnyaraPackageGenerate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnyaraPackageGenerate.inject(
        rampUsersPerSec(1) to(yaraPackageGeneratePerSecond) during(rampUpSeconds),
        constantUsersPerSec(yaraPackageGeneratePerSecond) during(durationSeconds),
        rampUsersPerSec(yaraPackageGeneratePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnyaraPackageStatus = scenario("yaraPackageStatusSimulation")
        .feed(yaraPackageStatusHEADERFeeder)
        .exec(http("yaraPackageStatus")
        .httpRequest("GET","/yara/package")
        .header("apikey","${apikey}")
)

    // Run scnyaraPackageStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnyaraPackageStatus.inject(
        rampUsersPerSec(1) to(yaraPackageStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(yaraPackageStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(yaraPackageStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnyaraSourcesGet = scenario("yaraSourcesGetSimulation")
        .feed(yaraSourcesGetHEADERFeeder)
        .exec(http("yaraSourcesGet")
        .httpRequest("GET","/admin/config/yara/sources")
        .header("apikey","${apikey}")
)

    // Run scnyaraSourcesGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnyaraSourcesGet.inject(
        rampUsersPerSec(1) to(yaraSourcesGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(yaraSourcesGetPerSecond) during(durationSeconds),
        rampUsersPerSec(yaraSourcesGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnyaraSourcesPut = scenario("yaraSourcesPutSimulation")
        .feed(yaraSourcesPutHEADERFeeder)
        .exec(http("yaraSourcesPut")
        .httpRequest("PUT","/admin/config/yara/sources")
        .header("apikey","${apikey}")
)

    // Run scnyaraSourcesPut with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnyaraSourcesPut.inject(
        rampUsersPerSec(1) to(yaraSourcesPutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(yaraSourcesPutPerSecond) during(durationSeconds),
        rampUsersPerSec(yaraSourcesPutPerSecond) to(1) during(rampDownSeconds)
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
