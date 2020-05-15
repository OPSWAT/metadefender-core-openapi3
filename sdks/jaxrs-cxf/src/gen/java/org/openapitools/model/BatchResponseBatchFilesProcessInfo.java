package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * The analysis summary
 **/
@ApiModel(description="The analysis summary")
public class BatchResponseBatchFilesProcessInfo  {
  
  @ApiModelProperty(example = "Infected", value = "Provides the reason why the file is blocked (if so).")
 /**
   * Provides the reason why the file is blocked (if so).
  **/
  private String blockedReason;

  @ApiModelProperty(example = "100", value = "Percentage of processing completed (from 1-100).")
 /**
   * Percentage of processing completed (from 1-100).
  **/
  private Integer progressPercentage;

  @ApiModelProperty(example = "Blocked", value = "The final result of processing the file (Allowed / Blocked / Processing).")
 /**
   * The final result of processing the file (Allowed / Blocked / Processing).
  **/
  private String result;

  @ApiModelProperty(example = "[Infected]", value = "Aggregated list of potential issues.")
 /**
   * Aggregated list of potential issues.
  **/
  private List<String> verdicts = null;
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

  public BatchResponseBatchFilesProcessInfo blockedReason(String blockedReason) {
    this.blockedReason = blockedReason;
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

  public BatchResponseBatchFilesProcessInfo progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
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

  public BatchResponseBatchFilesProcessInfo result(String result) {
    this.result = result;
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

  public BatchResponseBatchFilesProcessInfo verdicts(List<String> verdicts) {
    this.verdicts = verdicts;
    return this;
  }

  public BatchResponseBatchFilesProcessInfo addVerdictsItem(String verdictsItem) {
    this.verdicts.add(verdictsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

