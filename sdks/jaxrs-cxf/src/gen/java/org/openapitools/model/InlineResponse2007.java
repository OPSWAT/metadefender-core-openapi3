package org.openapitools.model;

import org.openapitools.model.InlineResponse2007Issues;
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

public class InlineResponse2007  {
  
@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("idle") IDLE(String.valueOf("idle")), @XmlEnumValue("error") ERROR(String.valueOf("error")), @XmlEnumValue("inprogress") INPROGRESS(String.valueOf("inprogress"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "idle", value = "Current status of generating the package.")
 /**
   * Current status of generating the package.
  **/
  private StatusEnum status;

  @ApiModelProperty(example = "", value = "Used only when status is inprogress, otherwise its empty")
 /**
   * Used only when status is inprogress, otherwise its empty
  **/
  private String startTime;

  @ApiModelProperty(value = "")
  @Valid
  private InlineResponse2007Issues issues;
 /**
   * Current status of generating the package.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InlineResponse2007 status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Used only when status is inprogress, otherwise its empty
   * @return startTime
  **/
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public InlineResponse2007 startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get issues
   * @return issues
  **/
  @JsonProperty("issues")
  public InlineResponse2007Issues getIssues() {
    return issues;
  }

  public void setIssues(InlineResponse2007Issues issues) {
    this.issues = issues;
  }

  public InlineResponse2007 issues(InlineResponse2007Issues issues) {
    this.issues = issues;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

