package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ConfigApiSimulation extends Simulation {

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
    val configAuditLogPerSecond = config.getDouble("performance.operationsPerSecond.configAuditLog") * rateMultiplier * instanceMultiplier
    val configGetSkipHashPerSecond = config.getDouble("performance.operationsPerSecond.configGetSkipHash") * rateMultiplier * instanceMultiplier
    val configQuarantinePerSecond = config.getDouble("performance.operationsPerSecond.configQuarantine") * rateMultiplier * instanceMultiplier
    val configSanitizedRepoPerSecond = config.getDouble("performance.operationsPerSecond.configSanitizedRepo") * rateMultiplier * instanceMultiplier
    val configScanHistoryPerSecond = config.getDouble("performance.operationsPerSecond.configScanHistory") * rateMultiplier * instanceMultiplier
    val configSessionPerSecond = config.getDouble("performance.operationsPerSecond.configSession") * rateMultiplier * instanceMultiplier
    val configUpdatePerSecond = config.getDouble("performance.operationsPerSecond.configUpdate") * rateMultiplier * instanceMultiplier
    val configUpdateSkipHashPerSecond = config.getDouble("performance.operationsPerSecond.configUpdateSkipHash") * rateMultiplier * instanceMultiplier
    val configUpdateWebhookPerSecond = config.getDouble("performance.operationsPerSecond.configUpdateWebhook") * rateMultiplier * instanceMultiplier
    val configWebhookPerSecond = config.getDouble("performance.operationsPerSecond.configWebhook") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val configAuditLogHEADERFeeder = csv(userDataDirectory + File.separator + "configAuditLog-headerParams.csv").random
    val configGetSkipHashHEADERFeeder = csv(userDataDirectory + File.separator + "configGetSkipHash-headerParams.csv").random
    val configQuarantineHEADERFeeder = csv(userDataDirectory + File.separator + "configQuarantine-headerParams.csv").random
    val configSanitizedRepoHEADERFeeder = csv(userDataDirectory + File.separator + "configSanitizedRepo-headerParams.csv").random
    val configScanHistoryHEADERFeeder = csv(userDataDirectory + File.separator + "configScanHistory-headerParams.csv").random
    val configSessionHEADERFeeder = csv(userDataDirectory + File.separator + "configSession-headerParams.csv").random
    val configUpdateHEADERFeeder = csv(userDataDirectory + File.separator + "configUpdate-headerParams.csv").random
    val configUpdateSkipHashHEADERFeeder = csv(userDataDirectory + File.separator + "configUpdateSkipHash-headerParams.csv").random
    val configUpdateWebhookHEADERFeeder = csv(userDataDirectory + File.separator + "configUpdateWebhook-headerParams.csv").random
    val configWebhookHEADERFeeder = csv(userDataDirectory + File.separator + "configWebhook-headerParams.csv").random

    // Setup all scenarios

    
    val scnconfigAuditLog = scenario("configAuditLogSimulation")
        .feed(configAuditLogHEADERFeeder)
        .exec(http("configAuditLog")
        .httpRequest("PUT","/admin/config/auditlog")
        .header("apikey","${apikey}")
)

    // Run scnconfigAuditLog with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigAuditLog.inject(
        rampUsersPerSec(1) to(configAuditLogPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configAuditLogPerSecond) during(durationSeconds),
        rampUsersPerSec(configAuditLogPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigGetSkipHash = scenario("configGetSkipHashSimulation")
        .feed(configGetSkipHashHEADERFeeder)
        .exec(http("configGetSkipHash")
        .httpRequest("GET","/admin/config/skip")
        .header("apikey","${apikey}")
)

    // Run scnconfigGetSkipHash with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigGetSkipHash.inject(
        rampUsersPerSec(1) to(configGetSkipHashPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configGetSkipHashPerSecond) during(durationSeconds),
        rampUsersPerSec(configGetSkipHashPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigQuarantine = scenario("configQuarantineSimulation")
        .feed(configQuarantineHEADERFeeder)
        .exec(http("configQuarantine")
        .httpRequest("PUT","/admin/config/quarantine")
        .header("apikey","${apikey}")
)

    // Run scnconfigQuarantine with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigQuarantine.inject(
        rampUsersPerSec(1) to(configQuarantinePerSecond) during(rampUpSeconds),
        constantUsersPerSec(configQuarantinePerSecond) during(durationSeconds),
        rampUsersPerSec(configQuarantinePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigSanitizedRepo = scenario("configSanitizedRepoSimulation")
        .feed(configSanitizedRepoHEADERFeeder)
        .exec(http("configSanitizedRepo")
        .httpRequest("PUT","/admin/config/sanitize")
        .header("apikey","${apikey}")
)

    // Run scnconfigSanitizedRepo with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigSanitizedRepo.inject(
        rampUsersPerSec(1) to(configSanitizedRepoPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configSanitizedRepoPerSecond) during(durationSeconds),
        rampUsersPerSec(configSanitizedRepoPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigScanHistory = scenario("configScanHistorySimulation")
        .feed(configScanHistoryHEADERFeeder)
        .exec(http("configScanHistory")
        .httpRequest("PUT","/admin/config/scanhistory")
        .header("apikey","${apikey}")
)

    // Run scnconfigScanHistory with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigScanHistory.inject(
        rampUsersPerSec(1) to(configScanHistoryPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configScanHistoryPerSecond) during(durationSeconds),
        rampUsersPerSec(configScanHistoryPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigSession = scenario("configSessionSimulation")
        .feed(configSessionHEADERFeeder)
        .exec(http("configSession")
        .httpRequest("PUT","/admin/config/session")
        .header("apikey","${apikey}")
)

    // Run scnconfigSession with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigSession.inject(
        rampUsersPerSec(1) to(configSessionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configSessionPerSecond) during(durationSeconds),
        rampUsersPerSec(configSessionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigUpdate = scenario("configUpdateSimulation")
        .feed(configUpdateHEADERFeeder)
        .exec(http("configUpdate")
        .httpRequest("PUT","/admin/config/update")
        .header("apikey","${apikey}")
)

    // Run scnconfigUpdate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigUpdate.inject(
        rampUsersPerSec(1) to(configUpdatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(configUpdatePerSecond) during(durationSeconds),
        rampUsersPerSec(configUpdatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigUpdateSkipHash = scenario("configUpdateSkipHashSimulation")
        .feed(configUpdateSkipHashHEADERFeeder)
        .exec(http("configUpdateSkipHash")
        .httpRequest("PUT","/admin/config/skip")
        .header("apikey","${apikey}")
)

    // Run scnconfigUpdateSkipHash with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigUpdateSkipHash.inject(
        rampUsersPerSec(1) to(configUpdateSkipHashPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configUpdateSkipHashPerSecond) during(durationSeconds),
        rampUsersPerSec(configUpdateSkipHashPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigUpdateWebhook = scenario("configUpdateWebhookSimulation")
        .feed(configUpdateWebhookHEADERFeeder)
        .exec(http("configUpdateWebhook")
        .httpRequest("PUT","/admin/config/webhook")
        .header("apikey","${apikey}")
)

    // Run scnconfigUpdateWebhook with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigUpdateWebhook.inject(
        rampUsersPerSec(1) to(configUpdateWebhookPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configUpdateWebhookPerSecond) during(durationSeconds),
        rampUsersPerSec(configUpdateWebhookPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnconfigWebhook = scenario("configWebhookSimulation")
        .feed(configWebhookHEADERFeeder)
        .exec(http("configWebhook")
        .httpRequest("GET","/admin/config/webhook")
        .header("apikey","${apikey}")
)

    // Run scnconfigWebhook with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnconfigWebhook.inject(
        rampUsersPerSec(1) to(configWebhookPerSecond) during(rampUpSeconds),
        constantUsersPerSec(configWebhookPerSecond) during(durationSeconds),
        rampUsersPerSec(configWebhookPerSecond) to(1) during(rampDownSeconds)
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
