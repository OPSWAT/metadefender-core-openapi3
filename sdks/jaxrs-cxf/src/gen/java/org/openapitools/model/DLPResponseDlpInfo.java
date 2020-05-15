package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.DLPResponseDlpInfoHits;
import org.openapitools.model.DLPResponseDlpInfoMetadataRemoval;
import org.openapitools.model.DLPResponseDlpInfoRedact;
import org.openapitools.model.DLPResponseDlpInfoWatermark;
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
  * Information on matched sensitive data
 **/
@ApiModel(description="Information on matched sensitive data")
public class DLPResponseDlpInfo  {
  
@XmlType(name="CertaintyEnum")
@XmlEnum(String.class)
public enum CertaintyEnum {

@XmlEnumValue("Very Low") VERY_LOW(String.valueOf("Very Low")), @XmlEnumValue("Low") LOW(String.valueOf("Low")), @XmlEnumValue("Medium") MEDIUM(String.valueOf("Medium")), @XmlEnumValue("High") HIGH(String.valueOf("High")), @XmlEnumValue("Very High") VERY_HIGH(String.valueOf("Very High"));


    private String value;

    CertaintyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CertaintyEnum fromValue(String value) {
        for (CertaintyEnum b : CertaintyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "High", value = "Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High` ")
 /**
   * Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High` 
  **/
  private CertaintyEnum certainty;

  @ApiModelProperty(example = "{redact=File structure invalid.}", value = "A  list of error objects (empty if no errors happened), each error object contains following keys:   * `scan`: scan related error description   * `redact`: redaction related error description   * `watermark`: watermark related error description   * `metadata_removal`: metadata removal related error description ")
  @Valid
 /**
   * A  list of error objects (empty if no errors happened), each error object contains following keys:   * `scan`: scan related error description   * `redact`: redaction related error description   * `watermark`: watermark related error description   * `metadata_removal`: metadata removal related error description 
  **/
  private Object errors;

  @ApiModelProperty(example = "OPSWAT_Proactive_DLP_CCN_proactive-dlp-processed_by_OPSWAT_MetaDefender_8101abae27be4d63859c55d9e0ed0135.pdf", value = "Output processed file name (pre-configured on engine settings under Core's worflow rule)")
 /**
   * Output processed file name (pre-configured on engine settings under Core's worflow rule)
  **/
  private String filename;

  @ApiModelProperty(value = "")
  @Valid
  private DLPResponseDlpInfoHits hits;

  @ApiModelProperty(value = "")
  @Valid
  private DLPResponseDlpInfoMetadataRemoval metadataRemoval;

  @ApiModelProperty(value = "")
  @Valid
  private DLPResponseDlpInfoRedact redact;

@XmlType(name="SeverityEnum")
@XmlEnum(Integer.class)
public enum SeverityEnum {

@XmlEnumValue("0") NUMBER_0(Integer.valueOf(0)), @XmlEnumValue("1") NUMBER_1(Integer.valueOf(1));


    private Integer value;

    SeverityEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SeverityEnum fromValue(Integer value) {
        for (SeverityEnum b : SeverityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "0", value = "(NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss ")
 /**
   * (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss 
  **/
  private SeverityEnum severity;

@XmlType(name="VerdictEnum")
@XmlEnum(Integer.class)
public enum VerdictEnum {

@XmlEnumValue("0") NUMBER_0(Integer.valueOf(0)), @XmlEnumValue("1") NUMBER_1(Integer.valueOf(1)), @XmlEnumValue("2") NUMBER_2(Integer.valueOf(2)), @XmlEnumValue("3") NUMBER_3(Integer.valueOf(3)), @XmlEnumValue("4") NUMBER_4(Integer.valueOf(4));


    private Integer value;

    VerdictEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VerdictEnum fromValue(Integer value) {
        for (VerdictEnum b : VerdictEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "1", value = "The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | ")
 /**
   * The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | 
  **/
  private VerdictEnum verdict;

  @ApiModelProperty(value = "")
  @Valid
  private DLPResponseDlpInfoWatermark watermark;
 /**
   * Describes how certain the hit is, possible values:   * &#x60;Very Low&#x60;   * &#x60;Low&#x60;   * &#x60;Medium&#x60;   * &#x60;High&#x60;   * &#x60;Very High&#x60; 
   * @return certainty
  **/
  @JsonProperty("certainty")
  public String getCertainty() {
    if (certainty == null) {
      return null;
    }
    return certainty.value();
  }

  public void setCertainty(CertaintyEnum certainty) {
    this.certainty = certainty;
  }

  public DLPResponseDlpInfo certainty(CertaintyEnum certainty) {
    this.certainty = certainty;
    return this;
  }

 /**
   * A  list of error objects (empty if no errors happened), each error object contains following keys:   * &#x60;scan&#x60;: scan related error description   * &#x60;redact&#x60;: redaction related error description   * &#x60;watermark&#x60;: watermark related error description   * &#x60;metadata_removal&#x60;: metadata removal related error description 
   * @return errors
  **/
  @JsonProperty("errors")
  public Object getErrors() {
    return errors;
  }

  public void setErrors(Object errors) {
    this.errors = errors;
  }

  public DLPResponseDlpInfo errors(Object errors) {
    this.errors = errors;
    return this;
  }

 /**
   * Output processed file name (pre-configured on engine settings under Core&#39;s worflow rule)
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public DLPResponseDlpInfo filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
   * Get hits
   * @return hits
  **/
  @JsonProperty("hits")
  public DLPResponseDlpInfoHits getHits() {
    return hits;
  }

  public void setHits(DLPResponseDlpInfoHits hits) {
    this.hits = hits;
  }

  public DLPResponseDlpInfo hits(DLPResponseDlpInfoHits hits) {
    this.hits = hits;
    return this;
  }

 /**
   * Get metadataRemoval
   * @return metadataRemoval
  **/
  @JsonProperty("metadata_removal")
  public DLPResponseDlpInfoMetadataRemoval getMetadataRemoval() {
    return metadataRemoval;
  }

  public void setMetadataRemoval(DLPResponseDlpInfoMetadataRemoval metadataRemoval) {
    this.metadataRemoval = metadataRemoval;
  }

  public DLPResponseDlpInfo metadataRemoval(DLPResponseDlpInfoMetadataRemoval metadataRemoval) {
    this.metadataRemoval = metadataRemoval;
    return this;
  }

 /**
   * Get redact
   * @return redact
  **/
  @JsonProperty("redact")
  public DLPResponseDlpInfoRedact getRedact() {
    return redact;
  }

  public void setRedact(DLPResponseDlpInfoRedact redact) {
    this.redact = redact;
  }

  public DLPResponseDlpInfo redact(DLPResponseDlpInfoRedact redact) {
    this.redact = redact;
    return this;
  }

 /**
   * (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * &#x60;0&#x60; - Certainly is data loss   * &#x60;1&#x60; - Might be data loss 
   * @return severity
  **/
  @JsonProperty("severity")
  public Integer getSeverity() {
    if (severity == null) {
      return null;
    }
    return severity.value();
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public DLPResponseDlpInfo severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

 /**
   * The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  | 
   * @return verdict
  **/
  @JsonProperty("verdict")
  public Integer getVerdict() {
    if (verdict == null) {
      return null;
    }
    return verdict.value();
  }

  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }

  public DLPResponseDlpInfo verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

 /**
   * Get watermark
   * @return watermark
  **/
  @JsonProperty("watermark")
  public DLPResponseDlpInfoWatermark getWatermark() {
    return watermark;
  }

  public void setWatermark(DLPResponseDlpInfoWatermark watermark) {
    this.watermark = watermark;
  }

  public DLPResponseDlpInfo watermark(DLPResponseDlpInfoWatermark watermark) {
    this.watermark = watermark;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

