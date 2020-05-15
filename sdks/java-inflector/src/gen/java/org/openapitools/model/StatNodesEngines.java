package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Engine summary
 **/

@ApiModel(description = "Engine summary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class StatNodesEngines   {
  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("db_ver")
  private String dbVer;

  @JsonProperty("def_time")
  private String defTime;

  @JsonProperty("eng_name")
  private String engName;

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

  @JsonProperty("id")
  private String id;

  /**
   * If used by at least one engine
   **/
  public StatNodesEngines active(Boolean active) {
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
   * The database version for this engine
   **/
  public StatNodesEngines dbVer(String dbVer) {
    this.dbVer = dbVer;
    return this;
  }

  
  @ApiModelProperty(example = "25050", value = "The database version for this engine")
  @JsonProperty("db_ver")
  public String getDbVer() {
    return dbVer;
  }
  public void setDbVer(String dbVer) {
    this.dbVer = dbVer;
  }

  /**
   * The database definition time for this engine
   **/
  public StatNodesEngines defTime(String defTime) {
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
   * Engine name
   **/
  public StatNodesEngines engName(String engName) {
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
   * Engine's version (format differs from one engine to another).
   **/
  public StatNodesEngines engVer(String engVer) {
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
  public StatNodesEngines engineType(EngineTypeEnum engineType) {
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
   * Engine internal ID
   **/
  public StatNodesEngines id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "clamav_1_linux", value = "Engine internal ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatNodesEngines statNodesEngines = (StatNodesEngines) o;
    return Objects.equals(active, statNodesEngines.active) &&
        Objects.equals(dbVer, statNodesEngines.dbVer) &&
        Objects.equals(defTime, statNodesEngines.defTime) &&
        Objects.equals(engName, statNodesEngines.engName) &&
        Objects.equals(engVer, statNodesEngines.engVer) &&
        Objects.equals(engineType, statNodesEngines.engineType) &&
        Objects.equals(id, statNodesEngines.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, dbVer, defTime, engName, engVer, engineType, id);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

