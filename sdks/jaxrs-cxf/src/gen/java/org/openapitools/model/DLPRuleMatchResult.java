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
  * An entry detailing the match.
 **/
@ApiModel(description="An entry detailing the match.")
public class DLPRuleMatchResult  {
  
  @ApiModelProperty(example = "123 Cherry Lane st.", value = "The context after the matched data.")
 /**
   * The context after the matched data.
  **/
  private String after;

  @ApiModelProperty(example = "Card Number", value = "The context before the matched data.")
 /**
   * The context before the matched data.
  **/
  private String before;

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

  @ApiModelProperty(example = "Very High", value = "The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High` ")
 /**
   * The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High` 
  **/
  private CertaintyEnum certainty;

  @ApiModelProperty(example = "100", value = "Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100] ")
 /**
   * Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100] 
  **/
  private Integer certaintyScore;

  @ApiModelProperty(example = "XXXXXXXXXXXXXXX1938", value = "The matched data.")
 /**
   * The matched data.
  **/
  private String hit;

  @ApiModelProperty(example = "false", value = "If file was redacted or not.")
 /**
   * If file was redacted or not.
  **/
  private Boolean isRedacted;

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

  @ApiModelProperty(example = "0", value = "(NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). ")
 /**
   * (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). 
  **/
  private SeverityEnum severity;
 /**
   * The context after the matched data.
   * @return after
  **/
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public DLPRuleMatchResult after(String after) {
    this.after = after;
    return this;
  }

 /**
   * The context before the matched data.
   * @return before
  **/
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public DLPRuleMatchResult before(String before) {
    this.before = before;
    return this;
  }

 /**
   * The text version of \&quot;certainty_score\&quot;, possible values:   * &#x60;Very Low&#x60;     * &#x60;Low&#x60;     * &#x60;Medium&#x60;     * &#x60;High&#x60;     * &#x60;Very High&#x60; 
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

  public DLPRuleMatchResult certainty(CertaintyEnum certainty) {
    this.certainty = certainty;
    return this;
  }

 /**
   * Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100] 
   * @return certaintyScore
  **/
  @JsonProperty("certainty_score")
  public Integer getCertaintyScore() {
    return certaintyScore;
  }

  public void setCertaintyScore(Integer certaintyScore) {
    this.certaintyScore = certaintyScore;
  }

  public DLPRuleMatchResult certaintyScore(Integer certaintyScore) {
    this.certaintyScore = certaintyScore;
    return this;
  }

 /**
   * The matched data.
   * @return hit
  **/
  @JsonProperty("hit")
  public String getHit() {
    return hit;
  }

  public void setHit(String hit) {
    this.hit = hit;
  }

  public DLPRuleMatchResult hit(String hit) {
    this.hit = hit;
    return this;
  }

 /**
   * If file was redacted or not.
   * @return isRedacted
  **/
  @JsonProperty("isRedacted")
  public Boolean getIsRedacted() {
    return isRedacted;
  }

  public void setIsRedacted(Boolean isRedacted) {
    this.isRedacted = isRedacted;
  }

  public DLPRuleMatchResult isRedacted(Boolean isRedacted) {
    this.isRedacted = isRedacted;
    return this;
  }

 /**
   * (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). 
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

  public DLPRuleMatchResult severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DLPRuleMatchResult {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    certainty: ").append(toIndentedString(certainty)).append("\n");
    sb.append("    certaintyScore: ").append(toIndentedString(certaintyScore)).append("\n");
    sb.append("    hit: ").append(toIndentedString(hit)).append("\n");
    sb.append("    isRedacted: ").append(toIndentedString(isRedacted)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

