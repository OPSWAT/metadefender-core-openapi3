package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
  * basic information of the scanned file
 **/
@ApiModel(description="basic information of the scanned file")
public class FileInformation  {
  
  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN.pdf", value = "The filename reported via `filename` header.")
 /**
   * The filename reported via `filename` header.
  **/
  private String displayName;

  @ApiModelProperty(example = "75906", value = "Total file size in bytes.")
 /**
   * Total file size in bytes.
  **/
  private Integer fileSize;

  @ApiModelProperty(example = "application/pdf", value = "The filetype using mimetype.")
 /**
   * The filetype using mimetype.
  **/
  private String fileType;

  @ApiModelProperty(example = "Adobe Portable Document Format", value = "The filetype in human readable format.")
 /**
   * The filetype in human readable format.
  **/
  private String fileTypeDescription;

  @ApiModelProperty(example = "c4863c8ce44fb7ae84eb48c9b78f8b5e", value = "File's MD5 hash.")
 /**
   * File's MD5 hash.
  **/
  private String md5;

  @ApiModelProperty(example = "a33c72a996a9603d479e3dff3d23bf619c975fbe", value = "File's SHA1 hash.")
 /**
   * File's SHA1 hash.
  **/
  private String sha1;

  @ApiModelProperty(example = "b9fdc10b47950b9e503ef4dc0ef42d28e7c37ccd749d4a5dcd7d9b3218996b7f", value = "File's SHA256 Hash.")
 /**
   * File's SHA256 Hash.
  **/
  private String sha256;

  @ApiModelProperty(example = "2020-03-12T08:37:05.412Z", value = "The timestamp when file was successfully uploaded to MetaDefender.")
 /**
   * The timestamp when file was successfully uploaded to MetaDefender.
  **/
  private String uploadTimestamp;
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

  public FileInformation displayName(String displayName) {
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

  public FileInformation fileSize(Integer fileSize) {
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

  public FileInformation fileType(String fileType) {
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

  public FileInformation fileTypeDescription(String fileTypeDescription) {
    this.fileTypeDescription = fileTypeDescription;
    return this;
  }

 /**
   * File&#39;s MD5 hash.
   * @return md5
  **/
  @JsonProperty("md5")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public FileInformation md5(String md5) {
    this.md5 = md5;
    return this;
  }

 /**
   * File&#39;s SHA1 hash.
   * @return sha1
  **/
  @JsonProperty("sha1")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public FileInformation sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

 /**
   * File&#39;s SHA256 Hash.
   * @return sha256
  **/
  @JsonProperty("sha256")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public FileInformation sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

 /**
   * The timestamp when file was successfully uploaded to MetaDefender.
   * @return uploadTimestamp
  **/
  @JsonProperty("upload_timestamp")
  public String getUploadTimestamp() {
    return uploadTimestamp;
  }

  public void setUploadTimestamp(String uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
  }

  public FileInformation uploadTimestamp(String uploadTimestamp) {
    this.uploadTimestamp = uploadTimestamp;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

