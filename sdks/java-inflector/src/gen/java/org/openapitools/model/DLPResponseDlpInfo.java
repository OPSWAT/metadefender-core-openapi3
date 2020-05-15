package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DLPResponseDlpInfoHits;
import org.openapitools.model.DLPResponseDlpInfoMetadataRemoval;
import org.openapitools.model.DLPResponseDlpInfoRedact;
import org.openapitools.model.DLPResponseDlpInfoWatermark;



/**
 * Information on matched sensitive data
 **/

@ApiModel(description = "Information on matched sensitive data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPResponseDlpInfo   {
  /**
   * Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High` 
   */
  public enum CertaintyEnum {
    VERY_LOW("Very Low"),
    
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High"),
    
    VERY_HIGH("Very High");

    private String value;

    CertaintyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CertaintyEnum fromValue(String text) {
      for (CertaintyEnum b : CertaintyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("certainty")
  private CertaintyEnum certainty;

  @JsonProperty("errors")
  private Object errors;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("hits")
  private DLPResponseDlpInfoHits hits;

  @JsonProperty("metadata_removal")
  private DLPResponseDlpInfoMetadataRemoval metadataRemoval;

  @JsonProperty("redact")
  private DLPResponseDlpInfoRedact redact;

  /**
   * (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss 
   */
  public enum SeverityEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    SeverityEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity;

  /**
   * The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | 
   */
  public enum VerdictEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    VerdictEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerdictEnum fromValue(String text) {
      for (VerdictEnum b : VerdictEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("verdict")
  private VerdictEnum verdict;

  @JsonProperty("watermark")
  private DLPResponseDlpInfoWatermark watermark;

  /**
   * Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High` 
   **/
  public DLPResponseDlpInfo certainty(CertaintyEnum certainty) {
    this.certainty = certainty;
    return this;
  }

  
  @ApiModelProperty(example = "High", value = "Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High` ")
  @JsonProperty("certainty")
  public CertaintyEnum getCertainty() {
    return certainty;
  }
  public void setCertainty(CertaintyEnum certainty) {
    this.certainty = certainty;
  }

  /**
   * A  list of error objects (empty if no errors happened), each error object contains following keys:   * `scan`: scan related error description   * `redact`: redaction related error description   * `watermark`: watermark related error description   * `metadata_removal`: metadata removal related error description 
   **/
  public DLPResponseDlpInfo errors(Object errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(example = "{redact=File structure invalid.}", value = "A  list of error objects (empty if no errors happened), each error object contains following keys:   * `scan`: scan related error description   * `redact`: redaction related error description   * `watermark`: watermark related error description   * `metadata_removal`: metadata removal related error description ")
  @JsonProperty("errors")
  public Object getErrors() {
    return errors;
  }
  public void setErrors(Object errors) {
    this.errors = errors;
  }

  /**
   * Output processed file name (pre-configured on engine settings under Core's worflow rule)
   **/
  public DLPResponseDlpInfo filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN_proactive-dlp-processed_by_OPSWAT_MetaDefender_8101abae27be4d63859c55d9e0ed0135.pdf", value = "Output processed file name (pre-configured on engine settings under Core's worflow rule)")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   **/
  public DLPResponseDlpInfo hits(DLPResponseDlpInfoHits hits) {
    this.hits = hits;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hits")
  public DLPResponseDlpInfoHits getHits() {
    return hits;
  }
  public void setHits(DLPResponseDlpInfoHits hits) {
    this.hits = hits;
  }

  /**
   **/
  public DLPResponseDlpInfo metadataRemoval(DLPResponseDlpInfoMetadataRemoval metadataRemoval) {
    this.metadataRemoval = metadataRemoval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("metadata_removal")
  public DLPResponseDlpInfoMetadataRemoval getMetadataRemoval() {
    return metadataRemoval;
  }
  public void setMetadataRemoval(DLPResponseDlpInfoMetadataRemoval metadataRemoval) {
    this.metadataRemoval = metadataRemoval;
  }

  /**
   **/
  public DLPResponseDlpInfo redact(DLPResponseDlpInfoRedact redact) {
    this.redact = redact;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redact")
  public DLPResponseDlpInfoRedact getRedact() {
    return redact;
  }
  public void setRedact(DLPResponseDlpInfoRedact redact) {
    this.redact = redact;
  }

  /**
   * (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss 
   **/
  public DLPResponseDlpInfo severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "(NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss ")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  /**
   * The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | 
   **/
  public DLPResponseDlpInfo verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | ")
  @JsonProperty("verdict")
  public VerdictEnum getVerdict() {
    return verdict;
  }
  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }

  /**
   **/
  public DLPResponseDlpInfo watermark(DLPResponseDlpInfoWatermark watermark) {
    this.watermark = watermark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("watermark")
  public DLPResponseDlpInfoWatermark getWatermark() {
    return watermark;
  }
  public void setWatermark(DLPResponseDlpInfoWatermark watermark) {
    this.watermark = watermark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPResponseDlpInfo dlPResponseDlpInfo = (DLPResponseDlpInfo) o;
    return Objects.equals(certainty, dlPResponseDlpInfo.certainty) &&
        Objects.equals(errors, dlPResponseDlpInfo.errors) &&
        Objects.equals(filename, dlPResponseDlpInfo.filename) &&
        Objects.equals(hits, dlPResponseDlpInfo.hits) &&
        Objects.equals(metadataRemoval, dlPResponseDlpInfo.metadataRemoval) &&
        Objects.equals(redact, dlPResponseDlpInfo.redact) &&
        Objects.equals(severity, dlPResponseDlpInfo.severity) &&
        Objects.equals(verdict, dlPResponseDlpInfo.verdict) &&
        Objects.equals(watermark, dlPResponseDlpInfo.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certainty, errors, filename, hits, metadataRemoval, redact, severity, verdict, watermark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPResponseDlpInfo {\n");
    
    sb.append("    certainty: ").append(toIndentedString(certainty)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    metadataRemoval: ").append(toIndentedString(metadataRemoval)).append("\n");
    sb.append("    redact: ").append(toIndentedString(redact)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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

