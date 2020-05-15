package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse20010   {
  @JsonProperty("max_file_size")
  private Integer maxFileSize;

  @JsonProperty("name")
  private String name;

  /**
   * The maximum allowed file size (in bytes) for this rule.
   **/
  public InlineResponse20010 maxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

  
  @ApiModelProperty(example = "200000000", value = "The maximum allowed file size (in bytes) for this rule.")
  @JsonProperty("max_file_size")
  public Integer getMaxFileSize() {
    return maxFileSize;
  }
  public void setMaxFileSize(Integer maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  /**
   * A unique identifier for identify in the used rule for a scan..
   **/
  public InlineResponse20010 name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "File scan", value = "A unique identifier for identify in the used rule for a scan..")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(maxFileSize, inlineResponse20010.maxFileSize) &&
        Objects.equals(name, inlineResponse20010.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFileSize, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

