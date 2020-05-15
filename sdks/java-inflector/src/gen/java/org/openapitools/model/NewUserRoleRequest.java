package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NewUserRoleRequestRights;



/**
 * MetaDefender user role describing object.
 **/

@ApiModel(description = "MetaDefender user role describing object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class NewUserRoleRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("rights")
  private NewUserRoleRequestRights rights;

  /**
   * The name identifier of the role
   **/
  public NewUserRoleRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "new_role", value = "The name identifier of the role")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The extended name showed in the Management Console.
   **/
  public NewUserRoleRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "New MetaDefender User Role", value = "The extended name showed in the Management Console.")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  public NewUserRoleRequest rights(NewUserRoleRequestRights rights) {
    this.rights = rights;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rights")
  public NewUserRoleRequestRights getRights() {
    return rights;
  }
  public void setRights(NewUserRoleRequestRights rights) {
    this.rights = rights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserRoleRequest newUserRoleRequest = (NewUserRoleRequest) o;
    return Objects.equals(name, newUserRoleRequest.name) &&
        Objects.equals(displayName, newUserRoleRequest.displayName) &&
        Objects.equals(rights, newUserRoleRequest.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, rights);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

