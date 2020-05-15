package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InlineResponse2007IssuesGeneral;
import org.openapitools.model.InlineResponse2007IssuesSource;



/**
 * Stores a map of issues. Each key represents the according source, except \&quot;general\&quot;, which contains general errors occurred during the generation process
 **/

@ApiModel(description = "Stores a map of issues. Each key represents the according source, except \"general\", which contains general errors occurred during the generation process")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse2007Issues   {
  @JsonProperty("general")
  private List<InlineResponse2007IssuesGeneral> general = null;

  @JsonProperty("source")
  private List<InlineResponse2007IssuesSource> source = null;

  /**
   * Contains general errors occurred during the generation process
   **/
  public InlineResponse2007Issues general(List<InlineResponse2007IssuesGeneral> general) {
    this.general = general;
    return this;
  }

  
  @ApiModelProperty(value = "Contains general errors occurred during the generation process")
  @JsonProperty("general")
  public List<InlineResponse2007IssuesGeneral> getGeneral() {
    return general;
  }
  public void setGeneral(List<InlineResponse2007IssuesGeneral> general) {
    this.general = general;
  }

  /**
   **/
  public InlineResponse2007Issues source(List<InlineResponse2007IssuesSource> source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public List<InlineResponse2007IssuesSource> getSource() {
    return source;
  }
  public void setSource(List<InlineResponse2007IssuesSource> source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Issues inlineResponse2007Issues = (InlineResponse2007Issues) o;
    return Objects.equals(general, inlineResponse2007Issues.general) &&
        Objects.equals(source, inlineResponse2007Issues.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Issues {\n");
    
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

