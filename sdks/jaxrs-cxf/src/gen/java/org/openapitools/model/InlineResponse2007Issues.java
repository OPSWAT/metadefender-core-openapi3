package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InlineResponse2007IssuesGeneral;
import org.openapitools.model.InlineResponse2007IssuesSource;
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
  * Stores a map of issues. Each key represents the according source, except \"general\", which contains general errors occurred during the generation process
 **/
@ApiModel(description="Stores a map of issues. Each key represents the according source, except \"general\", which contains general errors occurred during the generation process")
public class InlineResponse2007Issues  {
  
  @ApiModelProperty(value = "Contains general errors occurred during the generation process")
  @Valid
 /**
   * Contains general errors occurred during the generation process
  **/
  private List<InlineResponse2007IssuesGeneral> general = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<InlineResponse2007IssuesSource> source = null;
 /**
   * Contains general errors occurred during the generation process
   * @return general
  **/
  @JsonProperty("general")
  public List<InlineResponse2007IssuesGeneral> getGeneral() {
    return general;
  }

  public void setGeneral(List<InlineResponse2007IssuesGeneral> general) {
    this.general = general;
  }

  public InlineResponse2007Issues general(List<InlineResponse2007IssuesGeneral> general) {
    this.general = general;
    return this;
  }

  public InlineResponse2007Issues addGeneralItem(InlineResponse2007IssuesGeneral generalItem) {
    this.general.add(generalItem);
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public List<InlineResponse2007IssuesSource> getSource() {
    return source;
  }

  public void setSource(List<InlineResponse2007IssuesSource> source) {
    this.source = source;
  }

  public InlineResponse2007Issues source(List<InlineResponse2007IssuesSource> source) {
    this.source = source;
    return this;
  }

  public InlineResponse2007Issues addSourceItem(InlineResponse2007IssuesSource sourceItem) {
    this.source.add(sourceItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

