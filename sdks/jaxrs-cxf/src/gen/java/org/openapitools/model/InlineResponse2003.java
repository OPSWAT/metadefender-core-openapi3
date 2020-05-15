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

public class InlineResponse2003  {
  
@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

@XmlEnumValue("Engine is unpinned") ENGINE_IS_UNPINNED(String.valueOf("Engine is unpinned")), @XmlEnumValue("Database is unpinned") DATABASE_IS_UNPINNED(String.valueOf("Database is unpinned")), @XmlEnumValue("Both engine and database are unpinned") BOTH_ENGINE_AND_DATABASE_ARE_UNPINNED(String.valueOf("Both engine and database are unpinned"));


    private String value;

    ResultEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
        for (ResultEnum b : ResultEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "Both engine and database are unpinned", value = "")
  private ResultEnum result;
 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public String getResult() {
    if (result == null) {
      return null;
    }
    return result.value();
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public InlineResponse2003 result(ResultEnum result) {
    this.result = result;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

