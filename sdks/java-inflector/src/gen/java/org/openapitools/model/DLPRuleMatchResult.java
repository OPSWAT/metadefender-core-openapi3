package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An entry detailing the match.
 **/

@ApiModel(description = "An entry detailing the match.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DLPRuleMatchResult   {
  @JsonProperty("after")
  private String after;

  @JsonProperty("before")
  private String before;

  /**
   * The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High` 
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

  @JsonProperty("certainty_score")
  private Integer certaintyScore;

  @JsonProperty("hit")
  private String hit;

  @JsonProperty("isRedacted")
  private Boolean isRedacted;

  /**
   * (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). 
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
   * The context after the matched data.
   **/
  public DLPRuleMatchResult after(String after) {
    this.after = after;
    return this;
  }

  
  @ApiModelProperty(example = "123 Cherry Lane st.", value = "The context after the matched data.")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }

  /**
   * The context before the matched data.
   **/
  public DLPRuleMatchResult before(String before) {
    this.before = before;
    return this;
  }

  
  @ApiModelProperty(example = "Card Number", value = "The context before the matched data.")
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }
  public void setBefore(String before) {
    this.before = before;
  }

  /**
   * The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High` 
   **/
  public DLPRuleMatchResult certainty(CertaintyEnum certainty) {
    this.certainty = certainty;
    return this;
  }

  
  @ApiModelProperty(example = "Very High", value = "The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High` ")
  @JsonProperty("certainty")
  public CertaintyEnum getCertainty() {
    return certainty;
  }
  public void setCertainty(CertaintyEnum certainty) {
    this.certainty = certainty;
  }

  /**
   * Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100] 
   **/
  public DLPRuleMatchResult certaintyScore(Integer certaintyScore) {
    this.certaintyScore = certaintyScore;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100] ")
  @JsonProperty("certainty_score")
  public Integer getCertaintyScore() {
    return certaintyScore;
  }
  public void setCertaintyScore(Integer certaintyScore) {
    this.certaintyScore = certaintyScore;
  }

  /**
   * The matched data.
   **/
  public DLPRuleMatchResult hit(String hit) {
    this.hit = hit;
    return this;
  }

  
  @ApiModelProperty(example = "XXXXXXXXXXXXXXX1938", value = "The matched data.")
  @JsonProperty("hit")
  public String getHit() {
    return hit;
  }
  public void setHit(String hit) {
    this.hit = hit;
  }

  /**
   * If file was redacted or not.
   **/
  public DLPRuleMatchResult isRedacted(Boolean isRedacted) {
    this.isRedacted = isRedacted;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "If file was redacted or not.")
  @JsonProperty("isRedacted")
  public Boolean getIsRedacted() {
    return isRedacted;
  }
  public void setIsRedacted(Boolean isRedacted) {
    this.isRedacted = isRedacted;
  }

  /**
   * (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). 
   **/
  public DLPRuleMatchResult severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "(NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious). ")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DLPRuleMatchResult dlPRuleMatchResult = (DLPRuleMatchResult) o;
    return Objects.equals(after, dlPRuleMatchResult.after) &&
        Objects.equals(before, dlPRuleMatchResult.before) &&
        Objects.equals(certainty, dlPRuleMatchResult.certainty) &&
        Objects.equals(certaintyScore, dlPRuleMatchResult.certaintyScore) &&
        Objects.equals(hit, dlPRuleMatchResult.hit) &&
        Objects.equals(isRedacted, dlPRuleMatchResult.isRedacted) &&
        Objects.equals(severity, dlPRuleMatchResult.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, certainty, certaintyScore, hit, isRedacted, severity);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

