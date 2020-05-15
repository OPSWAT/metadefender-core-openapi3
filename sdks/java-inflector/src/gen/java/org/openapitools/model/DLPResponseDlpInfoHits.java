package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DLPResponseDlpInfoHitsCcn;



/**
 * Detailed results that contains as key the type of matched rule:    * ccn (credit card number),    * ssn (social security number),    * regex_&lt;index&gt; (regular expression with an index in order to differentiate the RegEx rules if there are more.) 
 **/

@ApiModel(description = "Detailed results that contains as key the type of matched rule:    * ccn (credit card number),    * ssn (social security number),    * regex_<index> (regular expression with an index in order to differentiate the RegEx rules if there are more.) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponseDlpInfoHits   {
  @JsonProperty("ccn")
  private DLPResponseDlpInfoHitsCcn ccn;

  /**
   **/
  public DLPResponseDlpInfoHits ccn(DLPResponseDlpInfoHitsCcn ccn) {
    this.ccn = ccn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ccn")
  public DLPResponseDlpInfoHitsCcn getCcn() {
    return ccn;
  }
  public void setCcn(DLPResponseDlpInfoHitsCcn ccn) {
    this.ccn = ccn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPResponseDlpInfoHits dlPResponseDlpInfoHits = (DLPResponseDlpInfoHits) o;
    return Objects.equals(ccn, dlPResponseDlpInfoHits.ccn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponseDlpInfoHits {\n");
    
    sb.append("    ccn: ").append(toIndentedString(ccn)).append("\n");
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

