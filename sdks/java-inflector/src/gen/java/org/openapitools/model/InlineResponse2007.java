package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InlineResponse2007Issues;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse2007   {
  /**
   * Current status of generating the package.
   */
  public enum StatusEnum {
    IDLE("idle"),
    
    ERROR("error"),
    
    INPROGRESS("inprogress");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("start_time")
  private String startTime;

  @JsonProperty("issues")
  private InlineResponse2007Issues issues;

  /**
   * Current status of generating the package.
   **/
  public InlineResponse2007 status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "idle", value = "Current status of generating the package.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Used only when status is inprogress, otherwise its empty
   **/
  public InlineResponse2007 startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Used only when status is inprogress, otherwise its empty")
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   **/
  public InlineResponse2007 issues(InlineResponse2007Issues issues) {
    this.issues = issues;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("issues")
  public InlineResponse2007Issues getIssues() {
    return issues;
  }
  public void setIssues(InlineResponse2007Issues issues) {
    this.issues = issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(status, inlineResponse2007.status) &&
        Objects.equals(startTime, inlineResponse2007.startTime) &&
        Objects.equals(issues, inlineResponse2007.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startTime, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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

