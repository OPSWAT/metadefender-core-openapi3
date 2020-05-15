package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DeepCDRDetailsDetails;



/**
 * Deep CDR module returns forensic info to describe what happened during the process in the case file was successfully sanitized.
 **/

@ApiModel(description = "Deep CDR module returns forensic info to describe what happened during the process in the case file was successfully sanitized.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class DeepCDRDetails   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("details")
  private List<DeepCDRDetailsDetails> details = null;

  /**
   * Action was successful or not.
   **/
  public DeepCDRDetails description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Sanitized successfully", value = "Action was successful or not.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of all sanitized objects
   **/
  public DeepCDRDetails details(List<DeepCDRDetailsDetails> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "List of all sanitized objects")
  @JsonProperty("details")
  public List<DeepCDRDetailsDetails> getDetails() {
    return details;
  }
  public void setDetails(List<DeepCDRDetailsDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepCDRDetails deepCDRDetails = (DeepCDRDetails) o;
    return Objects.equals(description, deepCDRDetails.description) &&
        Objects.equals(details, deepCDRDetails.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepCDRDetails {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

