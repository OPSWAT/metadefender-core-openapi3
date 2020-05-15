package org.openapitools.model;

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

public class NewUserRoleResponseAllOf  {
  
  @ApiModelProperty(example = "true", required = true, value = "If the role can be altered or not.")
 /**
   * If the role can be altered or not.
  **/
  private Boolean editable;

  @ApiModelProperty(example = "6", required = true, value = "Internal used identifier")
 /**
   * Internal used identifier
  **/
  private Integer id;
 /**
   * If the role can be altered or not.
   * @return editable
  **/
  @JsonProperty("editable")
  @NotNull
  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public NewUserRoleResponseAllOf editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

 /**
   * Internal used identifier
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NewUserRoleResponseAllOf id(Integer id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRoleResponseAllOf {\n");
    
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

