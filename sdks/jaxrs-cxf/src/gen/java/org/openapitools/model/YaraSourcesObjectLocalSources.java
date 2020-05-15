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
  * Object defining the location of the files and if this source is being used.
 **/
@ApiModel(description="Object defining the location of the files and if this source is being used.")
public class YaraSourcesObjectLocalSources  {
  
  @ApiModelProperty(example = "/mnt/yara", value = "The location (file path) of the files.")
 /**
   * The location (file path) of the files.
  **/
  private String source;

@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

@XmlEnumValue("disabled") DISABLED(String.valueOf("disabled")), @XmlEnumValue("enabled") ENABLED(String.valueOf("enabled"));


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

  @ApiModelProperty(example = "enabled", value = "Defining if this source is being used or not")
 /**
   * Defining if this source is being used or not
  **/
  private StateEnum state;
 /**
   * The location (file path) of the files.
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public YaraSourcesObjectLocalSources source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Defining if this source is being used or not
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

  public YaraSourcesObjectLocalSources state(StateEnum state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YaraSourcesObjectLocalSources {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

