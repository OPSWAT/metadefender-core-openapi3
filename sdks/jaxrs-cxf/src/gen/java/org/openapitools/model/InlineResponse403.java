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

public class InlineResponse403  {
  
  @ApiModelProperty(value = "<error message> will describe the incident. More details would be logged in MetaDefender Core logs")
 /**
   * <error message> will describe the incident. More details would be logged in MetaDefender Core logs
  **/
  private String err;
 /**
   * &lt;error message&gt; will describe the incident. More details would be logged in MetaDefender Core logs
   * @return err
  **/
  @JsonProperty("err")
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public InlineResponse403 err(String err) {
    this.err = err;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse403 {\n");
    
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
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

