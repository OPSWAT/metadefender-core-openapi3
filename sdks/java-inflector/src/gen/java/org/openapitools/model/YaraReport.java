package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ScanResultEnum;



/**
 * Information on data that matched yara rules
 **/

@ApiModel(description = "Information on data that matched yara rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class YaraReport   {
  @JsonProperty("hits")
  private Object hits;

  @JsonProperty("verdict")
  private ScanResultEnum verdict;

  /**
   * detailed results that contains the name of the matched rules and a description for each.
   **/
  public YaraReport hits(Object hits) {
    this.hits = hits;
    return this;
  }

  
  @ApiModelProperty(value = "detailed results that contains the name of the matched rules and a description for each.")
  @JsonProperty("hits")
  public Object getHits() {
    return hits;
  }
  public void setHits(Object hits) {
    this.hits = hits;
  }

  /**
   **/
  public YaraReport verdict(ScanResultEnum verdict) {
    this.verdict = verdict;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verdict")
  public ScanResultEnum getVerdict() {
    return verdict;
  }
  public void setVerdict(ScanResultEnum verdict) {
    this.verdict = verdict;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YaraReport yaraReport = (YaraReport) o;
    return Objects.equals(hits, yaraReport.hits) &&
        Objects.equals(verdict, yaraReport.verdict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hits, verdict);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

