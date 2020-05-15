package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse200   {
  @JsonProperty("cleanuprange")
  private Integer cleanuprange;

  /**
   * The number of hours of data retention. Anything older than this number will be deleted.
   **/
  public InlineResponse200 cleanuprange(Integer cleanuprange) {
    this.cleanuprange = cleanuprange;
    return this;
  }

  
  @ApiModelProperty(example = "24", value = "The number of hours of data retention. Anything older than this number will be deleted.")
  @JsonProperty("cleanuprange")
  public Integer getCleanuprange() {
    return cleanuprange;
  }
  public void setCleanuprange(Integer cleanuprange) {
    this.cleanuprange = cleanuprange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(cleanuprange, inlineResponse200.cleanuprange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanuprange);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

