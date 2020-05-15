package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * User object in MetaDefender.
 **/

@ApiModel(description = "User object in MetaDefender.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class UserResponse   {
  @JsonProperty("apikey")
  private String apikey;

  @JsonProperty("directory_id")
  private Integer directoryId;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("name")
  private String name;

  @JsonProperty("roles")
  private List<String> roles = null;

  @JsonProperty("ui_settings")
  private Object uiSettings;

  /**
   * Associated apikey with this user
   **/
  public UserResponse apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

  
  @ApiModelProperty(example = "b8a4b52f19de88e365aa4f7e403fa91b352f", value = "Associated apikey with this user")
  @JsonProperty("apikey")
  public String getApikey() {
    return apikey;
  }
  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  /**
   * To which User Directories belongs to (LOCAL/System/etc.)
   **/
  public UserResponse directoryId(Integer directoryId) {
    this.directoryId = directoryId;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "To which User Directories belongs to (LOCAL/System/etc.)")
  @JsonProperty("directory_id")
  public Integer getDirectoryId() {
    return directoryId;
  }
  public void setDirectoryId(Integer directoryId) {
    this.directoryId = directoryId;
  }

  /**
   * Which is the name showed in the Management Console
   **/
  public UserResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "jsmith", value = "Which is the name showed in the Management Console")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * User's email address
   **/
  public UserResponse email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "john.smith@company.com", value = "User's email address")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * User's full name
   **/
  public UserResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "John Smith", value = "User's full name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of roles attached to this user
   **/
  public UserResponse roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  
  @ApiModelProperty(example = "[1, 2, 3, ...]", value = "A list of roles attached to this user")
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  /**
   * Configuration of Management Console for this user.
   **/
  public UserResponse uiSettings(Object uiSettings) {
    this.uiSettings = uiSettings;
    return this;
  }

  
  @ApiModelProperty(example = "{refresh_rate={value=30}, time_period={value=24, unitsInHour=1}}", value = "Configuration of Management Console for this user.")
  @JsonProperty("ui_settings")
  public Object getUiSettings() {
    return uiSettings;
  }
  public void setUiSettings(Object uiSettings) {
    this.uiSettings = uiSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(apikey, userResponse.apikey) &&
        Objects.equals(directoryId, userResponse.directoryId) &&
        Objects.equals(displayName, userResponse.displayName) &&
        Objects.equals(email, userResponse.email) &&
        Objects.equals(name, userResponse.name) &&
        Objects.equals(roles, userResponse.roles) &&
        Objects.equals(uiSettings, userResponse.uiSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apikey, directoryId, displayName, email, name, roles, uiSettings);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

