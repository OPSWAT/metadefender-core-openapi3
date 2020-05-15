package org.openapitools.model;

import org.openapitools.model.BatchResponseBatchFilesProcessInfo;
import org.openapitools.model.ProcessingResultsIndexEnum;
import org.openapitools.model.ProcessingResultsStringEnum;
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

public class BatchResponseBatchFilesFilesInBatch  {
  
  @ApiModelProperty(example = "24c8b5dadd48445989ac3431544fdc34", value = "Unique identifer for the file.")
 /**
   * Unique identifer for the file.
  **/
  private String dataId;

  @ApiModelProperty(example = "4", value = "Total number of engines that detected this file.")
 /**
   * Total number of engines that detected this file.
  **/
  private Integer detectedBy;

  @ApiModelProperty(example = "eicar.com", value = "The filename reported via `filename` header.")
 /**
   * The filename reported via `filename` header.
  **/
  private String displayName;

  @ApiModelProperty(example = "68", value = "Total file size in bytes.")
 /**
   * Total file size in bytes.
  **/
  private Integer fileSize;

  @ApiModelProperty(example = "application/octet-stream", value = "The filetype using mimetype.")
 /**
   * The filetype using mimetype.
  **/
  private String fileType;

  @ApiModelProperty(example = "EICAR virus test files", value = "The filetype in human readable format.")
 /**
   * The filetype in human readable format.
  **/
  private String fileTypeDescription;

  @ApiModelProperty(value = "")
  @Valid
  private BatchResponseBatchFilesProcessInfo processInfo;

  @ApiModelProperty(example = "100", value = "Track analysis progress until reaches 100.")
 /**
   * Track analysis progress until reaches 100.
  **/
  private Integer progressPercentage;

  @ApiModelProperty(example = "Infected", value = "The overall scan result as string")
  @Valid
 /**
   * The overall scan result as string
  **/
  private ProcessingResultsStringEnum scanAllResultA = null;

  @ApiModelProperty(example = "1", value = "The overall scan result as index in the Processing Results table.")
  @Valid
 /**
   * The overall scan result as index in the Processing Results table.
  **/
  private ProcessingResultsIndexEnum scanAllResultI = null;

  @ApiModelProperty(example = "4", value = "The total number of engines used to analyze this file.")
 /**
   * The total number of engines used to analyze this file.
  **/
  private Integer scannedWith;
 /**
   * Unique identifer for the file.
   * @return dataId
  **/
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public BatchResponseBatchFilesFilesInBatch dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

 /**
   * Total number of engines that detected this file.
   * @return detectedBy
  **/
  @JsonProperty("detected_by")
  public Integer getDetectedBy() {
    return detectedBy;
  }

  public void setDetectedBy(Integer detectedBy) {
    this.detectedBy = detectedBy;
  }

  public BatchResponseBatchFilesFilesInBatch detectedBy(Integer detectedBy) {
    this.detectedBy = detectedBy;
    return this;
  }

 /**
   * The filename reported via &#x60;filename&#x60; header.
   * @return displayName
  **/
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public BatchResponseBatchFilesFilesInBatch displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * Total file size in bytes.
   * @return fileSize
  **/
  @JsonProperty("file_size")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public BatchResponseBatchFilesFilesInBatch fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

 /**
   * The filetype using mimetype.
   * @return fileType
  **/
  @JsonProperty("file_type")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public BatchResponseBatchFilesFilesInBatch fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

 /**
   * The filetype in human readable format.
   * @return fileTypeDescription
  **/
  @JsonProperty("file_type_description")
  public String getFileTypeDescription() {
    return fileTypeDescription;
  }

  public void setFileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
  }

  public BatchResponseBatchFilesFilesInBatch fileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
    return this;
  }

 /**
   * Get processInfo
   * @return processInfo
  **/
  @JsonProperty("process_info")
  public BatchResponseBatchFilesProcessInfo getProcessInfo() {
    return processInfo;
  }

  public void setProcessInfo(BatchResponseBatchFilesProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  public BatchResponseBatchFilesFilesInBatch processInfo(BatchResponseBatchFilesProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

 /**
   * Track analysis progress until reaches 100.
   * @return progressPercentage
  **/
  @JsonProperty("progress_percentage")
  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  public BatchResponseBatchFilesFilesInBatch progressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
    return this;
  }

 /**
   * The overall scan result as string
   * @return scanAllResultA
  **/
  @JsonProperty("scan_all_result_a")
  public ProcessingResultsStringEnum getScanAllResultA() {
    return scanAllResultA;
  }

  public void setScanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
  }

  public BatchResponseBatchFilesFilesInBatch scanAllResultA(ProcessingResultsStringEnum scanAllResultA) {
    this.scanAllResultA = scanAllResultA;
    return this;
  }

 /**
   * The overall scan result as index in the Processing Results table.
   * @return scanAllResultI
  **/
  @JsonProperty("scan_all_result_i")
  public ProcessingResultsIndexEnum getScanAllResultI() {
    return scanAllResultI;
  }

  public void setScanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
  }

  public BatchResponseBatchFilesFilesInBatch scanAllResultI(ProcessingResultsIndexEnum scanAllResultI) {
    this.scanAllResultI = scanAllResultI;
    return this;
  }

 /**
   * The total number of engines used to analyze this file.
   * @return scannedWith
  **/
  @JsonProperty("scanned_with")
  public Integer getScannedWith() {
    return scannedWith;
  }

  public void setScannedWith(Integer scannedWith) {
    this.scannedWith = scannedWith;
  }

  public BatchResponseBatchFilesFilesInBatch scannedWith(Integer scannedWith) {
    this.scannedWith = scannedWith;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

