package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BatchResponseBatchFiles;
import org.openapitools.model.BatchResponseProcessInfo;
import org.openapitools.model.BatchResponseScanResults;



/**
 * The response for a Batch status request.
 **/

@ApiModel(description = "The response for a Batch status request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponse   {
  @JsonProperty("batch_files")
  private BatchResponseBatchFiles batchFiles;

  @JsonProperty("batch_id")
  private String batchId;

  @JsonProperty("is_closed")
  private Boolean isClosed;

  @JsonProperty("process_info")
  private BatchResponseProcessInfo processInfo;

  @JsonProperty("scan_results")
  private BatchResponseScanResults scanResults;

  @JsonProperty("user_data")
  private String userData;

  /**
   **/
  public BatchResponse batchFiles(BatchResponseBatchFiles batchFiles) {
    this.batchFiles = batchFiles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batch_files")
  public BatchResponseBatchFiles getBatchFiles() {
    return batchFiles;
  }
  public void setBatchFiles(BatchResponseBatchFiles batchFiles) {
    this.batchFiles = batchFiles;
  }

  /**
   * The batch unique identifer
   **/
  public BatchResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  
  @ApiModelProperty(example = "b7cc760038324b02908a5c111cb1563d", value = "The batch unique identifer")
  @JsonProperty("batch_id")
  public String getBatchId() {
    return batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  /**
   * The batch status (open/close).
   **/
  public BatchResponse isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "The batch status (open/close).")
  @JsonProperty("is_closed")
  public Boolean getIsClosed() {
    return isClosed;
  }
  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  /**
   **/
  public BatchResponse processInfo(BatchResponseProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process_info")
  public BatchResponseProcessInfo getProcessInfo() {
    return processInfo;
  }
  public void setProcessInfo(BatchResponseProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  /**
   **/
  public BatchResponse scanResults(BatchResponseScanResults scanResults) {
    this.scanResults = scanResults;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scan_results")
  public BatchResponseScanResults getScanResults() {
    return scanResults;
  }
  public void setScanResults(BatchResponseScanResults scanResults) {
    this.scanResults = scanResults;
  }

  /**
   * Metadata submitted at batch creation.
   **/
  public BatchResponse userData(String userData) {
    this.userData = userData;
    return this;
  }

  
  @ApiModelProperty(example = "http://localhost:8008/", value = "Metadata submitted at batch creation.")
  @JsonProperty("user_data")
  public String getUserData() {
    return userData;
  }
  public void setUserData(String userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(batchFiles, batchResponse.batchFiles) &&
        Objects.equals(batchId, batchResponse.batchId) &&
        Objects.equals(isClosed, batchResponse.isClosed) &&
        Objects.equals(processInfo, batchResponse.processInfo) &&
        Objects.equals(scanResults, batchResponse.scanResults) &&
        Objects.equals(userData, batchResponse.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchFiles, batchId, isClosed, processInfo, scanResults, userData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

