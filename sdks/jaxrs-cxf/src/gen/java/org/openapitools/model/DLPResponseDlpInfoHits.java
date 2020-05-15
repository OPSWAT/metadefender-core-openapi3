package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.DLPResponseDlpInfoHitsCcn;
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
  * Detailed results that contains as key the type of matched rule:    * ccn (credit card number),    * ssn (social security number),    * regex_<index> (regular expression with an index in order to differentiate the RegEx rules if there are more.) 
 **/
@ApiModel(description="Detailed results that contains as key the type of matched rule:    * ccn (credit card number),    * ssn (social security number),    * regex_<index> (regular expression with an index in order to differentiate the RegEx rules if there are more.) ")
public class DLPResponseDlpInfoHits  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DLPResponseDlpInfoHitsCcn ccn;
 /**
   * Get ccn
   * @return ccn
  **/
  @JsonProperty("ccn")
  public DLPResponseDlpInfoHitsCcn getCcn() {
    return ccn;
  }

  public void setCcn(DLPResponseDlpInfoHitsCcn ccn) {
    this.ccn = ccn;
  }

  public DLPResponseDlpInfoHits ccn(DLPResponseDlpInfoHitsCcn ccn) {
    this.ccn = ccn;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

