package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse2001   {
  @JsonProperty("maxage")
  private Integer maxage;

  /**
   * The number of minutes of data retention. Anything older than this number will be deleted.
   **/
  public InlineResponse2001 maxage(Integer maxage) {
    this.maxage = maxage;
    return this;
  }

  
  @ApiModelProperty(example = "360", value = "The number of minutes of data retention. Anything older than this number will be deleted.")
  @JsonProperty("maxage")
  public Integer getMaxage() {
    return maxage;
  }
  public void setMaxage(Integer maxage) {
    this.maxage = maxage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(maxage, inlineResponse2001.maxage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    maxage: ").append(toIndentedString(maxage)).append("\n");
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

