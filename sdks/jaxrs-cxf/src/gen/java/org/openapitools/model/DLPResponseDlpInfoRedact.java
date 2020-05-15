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
  * Result of redaction process.
 **/
@ApiModel(description="Result of redaction process.")
public class DLPResponseDlpInfoRedact  {
  
@XmlType(name="ResultEnum")
@XmlEnum(String.class)
public enum ResultEnum {

@XmlEnumValue("redacted") REDACTED(String.valueOf("redacted")), @XmlEnumValue("not redacted") NOT_REDACTED(String.valueOf("not redacted")), @XmlEnumValue("failed to redact") FAILED_TO_REDACT(String.valueOf("failed to redact"));


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

  @ApiModelProperty(example = "redacted", value = "Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact` ")
 /**
   * Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact` 
  **/
  private ResultEnum result;
 /**
   * Result of the redaction process, possible values: * &#x60;redacted&#x60; * &#x60;not redacted&#x60; * &#x60;failed to redact&#x60; 
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

  public DLPResponseDlpInfoRedact result(ResultEnum result) {
    this.result = result;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponseDlpInfoRedact {\n");
    
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

