package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DeepCDRDetailsDetails   {
  /**
   * The type of action that was performed
   */
  public enum ActionEnum {
    SANITIZED("sanitized"),
    
    REMOVED("removed");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("action")
  private ActionEnum action;

  @JsonProperty("object_name")
  private String objectName;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("object_details")
  private String objectDetails;

  @JsonProperty("file_name")
  private String fileName;

  /**
   * The type of action that was performed
   **/
  public DeepCDRDetailsDetails action(ActionEnum action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(example = "sanitized", required = true, value = "The type of action that was performed")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  /**
   * The object type that was sanitized/removed.
   **/
  public DeepCDRDetailsDetails objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  
  @ApiModelProperty(example = "XML content", required = true, value = "The object type that was sanitized/removed.")
  @JsonProperty("object_name")
  public String getObjectName() {
    return objectName;
  }
  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  /**
   * The number of objects that were sanitized/removed.
   **/
  public DeepCDRDetailsDetails count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "The number of objects that were sanitized/removed.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Additional information about the sanitized object
   **/
  public DeepCDRDetailsDetails objectDetails(String objectDetails) {
    this.objectDetails = objectDetails;
    return this;
  }

  
  @ApiModelProperty(example = "\"<ddeLink xmlns:r=\\\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\\\" ddeService=\\\"calc\\\" ddeTopic=\\\"topic\\\" xmlns=\\\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\\\">\\r\\n  <ddeItems>\\r\\n    <ddeItem name=\\\"_xlbgnm.A3\\\" advise=\\\"1\\\" />\\r\\n    <ddeItem name=\\\"StdDocumentName\\\" ole=\\\"1\\\" advise=\\\"1\\\" />\\r\\n  </ddeItems>\\r\\n</ddeLink>\" ", value = "Additional information about the sanitized object")
  @JsonProperty("object_details")
  public String getObjectDetails() {
    return objectDetails;
  }
  public void setObjectDetails(String objectDetails) {
    this.objectDetails = objectDetails;
  }

  /**
   * If an embedded file was sanitized.
   **/
  public DeepCDRDetailsDetails fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  
  @ApiModelProperty(example = "Microsoft_Excel_97-2003_Worksheet.xls", value = "If an embedded file was sanitized.")
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepCDRDetailsDetails deepCDRDetailsDetails = (DeepCDRDetailsDetails) o;
    return Objects.equals(action, deepCDRDetailsDetails.action) &&
        Objects.equals(objectName, deepCDRDetailsDetails.objectName) &&
        Objects.equals(count, deepCDRDetailsDetails.count) &&
        Objects.equals(objectDetails, deepCDRDetailsDetails.objectDetails) &&
        Objects.equals(fileName, deepCDRDetailsDetails.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, objectName, count, objectDetails, fileName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

