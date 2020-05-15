package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class StatNodesIssues   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("severity")
  private String severity;

  /**
   * Text detailing the issue.
   **/
  public StatNodesIssues description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "1 engines are not deployed to this node", value = "Text detailing the issue.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * How important is the reported issue.
   **/
  public StatNodesIssues severity(String severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "warning", value = "How important is the reported issue.")
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatNodesIssues statNodesIssues = (StatNodesIssues) o;
    return Objects.equals(description, statNodesIssues.description) &&
        Objects.equals(severity, statNodesIssues.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatNodesIssues {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

