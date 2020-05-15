package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse20012   {
  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("def_time")
  private String defTime;

  @JsonProperty("download_progress")
  private Integer downloadProgress;

  @JsonProperty("download_time")
  private String downloadTime;

  @JsonProperty("eng_id")
  private String engId;

  @JsonProperty("eng_name")
  private String engName;

  @JsonProperty("eng_type")
  private String engType;

  @JsonProperty("eng_ver")
  private String engVer;

  /**
   * Engine's type:    * av   * archive   * filetype 
   */
  public enum EngineTypeEnum {
    AV("av"),
    
    ARCHIVE("archive"),
    
    FILETYPE("filetype");

    private String value;

    EngineTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EngineTypeEnum fromValue(String text) {
      for (EngineTypeEnum b : EngineTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("engine_type")
  private EngineTypeEnum engineType;

  /**
   * Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed 
   */
  public enum StateEnum {
    DOWNLOADING("downloading"),
    
    DOWNLOADED("downloaded"),
    
    STAGING("staging"),
    
    PRODUCTION("production"),
    
    REMOVED("removed"),
    
    TEMPORARY_FAILED("temporary failed"),
    
    PERMANENTLY_FAILED("permanently failed"),
    
    CONTENT_INVALID("content invalid"),
    
    DOWNLOAD_FAILED("download failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  /**
   * If used by at least one engine
   **/
  public InlineResponse20012 active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If used by at least one engine")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * The database definition time for this engine
   **/
  public InlineResponse20012 defTime(String defTime) {
    this.defTime = defTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-04-17T02:37:05.000Z", value = "The database definition time for this engine")
  @JsonProperty("def_time")
  public String getDefTime() {
    return defTime;
  }
  public void setDefTime(String defTime) {
    this.defTime = defTime;
  }

  /**
   * The percentage progress of download
   **/
  public InlineResponse20012 downloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "The percentage progress of download")
  @JsonProperty("download_progress")
  public Integer getDownloadProgress() {
    return downloadProgress;
  }
  public void setDownloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
  }

  /**
   * When this engine downloaded from the update server.
   **/
  public InlineResponse20012 downloadTime(String downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

  
  @ApiModelProperty(example = "2020-04-17T08:17:22.810Z", value = "When this engine downloaded from the update server.")
  @JsonProperty("download_time")
  public String getDownloadTime() {
    return downloadTime;
  }
  public void setDownloadTime(String downloadTime) {
    this.downloadTime = downloadTime;
  }

  /**
   * Engine internal ID
   **/
  public InlineResponse20012 engId(String engId) {
    this.engId = engId;
    return this;
  }

  
  @ApiModelProperty(example = "clamav_1_linux", value = "Engine internal ID")
  @JsonProperty("eng_id")
  public String getEngId() {
    return engId;
  }
  public void setEngId(String engId) {
    this.engId = engId;
  }

  /**
   * Engine name
   **/
  public InlineResponse20012 engName(String engName) {
    this.engName = engName;
    return this;
  }

  
  @ApiModelProperty(example = "ClamAV", value = "Engine name")
  @JsonProperty("eng_name")
  public String getEngName() {
    return engName;
  }
  public void setEngName(String engName) {
    this.engName = engName;
  }

  /**
   * Engine type in human readable form
   **/
  public InlineResponse20012 engType(String engType) {
    this.engType = engType;
    return this;
  }

  
  @ApiModelProperty(example = "Bundled engine", value = "Engine type in human readable form")
  @JsonProperty("eng_type")
  public String getEngType() {
    return engType;
  }
  public void setEngType(String engType) {
    this.engType = engType;
  }

  /**
   * Engine's version (format differs from one engine to another).
   **/
  public InlineResponse20012 engVer(String engVer) {
    this.engVer = engVer;
    return this;
  }

  
  @ApiModelProperty(example = "3.0-43", value = "Engine's version (format differs from one engine to another).")
  @JsonProperty("eng_ver")
  public String getEngVer() {
    return engVer;
  }
  public void setEngVer(String engVer) {
    this.engVer = engVer;
  }

  /**
   * Engine's type:    * av   * archive   * filetype 
   **/
  public InlineResponse20012 engineType(EngineTypeEnum engineType) {
    this.engineType = engineType;
    return this;
  }

  
  @ApiModelProperty(example = "av", value = "Engine's type:    * av   * archive   * filetype ")
  @JsonProperty("engine_type")
  public EngineTypeEnum getEngineType() {
    return engineType;
  }
  public void setEngineType(EngineTypeEnum engineType) {
    this.engineType = engineType;
  }

  /**
   * Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed 
   **/
  public InlineResponse20012 state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(example = "production", value = "Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed ")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(active, inlineResponse20012.active) &&
        Objects.equals(defTime, inlineResponse20012.defTime) &&
        Objects.equals(downloadProgress, inlineResponse20012.downloadProgress) &&
        Objects.equals(downloadTime, inlineResponse20012.downloadTime) &&
        Objects.equals(engId, inlineResponse20012.engId) &&
        Objects.equals(engName, inlineResponse20012.engName) &&
        Objects.equals(engType, inlineResponse20012.engType) &&
        Objects.equals(engVer, inlineResponse20012.engVer) &&
        Objects.equals(engineType, inlineResponse20012.engineType) &&
        Objects.equals(state, inlineResponse20012.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, defTime, downloadProgress, downloadTime, engId, engName, engType, engVer, engineType, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    defTime: ").append(toIndentedString(defTime)).append("\n");
    sb.append("    downloadProgress: ").append(toIndentedString(downloadProgress)).append("\n");
    sb.append("    downloadTime: ").append(toIndentedString(downloadTime)).append("\n");
    sb.append("    engId: ").append(toIndentedString(engId)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    engType: ").append(toIndentedString(engType)).append("\n");
    sb.append("    engVer: ").append(toIndentedString(engVer)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

