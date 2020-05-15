package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
  * Overall batch process result
 **/
@ApiModel(description="Overall batch process result")
public class BatchResponseProcessInfo  {
  
  @ApiModelProperty(example = "Infected", value = "Provides the reason why the file is blocked (if so).")
 /**
   * Provides the reason why the file is blocked (if so).
  **/
  private String blockedReason;

  @ApiModelProperty(example = "false", value = "Indicates if the input file's detected type was configured to skip scanning.")
 /**
   * Indicates if the input file's detected type was configured to skip scanning.
  **/
  private Boolean fileTypeSkippedScan;

  @ApiModelProperty(example = "File process", value = "The used rule name.")
 /**
   * The used rule name.
  **/
  private String profile;

  @ApiModelProperty(example = "Blocked", value = "The final result of processing the file (Allowed / Blocked / Processing).")
 /**
   * The final result of processing the file (Allowed / Blocked / Processing).
  **/
  private String result;

  @ApiModelProperty(example = "mdicapserver", value = "Identifier for the REST Client that calls the API.")
 /**
   * Identifier for the REST Client that calls the API.
  **/
  private String userAgent;

  @ApiModelProperty(example = "LOCAL/admin", value = "User identifier who submitted scan request earlier.")
 /**
   * User identifier who submitted scan request earlier.
  **/
  private String username;
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

  public BatchResponseProcessInfo blockedReason(String blockedReason) {
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

  public BatchResponseProcessInfo fileTypeSkippedScan(Boolean fileTypeSkippedScan) {
    this.fileTypeSkippedScan = fileTypeSkippedScan;
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

  public BatchResponseProcessInfo profile(String profile) {
    this.profile = profile;
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

  public BatchResponseProcessInfo result(String result) {
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

  public BatchResponseProcessInfo userAgent(String userAgent) {
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

  public BatchResponseProcessInfo username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseProcessInfo {\n");
    
    sb.append("    blockedReason: ").append(toIndentedString(blockedReason)).append("\n");
    sb.append("    fileTypeSkippedScan: ").append(toIndentedString(fileTypeSkippedScan)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

