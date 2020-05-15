package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * User object in MetaDefender.
 **/
@ApiModel(description="User object in MetaDefender.")
public class UserResponse  {
  
  @ApiModelProperty(example = "b8a4b52f19de88e365aa4f7e403fa91b352f", value = "Associated apikey with this user")
 /**
   * Associated apikey with this user
  **/
  private String apikey;

  @ApiModelProperty(example = "1", value = "To which User Directories belongs to (LOCAL/System/etc.)")
 /**
   * To which User Directories belongs to (LOCAL/System/etc.)
  **/
  private Integer directoryId;

  @ApiModelProperty(example = "jsmith", value = "Which is the name showed in the Management Console")
 /**
   * Which is the name showed in the Management Console
  **/
  private String displayName;

  @ApiModelProperty(example = "john.smith@company.com", value = "User's email address")
 /**
   * User's email address
  **/
  private String email;

  @ApiModelProperty(example = "John Smith", value = "User's full name")
 /**
   * User's full name
  **/
  private String name;

  @ApiModelProperty(example = "[1, 2, 3, ...]", value = "A list of roles attached to this user")
 /**
   * A list of roles attached to this user
  **/
  private List<String> roles = null;

  @ApiModelProperty(example = "{refresh_rate={value=30}, time_period={value=24, unitsInHour=1}}", value = "Configuration of Management Console for this user.")
  @Valid
 /**
   * Configuration of Management Console for this user.
  **/
  private Object uiSettings;
 /**
   * Associated apikey with this user
   * @return apikey
  **/
  @JsonProperty("apikey")
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public UserResponse apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

 /**
   * To which User Directories belongs to (LOCAL/System/etc.)
   * @return directoryId
  **/
  @JsonProperty("directory_id")
  public Integer getDirectoryId() {
    return directoryId;
  }

  public void setDirectoryId(Integer directoryId) {
    this.directoryId = directoryId;
  }

  public UserResponse directoryId(Integer directoryId) {
    this.directoryId = directoryId;
    return this;
  }

 /**
   * Which is the name showed in the Management Console
   * @return displayName
  **/
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * User&#39;s email address
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

 /**
   * User&#39;s full name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A list of roles attached to this user
   * @return roles
  **/
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public UserResponse roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UserResponse addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

 /**
   * Configuration of Management Console for this user.
   * @return uiSettings
  **/
  @JsonProperty("ui_settings")
  public Object getUiSettings() {
    return uiSettings;
  }

  public void setUiSettings(Object uiSettings) {
    this.uiSettings = uiSettings;
  }

  public UserResponse uiSettings(Object uiSettings) {
    this.uiSettings = uiSettings;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    uiSettings: ").append(toIndentedString(uiSettings)).append("\n");
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

