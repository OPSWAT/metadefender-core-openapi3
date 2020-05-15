package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.YaraSourcesObjectHttpSources;
import org.openapitools.model.YaraSourcesObjectLocalSources;
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
  * Object describing the yara sources.
 **/
@ApiModel(description="Object describing the yara sources.")
public class YaraSourcesObject  {
  
  @ApiModelProperty(value = "A list of all locals sources")
  @Valid
 /**
   * A list of all locals sources
  **/
  private List<YaraSourcesObjectLocalSources> localSources = null;

  @ApiModelProperty(value = "A list of all remote sources.")
  @Valid
 /**
   * A list of all remote sources.
  **/
  private List<YaraSourcesObjectHttpSources> httpSources = null;
 /**
   * A list of all locals sources
   * @return localSources
  **/
  @JsonProperty("local_sources")
  public List<YaraSourcesObjectLocalSources> getLocalSources() {
    return localSources;
  }

  public void setLocalSources(List<YaraSourcesObjectLocalSources> localSources) {
    this.localSources = localSources;
  }

  public YaraSourcesObject localSources(List<YaraSourcesObjectLocalSources> localSources) {
    this.localSources = localSources;
    return this;
  }

  public YaraSourcesObject addLocalSourcesItem(YaraSourcesObjectLocalSources localSourcesItem) {
    this.localSources.add(localSourcesItem);
    return this;
  }

 /**
   * A list of all remote sources.
   * @return httpSources
  **/
  @JsonProperty("http_sources")
  public List<YaraSourcesObjectHttpSources> getHttpSources() {
    return httpSources;
  }

  public void setHttpSources(List<YaraSourcesObjectHttpSources> httpSources) {
    this.httpSources = httpSources;
  }

  public YaraSourcesObject httpSources(List<YaraSourcesObjectHttpSources> httpSources) {
    this.httpSources = httpSources;
    return this;
  }

  public YaraSourcesObject addHttpSourcesItem(YaraSourcesObjectHttpSources httpSourcesItem) {
    this.httpSources.add(httpSourcesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

