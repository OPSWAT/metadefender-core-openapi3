package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Result of metadata removal.
 **/

@ApiModel(description = "Result of metadata removal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponseDlpInfoMetadataRemoval   {
  /**
   * Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove` 
   */
  public enum ResultEnum {
    REMOVED("removed"),
    
    NOT_REMOVED("not removed"),
    
    FAILED_TO_REMOVE("failed to remove");

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
   * Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove` 
   **/
  public DLPResponseDlpInfoMetadataRemoval result(ResultEnum result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(example = "not removed", value = "Result of the metadata removal process, possible values: * `removed` * `not removed` * `failed to remove` ")
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
    DLPResponseDlpInfoMetadataRemoval dlPResponseDlpInfoMetadataRemoval = (DLPResponseDlpInfoMetadataRemoval) o;
    return Objects.equals(result, dlPResponseDlpInfoMetadataRemoval.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

