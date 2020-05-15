package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DeepCDRDetailsDetails;
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
  * Deep CDR module returns forensic info to describe what happened during the process in the case file was successfully sanitized.
 **/
@ApiModel(description="Deep CDR module returns forensic info to describe what happened during the process in the case file was successfully sanitized.")
public class DeepCDRDetails  {
  
  @ApiModelProperty(example = "Sanitized successfully", value = "Action was successful or not.")
 /**
   * Action was successful or not.
  **/
  private String description;

  @ApiModelProperty(value = "List of all sanitized objects")
  @Valid
 /**
   * List of all sanitized objects
  **/
  private List<DeepCDRDetailsDetails> details = null;
 /**
   * Action was successful or not.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeepCDRDetails description(String description) {
    this.description = description;
    return this;
  }

 /**
   * List of all sanitized objects
   * @return details
  **/
  @JsonProperty("details")
  public List<DeepCDRDetailsDetails> getDetails() {
    return details;
  }

  public void setDetails(List<DeepCDRDetailsDetails> details) {
    this.details = details;
  }

  public DeepCDRDetails details(List<DeepCDRDetailsDetails> details) {
    this.details = details;
    return this;
  }

  public DeepCDRDetails addDetailsItem(DeepCDRDetailsDetails detailsItem) {
    this.details.add(detailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepCDRDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

