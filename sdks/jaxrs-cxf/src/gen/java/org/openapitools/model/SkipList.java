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
  * Object that defines the skip hashes list.
 **/
@ApiModel(description="Object that defines the skip hashes list.")
public class SkipList  {
  
  @ApiModelProperty(example = "{edecbf6bd03ef340e0c6cd438a4069c2={comment=example3}}", value = "")
  @Valid
  private Object blacklist;

  @ApiModelProperty(example = "{13d8b8329bd2f668e6a889f32feaa48c832dbf0c={comment=example4, engines=[totaldefense]}}", value = "")
  @Valid
  private Object skip;

  @ApiModelProperty(example = "{6e340b9cffb37a989ca544e6bb780a2c78901d3fb33738768511a30617afa01d={comment=example5}, df72d035b31b1ff89f752e83af14b9e9dcf4913d9954f074546860d10b6908fb={comment=example2}}", value = "")
  @Valid
  private Object whitelist;
 /**
   * Get blacklist
   * @return blacklist
  **/
  @JsonProperty("blacklist")
  public Object getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(Object blacklist) {
    this.blacklist = blacklist;
  }

  public SkipList blacklist(Object blacklist) {
    this.blacklist = blacklist;
    return this;
  }

 /**
   * Get skip
   * @return skip
  **/
  @JsonProperty("skip")
  public Object getSkip() {
    return skip;
  }

  public void setSkip(Object skip) {
    this.skip = skip;
  }

  public SkipList skip(Object skip) {
    this.skip = skip;
    return this;
  }

 /**
   * Get whitelist
   * @return whitelist
  **/
  @JsonProperty("whitelist")
  public Object getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(Object whitelist) {
    this.whitelist = whitelist;
  }

  public SkipList whitelist(Object whitelist) {
    this.whitelist = whitelist;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkipList {\n");
    
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

