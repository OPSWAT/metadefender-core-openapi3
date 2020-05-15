package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Result of redaction process.
 **/

@ApiModel(description = "Result of redaction process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponseDlpInfoRedact   {
  /**
   * Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact` 
   */
  public enum ResultEnum {
    REDACTED("redacted"),
    
    NOT_REDACTED("not redacted"),
    
    FAILED_TO_REDACT("failed to redact");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("result")
  private ResultEnum result;

  /**
   * Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact` 
   **/
  public DLPResponseDlpInfoRedact result(ResultEnum result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(example = "redacted", value = "Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact` ")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPResponseDlpInfoRedact dlPResponseDlpInfoRedact = (DLPResponseDlpInfoRedact) o;
    return Objects.equals(result, dlPResponseDlpInfoRedact.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

