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

public class InlineResponse200  {
  
  @ApiModelProperty(example = "24", value = "The number of hours of data retention. Anything older than this number will be deleted.")
 /**
   * The number of hours of data retention. Anything older than this number will be deleted.
  **/
  private Integer cleanuprange;
 /**
   * The number of hours of data retention. Anything older than this number will be deleted.
   * @return cleanuprange
  **/
  @JsonProperty("cleanuprange")
  public Integer getCleanuprange() {
    return cleanuprange;
  }

  public void setCleanuprange(Integer cleanuprange) {
    this.cleanuprange = cleanuprange;
  }

  public InlineResponse200 cleanuprange(Integer cleanuprange) {
    this.cleanuprange = cleanuprange;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    cleanuprange: ").append(toIndentedString(cleanuprange)).append("\n");
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

