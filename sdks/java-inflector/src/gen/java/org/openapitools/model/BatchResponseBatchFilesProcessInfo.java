package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * The analysis summary
 **/

@ApiModel(description = "The analysis summary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponseBatchFilesProcessInfo   {
  @JsonProperty("blocked_reason")
  private String blockedReason;

  @JsonProperty("progress_percentage")
  private Integer progressPercentage;

  @JsonProperty("result")
  private String result;

  @JsonProperty("verdicts")
  private List<String> verdicts = null;

  /**
   * Provides the reason why the file is blocked (if so).
   **/
  public BatchResponseBatchFilesProcessInfo blockedReason(String blockedReason) {
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
   * Percentage of processing completed (from 1-100).
   **/
  public BatchResponseBatchFilesProcessInfo progressPercentage(Integer progressPercentage) {
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
   * The final result of processing the file (Allowed / Blocked / Processing).
   **/
  public BatchResponseBatchFilesProcessInfo result(String result) {
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
   * Aggregated list of potential issues.
   **/
  public BatchResponseBatchFilesProcessInfo verdicts(List<String> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  
  @ApiModelProperty(example = "[Infected]", value = "Aggregated list of potential issues.")
  @JsonProperty("verdicts")
  public List<String> getVerdicts() {
    return verdicts;
  }
  public void setVerdicts(List<String> verdicts) {
    this.verdicts = verdicts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponseBatchFilesProcessInfo batchResponseBatchFilesProcessInfo = (BatchResponseBatchFilesProcessInfo) o;
    return Objects.equals(blockedReason, batchResponseBatchFilesProcessInfo.blockedReason) &&
        Objects.equals(progressPercentage, batchResponseBatchFilesProcessInfo.progressPercentage) &&
        Objects.equals(result, batchResponseBatchFilesProcessInfo.result) &&
        Objects.equals(verdicts, batchResponseBatchFilesProcessInfo.verdicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedReason, progressPercentage, result, verdicts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseBatchFilesProcessInfo {\n");
    
    sb.append("    blockedReason: ").append(toIndentedString(blockedReason)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
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

