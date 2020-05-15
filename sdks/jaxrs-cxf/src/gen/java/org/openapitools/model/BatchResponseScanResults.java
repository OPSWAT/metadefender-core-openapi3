package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ProcessingResultsIndexEnum;
import org.openapitools.model.ProcessingResultsStringEnum;
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
  * Metascan analysis result.
 **/
@ApiModel(description="Metascan analysis result.")
public class BatchResponseScanResults  {
  
  @ApiModelProperty(example = "b7cc760038324b02908a5c111cb1563d", value = "The batch unique identifer")
 /**
   * The batch unique identifer
  **/
  private String batchId;

  @ApiModelProperty(example = "Infected", value = "The overall scan result as string")
  @Valid
 /**
   * The overall scan result as string
  **/
  private ProcessingResultsStringEnum scanAllResultA = null;

  @ApiModelProperty(example = "1", value = "The overall scan result as index in the Processing Results table.")
  @Valid
 /**
   * The overall scan result as index in the Processing Results table.
  **/
  private ProcessingResultsIndexEnum scanAllResultI = null;

  @ApiModelProperty(example = "2020-03-12T08:37:05.427Z", value = "Timestamp when the scanning process starts.")
 /**
   * Timestamp when the scanning process starts.
  **/
  private String startTime;

  @ApiModelProperty(example = "0", value = "Total number of scanning engines used as part of this analysis.")
 /**
   * Total number of scanning engines used as part of this analysis.
  **/
  private Integer totalAvs;

  @ApiModelProperty(example = "18403", value = "Total time elapsed during scan (in milliseconds).")
 /**
   * Total time elapsed during scan (in milliseconds).
  **/
  private Integer totalTime;
 /**
   * The batch unique identifer
   * @return batchId
  **/
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public BatchResponseScanResults batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * The overall scan result as string
   * @return scanAllResultA
  **/
  @JsonProperty("scan_all_result_a")
  public ProcessingResultsStringEnum getScanAllResultA() {
    return scanAllResultA;
  }

  public void setScanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
  }

  public BatchResponseScanResults scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
    return this;
  }

 /**
   * The overall scan result as index in the Processing Results table.
   * @return scanAllResultI
  **/
  @JsonProperty("scan_all_result_i")
  public ProcessingResultsIndexEnum getScanAllResultI() {
    return scanAllResultI;
  }

  public void setScanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
  }

  public BatchResponseScanResults scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
    return this;
  }

 /**
   * Timestamp when the scanning process starts.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BatchResponseScanResults startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Total number of scanning engines used as part of this analysis.
   * @return totalAvs
  **/
  @JsonProperty("total_avs")
  public Integer getTotalAvs() {
    return totalAvs;
  }

  public void setTotalAvs(Integer totalAvs) {
    this.totalAvs = totalAvs;
  }

  public BatchResponseScanResults totalAvs(Integer totalAvs) {
    this.totalAvs = totalAvs;
    return this;
  }

 /**
   * Total time elapsed during scan (in milliseconds).
   * @return totalTime
  **/
  @JsonProperty("total_time")
  public Integer getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }

  public BatchResponseScanResults totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseScanResults {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    scanAllResultA: ").append(toIndentedString(scanAllResultA)).append("\n");
    sb.append("    scanAllResultI: ").append(toIndentedString(scanAllResultI)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalAvs: ").append(toIndentedString(totalAvs)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
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

