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
  * Scan report per each engine.
 **/
@ApiModel(description="Scan report per each engine.")
public class AVEngineScanReport  {
  
  @ApiModelProperty(example = "2020-03-11T11:08:00.000Z", value = "The database definition time for this engine")
 /**
   * The database definition time for this engine
  **/
  private String defTime;

  @ApiModelProperty(example = "clamav_1_windows", value = "The  unique identification string for the engine")
 /**
   * The  unique identification string for the engine
  **/
  private String engId;

  @ApiModelProperty(example = "local", value = "Where this engine is deployed (local/remote).")
 /**
   * Where this engine is deployed (local/remote).
  **/
  private String location;

  @ApiModelProperty(example = "0", value = "Scan result as index in the Processing Results table")
 /**
   * Scan result as index in the Processing Results table
  **/
  private Integer scanResultI;

  @ApiModelProperty(example = "336", value = "The time elapsed during scan with this engine (in milliseconds).")
 /**
   * The time elapsed during scan with this engine (in milliseconds).
  **/
  private Integer scanTime;

  @ApiModelProperty(example = "", value = "The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine.")
 /**
   * The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine.
  **/
  private String threatFound;

  @ApiModelProperty(example = "3", value = "Time elapsed between sending file to node and receiving the result from the engine (in milliseconds).")
 /**
   * Time elapsed between sending file to node and receiving the result from the engine (in milliseconds).
  **/
  private Integer waitTime;
 /**
   * The database definition time for this engine
   * @return defTime
  **/
  @JsonProperty("def_time")
  public String getDefTime() {
    return defTime;
  }

  public void setDefTime(String defTime) {
    this.defTime = defTime;
  }

  public AVEngineScanReport defTime(String defTime) {
    this.defTime = defTime;
    return this;
  }

 /**
   * The  unique identification string for the engine
   * @return engId
  **/
  @JsonProperty("eng_id")
  public String getEngId() {
    return engId;
  }

  public void setEngId(String engId) {
    this.engId = engId;
  }

  public AVEngineScanReport engId(String engId) {
    this.engId = engId;
    return this;
  }

 /**
   * Where this engine is deployed (local/remote).
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AVEngineScanReport location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Scan result as index in the Processing Results table
   * @return scanResultI
  **/
  @JsonProperty("scan_result_i")
  public Integer getScanResultI() {
    return scanResultI;
  }

  public void setScanResultI(Integer scanResultI) {
    this.scanResultI = scanResultI;
  }

  public AVEngineScanReport scanResultI(Integer scanResultI) {
    this.scanResultI = scanResultI;
    return this;
  }

 /**
   * The time elapsed during scan with this engine (in milliseconds).
   * @return scanTime
  **/
  @JsonProperty("scan_time")
  public Integer getScanTime() {
    return scanTime;
  }

  public void setScanTime(Integer scanTime) {
    this.scanTime = scanTime;
  }

  public AVEngineScanReport scanTime(Integer scanTime) {
    this.scanTime = scanTime;
    return this;
  }

 /**
   * The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine.
   * @return threatFound
  **/
  @JsonProperty("threat_found")
  public String getThreatFound() {
    return threatFound;
  }

  public void setThreatFound(String threatFound) {
    this.threatFound = threatFound;
  }

  public AVEngineScanReport threatFound(String threatFound) {
    this.threatFound = threatFound;
    return this;
  }

 /**
   * Time elapsed between sending file to node and receiving the result from the engine (in milliseconds).
   * @return waitTime
  **/
  @JsonProperty("wait_time")
  public Integer getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }

  public AVEngineScanReport waitTime(Integer waitTime) {
    this.waitTime = waitTime;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

