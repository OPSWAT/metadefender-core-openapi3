package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AnalysisResultProcessInfoPostProcessing;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Processing information
 **/
@ApiModel(description="Processing information")
public class AnalysisResultProcessInfo  {
  
  @ApiModelProperty(example = "Sensitive Data Found", value = "Provides the reason why the file is blocked (if so).")
 /**
   * Provides the reason why the file is blocked (if so).
  **/
  private String blockedReason;

  @ApiModelProperty(example = "false", value = "Indicates if the input file's detected type was configured to skip scanning.")
 /**
   * Indicates if the input file's detected type was configured to skip scanning.
  **/
  private Boolean fileTypeSkippedScan;

@XmlType(name="OutdatedDataEnum")
@XmlEnum(String.class)
public enum OutdatedDataEnum {

@XmlEnumValue("enginedefinition") ENGINEDEFINITION(String.valueOf("enginedefinition")), @XmlEnumValue("configuration") CONFIGURATION(String.valueOf("configuration")), @XmlEnumValue("sanitization") SANITIZATION(String.valueOf("sanitization"));


    private String value;

    OutdatedDataEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OutdatedDataEnum fromValue(String value) {
        for (OutdatedDataEnum b : OutdatedDataEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "[enginedefinition, configuration, sanitization]", value = "array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process' rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available               ")
 /**
   * array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process' rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available               
  **/
  private List<OutdatedDataEnum> outdatedData = null;

  @ApiModelProperty(example = "4804", value = "Total time elapsed during processing file on the node (in milliseconds).")
 /**
   * Total time elapsed during processing file on the node (in milliseconds).
  **/
  private Integer processingTime;

  @ApiModelProperty(example = "File process", value = "The used rule name.")
 /**
   * The used rule name.
  **/
  private String profile;

  @ApiModelProperty(example = "100", value = "Percentage of processing completed (from 1-100).")
 /**
   * Percentage of processing completed (from 1-100).
  **/
  private Integer progressPercentage;

  @ApiModelProperty(example = "321", value = "Total time elapsed while the file waits in the queue (in milliseconds).")
 /**
   * Total time elapsed while the file waits in the queue (in milliseconds).
  **/
  private Integer queueTime;

  @ApiModelProperty(example = "Blocked", value = "The final result of processing the file (Allowed / Blocked / Processing).")
 /**
   * The final result of processing the file (Allowed / Blocked / Processing).
  **/
  private String result;

  @ApiModelProperty(example = "webscan", value = "Identifier for the REST Client that calls the API.")
 /**
   * Identifier for the REST Client that calls the API.
  **/
  private String userAgent;

  @ApiModelProperty(example = "LOCAL/admin", value = "User identifier who submitted scan request earlier.")
 /**
   * User identifier who submitted scan request earlier.
  **/
  private String username;

  @ApiModelProperty(example = "[Sensitive Data Found]", value = "Aggregated list of potential issues.")
 /**
   * Aggregated list of potential issues.
  **/
  private List<String> verdicts = null;

  @ApiModelProperty(value = "")
  @Valid
  private AnalysisResultProcessInfoPostProcessing postProcessing;
 /**
   * Provides the reason why the file is blocked (if so).
   * @return blockedReason
  **/
  @JsonProperty("blocked_reason")
  public String getBlockedReason() {
    return blockedReason;
  }

  public void setBlockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
  }

  public AnalysisResultProcessInfo blockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
    return this;
  }

 /**
   * Indicates if the input file&#39;s detected type was configured to skip scanning.
   * @return fileTypeSkippedScan
  **/
  @JsonProperty("file_type_skipped_scan")
  public Boolean getFileTypeSkippedScan() {
    return fileTypeSkippedScan;
  }

  public void setFileTypeSkippedScan(Boolean fileTypeSkippedScan) {
    this.fileTypeSkippedScan = fileTypeSkippedScan;
  }

  public AnalysisResultProcessInfo fileTypeSkippedScan(Boolean fileTypeSkippedScan) {
    this.fileTypeSkippedScan = fileTypeSkippedScan;
    return this;
  }

 /**
   * array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process&#39; rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available               
   * @return outdatedData
  **/
  @JsonProperty("outdated_data")
  public List<OutdatedDataEnum> getOutdatedData() {
    return outdatedData;
  }

  public void setOutdatedData(List<OutdatedDataEnum> outdatedData) {
    this.outdatedData = outdatedData;
  }

  public AnalysisResultProcessInfo outdatedData(List<OutdatedDataEnum> outdatedData) {
    this.outdatedData = outdatedData;
    return this;
  }

  public AnalysisResultProcessInfo addOutdatedDataItem(OutdatedDataEnum outdatedDataItem) {
    this.outdatedData.add(outdatedDataItem);
    return this;
  }

 /**
   * Total time elapsed during processing file on the node (in milliseconds).
   * @return processingTime
  **/
  @JsonProperty("processing_time")
  public Integer getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(Integer processingTime) {
    this.processingTime = processingTime;
  }

  public AnalysisResultProcessInfo processingTime(Integer processingTime) {
    this.processingTime = processingTime;
    return this;
  }

 /**
   * The used rule name.
   * @return profile
  **/
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public AnalysisResultProcessInfo profile(String profile) {
    this.profile = profile;
    return this;
  }

 /**
   * Percentage of processing completed (from 1-100).
   * @return progressPercentage
  **/
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  public AnalysisResultProcessInfo progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

 /**
   * Total time elapsed while the file waits in the queue (in milliseconds).
   * @return queueTime
  **/
  @JsonProperty("queue_time")
  public Integer getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(Integer queueTime) {
    this.queueTime = queueTime;
  }

  public AnalysisResultProcessInfo queueTime(Integer queueTime) {
    this.queueTime = queueTime;
    return this;
  }

 /**
   * The final result of processing the file (Allowed / Blocked / Processing).
   * @return result
  **/
  @JsonProperty("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public AnalysisResultProcessInfo result(String result) {
    this.result = result;
    return this;
  }

 /**
   * Identifier for the REST Client that calls the API.
   * @return userAgent
  **/
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public AnalysisResultProcessInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

 /**
   * User identifier who submitted scan request earlier.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AnalysisResultProcessInfo username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Aggregated list of potential issues.
   * @return verdicts
  **/
  @JsonProperty("verdicts")
  public List<String> getVerdicts() {
    return verdicts;
  }

  public void setVerdicts(List<String> verdicts) {
    this.verdicts = verdicts;
  }

  public AnalysisResultProcessInfo verdicts(List<String> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  public AnalysisResultProcessInfo addVerdictsItem(String verdictsItem) {
    this.verdicts.add(verdictsItem);
    return this;
  }

 /**
   * Get postProcessing
   * @return postProcessing
  **/
  @JsonProperty("post_processing")
  public AnalysisResultProcessInfoPostProcessing getPostProcessing() {
    return postProcessing;
  }

  public void setPostProcessing(AnalysisResultProcessInfoPostProcessing postProcessing) {
    this.postProcessing = postProcessing;
  }

  public AnalysisResultProcessInfo postProcessing(AnalysisResultProcessInfoPostProcessing postProcessing) {
    this.postProcessing = postProcessing;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

