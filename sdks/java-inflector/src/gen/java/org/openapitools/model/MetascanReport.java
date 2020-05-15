package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MetascanReportScanDetails;
import org.openapitools.model.ProcessingResultsIndexEnum;
import org.openapitools.model.ProcessingResultsStringEnum;



/**
 * Result of the scanning process.
 **/

@ApiModel(description = "Result of the scanning process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class MetascanReport   {
  @JsonProperty("data_id")
  private String dataId;

  @JsonProperty("progress_percentage")
  private Integer progressPercentage;

  @JsonProperty("scan_all_result_a")
  private ProcessingResultsStringEnum scanAllResultA = null;

  @JsonProperty("scan_all_result_i")
  private ProcessingResultsIndexEnum scanAllResultI = null;

  @JsonProperty("start_time")
  private String startTime;

  @JsonProperty("total_avs")
  private Integer totalAvs;

  @JsonProperty("total_time")
  private Integer totalTime;

  @JsonProperty("scan_details")
  private MetascanReportScanDetails scanDetails;

  /**
   * Data ID of the requested file
   **/
  public MetascanReport dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

  
  @ApiModelProperty(example = "8101abae27be4d63859c55d9e0ed0135", value = "Data ID of the requested file")
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }
  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  /**
   * Track analysis progress until reaches 100.
   **/
  public MetascanReport progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Track analysis progress until reaches 100.")
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }
  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  /**
   * The overall scan result as string
   **/
  public MetascanReport scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
    return this;
  }

  
  @ApiModelProperty(example = "Sensitive Data Found", value = "The overall scan result as string")
  @JsonProperty("scan_all_result_a")
  public ProcessingResultsStringEnum getScanAllResultA() {
    return scanAllResultA;
  }
  public void setScanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
  }

  /**
   * The overall scan result as index in the Processing Results table.
   **/
  public MetascanReport scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
    return this;
  }

  
  @ApiModelProperty(example = "20", value = "The overall scan result as index in the Processing Results table.")
  @JsonProperty("scan_all_result_i")
  public ProcessingResultsIndexEnum getScanAllResultI() {
    return scanAllResultI;
  }
  public void setScanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
  }

  /**
   * Timestamp when the scanning process starts.
   **/
  public MetascanReport startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-03-12T08:37:05.427Z", value = "Timestamp when the scanning process starts.")
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Total number of scanning engines used as part of this analysis.
   **/
  public MetascanReport totalAvs(Integer totalAvs) {
    this.totalAvs = totalAvs;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Total number of scanning engines used as part of this analysis.")
  @JsonProperty("total_avs")
  public Integer getTotalAvs() {
    return totalAvs;
  }
  public void setTotalAvs(Integer totalAvs) {
    this.totalAvs = totalAvs;
  }

  /**
   * Total time elapsed during scan (in milliseconds).
   **/
  public MetascanReport totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  
  @ApiModelProperty(example = "4804", value = "Total time elapsed during scan (in milliseconds).")
  @JsonProperty("total_time")
  public Integer getTotalTime() {
    return totalTime;
  }
  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }

  /**
   **/
  public MetascanReport scanDetails(MetascanReportScanDetails scanDetails) {
    this.scanDetails = scanDetails;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scan_details")
  public MetascanReportScanDetails getScanDetails() {
    return scanDetails;
  }
  public void setScanDetails(MetascanReportScanDetails scanDetails) {
    this.scanDetails = scanDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetascanReport metascanReport = (MetascanReport) o;
    return Objects.equals(dataId, metascanReport.dataId) &&
        Objects.equals(progressPercentage, metascanReport.progressPercentage) &&
        Objects.equals(scanAllResultA, metascanReport.scanAllResultA) &&
        Objects.equals(scanAllResultI, metascanReport.scanAllResultI) &&
        Objects.equals(startTime, metascanReport.startTime) &&
        Objects.equals(totalAvs, metascanReport.totalAvs) &&
        Objects.equals(totalTime, metascanReport.totalTime) &&
        Objects.equals(scanDetails, metascanReport.scanDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId, progressPercentage, scanAllResultA, scanAllResultI, startTime, totalAvs, totalTime, scanDetails);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

