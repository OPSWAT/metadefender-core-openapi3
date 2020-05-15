package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ScanResultEnum;
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
  * Information on data that matched yara rules
 **/
@ApiModel(description="Information on data that matched yara rules")
public class YaraReport  {
  
  @ApiModelProperty(value = "detailed results that contains the name of the matched rules and a description for each.")
  @Valid
 /**
   * detailed results that contains the name of the matched rules and a description for each.
  **/
  private Object hits;

  @ApiModelProperty(value = "")
  @Valid
  private ScanResultEnum verdict;
 /**
   * detailed results that contains the name of the matched rules and a description for each.
   * @return hits
  **/
  @JsonProperty("hits")
  public Object getHits() {
    return hits;
  }

  public void setHits(Object hits) {
    this.hits = hits;
  }

  public YaraReport hits(Object hits) {
    this.hits = hits;
    return this;
  }

 /**
   * Get verdict
   * @return verdict
  **/
  @JsonProperty("verdict")
  public ScanResultEnum getVerdict() {
    return verdict;
  }

  public void setVerdict(ScanResultEnum verdict) {
    this.verdict = verdict;
  }

  public YaraReport verdict(ScanResultEnum verdict) {
    this.verdict = verdict;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YaraReport {\n");
    
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
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

