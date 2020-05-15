package org.openapitools.model;

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

public class InlineObject1  {
  
  @ApiModelProperty(example = "360", value = "The number of minutes of data retention. Anything older than this number will be deleted.")
 /**
   * The number of minutes of data retention. Anything older than this number will be deleted.
  **/
  private Integer maxage;
 /**
   * The number of minutes of data retention. Anything older than this number will be deleted.
   * @return maxage
  **/
  @JsonProperty("maxage")
  public Integer getMaxage() {
    return maxage;
  }

  public void setMaxage(Integer maxage) {
    this.maxage = maxage;
  }

  public InlineObject1 maxage(Integer maxage) {
    this.maxage = maxage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
    sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
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

