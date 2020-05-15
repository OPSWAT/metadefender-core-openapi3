package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProcessingResultsIndexEnum;
import org.openapitools.model.ProcessingResultsStringEnum;



/**
 * Metascan analysis result.
 **/

@ApiModel(description = "Metascan analysis result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponseScanResults   {
  @JsonProperty("batch_id")
  private String batchId;

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

  /**
   * The batch unique identifer
   **/
  public BatchResponseScanResults batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "b7cc760038324b02908a5c111cb1563d", value = "The batch unique identifer")
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * The overall scan result as string
   **/
  public BatchResponseScanResults scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
    return this;
  }

  
  @ApiModelProperty(example = "Infected", value = "The overall scan result as string")
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
  public BatchResponseScanResults scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The overall scan result as index in the Processing Results table.")
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
  public BatchResponseScanResults startTime(String startTime) {
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
  public BatchResponseScanResults totalAvs(Integer totalAvs) {
    this.totalAvs = totalAvs;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "Total number of scanning engines used as part of this analysis.")
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
  public BatchResponseScanResults totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  
  @ApiModelProperty(example = "18403", value = "Total time elapsed during scan (in milliseconds).")
  @JsonProperty("total_time")
  public Integer getTotalTime() {
    return totalTime;
  }
  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponseScanResults batchResponseScanResults = (BatchResponseScanResults) o;
    return Objects.equals(batchId, batchResponseScanResults.batchId) &&
        Objects.equals(scanAllResultA, batchResponseScanResults.scanAllResultA) &&
        Objects.equals(scanAllResultI, batchResponseScanResults.scanAllResultI) &&
        Objects.equals(startTime, batchResponseScanResults.startTime) &&
        Objects.equals(totalAvs, batchResponseScanResults.totalAvs) &&
        Objects.equals(totalTime, batchResponseScanResults.totalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, scanAllResultA, scanAllResultI, startTime, totalAvs, totalTime);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

