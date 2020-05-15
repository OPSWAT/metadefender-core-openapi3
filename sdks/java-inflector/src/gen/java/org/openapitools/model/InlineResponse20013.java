package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StatNodesStatuses;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse20013   {
  @JsonProperty("external_nodes_allowed")
  private Boolean externalNodesAllowed;

  @JsonProperty("max_node_count")
  private Integer maxNodeCount;

  @JsonProperty("statuses")
  private List<StatNodesStatuses> statuses = null;

  /**
   * Configuration option if additional external nodes could be connected.
   **/
  public InlineResponse20013 externalNodesAllowed(Boolean externalNodesAllowed) {
    this.externalNodesAllowed = externalNodesAllowed;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Configuration option if additional external nodes could be connected.")
  @JsonProperty("external_nodes_allowed")
  public Boolean getExternalNodesAllowed() {
    return externalNodesAllowed;
  }
  public void setExternalNodesAllowed(Boolean externalNodesAllowed) {
    this.externalNodesAllowed = externalNodesAllowed;
  }

  /**
   * Remaining available slots to connect to this instance.
   **/
  public InlineResponse20013 maxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Remaining available slots to connect to this instance.")
  @JsonProperty("max_node_count")
  public Integer getMaxNodeCount() {
    return maxNodeCount;
  }
  public void setMaxNodeCount(Integer maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }

  /**
   * Array with a status for each attached node.
   **/
  public InlineResponse20013 statuses(List<StatNodesStatuses> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Array with a status for each attached node.")
  @JsonProperty("statuses")
  public List<StatNodesStatuses> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<StatNodesStatuses> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(externalNodesAllowed, inlineResponse20013.externalNodesAllowed) &&
        Objects.equals(maxNodeCount, inlineResponse20013.maxNodeCount) &&
        Objects.equals(statuses, inlineResponse20013.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalNodesAllowed, maxNodeCount, statuses);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

