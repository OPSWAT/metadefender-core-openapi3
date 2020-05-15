package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object defining the location of the files and if this source is being used.
 **/

@ApiModel(description = "Object defining the location of the files and if this source is being used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class YaraSourcesObjectLocalSources   {
  @JsonProperty("source")
  private String source;

  /**
   * Defining if this source is being used or not
   */
  public enum StateEnum {
    DISABLED("disabled"),
    
    ENABLED("enabled");

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
   * The location (file path) of the files.
   **/
  public YaraSourcesObjectLocalSources source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(example = "/mnt/yara", value = "The location (file path) of the files.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Defining if this source is being used or not
   **/
  public YaraSourcesObjectLocalSources state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(example = "enabled", value = "Defining if this source is being used or not")
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
    YaraSourcesObjectLocalSources yaraSourcesObjectLocalSources = (YaraSourcesObjectLocalSources) o;
    return Objects.equals(source, yaraSourcesObjectLocalSources.source) &&
        Objects.equals(state, yaraSourcesObjectLocalSources.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, state);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

