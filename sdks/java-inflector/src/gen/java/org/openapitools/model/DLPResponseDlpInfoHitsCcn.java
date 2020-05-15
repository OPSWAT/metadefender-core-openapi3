package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DLPRuleMatchResult;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponseDlpInfoHitsCcn   {
  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("hits")
  private List<DLPRuleMatchResult> hits = null;

  /**
   * Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user
   **/
  public DLPResponseDlpInfoHitsCcn displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "Credit Card Number", value = "Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A list of detections that matched this rule/pattern.
   **/
  public DLPResponseDlpInfoHitsCcn hits(List<DLPRuleMatchResult> hits) {
    this.hits = hits;
    return this;
  }

  
  @ApiModelProperty(value = "A list of detections that matched this rule/pattern.")
  @JsonProperty("hits")
  public List<DLPRuleMatchResult> getHits() {
    return hits;
  }
  public void setHits(List<DLPRuleMatchResult> hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPResponseDlpInfoHitsCcn dlPResponseDlpInfoHitsCcn = (DLPResponseDlpInfoHitsCcn) o;
    return Objects.equals(displayName, dlPResponseDlpInfoHitsCcn.displayName) &&
        Objects.equals(hits, dlPResponseDlpInfoHitsCcn.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, hits);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

