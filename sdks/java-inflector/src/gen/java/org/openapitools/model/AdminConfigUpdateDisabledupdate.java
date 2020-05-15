package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. &lt;i&gt;From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)&lt;i&gt; 
 **/

@ApiModel(description = "The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. <i>From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)<i> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AdminConfigUpdateDisabledupdate   {
  @JsonProperty("days")
  private String days;

  @JsonProperty("from")
  private Integer from;

  @JsonProperty("to")
  private Integer to;

  /**
   * A particular day (index of the week) or a defined interval (Fri-Sun -> 5-7)
   **/
  public AdminConfigUpdateDisabledupdate days(String days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(example = "5-7", value = "A particular day (index of the week) or a defined interval (Fri-Sun -> 5-7)")
  @JsonProperty("days")
  public String getDays() {
    return days;
  }
  public void setDays(String days) {
    this.days = days;
  }

  /**
   * When to start the lockdown, expressed in minutes (8 AM=480)
   **/
  public AdminConfigUpdateDisabledupdate from(Integer from) {
    this.from = from;
    return this;
  }

  
  @ApiModelProperty(example = "480", value = "When to start the lockdown, expressed in minutes (8 AM=480)")
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }
  public void setFrom(Integer from) {
    this.from = from;
  }

  /**
   * When to end the lockdown, expressed in minutes (4 PM=960)
   **/
  public AdminConfigUpdateDisabledupdate to(Integer to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(example = "960", value = "When to end the lockdown, expressed in minutes (4 PM=960)")
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }
  public void setTo(Integer to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminConfigUpdateDisabledupdate adminConfigUpdateDisabledupdate = (AdminConfigUpdateDisabledupdate) o;
    return Objects.equals(days, adminConfigUpdateDisabledupdate.days) &&
        Objects.equals(from, adminConfigUpdateDisabledupdate.from) &&
        Objects.equals(to, adminConfigUpdateDisabledupdate.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, from, to);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

