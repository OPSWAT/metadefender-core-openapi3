package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BatchResponseBatchFilesFilesInBatch;



/**
 * aaaaa
 **/

@ApiModel(description = "aaaaa")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class BatchResponseBatchFiles   {
  @JsonProperty("batch_count")
  private Integer batchCount;

  @JsonProperty("files_in_batch")
  private List<BatchResponseBatchFilesFilesInBatch> filesInBatch = null;

  @JsonProperty("first_index")
  private Integer firstIndex;

  @JsonProperty("page_size")
  private Integer pageSize;

  /**
   * How many files/entries in the batch.
   **/
  public BatchResponseBatchFiles batchCount(Integer batchCount) {
    this.batchCount = batchCount;
    return this;
  }

  
  @ApiModelProperty(example = "4", value = "How many files/entries in the batch.")
  @JsonProperty("batch_count")
  public Integer getBatchCount() {
    return batchCount;
  }
  public void setBatchCount(Integer batchCount) {
    this.batchCount = batchCount;
  }

  /**
   * The list of files in this batch.
   **/
  public BatchResponseBatchFiles filesInBatch(List<BatchResponseBatchFilesFilesInBatch> filesInBatch) {
    this.filesInBatch = filesInBatch;
    return this;
  }

  
  @ApiModelProperty(value = "The list of files in this batch.")
  @JsonProperty("files_in_batch")
  public List<BatchResponseBatchFilesFilesInBatch> getFilesInBatch() {
    return filesInBatch;
  }
  public void setFilesInBatch(List<BatchResponseBatchFilesFilesInBatch> filesInBatch) {
    this.filesInBatch = filesInBatch;
  }

  /**
   * The starting index in the batch. Used for pagination.
   **/
  public BatchResponseBatchFiles firstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "The starting index in the batch. Used for pagination.")
  @JsonProperty("first_index")
  public Integer getFirstIndex() {
    return firstIndex;
  }
  public void setFirstIndex(Integer firstIndex) {
    this.firstIndex = firstIndex;
  }

  /**
   * The number of entries per page.
   **/
  public BatchResponseBatchFiles pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  
  @ApiModelProperty(example = "50", value = "The number of entries per page.")
  @JsonProperty("page_size")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponseBatchFiles batchResponseBatchFiles = (BatchResponseBatchFiles) o;
    return Objects.equals(batchCount, batchResponseBatchFiles.batchCount) &&
        Objects.equals(filesInBatch, batchResponseBatchFiles.filesInBatch) &&
        Objects.equals(firstIndex, batchResponseBatchFiles.firstIndex) &&
        Objects.equals(pageSize, batchResponseBatchFiles.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchCount, filesInBatch, firstIndex, pageSize);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

