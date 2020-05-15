package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.NewUserRoleRequestRights;
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
  * MetaDefender user role describing object.
 **/
@ApiModel(description="MetaDefender user role describing object.")
public class NewUserRoleRequest  {
  
  @ApiModelProperty(example = "new_role", value = "The name identifier of the role")
 /**
   * The name identifier of the role
  **/
  private String name;

  @ApiModelProperty(example = "New MetaDefender User Role", value = "The extended name showed in the Management Console.")
 /**
   * The extended name showed in the Management Console.
  **/
  private String displayName;

  @ApiModelProperty(value = "")
  @Valid
  private NewUserRoleRequestRights rights;
 /**
   * The name identifier of the role
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewUserRoleRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The extended name showed in the Management Console.
   * @return displayName
  **/
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public NewUserRoleRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * Get rights
   * @return rights
  **/
  @JsonProperty("rights")
  public NewUserRoleRequestRights getRights() {
    return rights;
  }

  public void setRights(NewUserRoleRequestRights rights) {
    this.rights = rights;
  }

  public NewUserRoleRequest rights(NewUserRoleRequestRights rights) {
    this.rights = rights;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRoleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

