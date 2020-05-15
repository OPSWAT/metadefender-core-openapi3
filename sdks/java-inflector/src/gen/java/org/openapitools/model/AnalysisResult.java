package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AnalysisResultProcessInfo;
import org.openapitools.model.DLPResponse;
import org.openapitools.model.FileInformation;
import org.openapitools.model.MetascanReport;
import org.openapitools.model.VulnerabilityResponse;
import org.openapitools.model.YaraReport;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AnalysisResult   {
  @JsonProperty("data_id")
  private String dataId;

  @JsonProperty("dlp_info")
  private DLPResponse dlpInfo;

  @JsonProperty("file_info")
  private FileInformation fileInfo;

  @JsonProperty("process_info")
  private AnalysisResultProcessInfo processInfo;

  @JsonProperty("scan_results")
  private MetascanReport scanResults;

  @JsonProperty("vulnerability_info")
  private VulnerabilityResponse vulnerabilityInfo;

  @JsonProperty("yara")
  private YaraReport yara;

  /**
   * data identifier of the requested file
   **/
  public AnalysisResult dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

  
  @ApiModelProperty(example = "8101abae27be4d63859c55d9e0ed0135", value = "data identifier of the requested file")
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }
  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  /**
   **/
  public AnalysisResult dlpInfo(DLPResponse dlpInfo) {
    this.dlpInfo = dlpInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dlp_info")
  public DLPResponse getDlpInfo() {
    return dlpInfo;
  }
  public void setDlpInfo(DLPResponse dlpInfo) {
    this.dlpInfo = dlpInfo;
  }

  /**
   **/
  public AnalysisResult fileInfo(FileInformation fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file_info")
  public FileInformation getFileInfo() {
    return fileInfo;
  }
  public void setFileInfo(FileInformation fileInfo) {
    this.fileInfo = fileInfo;
  }

  /**
   **/
  public AnalysisResult processInfo(AnalysisResultProcessInfo processInfo) {
    this.processInfo = processInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process_info")
  public AnalysisResultProcessInfo getProcessInfo() {
    return processInfo;
  }
  public void setProcessInfo(AnalysisResultProcessInfo processInfo) {
    this.processInfo = processInfo;
  }

  /**
   **/
  public AnalysisResult scanResults(MetascanReport scanResults) {
    this.scanResults = scanResults;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scan_results")
  public MetascanReport getScanResults() {
    return scanResults;
  }
  public void setScanResults(MetascanReport scanResults) {
    this.scanResults = scanResults;
  }

  /**
   **/
  public AnalysisResult vulnerabilityInfo(VulnerabilityResponse vulnerabilityInfo) {
    this.vulnerabilityInfo = vulnerabilityInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vulnerability_info")
  public VulnerabilityResponse getVulnerabilityInfo() {
    return vulnerabilityInfo;
  }
  public void setVulnerabilityInfo(VulnerabilityResponse vulnerabilityInfo) {
    this.vulnerabilityInfo = vulnerabilityInfo;
  }

  /**
   **/
  public AnalysisResult yara(YaraReport yara) {
    this.yara = yara;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("yara")
  public YaraReport getYara() {
    return yara;
  }
  public void setYara(YaraReport yara) {
    this.yara = yara;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResult analysisResult = (AnalysisResult) o;
    return Objects.equals(dataId, analysisResult.dataId) &&
        Objects.equals(dlpInfo, analysisResult.dlpInfo) &&
        Objects.equals(fileInfo, analysisResult.fileInfo) &&
        Objects.equals(processInfo, analysisResult.processInfo) &&
        Objects.equals(scanResults, analysisResult.scanResults) &&
        Objects.equals(vulnerabilityInfo, analysisResult.vulnerabilityInfo) &&
        Objects.equals(yara, analysisResult.yara);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId, dlpInfo, fileInfo, processInfo, scanResults, vulnerabilityInfo, yara);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

