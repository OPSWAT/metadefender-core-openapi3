package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NewUserRoleRequest;
import org.openapitools.model.NewUserRoleRequestRights;
import org.openapitools.model.NewUserRoleResponseAllOf;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class NewUserRoleResponse extends NewUserRoleRequest  {
  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("id")
  private Integer id;

  /**
   * If the role can be altered or not.
   **/
  public NewUserRoleResponse editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  
  @ApiModelProperty(example = "true", required = true, value = "If the role can be altered or not.")
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  /**
   * Internal used identifier
   **/
  public NewUserRoleResponse id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "6", required = true, value = "Internal used identifier")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
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
    NewUserRoleResponse newUserRoleResponse = (NewUserRoleResponse) o;
    return Objects.equals(editable, newUserRoleResponse.editable) &&
        Objects.equals(id, newUserRoleResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editable, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRoleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

