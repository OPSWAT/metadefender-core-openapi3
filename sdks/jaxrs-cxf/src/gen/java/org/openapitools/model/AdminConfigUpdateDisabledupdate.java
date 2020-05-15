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
  * The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. <i>From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)<i> 
 **/
@ApiModel(description="The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. <i>From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)<i> ")
public class AdminConfigUpdateDisabledupdate  {
  
  @ApiModelProperty(example = "5-7", value = "A particular day (index of the week) or a defined interval (Fri-Sun -> 5-7)")
 /**
   * A particular day (index of the week) or a defined interval (Fri-Sun -> 5-7)
  **/
  private String days;

  @ApiModelProperty(example = "480", value = "When to start the lockdown, expressed in minutes (8 AM=480)")
 /**
   * When to start the lockdown, expressed in minutes (8 AM=480)
  **/
  private Integer from;

  @ApiModelProperty(example = "960", value = "When to end the lockdown, expressed in minutes (4 PM=960)")
 /**
   * When to end the lockdown, expressed in minutes (4 PM=960)
  **/
  private Integer to;
 /**
   * A particular day (index of the week) or a defined interval (Fri-Sun -&gt; 5-7)
   * @return days
  **/
  @JsonProperty("days")
  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }

  public AdminConfigUpdateDisabledupdate days(String days) {
    this.days = days;
    return this;
  }

 /**
   * When to start the lockdown, expressed in minutes (8 AM&#x3D;480)
   * @return from
  **/
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public AdminConfigUpdateDisabledupdate from(Integer from) {
    this.from = from;
    return this;
  }

 /**
   * When to end the lockdown, expressed in minutes (4 PM&#x3D;960)
   * @return to
  **/
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }

  public AdminConfigUpdateDisabledupdate to(Integer to) {
    this.to = to;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminConfigUpdateDisabledupdate {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

