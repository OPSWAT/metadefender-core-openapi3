package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.YaraSourcesObjectHttpSources;
import org.openapitools.model.YaraSourcesObjectLocalSources;



/**
 * Object describing the yara sources.
 **/

@ApiModel(description = "Object describing the yara sources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class YaraSourcesObject   {
  @JsonProperty("local_sources")
  private List<YaraSourcesObjectLocalSources> localSources = null;

  @JsonProperty("http_sources")
  private List<YaraSourcesObjectHttpSources> httpSources = null;

  /**
   * A list of all locals sources
   **/
  public YaraSourcesObject localSources(List<YaraSourcesObjectLocalSources> localSources) {
    this.localSources = localSources;
    return this;
  }

  
  @ApiModelProperty(value = "A list of all locals sources")
  @JsonProperty("local_sources")
  public List<YaraSourcesObjectLocalSources> getLocalSources() {
    return localSources;
  }
  public void setLocalSources(List<YaraSourcesObjectLocalSources> localSources) {
    this.localSources = localSources;
  }

  /**
   * A list of all remote sources.
   **/
  public YaraSourcesObject httpSources(List<YaraSourcesObjectHttpSources> httpSources) {
    this.httpSources = httpSources;
    return this;
  }

  
  @ApiModelProperty(value = "A list of all remote sources.")
  @JsonProperty("http_sources")
  public List<YaraSourcesObjectHttpSources> getHttpSources() {
    return httpSources;
  }
  public void setHttpSources(List<YaraSourcesObjectHttpSources> httpSources) {
    this.httpSources = httpSources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YaraSourcesObject yaraSourcesObject = (YaraSourcesObject) o;
    return Objects.equals(localSources, yaraSourcesObject.localSources) &&
        Objects.equals(httpSources, yaraSourcesObject.httpSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localSources, httpSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YaraSourcesObject {\n");
    
    sb.append("    localSources: ").append(toIndentedString(localSources)).append("\n");
    sb.append("    httpSources: ").append(toIndentedString(httpSources)).append("\n");
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

