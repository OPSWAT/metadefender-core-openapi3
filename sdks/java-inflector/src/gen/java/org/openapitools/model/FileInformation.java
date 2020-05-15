package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * basic information of the scanned file
 **/

@ApiModel(description = "basic information of the scanned file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class FileInformation   {
  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("file_size")
  private Integer fileSize;

  @JsonProperty("file_type")
  private String fileType;

  @JsonProperty("file_type_description")
  private String fileTypeDescription;

  @JsonProperty("md5")
  private String md5;

  @JsonProperty("sha1")
  private String sha1;

  @JsonProperty("sha256")
  private String sha256;

  @JsonProperty("upload_timestamp")
  private String uploadTimestamp;

  /**
   * The filename reported via `filename` header.
   **/
  public FileInformation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN.pdf", value = "The filename reported via `filename` header.")
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
  public FileInformation fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  
  @ApiModelProperty(example = "75906", value = "Total file size in bytes.")
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
  public FileInformation fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  
  @ApiModelProperty(example = "application/pdf", value = "The filetype using mimetype.")
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
  public FileInformation fileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
    return this;
  }

  
  @ApiModelProperty(example = "Adobe Portable Document Format", value = "The filetype in human readable format.")
  @JsonProperty("file_type_description")
  public String getFileTypeDescription() {
    return fileTypeDescription;
  }
  public void setFileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
  }

  /**
   * File's MD5 hash.
   **/
  public FileInformation md5(String md5) {
    this.md5 = md5;
    return this;
  }

  
  @ApiModelProperty(example = "c4863c8ce44fb7ae84eb48c9b78f8b5e", value = "File's MD5 hash.")
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  /**
   * File's SHA1 hash.
   **/
  public FileInformation sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  
  @ApiModelProperty(example = "a33c72a996a9603d479e3dff3d23bf619c975fbe", value = "File's SHA1 hash.")
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  /**
   * File's SHA256 Hash.
   **/
  public FileInformation sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

  
  @ApiModelProperty(example = "b9fdc10b47950b9e503ef4dc0ef42d28e7c37ccd749d4a5dcd7d9b3218996b7f", value = "File's SHA256 Hash.")
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  /**
   * The timestamp when file was successfully uploaded to MetaDefender.
   **/
  public FileInformation uploadTimestamp(String uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "2020-03-12T08:37:05.412Z", value = "The timestamp when file was successfully uploaded to MetaDefender.")
  @JsonProperty("upload_timestamp")
  public String getUploadTimestamp() {
    return uploadTimestamp;
  }
  public void setUploadTimestamp(String uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileInformation fileInformation = (FileInformation) o;
    return Objects.equals(displayName, fileInformation.displayName) &&
        Objects.equals(fileSize, fileInformation.fileSize) &&
        Objects.equals(fileType, fileInformation.fileType) &&
        Objects.equals(fileTypeDescription, fileInformation.fileTypeDescription) &&
        Objects.equals(md5, fileInformation.md5) &&
        Objects.equals(sha1, fileInformation.sha1) &&
        Objects.equals(sha256, fileInformation.sha256) &&
        Objects.equals(uploadTimestamp, fileInformation.uploadTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, fileSize, fileType, fileTypeDescription, md5, sha1, sha256, uploadTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileInformation {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileTypeDescription: ").append(toIndentedString(fileTypeDescription)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    uploadTimestamp: ").append(toIndentedString(uploadTimestamp)).append("\n");
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

