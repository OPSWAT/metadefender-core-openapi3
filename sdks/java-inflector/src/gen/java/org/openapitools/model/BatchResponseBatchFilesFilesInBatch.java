package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BatchResponseBatchFilesProcessInfo;
import org.openapitools.model.ProcessingResultsIndexEnum;
import org.openapitools.model.ProcessingResultsStringEnum;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponseBatchFilesFilesInBatch   {
  @JsonProperty("data_id")
  private String dataId;

  @JsonProperty("detected_by")
  private Integer detectedBy;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("file_size")
  private Integer fileSize;

  @JsonProperty("file_type")
  private String fileType;

  @JsonProperty("file_type_description")
  private String fileTypeDescription;

  @JsonProperty("process_info")
  private BatchResponseBatchFilesProcessInfo processInfo;

  @JsonProperty("progress_percentage")
  private Integer progressPercentage;

  @JsonProperty("scan_all_result_a")
  private ProcessingResultsStringEnum scanAllResultA = null;

  @JsonProperty("scan_all_result_i")
  private ProcessingResultsIndexEnum scanAllResultI = null;

  @JsonProperty("scanned_with")
  private Integer scannedWith;

  /**
   * Unique identifer for the file.
   **/
  public BatchResponseBatchFilesFilesInBatch dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

  
  @ApiModelProperty(example = "24c8b5dadd48445989ac3431544fdc34", value = "Unique identifer for the file.")
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }
  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  /**
   * Total number of engines that detected this file.
   **/
  public BatchResponseBatchFilesFilesInBatch detectedBy(Integer detectedBy) {
    this.detectedBy = detectedBy;
    return this;
  }

  
  @ApiModelProperty(example = "4", value = "Total number of engines that detected this file.")
  @JsonProperty("detected_by")
  public Integer getDetectedBy() {
    return detectedBy;
  }
  public void setDetectedBy(Integer detectedBy) {
    this.detectedBy = detectedBy;
  }

  /**
   * The filename reported via `filename` header.
   **/
  public BatchResponseBatchFilesFilesInBatch displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "eicar.com", value = "The filename reported via `filename` header.")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Total file size in bytes.
   **/
  public BatchResponseBatchFilesFilesInBatch fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  
  @ApiModelProperty(example = "68", value = "Total file size in bytes.")
  @JsonProperty("file_size")
  public Integer getFileSize() {
    return fileSize;
  }
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  /**
   * The filetype using mimetype.
   **/
  public BatchResponseBatchFilesFilesInBatch fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  
  @ApiModelProperty(example = "application/octet-stream", value = "The filetype using mimetype.")
  @JsonProperty("file_type")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  /**
   * The filetype in human readable format.
   **/
  public BatchResponseBatchFilesFilesInBatch fileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
    return this;
  }

  
  @ApiModelProperty(example = "EICAR virus test files", value = "The filetype in human readable format.")
  @JsonProperty("file_type_description")
  public String getFileTypeDescription() {
    return fileTypeDescription;
  }
  public void setFileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
  }

  /**
   **/
  public BatchResponseBatchFilesFilesInBatch processInfo(BatchResponseBatchFilesProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process_info")
  public BatchResponseBatchFilesProcessInfo getProcessInfo() {
    return processInfo;
  }
  public void setProcessInfo(BatchResponseBatchFilesProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  /**
   * Track analysis progress until reaches 100.
   **/
  public BatchResponseBatchFilesFilesInBatch progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Track analysis progress until reaches 100.")
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }
  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  /**
   * The overall scan result as string
   **/
  public BatchResponseBatchFilesFilesInBatch scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
    return this;
  }

  
  @ApiModelProperty(example = "Infected", value = "The overall scan result as string")
  @JsonProperty("scan_all_result_a")
  public ProcessingResultsStringEnum getScanAllResultA() {
    return scanAllResultA;
  }
  public void setScanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
  }

  /**
   * The overall scan result as index in the Processing Results table.
   **/
  public BatchResponseBatchFilesFilesInBatch scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The overall scan result as index in the Processing Results table.")
  @JsonProperty("scan_all_result_i")
  public ProcessingResultsIndexEnum getScanAllResultI() {
    return scanAllResultI;
  }
  public void setScanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
  }

  /**
   * The total number of engines used to analyze this file.
   **/
  public BatchResponseBatchFilesFilesInBatch scannedWith(Integer scannedWith) {
    this.scannedWith = scannedWith;
    return this;
  }

  
  @ApiModelProperty(example = "4", value = "The total number of engines used to analyze this file.")
  @JsonProperty("scanned_with")
  public Integer getScannedWith() {
    return scannedWith;
  }
  public void setScannedWith(Integer scannedWith) {
    this.scannedWith = scannedWith;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponseBatchFilesFilesInBatch batchResponseBatchFilesFilesInBatch = (BatchResponseBatchFilesFilesInBatch) o;
    return Objects.equals(dataId, batchResponseBatchFilesFilesInBatch.dataId) &&
        Objects.equals(detectedBy, batchResponseBatchFilesFilesInBatch.detectedBy) &&
        Objects.equals(displayName, batchResponseBatchFilesFilesInBatch.displayName) &&
        Objects.equals(fileSize, batchResponseBatchFilesFilesInBatch.fileSize) &&
        Objects.equals(fileType, batchResponseBatchFilesFilesInBatch.fileType) &&
        Objects.equals(fileTypeDescription, batchResponseBatchFilesFilesInBatch.fileTypeDescription) &&
        Objects.equals(processInfo, batchResponseBatchFilesFilesInBatch.processInfo) &&
        Objects.equals(progressPercentage, batchResponseBatchFilesFilesInBatch.progressPercentage) &&
        Objects.equals(scanAllResultA, batchResponseBatchFilesFilesInBatch.scanAllResultA) &&
        Objects.equals(scanAllResultI, batchResponseBatchFilesFilesInBatch.scanAllResultI) &&
        Objects.equals(scannedWith, batchResponseBatchFilesFilesInBatch.scannedWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId, detectedBy, displayName, fileSize, fileType, fileTypeDescription, processInfo, progressPercentage, scanAllResultA, scanAllResultI, scannedWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseBatchFilesFilesInBatch {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    detectedBy: ").append(toIndentedString(detectedBy)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileTypeDescription: ").append(toIndentedString(fileTypeDescription)).append("\n");
    sb.append("    processInfo: ").append(toIndentedString(processInfo)).append("\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    scanAllResultA: ").append(toIndentedString(scanAllResultA)).append("\n");
    sb.append("    scanAllResultI: ").append(toIndentedString(scanAllResultI)).append("\n");
    sb.append("    scannedWith: ").append(toIndentedString(scannedWith)).append("\n");
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

