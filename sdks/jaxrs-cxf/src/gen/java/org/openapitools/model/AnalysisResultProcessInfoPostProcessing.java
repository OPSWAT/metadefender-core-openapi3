package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.DeepCDRDetails;
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
  * Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.
 **/
@ApiModel(description="Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.")
public class AnalysisResultProcessInfoPostProcessing  {
  
  @ApiModelProperty(example = "Sanitization Failed | PAscript failed", value = "Empty string if no action failed or list of failed actions, separated by \"|\".")
 /**
   * Empty string if no action failed or list of failed actions, separated by \"|\".
  **/
  private String actionsFailed;

  @ApiModelProperty(example = "Sanitized | PAscript", value = "List of successful actions, separated by \"|\". Empty string if otherwise.")
 /**
   * List of successful actions, separated by \"|\". Empty string if otherwise.
  **/
  private String actionsRan;

  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN_sanitized.pdf", value = "Contains the name of the sanitized file.")
 /**
   * Contains the name of the sanitized file.
  **/
  private String convertedDestination;

  @ApiModelProperty(example = "", value = "Contains target type name of sanitization.")
 /**
   * Contains target type name of sanitization.
  **/
  private String convertedTo;

  @ApiModelProperty(example = "", value = "Contains target type name of sanitization.")
 /**
   * Contains target type name of sanitization.
  **/
  private String copyMoveDestination;

  @ApiModelProperty(value = "Contains target type name of sanitization.")
  @Valid
 /**
   * Contains target type name of sanitization.
  **/
  private DeepCDRDetails sanitizationDetails = null;
 /**
   * Empty string if no action failed or list of failed actions, separated by \&quot;|\&quot;.
   * @return actionsFailed
  **/
  @JsonProperty("actions_failed")
  public String getActionsFailed() {
    return actionsFailed;
  }

  public void setActionsFailed(String actionsFailed) {
    this.actionsFailed = actionsFailed;
  }

  public AnalysisResultProcessInfoPostProcessing actionsFailed(String actionsFailed) {
    this.actionsFailed = actionsFailed;
    return this;
  }

 /**
   * List of successful actions, separated by \&quot;|\&quot;. Empty string if otherwise.
   * @return actionsRan
  **/
  @JsonProperty("actions_ran")
  public String getActionsRan() {
    return actionsRan;
  }

  public void setActionsRan(String actionsRan) {
    this.actionsRan = actionsRan;
  }

  public AnalysisResultProcessInfoPostProcessing actionsRan(String actionsRan) {
    this.actionsRan = actionsRan;
    return this;
  }

 /**
   * Contains the name of the sanitized file.
   * @return convertedDestination
  **/
  @JsonProperty("converted_destination")
  public String getConvertedDestination() {
    return convertedDestination;
  }

  public void setConvertedDestination(String convertedDestination) {
    this.convertedDestination = convertedDestination;
  }

  public AnalysisResultProcessInfoPostProcessing convertedDestination(String convertedDestination) {
    this.convertedDestination = convertedDestination;
    return this;
  }

 /**
   * Contains target type name of sanitization.
   * @return convertedTo
  **/
  @JsonProperty("converted_to")
  public String getConvertedTo() {
    return convertedTo;
  }

  public void setConvertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
  }

  public AnalysisResultProcessInfoPostProcessing convertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
    return this;
  }

 /**
   * Contains target type name of sanitization.
   * @return copyMoveDestination
  **/
  @JsonProperty("copy_move_destination")
  public String getCopyMoveDestination() {
    return copyMoveDestination;
  }

  public void setCopyMoveDestination(String copyMoveDestination) {
    this.copyMoveDestination = copyMoveDestination;
  }

  public AnalysisResultProcessInfoPostProcessing copyMoveDestination(String copyMoveDestination) {
    this.copyMoveDestination = copyMoveDestination;
    return this;
  }

 /**
   * Contains target type name of sanitization.
   * @return sanitizationDetails
  **/
  @JsonProperty("sanitization_details")
  public DeepCDRDetails getSanitizationDetails() {
    return sanitizationDetails;
  }

  public void setSanitizationDetails(DeepCDRDetails sanitizationDetails) {
    this.sanitizationDetails = sanitizationDetails;
  }

  public AnalysisResultProcessInfoPostProcessing sanitizationDetails(DeepCDRDetails sanitizationDetails) {
    this.sanitizationDetails = sanitizationDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResultProcessInfoPostProcessing {\n");
    
    sb.append("    actionsFailed: ").append(toIndentedString(actionsFailed)).append("\n");
    sb.append("    actionsRan: ").append(toIndentedString(actionsRan)).append("\n");
    sb.append("    convertedDestination: ").append(toIndentedString(convertedDestination)).append("\n");
    sb.append("    convertedTo: ").append(toIndentedString(convertedTo)).append("\n");
    sb.append("    copyMoveDestination: ").append(toIndentedString(copyMoveDestination)).append("\n");
    sb.append("    sanitizationDetails: ").append(toIndentedString(sanitizationDetails)).append("\n");
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

