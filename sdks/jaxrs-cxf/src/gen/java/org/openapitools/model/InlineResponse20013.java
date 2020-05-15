package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StatNodesStatuses;
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

public class InlineResponse20013  {
  
  @ApiModelProperty(example = "false", value = "Configuration option if additional external nodes could be connected.")
 /**
   * Configuration option if additional external nodes could be connected.
  **/
  private Boolean externalNodesAllowed;

  @ApiModelProperty(example = "1", value = "Remaining available slots to connect to this instance.")
 /**
   * Remaining available slots to connect to this instance.
  **/
  private Integer maxNodeCount;

  @ApiModelProperty(value = "Array with a status for each attached node.")
  @Valid
 /**
   * Array with a status for each attached node.
  **/
  private List<StatNodesStatuses> statuses = null;
 /**
   * Configuration option if additional external nodes could be connected.
   * @return externalNodesAllowed
  **/
  @JsonProperty("external_nodes_allowed")
  public Boolean getExternalNodesAllowed() {
    return externalNodesAllowed;
  }

  public void setExternalNodesAllowed(Boolean externalNodesAllowed) {
    this.externalNodesAllowed = externalNodesAllowed;
  }

  public InlineResponse20013 externalNodesAllowed(Boolean externalNodesAllowed) {
    this.externalNodesAllowed = externalNodesAllowed;
    return this;
  }

 /**
   * Remaining available slots to connect to this instance.
   * @return maxNodeCount
  **/
  @JsonProperty("max_node_count")
  public Integer getMaxNodeCount() {
    return maxNodeCount;
  }

  public void setMaxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }

  public InlineResponse20013 maxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

 /**
   * Array with a status for each attached node.
   * @return statuses
  **/
  @JsonProperty("statuses")
  public List<StatNodesStatuses> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<StatNodesStatuses> statuses) {
    this.statuses = statuses;
  }

  public InlineResponse20013 statuses(List<StatNodesStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  public InlineResponse20013 addStatusesItem(StatNodesStatuses statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    externalNodesAllowed: ").append(toIndentedString(externalNodesAllowed)).append("\n");
    sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

