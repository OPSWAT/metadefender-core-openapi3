package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class AnalysisApiSimulation extends Simulation {

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
    val analysisRulesPerSecond = config.getDouble("performance.operationsPerSecond.analysisRules") * rateMultiplier * instanceMultiplier
    val fileAnalysisCancelPerSecond = config.getDouble("performance.operationsPerSecond.fileAnalysisCancel") * rateMultiplier * instanceMultiplier
    val fileAnalysisGetPerSecond = config.getDouble("performance.operationsPerSecond.fileAnalysisGet") * rateMultiplier * instanceMultiplier
    val fileAnalysisPostPerSecond = config.getDouble("performance.operationsPerSecond.fileAnalysisPost") * rateMultiplier * instanceMultiplier
    val sanitizedFilePerSecond = config.getDouble("performance.operationsPerSecond.sanitizedFile") * rateMultiplier * instanceMultiplier
    val webhookStatusPerSecond = config.getDouble("performance.operationsPerSecond.webhookStatus") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val analysisRulesHEADERFeeder = csv(userDataDirectory + File.separator + "analysisRules-headerParams.csv").random
    val fileAnalysisCancelHEADERFeeder = csv(userDataDirectory + File.separator + "fileAnalysisCancel-headerParams.csv").random
    val fileAnalysisCancelPATHFeeder = csv(userDataDirectory + File.separator + "fileAnalysisCancel-pathParams.csv").random
    val fileAnalysisGetHEADERFeeder = csv(userDataDirectory + File.separator + "fileAnalysisGet-headerParams.csv").random
    val fileAnalysisGetPATHFeeder = csv(userDataDirectory + File.separator + "fileAnalysisGet-pathParams.csv").random
    val fileAnalysisPostHEADERFeeder = csv(userDataDirectory + File.separator + "fileAnalysisPost-headerParams.csv").random
    val sanitizedFileHEADERFeeder = csv(userDataDirectory + File.separator + "sanitizedFile-headerParams.csv").random
    val sanitizedFilePATHFeeder = csv(userDataDirectory + File.separator + "sanitizedFile-pathParams.csv").random
    val webhookStatusHEADERFeeder = csv(userDataDirectory + File.separator + "webhookStatus-headerParams.csv").random
    val webhookStatusPATHFeeder = csv(userDataDirectory + File.separator + "webhookStatus-pathParams.csv").random

    // Setup all scenarios

    
    val scnanalysisRules = scenario("analysisRulesSimulation")
        .feed(analysisRulesHEADERFeeder)
        .exec(http("analysisRules")
        .httpRequest("GET","/file/rules")
        .header("user_agent","${user_agent}")
)

    // Run scnanalysisRules with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnanalysisRules.inject(
        rampUsersPerSec(1) to(analysisRulesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(analysisRulesPerSecond) during(durationSeconds),
        rampUsersPerSec(analysisRulesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfileAnalysisCancel = scenario("fileAnalysisCancelSimulation")
        .feed(fileAnalysisCancelHEADERFeeder)
        .feed(fileAnalysisCancelPATHFeeder)
        .exec(http("fileAnalysisCancel")
        .httpRequest("POST","/file/${data_id}/cancel")
        .header("apikey","${apikey}")
)

    // Run scnfileAnalysisCancel with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfileAnalysisCancel.inject(
        rampUsersPerSec(1) to(fileAnalysisCancelPerSecond) during(rampUpSeconds),
        constantUsersPerSec(fileAnalysisCancelPerSecond) during(durationSeconds),
        rampUsersPerSec(fileAnalysisCancelPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfileAnalysisGet = scenario("fileAnalysisGetSimulation")
        .feed(fileAnalysisGetHEADERFeeder)
        .feed(fileAnalysisGetPATHFeeder)
        .exec(http("fileAnalysisGet")
        .httpRequest("GET","/file/${data_id}")
        .header("apikey","${apikey}")
)

    // Run scnfileAnalysisGet with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfileAnalysisGet.inject(
        rampUsersPerSec(1) to(fileAnalysisGetPerSecond) during(rampUpSeconds),
        constantUsersPerSec(fileAnalysisGetPerSecond) during(durationSeconds),
        rampUsersPerSec(fileAnalysisGetPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnfileAnalysisPost = scenario("fileAnalysisPostSimulation")
        .feed(fileAnalysisPostHEADERFeeder)
        .exec(http("fileAnalysisPost")
        .httpRequest("POST","/file")
        .header("filepath","${filepath}")
        .header("workflow","${workflow}")
        .header("batch","${batch}")
        .header("apikey","${apikey}")
        .header("user_agent","${user_agent}")
        .header("filename","${filename}")
        .header("archivepwd","${archivepwd}")
        .header("metadata","${metadata}")
        .header("rule","${rule}")
        .header("callbackurl","${callbackurl}")
)

    // Run scnfileAnalysisPost with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnfileAnalysisPost.inject(
        rampUsersPerSec(1) to(fileAnalysisPostPerSecond) during(rampUpSeconds),
        constantUsersPerSec(fileAnalysisPostPerSecond) during(durationSeconds),
        rampUsersPerSec(fileAnalysisPostPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsanitizedFile = scenario("sanitizedFileSimulation")
        .feed(sanitizedFileHEADERFeeder)
        .feed(sanitizedFilePATHFeeder)
        .exec(http("sanitizedFile")
        .httpRequest("GET","/file/converted/${data_id}")
        .header("apikey","${apikey}")
)

    // Run scnsanitizedFile with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsanitizedFile.inject(
        rampUsersPerSec(1) to(sanitizedFilePerSecond) during(rampUpSeconds),
        constantUsersPerSec(sanitizedFilePerSecond) during(durationSeconds),
        rampUsersPerSec(sanitizedFilePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnwebhookStatus = scenario("webhookStatusSimulation")
        .feed(webhookStatusHEADERFeeder)
        .feed(webhookStatusPATHFeeder)
        .exec(http("webhookStatus")
        .httpRequest("GET","/file/webhook/${data_id}")
        .header("apikey","${apikey}")
)

    // Run scnwebhookStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnwebhookStatus.inject(
        rampUsersPerSec(1) to(webhookStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(webhookStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(webhookStatusPerSecond) to(1) during(rampDownSeconds)
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
