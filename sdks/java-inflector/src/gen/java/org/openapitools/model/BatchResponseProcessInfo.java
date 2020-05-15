package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Overall batch process result
 **/

@ApiModel(description = "Overall batch process result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponseProcessInfo   {
  @JsonProperty("blocked_reason")
  private String blockedReason;

  @JsonProperty("file_type_skipped_scan")
  private Boolean fileTypeSkippedScan;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("result")
  private String result;

  @JsonProperty("user_agent")
  private String userAgent;

  @JsonProperty("username")
  private String username;

  /**
   * Provides the reason why the file is blocked (if so).
   **/
  public BatchResponseProcessInfo blockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
    return this;
  }

  
  @ApiModelProperty(example = "Infected", value = "Provides the reason why the file is blocked (if so).")
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
  public BatchResponseProcessInfo fileTypeSkippedScan(Boolean fileTypeSkippedScan) {
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
   * The used rule name.
   **/
  public BatchResponseProcessInfo profile(String profile) {
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
   * The final result of processing the file (Allowed / Blocked / Processing).
   **/
  public BatchResponseProcessInfo result(String result) {
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
  public BatchResponseProcessInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(example = "mdicapserver", value = "Identifier for the REST Client that calls the API.")
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
  public BatchResponseProcessInfo username(String username) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponseProcessInfo batchResponseProcessInfo = (BatchResponseProcessInfo) o;
    return Objects.equals(blockedReason, batchResponseProcessInfo.blockedReason) &&
        Objects.equals(fileTypeSkippedScan, batchResponseProcessInfo.fileTypeSkippedScan) &&
        Objects.equals(profile, batchResponseProcessInfo.profile) &&
        Objects.equals(result, batchResponseProcessInfo.result) &&
        Objects.equals(userAgent, batchResponseProcessInfo.userAgent) &&
        Objects.equals(username, batchResponseProcessInfo.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedReason, fileTypeSkippedScan, profile, result, userAgent, username);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

