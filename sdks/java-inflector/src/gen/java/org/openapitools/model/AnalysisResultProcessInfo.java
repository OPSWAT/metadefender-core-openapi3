package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AnalysisResultProcessInfoPostProcessing;



/**
 * Processing information
 **/

@ApiModel(description = "Processing information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AnalysisResultProcessInfo   {
  @JsonProperty("blocked_reason")
  private String blockedReason;

  @JsonProperty("file_type_skipped_scan")
  private Boolean fileTypeSkippedScan;

  /**
   * Gets or Sets outdatedData
   */
  public enum OutdatedDataEnum {
    ENGINEDEFINITION("enginedefinition"),
    
    CONFIGURATION("configuration"),
    
    SANITIZATION("sanitization");

    private String value;

    OutdatedDataEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutdatedDataEnum fromValue(String text) {
      for (OutdatedDataEnum b : OutdatedDataEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("outdated_data")
  private List<OutdatedDataEnum> outdatedData = null;

  @JsonProperty("processing_time")
  private Integer processingTime;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("progress_percentage")
  private Integer progressPercentage;

  @JsonProperty("queue_time")
  private Integer queueTime;

  @JsonProperty("result")
  private String result;

  @JsonProperty("user_agent")
  private String userAgent;

  @JsonProperty("username")
  private String username;

  @JsonProperty("verdicts")
  private List<String> verdicts = null;

  @JsonProperty("post_processing")
  private AnalysisResultProcessInfoPostProcessing postProcessing;

  /**
   * Provides the reason why the file is blocked (if so).
   **/
  public AnalysisResultProcessInfo blockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
    return this;
  }

  
  @ApiModelProperty(example = "Sensitive Data Found", value = "Provides the reason why the file is blocked (if so).")
  @JsonProperty("blocked_reason")
  public String getBlockedReason() {
    return blockedReason;
  }
  public void setBlockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
  }

  /**
   * Indicates if the input file's detected type was configured to skip scanning.
   **/
  public AnalysisResultProcessInfo fileTypeSkippedScan(Boolean fileTypeSkippedScan) {
    this.fileTypeSkippedScan = fileTypeSkippedScan;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Indicates if the input file's detected type was configured to skip scanning.")
  @JsonProperty("file_type_skipped_scan")
  public Boolean getFileTypeSkippedScan() {
    return fileTypeSkippedScan;
  }
  public void setFileTypeSkippedScan(Boolean fileTypeSkippedScan) {
    this.fileTypeSkippedScan = fileTypeSkippedScan;
  }

  /**
   * array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process' rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available               
   **/
  public AnalysisResultProcessInfo outdatedData(List<OutdatedDataEnum> outdatedData) {
    this.outdatedData = outdatedData;
    return this;
  }

  
  @ApiModelProperty(example = "[enginedefinition, configuration, sanitization]", value = "array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process' rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available               ")
  @JsonProperty("outdated_data")
  public List<OutdatedDataEnum> getOutdatedData() {
    return outdatedData;
  }
  public void setOutdatedData(List<OutdatedDataEnum> outdatedData) {
    this.outdatedData = outdatedData;
  }

  /**
   * Total time elapsed during processing file on the node (in milliseconds).
   **/
  public AnalysisResultProcessInfo processingTime(Integer processingTime) {
    this.processingTime = processingTime;
    return this;
  }

  
  @ApiModelProperty(example = "4804", value = "Total time elapsed during processing file on the node (in milliseconds).")
  @JsonProperty("processing_time")
  public Integer getProcessingTime() {
    return processingTime;
  }
  public void setProcessingTime(Integer processingTime) {
    this.processingTime = processingTime;
  }

  /**
   * The used rule name.
   **/
  public AnalysisResultProcessInfo profile(String profile) {
    this.profile = profile;
    return this;
  }

  
  @ApiModelProperty(example = "File process", value = "The used rule name.")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /**
   * Percentage of processing completed (from 1-100).
   **/
  public AnalysisResultProcessInfo progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Percentage of processing completed (from 1-100).")
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }
  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  /**
   * Total time elapsed while the file waits in the queue (in milliseconds).
   **/
  public AnalysisResultProcessInfo queueTime(Integer queueTime) {
    this.queueTime = queueTime;
    return this;
  }

  
  @ApiModelProperty(example = "321", value = "Total time elapsed while the file waits in the queue (in milliseconds).")
  @JsonProperty("queue_time")
  public Integer getQueueTime() {
    return queueTime;
  }
  public void setQueueTime(Integer queueTime) {
    this.queueTime = queueTime;
  }

  /**
   * The final result of processing the file (Allowed / Blocked / Processing).
   **/
  public AnalysisResultProcessInfo result(String result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(example = "Blocked", value = "The final result of processing the file (Allowed / Blocked / Processing).")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * Identifier for the REST Client that calls the API.
   **/
  public AnalysisResultProcessInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(example = "webscan", value = "Identifier for the REST Client that calls the API.")
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * User identifier who submitted scan request earlier.
   **/
  public AnalysisResultProcessInfo username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "LOCAL/admin", value = "User identifier who submitted scan request earlier.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Aggregated list of potential issues.
   **/
  public AnalysisResultProcessInfo verdicts(List<String> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  
  @ApiModelProperty(example = "[Sensitive Data Found]", value = "Aggregated list of potential issues.")
  @JsonProperty("verdicts")
  public List<String> getVerdicts() {
    return verdicts;
  }
  public void setVerdicts(List<String> verdicts) {
    this.verdicts = verdicts;
  }

  /**
   **/
  public AnalysisResultProcessInfo postProcessing(AnalysisResultProcessInfoPostProcessing postProcessing) {
    this.postProcessing = postProcessing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("post_processing")
  public AnalysisResultProcessInfoPostProcessing getPostProcessing() {
    return postProcessing;
  }
  public void setPostProcessing(AnalysisResultProcessInfoPostProcessing postProcessing) {
    this.postProcessing = postProcessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResultProcessInfo analysisResultProcessInfo = (AnalysisResultProcessInfo) o;
    return Objects.equals(blockedReason, analysisResultProcessInfo.blockedReason) &&
        Objects.equals(fileTypeSkippedScan, analysisResultProcessInfo.fileTypeSkippedScan) &&
        Objects.equals(outdatedData, analysisResultProcessInfo.outdatedData) &&
        Objects.equals(processingTime, analysisResultProcessInfo.processingTime) &&
        Objects.equals(profile, analysisResultProcessInfo.profile) &&
        Objects.equals(progressPercentage, analysisResultProcessInfo.progressPercentage) &&
        Objects.equals(queueTime, analysisResultProcessInfo.queueTime) &&
        Objects.equals(result, analysisResultProcessInfo.result) &&
        Objects.equals(userAgent, analysisResultProcessInfo.userAgent) &&
        Objects.equals(username, analysisResultProcessInfo.username) &&
        Objects.equals(verdicts, analysisResultProcessInfo.verdicts) &&
        Objects.equals(postProcessing, analysisResultProcessInfo.postProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedReason, fileTypeSkippedScan, outdatedData, processingTime, profile, progressPercentage, queueTime, result, userAgent, username, verdicts, postProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResultProcessInfo {\n");
    
    sb.append("    blockedReason: ").append(toIndentedString(blockedReason)).append("\n");
    sb.append("    fileTypeSkippedScan: ").append(toIndentedString(fileTypeSkippedScan)).append("\n");
    sb.append("    outdatedData: ").append(toIndentedString(outdatedData)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
    sb.append("    postProcessing: ").append(toIndentedString(postProcessing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

