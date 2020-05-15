package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse2007IssuesSource   {
  @JsonProperty("severity")
  private String severity;

  @JsonProperty("message")
  private String message;

  /**
   **/
  public InlineResponse2007IssuesSource severity(String severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "warning", value = "")
  @JsonProperty("severity")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  /**
   **/
  public InlineResponse2007IssuesSource message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "The given local source does not exists.", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007IssuesSource inlineResponse2007IssuesSource = (InlineResponse2007IssuesSource) o;
    return Objects.equals(severity, inlineResponse2007IssuesSource.severity) &&
        Objects.equals(message, inlineResponse2007IssuesSource.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007IssuesSource {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

