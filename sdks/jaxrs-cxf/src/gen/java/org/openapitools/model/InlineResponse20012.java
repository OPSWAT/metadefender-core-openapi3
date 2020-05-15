package org.openapitools.model;

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

public class InlineResponse20012  {
  
  @ApiModelProperty(example = "true", value = "If used by at least one engine")
 /**
   * If used by at least one engine
  **/
  private Boolean active;

  @ApiModelProperty(example = "2020-04-17T02:37:05.000Z", value = "The database definition time for this engine")
 /**
   * The database definition time for this engine
  **/
  private String defTime;

  @ApiModelProperty(example = "100", value = "The percentage progress of download")
 /**
   * The percentage progress of download
  **/
  private Integer downloadProgress;

  @ApiModelProperty(example = "2020-04-17T08:17:22.810Z", value = "When this engine downloaded from the update server.")
 /**
   * When this engine downloaded from the update server.
  **/
  private String downloadTime;

  @ApiModelProperty(example = "clamav_1_linux", value = "Engine internal ID")
 /**
   * Engine internal ID
  **/
  private String engId;

  @ApiModelProperty(example = "ClamAV", value = "Engine name")
 /**
   * Engine name
  **/
  private String engName;

  @ApiModelProperty(example = "Bundled engine", value = "Engine type in human readable form")
 /**
   * Engine type in human readable form
  **/
  private String engType;

  @ApiModelProperty(example = "3.0-43", value = "Engine's version (format differs from one engine to another).")
 /**
   * Engine's version (format differs from one engine to another).
  **/
  private String engVer;

@XmlType(name="EngineTypeEnum")
@XmlEnum(String.class)
public enum EngineTypeEnum {

@XmlEnumValue("av") AV(String.valueOf("av")), @XmlEnumValue("archive") ARCHIVE(String.valueOf("archive")), @XmlEnumValue("filetype") FILETYPE(String.valueOf("filetype"));


    private String value;

    EngineTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EngineTypeEnum fromValue(String value) {
        for (EngineTypeEnum b : EngineTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "av", value = "Engine's type:    * av   * archive   * filetype ")
 /**
   * Engine's type:    * av   * archive   * filetype 
  **/
  private EngineTypeEnum engineType;

@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

@XmlEnumValue("downloading") DOWNLOADING(String.valueOf("downloading")), @XmlEnumValue("downloaded") DOWNLOADED(String.valueOf("downloaded")), @XmlEnumValue("staging") STAGING(String.valueOf("staging")), @XmlEnumValue("production") PRODUCTION(String.valueOf("production")), @XmlEnumValue("removed") REMOVED(String.valueOf("removed")), @XmlEnumValue("temporary failed") TEMPORARY_FAILED(String.valueOf("temporary failed")), @XmlEnumValue("permanently failed") PERMANENTLY_FAILED(String.valueOf("permanently failed")), @XmlEnumValue("content invalid") CONTENT_INVALID(String.valueOf("content invalid")), @XmlEnumValue("download failed") DOWNLOAD_FAILED(String.valueOf("download failed"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "production", value = "Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed ")
 /**
   * Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed 
  **/
  private StateEnum state;
 /**
   * If used by at least one engine
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public InlineResponse20012 active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * The database definition time for this engine
   * @return defTime
  **/
  @JsonProperty("def_time")
  public String getDefTime() {
    return defTime;
  }

  public void setDefTime(String defTime) {
    this.defTime = defTime;
  }

  public InlineResponse20012 defTime(String defTime) {
    this.defTime = defTime;
    return this;
  }

 /**
   * The percentage progress of download
   * @return downloadProgress
  **/
  @JsonProperty("download_progress")
  public Integer getDownloadProgress() {
    return downloadProgress;
  }

  public void setDownloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
  }

  public InlineResponse20012 downloadProgress(Integer downloadProgress) {
    this.downloadProgress = downloadProgress;
    return this;
  }

 /**
   * When this engine downloaded from the update server.
   * @return downloadTime
  **/
  @JsonProperty("download_time")
  public String getDownloadTime() {
    return downloadTime;
  }

  public void setDownloadTime(String downloadTime) {
    this.downloadTime = downloadTime;
  }

  public InlineResponse20012 downloadTime(String downloadTime) {
    this.downloadTime = downloadTime;
    return this;
  }

 /**
   * Engine internal ID
   * @return engId
  **/
  @JsonProperty("eng_id")
  public String getEngId() {
    return engId;
  }

  public void setEngId(String engId) {
    this.engId = engId;
  }

  public InlineResponse20012 engId(String engId) {
    this.engId = engId;
    return this;
  }

 /**
   * Engine name
   * @return engName
  **/
  @JsonProperty("eng_name")
  public String getEngName() {
    return engName;
  }

  public void setEngName(String engName) {
    this.engName = engName;
  }

  public InlineResponse20012 engName(String engName) {
    this.engName = engName;
    return this;
  }

 /**
   * Engine type in human readable form
   * @return engType
  **/
  @JsonProperty("eng_type")
  public String getEngType() {
    return engType;
  }

  public void setEngType(String engType) {
    this.engType = engType;
  }

  public InlineResponse20012 engType(String engType) {
    this.engType = engType;
    return this;
  }

 /**
   * Engine&#39;s version (format differs from one engine to another).
   * @return engVer
  **/
  @JsonProperty("eng_ver")
  public String getEngVer() {
    return engVer;
  }

  public void setEngVer(String engVer) {
    this.engVer = engVer;
  }

  public InlineResponse20012 engVer(String engVer) {
    this.engVer = engVer;
    return this;
  }

 /**
   * Engine&#39;s type:    * av   * archive   * filetype 
   * @return engineType
  **/
  @JsonProperty("engine_type")
  public String getEngineType() {
    if (engineType == null) {
      return null;
    }
    return engineType.value();
  }

  public void setEngineType(EngineTypeEnum engineType) {
    this.engineType = engineType;
  }

  public InlineResponse20012 engineType(EngineTypeEnum engineType) {
    this.engineType = engineType;
    return this;
  }

 /**
   * Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed 
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    if (state == null) {
      return null;
    }
    return state.value();
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public InlineResponse20012 state(StateEnum state) {
    this.state = state;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

