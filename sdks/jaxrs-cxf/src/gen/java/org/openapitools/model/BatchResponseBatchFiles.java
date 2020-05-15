package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BatchResponseBatchFilesFilesInBatch;
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
  * aaaaa
 **/
@ApiModel(description="aaaaa")
public class BatchResponseBatchFiles  {
  
  @ApiModelProperty(example = "4", value = "How many files/entries in the batch.")
 /**
   * How many files/entries in the batch.
  **/
  private Integer batchCount;

  @ApiModelProperty(value = "The list of files in this batch.")
  @Valid
 /**
   * The list of files in this batch.
  **/
  private List<BatchResponseBatchFilesFilesInBatch> filesInBatch = null;

  @ApiModelProperty(example = "0", value = "The starting index in the batch. Used for pagination.")
 /**
   * The starting index in the batch. Used for pagination.
  **/
  private Integer firstIndex;

  @ApiModelProperty(example = "50", value = "The number of entries per page.")
 /**
   * The number of entries per page.
  **/
  private Integer pageSize;
 /**
   * How many files/entries in the batch.
   * @return batchCount
  **/
  @JsonProperty("batch_count")
  public Integer getBatchCount() {
    return batchCount;
  }

  public void setBatchCount(Integer batchCount) {
    this.batchCount = batchCount;
  }

  public BatchResponseBatchFiles batchCount(Integer batchCount) {
    this.batchCount = batchCount;
    return this;
  }

 /**
   * The list of files in this batch.
   * @return filesInBatch
  **/
  @JsonProperty("files_in_batch")
  public List<BatchResponseBatchFilesFilesInBatch> getFilesInBatch() {
    return filesInBatch;
  }

  public void setFilesInBatch(List<BatchResponseBatchFilesFilesInBatch> filesInBatch) {
    this.filesInBatch = filesInBatch;
  }

  public BatchResponseBatchFiles filesInBatch(List<BatchResponseBatchFilesFilesInBatch> filesInBatch) {
    this.filesInBatch = filesInBatch;
    return this;
  }

  public BatchResponseBatchFiles addFilesInBatchItem(BatchResponseBatchFilesFilesInBatch filesInBatchItem) {
    this.filesInBatch.add(filesInBatchItem);
    return this;
  }

 /**
   * The starting index in the batch. Used for pagination.
   * @return firstIndex
  **/
  @JsonProperty("first_index")
  public Integer getFirstIndex() {
    return firstIndex;
  }

  public void setFirstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
  }

  public BatchResponseBatchFiles firstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
    return this;
  }

 /**
   * The number of entries per page.
   * @return pageSize
  **/
  @JsonProperty("page_size")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public BatchResponseBatchFiles pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponseBatchFiles {\n");
    
    sb.append("    batchCount: ").append(toIndentedString(batchCount)).append("\n");
    sb.append("    filesInBatch: ").append(toIndentedString(filesInBatch)).append("\n");
    sb.append("    firstIndex: ").append(toIndentedString(firstIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

