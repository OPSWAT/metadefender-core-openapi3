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

public class InlineResponse20010  {
  
  @ApiModelProperty(example = "200000000", value = "The maximum allowed file size (in bytes) for this rule.")
 /**
   * The maximum allowed file size (in bytes) for this rule.
  **/
  private Integer maxFileSize;

  @ApiModelProperty(example = "File scan", value = "A unique identifier for identify in the used rule for a scan..")
 /**
   * A unique identifier for identify in the used rule for a scan..
  **/
  private String name;
 /**
   * The maximum allowed file size (in bytes) for this rule.
   * @return maxFileSize
  **/
  @JsonProperty("max_file_size")
  public Integer getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public InlineResponse20010 maxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

 /**
   * A unique identifier for identify in the used rule for a scan..
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20010 name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

