package org.openapitools.model;

import org.openapitools.model.AnalysisResultProcessInfo;
import org.openapitools.model.DLPResponse;
import org.openapitools.model.FileInformation;
import org.openapitools.model.MetascanReport;
import org.openapitools.model.VulnerabilityResponse;
import org.openapitools.model.YaraReport;
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

public class AnalysisResult  {
  
  @ApiModelProperty(example = "8101abae27be4d63859c55d9e0ed0135", value = "data identifier of the requested file")
 /**
   * data identifier of the requested file
  **/
  private String dataId;

  @ApiModelProperty(value = "")
  @Valid
  private DLPResponse dlpInfo;

  @ApiModelProperty(value = "")
  @Valid
  private FileInformation fileInfo;

  @ApiModelProperty(value = "")
  @Valid
  private AnalysisResultProcessInfo processInfo;

  @ApiModelProperty(value = "")
  @Valid
  private MetascanReport scanResults;

  @ApiModelProperty(value = "")
  @Valid
  private VulnerabilityResponse vulnerabilityInfo;

  @ApiModelProperty(value = "")
  @Valid
  private YaraReport yara;
 /**
   * data identifier of the requested file
   * @return dataId
  **/
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public AnalysisResult dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

 /**
   * Get dlpInfo
   * @return dlpInfo
  **/
  @JsonProperty("dlp_info")
  public DLPResponse getDlpInfo() {
    return dlpInfo;
  }

  public void setDlpInfo(DLPResponse dlpInfo) {
    this.dlpInfo = dlpInfo;
  }

  public AnalysisResult dlpInfo(DLPResponse dlpInfo) {
    this.dlpInfo = dlpInfo;
    return this;
  }

 /**
   * Get fileInfo
   * @return fileInfo
  **/
  @JsonProperty("file_info")
  public FileInformation getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInformation fileInfo) {
    this.fileInfo = fileInfo;
  }

  public AnalysisResult fileInfo(FileInformation fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

 /**
   * Get processInfo
   * @return processInfo
  **/
  @JsonProperty("process_info")
  public AnalysisResultProcessInfo getProcessInfo() {
    return processInfo;
  }

  public void setProcessInfo(AnalysisResultProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  public AnalysisResult processInfo(AnalysisResultProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

 /**
   * Get scanResults
   * @return scanResults
  **/
  @JsonProperty("scan_results")
  public MetascanReport getScanResults() {
    return scanResults;
  }

  public void setScanResults(MetascanReport scanResults) {
    this.scanResults = scanResults;
  }

  public AnalysisResult scanResults(MetascanReport scanResults) {
    this.scanResults = scanResults;
    return this;
  }

 /**
   * Get vulnerabilityInfo
   * @return vulnerabilityInfo
  **/
  @JsonProperty("vulnerability_info")
  public VulnerabilityResponse getVulnerabilityInfo() {
    return vulnerabilityInfo;
  }

  public void setVulnerabilityInfo(VulnerabilityResponse vulnerabilityInfo) {
    this.vulnerabilityInfo = vulnerabilityInfo;
  }

  public AnalysisResult vulnerabilityInfo(VulnerabilityResponse vulnerabilityInfo) {
    this.vulnerabilityInfo = vulnerabilityInfo;
    return this;
  }

 /**
   * Get yara
   * @return yara
  **/
  @JsonProperty("yara")
  public YaraReport getYara() {
    return yara;
  }

  public void setYara(YaraReport yara) {
    this.yara = yara;
  }

  public AnalysisResult yara(YaraReport yara) {
    this.yara = yara;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResult {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    dlpInfo: ").append(toIndentedString(dlpInfo)).append("\n");
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    processInfo: ").append(toIndentedString(processInfo)).append("\n");
    sb.append("    scanResults: ").append(toIndentedString(scanResults)).append("\n");
    sb.append("    vulnerabilityInfo: ").append(toIndentedString(vulnerabilityInfo)).append("\n");
    sb.append("    yara: ").append(toIndentedString(yara)).append("\n");
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

