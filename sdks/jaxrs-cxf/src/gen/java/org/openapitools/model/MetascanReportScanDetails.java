package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.AVEngineScanReport;
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
  * Scan results for each antivirus engine. The key is the name of the antivirus engine and the value is the result of the antivirus engine
 **/
@ApiModel(description="Scan results for each antivirus engine. The key is the name of the antivirus engine and the value is the result of the antivirus engine")
public class MetascanReportScanDetails  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AVEngineScanReport clamAV;
 /**
   * Get clamAV
   * @return clamAV
  **/
  @JsonProperty("ClamAV")
  public AVEngineScanReport getClamAV() {
    return clamAV;
  }

  public void setClamAV(AVEngineScanReport clamAV) {
    this.clamAV = clamAV;
  }

  public MetascanReportScanDetails clamAV(AVEngineScanReport clamAV) {
    this.clamAV = clamAV;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetascanReportScanDetails {\n");
    
    sb.append("    clamAV: ").append(toIndentedString(clamAV)).append("\n");
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

