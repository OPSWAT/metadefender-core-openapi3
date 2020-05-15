package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AVEngineScanReport;



/**
 * Scan results for each antivirus engine. The key is the name of the antivirus engine and the value is the result of the antivirus engine
 **/

@ApiModel(description = "Scan results for each antivirus engine. The key is the name of the antivirus engine and the value is the result of the antivirus engine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class MetascanReportScanDetails   {
  @JsonProperty("ClamAV")
  private AVEngineScanReport clamAV;

  /**
   **/
  public MetascanReportScanDetails clamAV(AVEngineScanReport clamAV) {
    this.clamAV = clamAV;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ClamAV")
  public AVEngineScanReport getClamAV() {
    return clamAV;
  }
  public void setClamAV(AVEngineScanReport clamAV) {
    this.clamAV = clamAV;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetascanReportScanDetails metascanReportScanDetails = (MetascanReportScanDetails) o;
    return Objects.equals(clamAV, metascanReportScanDetails.clamAV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clamAV);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

