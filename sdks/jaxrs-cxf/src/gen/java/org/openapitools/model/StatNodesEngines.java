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
  * Engine summary
 **/
@ApiModel(description="Engine summary")
public class StatNodesEngines  {
  
  @ApiModelProperty(example = "true", value = "If used by at least one engine")
 /**
   * If used by at least one engine
  **/
  private Boolean active;

  @ApiModelProperty(example = "25050", value = "The database version for this engine")
 /**
   * The database version for this engine
  **/
  private String dbVer;

  @ApiModelProperty(example = "2020-04-17T02:37:05.000Z", value = "The database definition time for this engine")
 /**
   * The database definition time for this engine
  **/
  private String defTime;

  @ApiModelProperty(example = "ClamAV", value = "Engine name")
 /**
   * Engine name
  **/
  private String engName;

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

  @ApiModelProperty(example = "clamav_1_linux", value = "Engine internal ID")
 /**
   * Engine internal ID
  **/
  private String id;
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

  public StatNodesEngines active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * The database version for this engine
   * @return dbVer
  **/
  @JsonProperty("db_ver")
  public String getDbVer() {
    return dbVer;
  }

  public void setDbVer(String dbVer) {
    this.dbVer = dbVer;
  }

  public StatNodesEngines dbVer(String dbVer) {
    this.dbVer = dbVer;
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

  public StatNodesEngines defTime(String defTime) {
    this.defTime = defTime;
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

  public StatNodesEngines engName(String engName) {
    this.engName = engName;
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

  public StatNodesEngines engVer(String engVer) {
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

  public StatNodesEngines engineType(EngineTypeEnum engineType) {
    this.engineType = engineType;
    return this;
  }

 /**
   * Engine internal ID
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatNodesEngines id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatNodesEngines {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    dbVer: ").append(toIndentedString(dbVer)).append("\n");
    sb.append("    defTime: ").append(toIndentedString(defTime)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    engVer: ").append(toIndentedString(engVer)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

