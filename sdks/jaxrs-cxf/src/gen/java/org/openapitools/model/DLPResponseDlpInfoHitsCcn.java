package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DLPRuleMatchResult;
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

public class DLPResponseDlpInfoHitsCcn  {
  
  @ApiModelProperty(example = "Credit Card Number", value = "Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user")
 /**
   * Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user
  **/
  private String displayName;

  @ApiModelProperty(value = "A list of detections that matched this rule/pattern.")
  @Valid
 /**
   * A list of detections that matched this rule/pattern.
  **/
  private List<DLPRuleMatchResult> hits = null;
 /**
   * Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user
   * @return displayName
  **/
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DLPResponseDlpInfoHitsCcn displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * A list of detections that matched this rule/pattern.
   * @return hits
  **/
  @JsonProperty("hits")
  public List<DLPRuleMatchResult> getHits() {
    return hits;
  }

  public void setHits(List<DLPRuleMatchResult> hits) {
    this.hits = hits;
  }

  public DLPResponseDlpInfoHitsCcn hits(List<DLPRuleMatchResult> hits) {
    this.hits = hits;
    return this;
  }

  public DLPResponseDlpInfoHitsCcn addHitsItem(DLPRuleMatchResult hitsItem) {
    this.hits.add(hitsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponseDlpInfoHitsCcn {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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

