package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object that defines the skip hashes list.
 **/

@ApiModel(description = "Object that defines the skip hashes list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class SkipList   {
  @JsonProperty("blacklist")
  private Object blacklist;

  @JsonProperty("skip")
  private Object skip;

  @JsonProperty("whitelist")
  private Object whitelist;

  /**
   **/
  public SkipList blacklist(Object blacklist) {
    this.blacklist = blacklist;
    return this;
  }

  
  @ApiModelProperty(example = "{edecbf6bd03ef340e0c6cd438a4069c2={comment=example3}}", value = "")
  @JsonProperty("blacklist")
  public Object getBlacklist() {
    return blacklist;
  }
  public void setBlacklist(Object blacklist) {
    this.blacklist = blacklist;
  }

  /**
   **/
  public SkipList skip(Object skip) {
    this.skip = skip;
    return this;
  }

  
  @ApiModelProperty(example = "{13d8b8329bd2f668e6a889f32feaa48c832dbf0c={comment=example4, engines=[totaldefense]}}", value = "")
  @JsonProperty("skip")
  public Object getSkip() {
    return skip;
  }
  public void setSkip(Object skip) {
    this.skip = skip;
  }

  /**
   **/
  public SkipList whitelist(Object whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  
  @ApiModelProperty(example = "{6e340b9cffb37a989ca544e6bb780a2c78901d3fb33738768511a30617afa01d={comment=example5}, df72d035b31b1ff89f752e83af14b9e9dcf4913d9954f074546860d10b6908fb={comment=example2}}", value = "")
  @JsonProperty("whitelist")
  public Object getWhitelist() {
    return whitelist;
  }
  public void setWhitelist(Object whitelist) {
    this.whitelist = whitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkipList skipList = (SkipList) o;
    return Objects.equals(blacklist, skipList.blacklist) &&
        Objects.equals(skip, skipList.skip) &&
        Objects.equals(whitelist, skipList.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blacklist, skip, whitelist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

