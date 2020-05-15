package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DLPResponseDlpInfo;



/**
 * Full report from Proactive DLP
 **/

@ApiModel(description = "Full report from Proactive DLP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponse   {
  @JsonProperty("dlp_info")
  private DLPResponseDlpInfo dlpInfo;

  /**
   **/
  public DLPResponse dlpInfo(DLPResponseDlpInfo dlpInfo) {
    this.dlpInfo = dlpInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dlp_info")
  public DLPResponseDlpInfo getDlpInfo() {
    return dlpInfo;
  }
  public void setDlpInfo(DLPResponseDlpInfo dlpInfo) {
    this.dlpInfo = dlpInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPResponse dlPResponse = (DLPResponse) o;
    return Objects.equals(dlpInfo, dlPResponse.dlpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dlpInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponse {\n");
    
    sb.append("    dlpInfo: ").append(toIndentedString(dlpInfo)).append("\n");
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

