package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DeepCDRDetails;



/**
 * Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.
 **/

@ApiModel(description = "Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AnalysisResultProcessInfoPostProcessing   {
  @JsonProperty("actions_failed")
  private String actionsFailed;

  @JsonProperty("actions_ran")
  private String actionsRan;

  @JsonProperty("converted_destination")
  private String convertedDestination;

  @JsonProperty("converted_to")
  private String convertedTo;

  @JsonProperty("copy_move_destination")
  private String copyMoveDestination;

  @JsonProperty("sanitization_details")
  private DeepCDRDetails sanitizationDetails = null;

  /**
   * Empty string if no action failed or list of failed actions, separated by \"|\".
   **/
  public AnalysisResultProcessInfoPostProcessing actionsFailed(String actionsFailed) {
    this.actionsFailed = actionsFailed;
    return this;
  }

  
  @ApiModelProperty(example = "Sanitization Failed | PAscript failed", value = "Empty string if no action failed or list of failed actions, separated by \"|\".")
  @JsonProperty("actions_failed")
  public String getActionsFailed() {
    return actionsFailed;
  }
  public void setActionsFailed(String actionsFailed) {
    this.actionsFailed = actionsFailed;
  }

  /**
   * List of successful actions, separated by \"|\". Empty string if otherwise.
   **/
  public AnalysisResultProcessInfoPostProcessing actionsRan(String actionsRan) {
    this.actionsRan = actionsRan;
    return this;
  }

  
  @ApiModelProperty(example = "Sanitized | PAscript", value = "List of successful actions, separated by \"|\". Empty string if otherwise.")
  @JsonProperty("actions_ran")
  public String getActionsRan() {
    return actionsRan;
  }
  public void setActionsRan(String actionsRan) {
    this.actionsRan = actionsRan;
  }

  /**
   * Contains the name of the sanitized file.
   **/
  public AnalysisResultProcessInfoPostProcessing convertedDestination(String convertedDestination) {
    this.convertedDestination = convertedDestination;
    return this;
  }

  
  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN_sanitized.pdf", value = "Contains the name of the sanitized file.")
  @JsonProperty("converted_destination")
  public String getConvertedDestination() {
    return convertedDestination;
  }
  public void setConvertedDestination(String convertedDestination) {
    this.convertedDestination = convertedDestination;
  }

  /**
   * Contains target type name of sanitization.
   **/
  public AnalysisResultProcessInfoPostProcessing convertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Contains target type name of sanitization.")
  @JsonProperty("converted_to")
  public String getConvertedTo() {
    return convertedTo;
  }
  public void setConvertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
  }

  /**
   * Contains target type name of sanitization.
   **/
  public AnalysisResultProcessInfoPostProcessing copyMoveDestination(String copyMoveDestination) {
    this.copyMoveDestination = copyMoveDestination;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "Contains target type name of sanitization.")
  @JsonProperty("copy_move_destination")
  public String getCopyMoveDestination() {
    return copyMoveDestination;
  }
  public void setCopyMoveDestination(String copyMoveDestination) {
    this.copyMoveDestination = copyMoveDestination;
  }

  /**
   * Contains target type name of sanitization.
   **/
  public AnalysisResultProcessInfoPostProcessing sanitizationDetails(DeepCDRDetails sanitizationDetails) {
    this.sanitizationDetails = sanitizationDetails;
    return this;
  }

  
  @ApiModelProperty(value = "Contains target type name of sanitization.")
  @JsonProperty("sanitization_details")
  public DeepCDRDetails getSanitizationDetails() {
    return sanitizationDetails;
  }
  public void setSanitizationDetails(DeepCDRDetails sanitizationDetails) {
    this.sanitizationDetails = sanitizationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResultProcessInfoPostProcessing analysisResultProcessInfoPostProcessing = (AnalysisResultProcessInfoPostProcessing) o;
    return Objects.equals(actionsFailed, analysisResultProcessInfoPostProcessing.actionsFailed) &&
        Objects.equals(actionsRan, analysisResultProcessInfoPostProcessing.actionsRan) &&
        Objects.equals(convertedDestination, analysisResultProcessInfoPostProcessing.convertedDestination) &&
        Objects.equals(convertedTo, analysisResultProcessInfoPostProcessing.convertedTo) &&
        Objects.equals(copyMoveDestination, analysisResultProcessInfoPostProcessing.copyMoveDestination) &&
        Objects.equals(sanitizationDetails, analysisResultProcessInfoPostProcessing.sanitizationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionsFailed, actionsRan, convertedDestination, convertedTo, copyMoveDestination, sanitizationDetails);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

