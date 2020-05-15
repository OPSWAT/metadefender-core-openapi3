package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)
 **/

@ApiModel(description = "Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class LicenseInformation   {
  @JsonProperty("days_left")
  private Integer daysLeft;

  @JsonProperty("deployment")
  private String deployment;

  @JsonProperty("expiration")
  private String expiration;

  @JsonProperty("licensed_engines")
  private List<String> licensedEngines = null;

  @JsonProperty("max_node_count")
  private String maxNodeCount;

  @JsonProperty("online_activated")
  private Boolean onlineActivated;

  @JsonProperty("product_id")
  private String productId;

  @JsonProperty("product_name")
  private String productName;

  /**
   * Number of days left before expiration
   **/
  public LicenseInformation daysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days left before expiration")
  @JsonProperty("days_left")
  public Integer getDaysLeft() {
    return daysLeft;
  }
  public void setDaysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
  }

  /**
   * Unique identifier which is maps the current deployment to the activation
   **/
  public LicenseInformation deployment(String deployment) {
    this.deployment = deployment;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier which is maps the current deployment to the activation")
  @JsonProperty("deployment")
  public String getDeployment() {
    return deployment;
  }
  public void setDeployment(String deployment) {
    this.deployment = deployment;
  }

  /**
   * Expiration date in MM/DD/YYYY format.
   **/
  public LicenseInformation expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  
  @ApiModelProperty(value = "Expiration date in MM/DD/YYYY format.")
  @JsonProperty("expiration")
  public String getExpiration() {
    return expiration;
  }
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  /**
   * List of engine/module identifiers that have been licensed
   **/
  public LicenseInformation licensedEngines(List<String> licensedEngines) {
    this.licensedEngines = licensedEngines;
    return this;
  }

  
  @ApiModelProperty(value = "List of engine/module identifiers that have been licensed")
  @JsonProperty("licensed_engines")
  public List<String> getLicensedEngines() {
    return licensedEngines;
  }
  public void setLicensedEngines(List<String> licensedEngines) {
    this.licensedEngines = licensedEngines;
  }

  /**
   * Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance.
   **/
  public LicenseInformation maxNodeCount(String maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

  
  @ApiModelProperty(value = "Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance.")
  @JsonProperty("max_node_count")
  public String getMaxNodeCount() {
    return maxNodeCount;
  }
  public void setMaxNodeCount(String maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }

  /**
   * Track online/offline activation mode
   **/
  public LicenseInformation onlineActivated(Boolean onlineActivated) {
    this.onlineActivated = onlineActivated;
    return this;
  }

  
  @ApiModelProperty(value = "Track online/offline activation mode")
  @JsonProperty("online_activated")
  public Boolean getOnlineActivated() {
    return onlineActivated;
  }
  public void setOnlineActivated(Boolean onlineActivated) {
    this.onlineActivated = onlineActivated;
  }

  /**
   * Official MetaDefender base SKU licensed.
   **/
  public LicenseInformation productId(String productId) {
    this.productId = productId;
    return this;
  }

  
  @ApiModelProperty(value = "Official MetaDefender base SKU licensed.")
  @JsonProperty("product_id")
  public String getProductId() {
    return productId;
  }
  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * Official MetaDefender base product name licensed.
   **/
  public LicenseInformation productName(String productName) {
    this.productName = productName;
    return this;
  }

  
  @ApiModelProperty(value = "Official MetaDefender base product name licensed.")
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseInformation licenseInformation = (LicenseInformation) o;
    return Objects.equals(daysLeft, licenseInformation.daysLeft) &&
        Objects.equals(deployment, licenseInformation.deployment) &&
        Objects.equals(expiration, licenseInformation.expiration) &&
        Objects.equals(licensedEngines, licenseInformation.licensedEngines) &&
        Objects.equals(maxNodeCount, licenseInformation.maxNodeCount) &&
        Objects.equals(onlineActivated, licenseInformation.onlineActivated) &&
        Objects.equals(productId, licenseInformation.productId) &&
        Objects.equals(productName, licenseInformation.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysLeft, deployment, expiration, licensedEngines, maxNodeCount, onlineActivated, productId, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseInformation {\n");
    
    sb.append("    daysLeft: ").append(toIndentedString(daysLeft)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    licensedEngines: ").append(toIndentedString(licensedEngines)).append("\n");
    sb.append("    maxNodeCount: ").append(toIndentedString(maxNodeCount)).append("\n");
    sb.append("    onlineActivated: ").append(toIndentedString(onlineActivated)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

