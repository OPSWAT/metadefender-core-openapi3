package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.BatchResponseBatchFiles;
import org.openapitools.model.BatchResponseProcessInfo;
import org.openapitools.model.BatchResponseScanResults;
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
  * The response for a Batch status request.
 **/
@ApiModel(description="The response for a Batch status request.")
public class BatchResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BatchResponseBatchFiles batchFiles;

  @ApiModelProperty(example = "b7cc760038324b02908a5c111cb1563d", value = "The batch unique identifer")
 /**
   * The batch unique identifer
  **/
  private String batchId;

  @ApiModelProperty(example = "false", value = "The batch status (open/close).")
 /**
   * The batch status (open/close).
  **/
  private Boolean isClosed;

  @ApiModelProperty(value = "")
  @Valid
  private BatchResponseProcessInfo processInfo;

  @ApiModelProperty(value = "")
  @Valid
  private BatchResponseScanResults scanResults;

  @ApiModelProperty(example = "http://localhost:8008/", value = "Metadata submitted at batch creation.")
 /**
   * Metadata submitted at batch creation.
  **/
  private String userData;
 /**
   * Get batchFiles
   * @return batchFiles
  **/
  @JsonProperty("batch_files")
  public BatchResponseBatchFiles getBatchFiles() {
    return batchFiles;
  }

  public void setBatchFiles(BatchResponseBatchFiles batchFiles) {
    this.batchFiles = batchFiles;
  }

  public BatchResponse batchFiles(BatchResponseBatchFiles batchFiles) {
    this.batchFiles = batchFiles;
    return this;
  }

 /**
   * The batch unique identifer
   * @return batchId
  **/
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public BatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

 /**
   * The batch status (open/close).
   * @return isClosed
  **/
  @JsonProperty("is_closed")
  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  public BatchResponse isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

 /**
   * Get processInfo
   * @return processInfo
  **/
  @JsonProperty("process_info")
  public BatchResponseProcessInfo getProcessInfo() {
    return processInfo;
  }

  public void setProcessInfo(BatchResponseProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  public BatchResponse processInfo(BatchResponseProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

 /**
   * Get scanResults
   * @return scanResults
  **/
  @JsonProperty("scan_results")
  public BatchResponseScanResults getScanResults() {
    return scanResults;
  }

  public void setScanResults(BatchResponseScanResults scanResults) {
    this.scanResults = scanResults;
  }

  public BatchResponse scanResults(BatchResponseScanResults scanResults) {
    this.scanResults = scanResults;
    return this;
  }

 /**
   * Metadata submitted at batch creation.
   * @return userData
  **/
  @JsonProperty("user_data")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public BatchResponse userData(String userData) {
    this.userData = userData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    
    sb.append("    batchFiles: ").append(toIndentedString(batchFiles)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    processInfo: ").append(toIndentedString(processInfo)).append("\n");
    sb.append("    scanResults: ").append(toIndentedString(scanResults)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

