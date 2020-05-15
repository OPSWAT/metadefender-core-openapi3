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
  * Result of metadata removal.
 **/
@ApiModel(description="Result of metadata removal.")
public class DLPResponseDlpInfoMetadataRemoval  {
  
@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

@XmlEnumValue("removed") REMOVED(String.valueOf("removed")), @XmlEnumValue("not removed") NOT_REMOVED(String.valueOf("not removed")), @XmlEnumValue("failed to remove") FAILED_TO_REMOVE(String.valueOf("failed to remove"));


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

  @ApiModelProperty(example = "not removed", value = "Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove` ")
 /**
   * Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove` 
  **/
  private ResultEnum result;
 /**
   * Result of the metadata removal process, possible values: * &#x60;removed&#x60; * &#x60;not removed&#x60; * &#x60;failed to remove&#x60; 
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

  public DLPResponseDlpInfoMetadataRemoval result(ResultEnum result) {
    this.result = result;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponseDlpInfoMetadataRemoval {\n");
    
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

