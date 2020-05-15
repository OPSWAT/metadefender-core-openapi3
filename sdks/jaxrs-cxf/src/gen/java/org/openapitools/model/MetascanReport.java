package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MetascanReportScanDetails;
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
  * Result of the scanning process.
 **/
@ApiModel(description="Result of the scanning process.")
public class MetascanReport  {
  
  @ApiModelProperty(example = "8101abae27be4d63859c55d9e0ed0135", value = "Data ID of the requested file")
 /**
   * Data ID of the requested file
  **/
  private String dataId;

  @ApiModelProperty(example = "100", value = "Track analysis progress until reaches 100.")
 /**
   * Track analysis progress until reaches 100.
  **/
  private Integer progressPercentage;

  @ApiModelProperty(example = "Sensitive Data Found", value = "The overall scan result as string")
  @Valid
 /**
   * The overall scan result as string
  **/
  private ProcessingResultsStringEnum scanAllResultA = null;

  @ApiModelProperty(example = "20", value = "The overall scan result as index in the Processing Results table.")
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

  @ApiModelProperty(example = "1", value = "Total number of scanning engines used as part of this analysis.")
 /**
   * Total number of scanning engines used as part of this analysis.
  **/
  private Integer totalAvs;

  @ApiModelProperty(example = "4804", value = "Total time elapsed during scan (in milliseconds).")
 /**
   * Total time elapsed during scan (in milliseconds).
  **/
  private Integer totalTime;

  @ApiModelProperty(value = "")
  @Valid
  private MetascanReportScanDetails scanDetails;
 /**
   * Data ID of the requested file
   * @return dataId
  **/
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public MetascanReport dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

 /**
   * Track analysis progress until reaches 100.
   * @return progressPercentage
  **/
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  public MetascanReport progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
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

  public MetascanReport scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
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

  public MetascanReport scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
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

  public MetascanReport startTime(String startTime) {
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

  public MetascanReport totalAvs(Integer totalAvs) {
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

  public MetascanReport totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

 /**
   * Get scanDetails
   * @return scanDetails
  **/
  @JsonProperty("scan_details")
  public MetascanReportScanDetails getScanDetails() {
    return scanDetails;
  }

  public void setScanDetails(MetascanReportScanDetails scanDetails) {
    this.scanDetails = scanDetails;
  }

  public MetascanReport scanDetails(MetascanReportScanDetails scanDetails) {
    this.scanDetails = scanDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetascanReport {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    scanAllResultA: ").append(toIndentedString(scanAllResultA)).append("\n");
    sb.append("    scanAllResultI: ").append(toIndentedString(scanAllResultI)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalAvs: ").append(toIndentedString(totalAvs)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    scanDetails: ").append(toIndentedString(scanDetails)).append("\n");
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

