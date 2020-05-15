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

public class DeepCDRDetailsDetails  {
  
@XmlType(name="ActionEnum")
@XmlEnum(String.class)
public enum ActionEnum {

@XmlEnumValue("sanitized") SANITIZED(String.valueOf("sanitized")), @XmlEnumValue("removed") REMOVED(String.valueOf("removed"));


    private String value;

    ActionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "sanitized", required = true, value = "The type of action that was performed")
 /**
   * The type of action that was performed
  **/
  private ActionEnum action;

  @ApiModelProperty(example = "XML content", required = true, value = "The object type that was sanitized/removed.")
 /**
   * The object type that was sanitized/removed.
  **/
  private String objectName;

  @ApiModelProperty(example = "1", value = "The number of objects that were sanitized/removed.")
 /**
   * The number of objects that were sanitized/removed.
  **/
  private Integer count;

  @ApiModelProperty(example = "\"<ddeLink xmlns:r=\\\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\\\" ddeService=\\\"calc\\\" ddeTopic=\\\"topic\\\" xmlns=\\\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\\\">\\r\\n  <ddeItems>\\r\\n    <ddeItem name=\\\"_xlbgnm.A3\\\" advise=\\\"1\\\" />\\r\\n    <ddeItem name=\\\"StdDocumentName\\\" ole=\\\"1\\\" advise=\\\"1\\\" />\\r\\n  </ddeItems>\\r\\n</ddeLink>\" ", value = "Additional information about the sanitized object")
 /**
   * Additional information about the sanitized object
  **/
  private String objectDetails;

  @ApiModelProperty(example = "Microsoft_Excel_97-2003_Worksheet.xls", value = "If an embedded file was sanitized.")
 /**
   * If an embedded file was sanitized.
  **/
  private String fileName;
 /**
   * The type of action that was performed
   * @return action
  **/
  @JsonProperty("action")
  @NotNull
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public DeepCDRDetailsDetails action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * The object type that was sanitized/removed.
   * @return objectName
  **/
  @JsonProperty("object_name")
  @NotNull
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public DeepCDRDetailsDetails objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

 /**
   * The number of objects that were sanitized/removed.
   * @return count
  **/
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DeepCDRDetailsDetails count(Integer count) {
    this.count = count;
    return this;
  }

 /**
   * Additional information about the sanitized object
   * @return objectDetails
  **/
  @JsonProperty("object_details")
  public String getObjectDetails() {
    return objectDetails;
  }

  public void setObjectDetails(String objectDetails) {
    this.objectDetails = objectDetails;
  }

  public DeepCDRDetailsDetails objectDetails(String objectDetails) {
    this.objectDetails = objectDetails;
    return this;
  }

 /**
   * If an embedded file was sanitized.
   * @return fileName
  **/
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DeepCDRDetailsDetails fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepCDRDetailsDetails {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    objectDetails: ").append(toIndentedString(objectDetails)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

