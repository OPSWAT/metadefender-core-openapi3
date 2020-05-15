package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Scan report per each engine.
 **/

@ApiModel(description = "Scan report per each engine.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AVEngineScanReport   {
  @JsonProperty("def_time")
  private String defTime;

  @JsonProperty("eng_id")
  private String engId;

  @JsonProperty("location")
  private String location;

  @JsonProperty("scan_result_i")
  private Integer scanResultI;

  @JsonProperty("scan_time")
  private Integer scanTime;

  @JsonProperty("threat_found")
  private String threatFound;

  @JsonProperty("wait_time")
  private Integer waitTime;

  /**
   * The database definition time for this engine
   **/
  public AVEngineScanReport defTime(String defTime) {
    this.defTime = defTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-03-11T11:08:00.000Z", value = "The database definition time for this engine")
  @JsonProperty("def_time")
  public String getDefTime() {
    return defTime;
  }
  public void setDefTime(String defTime) {
    this.defTime = defTime;
  }

  /**
   * The  unique identification string for the engine
   **/
  public AVEngineScanReport engId(String engId) {
    this.engId = engId;
    return this;
  }

  
  @ApiModelProperty(example = "clamav_1_windows", value = "The  unique identification string for the engine")
  @JsonProperty("eng_id")
  public String getEngId() {
    return engId;
  }
  public void setEngId(String engId) {
    this.engId = engId;
  }

  /**
   * Where this engine is deployed (local/remote).
   **/
  public AVEngineScanReport location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "local", value = "Where this engine is deployed (local/remote).")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Scan result as index in the Processing Results table
   **/
  public AVEngineScanReport scanResultI(Integer scanResultI) {
    this.scanResultI = scanResultI;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "Scan result as index in the Processing Results table")
  @JsonProperty("scan_result_i")
  public Integer getScanResultI() {
    return scanResultI;
  }
  public void setScanResultI(Integer scanResultI) {
    this.scanResultI = scanResultI;
  }

  /**
   * The time elapsed during scan with this engine (in milliseconds).
   **/
  public AVEngineScanReport scanTime(Integer scanTime) {
    this.scanTime = scanTime;
    return this;
  }

  
  @ApiModelProperty(example = "336", value = "The time elapsed during scan with this engine (in milliseconds).")
  @JsonProperty("scan_time")
  public Integer getScanTime() {
    return scanTime;
  }
  public void setScanTime(Integer scanTime) {
    this.scanTime = scanTime;
  }

  /**
   * The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine.
   **/
  public AVEngineScanReport threatFound(String threatFound) {
    this.threatFound = threatFound;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine.")
  @JsonProperty("threat_found")
  public String getThreatFound() {
    return threatFound;
  }
  public void setThreatFound(String threatFound) {
    this.threatFound = threatFound;
  }

  /**
   * Time elapsed between sending file to node and receiving the result from the engine (in milliseconds).
   **/
  public AVEngineScanReport waitTime(Integer waitTime) {
    this.waitTime = waitTime;
    return this;
  }

  
  @ApiModelProperty(example = "3", value = "Time elapsed between sending file to node and receiving the result from the engine (in milliseconds).")
  @JsonProperty("wait_time")
  public Integer getWaitTime() {
    return waitTime;
  }
  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AVEngineScanReport avEngineScanReport = (AVEngineScanReport) o;
    return Objects.equals(defTime, avEngineScanReport.defTime) &&
        Objects.equals(engId, avEngineScanReport.engId) &&
        Objects.equals(location, avEngineScanReport.location) &&
        Objects.equals(scanResultI, avEngineScanReport.scanResultI) &&
        Objects.equals(scanTime, avEngineScanReport.scanTime) &&
        Objects.equals(threatFound, avEngineScanReport.threatFound) &&
        Objects.equals(waitTime, avEngineScanReport.waitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defTime, engId, location, scanResultI, scanTime, threatFound, waitTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AVEngineScanReport {\n");
    
    sb.append("    defTime: ").append(toIndentedString(defTime)).append("\n");
    sb.append("    engId: ").append(toIndentedString(engId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    scanResultI: ").append(toIndentedString(scanResultI)).append("\n");
    sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
    sb.append("    threatFound: ").append(toIndentedString(threatFound)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
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

