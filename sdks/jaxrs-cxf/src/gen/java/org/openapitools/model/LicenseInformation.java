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
  * Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)
 **/
@ApiModel(description="Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)")
public class LicenseInformation  {
  
  @ApiModelProperty(value = "Number of days left before expiration")
 /**
   * Number of days left before expiration
  **/
  private Integer daysLeft;

  @ApiModelProperty(value = "Unique identifier which is maps the current deployment to the activation")
 /**
   * Unique identifier which is maps the current deployment to the activation
  **/
  private String deployment;

  @ApiModelProperty(value = "Expiration date in MM/DD/YYYY format.")
 /**
   * Expiration date in MM/DD/YYYY format.
  **/
  private String expiration;

  @ApiModelProperty(value = "List of engine/module identifiers that have been licensed")
 /**
   * List of engine/module identifiers that have been licensed
  **/
  private List<String> licensedEngines = null;

  @ApiModelProperty(value = "Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance.")
 /**
   * Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance.
  **/
  private String maxNodeCount;

  @ApiModelProperty(value = "Track online/offline activation mode")
 /**
   * Track online/offline activation mode
  **/
  private Boolean onlineActivated;

  @ApiModelProperty(value = "Official MetaDefender base SKU licensed.")
 /**
   * Official MetaDefender base SKU licensed.
  **/
  private String productId;

  @ApiModelProperty(value = "Official MetaDefender base product name licensed.")
 /**
   * Official MetaDefender base product name licensed.
  **/
  private String productName;
 /**
   * Number of days left before expiration
   * @return daysLeft
  **/
  @JsonProperty("days_left")
  public Integer getDaysLeft() {
    return daysLeft;
  }

  public void setDaysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
  }

  public LicenseInformation daysLeft(Integer daysLeft) {
    this.daysLeft = daysLeft;
    return this;
  }

 /**
   * Unique identifier which is maps the current deployment to the activation
   * @return deployment
  **/
  @JsonProperty("deployment")
  public String getDeployment() {
    return deployment;
  }

  public void setDeployment(String deployment) {
    this.deployment = deployment;
  }

  public LicenseInformation deployment(String deployment) {
    this.deployment = deployment;
    return this;
  }

 /**
   * Expiration date in MM/DD/YYYY format.
   * @return expiration
  **/
  @JsonProperty("expiration")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public LicenseInformation expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

 /**
   * List of engine/module identifiers that have been licensed
   * @return licensedEngines
  **/
  @JsonProperty("licensed_engines")
  public List<String> getLicensedEngines() {
    return licensedEngines;
  }

  public void setLicensedEngines(List<String> licensedEngines) {
    this.licensedEngines = licensedEngines;
  }

  public LicenseInformation licensedEngines(List<String> licensedEngines) {
    this.licensedEngines = licensedEngines;
    return this;
  }

  public LicenseInformation addLicensedEnginesItem(String licensedEnginesItem) {
    this.licensedEngines.add(licensedEnginesItem);
    return this;
  }

 /**
   * Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance.
   * @return maxNodeCount
  **/
  @JsonProperty("max_node_count")
  public String getMaxNodeCount() {
    return maxNodeCount;
  }

  public void setMaxNodeCount(String maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
  }

  public LicenseInformation maxNodeCount(String maxNodeCount) {
    this.maxNodeCount = maxNodeCount;
    return this;
  }

 /**
   * Track online/offline activation mode
   * @return onlineActivated
  **/
  @JsonProperty("online_activated")
  public Boolean getOnlineActivated() {
    return onlineActivated;
  }

  public void setOnlineActivated(Boolean onlineActivated) {
    this.onlineActivated = onlineActivated;
  }

  public LicenseInformation onlineActivated(Boolean onlineActivated) {
    this.onlineActivated = onlineActivated;
    return this;
  }

 /**
   * Official MetaDefender base SKU licensed.
   * @return productId
  **/
  @JsonProperty("product_id")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public LicenseInformation productId(String productId) {
    this.productId = productId;
    return this;
  }

 /**
   * Official MetaDefender base product name licensed.
   * @return productName
  **/
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public LicenseInformation productName(String productName) {
    this.productName = productName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

