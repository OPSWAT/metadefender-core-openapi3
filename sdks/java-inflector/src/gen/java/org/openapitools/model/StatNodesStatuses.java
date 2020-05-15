package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StatNodesEngines;
import org.openapitools.model.StatNodesIssues;



/**
 * Node status
 **/

@ApiModel(description = "Node status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class StatNodesStatuses   {
  @JsonProperty("address")
  private String address;

  @JsonProperty("cpu_cores")
  private Integer cpuCores;

  @JsonProperty("engines")
  private List<StatNodesEngines> engines = null;

  @JsonProperty("free_disk_space")
  private Integer freeDiskSpace;

  @JsonProperty("id")
  private String id;

  @JsonProperty("issues")
  private List<StatNodesIssues> issues = null;

  @JsonProperty("load")
  private Integer load;

  @JsonProperty("os")
  private String os;

  @JsonProperty("scan_queue")
  private Integer scanQueue;

  @JsonProperty("total_memory")
  private Integer totalMemory;

  @JsonProperty("version")
  private String version;

  /**
   * The location of the Node. If local, is empty string.
   **/
  public StatNodesStatuses address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "The location of the Node. If local, is empty string.")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * The number of CPU Cores allocated to this Node.
   **/
  public StatNodesStatuses cpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
    return this;
  }

  
  @ApiModelProperty(example = "8", value = "The number of CPU Cores allocated to this Node.")
  @JsonProperty("cpu_cores")
  public Integer getCpuCores() {
    return cpuCores;
  }
  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }

  /**
   * Summary of each engine status deployed on this Node.
   **/
  public StatNodesStatuses engines(List<StatNodesEngines> engines) {
    this.engines = engines;
    return this;
  }

  
  @ApiModelProperty(value = "Summary of each engine status deployed on this Node.")
  @JsonProperty("engines")
  public List<StatNodesEngines> getEngines() {
    return engines;
  }
  public void setEngines(List<StatNodesEngines> engines) {
    this.engines = engines;
  }

  /**
   * Reported available disk on that Node (in bytes).
   **/
  public StatNodesStatuses freeDiskSpace(Integer freeDiskSpace) {
    this.freeDiskSpace = freeDiskSpace;
    return this;
  }

  
  @ApiModelProperty(example = "173993443328", value = "Reported available disk on that Node (in bytes).")
  @JsonProperty("free_disk_space")
  public Integer getFreeDiskSpace() {
    return freeDiskSpace;
  }
  public void setFreeDiskSpace(Integer freeDiskSpace) {
    this.freeDiskSpace = freeDiskSpace;
  }

  /**
   * Node identfier
   **/
  public StatNodesStatuses id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = ":69", value = "Node identfier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of all potentials problems on that Node.
   **/
  public StatNodesStatuses issues(List<StatNodesIssues> issues) {
    this.issues = issues;
    return this;
  }

  
  @ApiModelProperty(value = "A list of all potentials problems on that Node.")
  @JsonProperty("issues")
  public List<StatNodesIssues> getIssues() {
    return issues;
  }
  public void setIssues(List<StatNodesIssues> issues) {
    this.issues = issues;
  }

  /**
   * Current CPU utilization on this Node (in percentage).
   **/
  public StatNodesStatuses load(Integer load) {
    this.load = load;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "Current CPU utilization on this Node (in percentage).")
  @JsonProperty("load")
  public Integer getLoad() {
    return load;
  }
  public void setLoad(Integer load) {
    this.load = load;
  }

  /**
   * Current used OS
   **/
  public StatNodesStatuses os(String os) {
    this.os = os;
    return this;
  }

  
  @ApiModelProperty(example = "Linux Mint 18.3 Sylvia", value = "Current used OS")
  @JsonProperty("os")
  public String getOs() {
    return os;
  }
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * Current load on the Node, how many files are in the queue
   **/
  public StatNodesStatuses scanQueue(Integer scanQueue) {
    this.scanQueue = scanQueue;
    return this;
  }

  
  @ApiModelProperty(example = "24", value = "Current load on the Node, how many files are in the queue")
  @JsonProperty("scan_queue")
  public Integer getScanQueue() {
    return scanQueue;
  }
  public void setScanQueue(Integer scanQueue) {
    this.scanQueue = scanQueue;
  }

  /**
   * How much memory is allocated on this Node (in MB).
   **/
  public StatNodesStatuses totalMemory(Integer totalMemory) {
    this.totalMemory = totalMemory;
    return this;
  }

  
  @ApiModelProperty(example = "40100", value = "How much memory is allocated on this Node (in MB).")
  @JsonProperty("total_memory")
  public Integer getTotalMemory() {
    return totalMemory;
  }
  public void setTotalMemory(Integer totalMemory) {
    this.totalMemory = totalMemory;
  }

  /**
   * Product version
   **/
  public StatNodesStatuses version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "4.18.0", value = "Product version")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatNodesStatuses statNodesStatuses = (StatNodesStatuses) o;
    return Objects.equals(address, statNodesStatuses.address) &&
        Objects.equals(cpuCores, statNodesStatuses.cpuCores) &&
        Objects.equals(engines, statNodesStatuses.engines) &&
        Objects.equals(freeDiskSpace, statNodesStatuses.freeDiskSpace) &&
        Objects.equals(id, statNodesStatuses.id) &&
        Objects.equals(issues, statNodesStatuses.issues) &&
        Objects.equals(load, statNodesStatuses.load) &&
        Objects.equals(os, statNodesStatuses.os) &&
        Objects.equals(scanQueue, statNodesStatuses.scanQueue) &&
        Objects.equals(totalMemory, statNodesStatuses.totalMemory) &&
        Objects.equals(version, statNodesStatuses.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cpuCores, engines, freeDiskSpace, id, issues, load, os, scanQueue, totalMemory, version);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

