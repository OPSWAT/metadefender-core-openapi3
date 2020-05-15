package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StatNodesEngines;
import org.openapitools.model.StatNodesIssues;
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
  * Node status
 **/
@ApiModel(description="Node status")
public class StatNodesStatuses  {
  
  @ApiModelProperty(example = "", value = "The location of the Node. If local, is empty string.")
 /**
   * The location of the Node. If local, is empty string.
  **/
  private String address;

  @ApiModelProperty(example = "8", value = "The number of CPU Cores allocated to this Node.")
 /**
   * The number of CPU Cores allocated to this Node.
  **/
  private Integer cpuCores;

  @ApiModelProperty(value = "Summary of each engine status deployed on this Node.")
  @Valid
 /**
   * Summary of each engine status deployed on this Node.
  **/
  private List<StatNodesEngines> engines = null;

  @ApiModelProperty(example = "173993443328", value = "Reported available disk on that Node (in bytes).")
 /**
   * Reported available disk on that Node (in bytes).
  **/
  private Integer freeDiskSpace;

  @ApiModelProperty(example = ":69", value = "Node identfier")
 /**
   * Node identfier
  **/
  private String id;

  @ApiModelProperty(value = "A list of all potentials problems on that Node.")
  @Valid
 /**
   * A list of all potentials problems on that Node.
  **/
  private List<StatNodesIssues> issues = null;

  @ApiModelProperty(example = "14", value = "Current CPU utilization on this Node (in percentage).")
 /**
   * Current CPU utilization on this Node (in percentage).
  **/
  private Integer load;

  @ApiModelProperty(example = "Linux Mint 18.3 Sylvia", value = "Current used OS")
 /**
   * Current used OS
  **/
  private String os;

  @ApiModelProperty(example = "24", value = "Current load on the Node, how many files are in the queue")
 /**
   * Current load on the Node, how many files are in the queue
  **/
  private Integer scanQueue;

  @ApiModelProperty(example = "40100", value = "How much memory is allocated on this Node (in MB).")
 /**
   * How much memory is allocated on this Node (in MB).
  **/
  private Integer totalMemory;

  @ApiModelProperty(example = "4.18.0", value = "Product version")
 /**
   * Product version
  **/
  private String version;
 /**
   * The location of the Node. If local, is empty string.
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public StatNodesStatuses address(String address) {
    this.address = address;
    return this;
  }

 /**
   * The number of CPU Cores allocated to this Node.
   * @return cpuCores
  **/
  @JsonProperty("cpu_cores")
  public Integer getCpuCores() {
    return cpuCores;
  }

  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

  public StatNodesStatuses cpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

 /**
   * Summary of each engine status deployed on this Node.
   * @return engines
  **/
  @JsonProperty("engines")
  public List<StatNodesEngines> getEngines() {
    return engines;
  }

  public void setEngines(List<StatNodesEngines> engines) {
    this.engines = engines;
  }

  public StatNodesStatuses engines(List<StatNodesEngines> engines) {
    this.engines = engines;
    return this;
  }

  public StatNodesStatuses addEnginesItem(StatNodesEngines enginesItem) {
    this.engines.add(enginesItem);
    return this;
  }

 /**
   * Reported available disk on that Node (in bytes).
   * @return freeDiskSpace
  **/
  @JsonProperty("free_disk_space")
  public Integer getFreeDiskSpace() {
    return freeDiskSpace;
  }

  public void setFreeDiskSpace(Integer freeDiskSpace) {
    this.freeDiskSpace = freeDiskSpace;
  }

  public StatNodesStatuses freeDiskSpace(Integer freeDiskSpace) {
    this.freeDiskSpace = freeDiskSpace;
    return this;
  }

 /**
   * Node identfier
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatNodesStatuses id(String id) {
    this.id = id;
    return this;
  }

 /**
   * A list of all potentials problems on that Node.
   * @return issues
  **/
  @JsonProperty("issues")
  public List<StatNodesIssues> getIssues() {
    return issues;
  }

  public void setIssues(List<StatNodesIssues> issues) {
    this.issues = issues;
  }

  public StatNodesStatuses issues(List<StatNodesIssues> issues) {
    this.issues = issues;
    return this;
  }

  public StatNodesStatuses addIssuesItem(StatNodesIssues issuesItem) {
    this.issues.add(issuesItem);
    return this;
  }

 /**
   * Current CPU utilization on this Node (in percentage).
   * @return load
  **/
  @JsonProperty("load")
  public Integer getLoad() {
    return load;
  }

  public void setLoad(Integer load) {
    this.load = load;
  }

  public StatNodesStatuses load(Integer load) {
    this.load = load;
    return this;
  }

 /**
   * Current used OS
   * @return os
  **/
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public StatNodesStatuses os(String os) {
    this.os = os;
    return this;
  }

 /**
   * Current load on the Node, how many files are in the queue
   * @return scanQueue
  **/
  @JsonProperty("scan_queue")
  public Integer getScanQueue() {
    return scanQueue;
  }

  public void setScanQueue(Integer scanQueue) {
    this.scanQueue = scanQueue;
  }

  public StatNodesStatuses scanQueue(Integer scanQueue) {
    this.scanQueue = scanQueue;
    return this;
  }

 /**
   * How much memory is allocated on this Node (in MB).
   * @return totalMemory
  **/
  @JsonProperty("total_memory")
  public Integer getTotalMemory() {
    return totalMemory;
  }

  public void setTotalMemory(Integer totalMemory) {
    this.totalMemory = totalMemory;
  }

  public StatNodesStatuses totalMemory(Integer totalMemory) {
    this.totalMemory = totalMemory;
    return this;
  }

 /**
   * Product version
   * @return version
  **/
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public StatNodesStatuses version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatNodesStatuses {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
    sb.append("    freeDiskSpace: ").append(toIndentedString(freeDiskSpace)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    scanQueue: ").append(toIndentedString(scanQueue)).append("\n");
    sb.append("    totalMemory: ").append(toIndentedString(totalMemory)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

