package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
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
  * Webhook configuration details.
 **/
@ApiModel(description="Webhook configuration details.")
public class AdminConfigWebhook  {
  
  @ApiModelProperty(example = "3", value = "Number of allowed retries sending callback to client when failed.  > _**For example**_: maxretrytime= 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms) ")
  @Valid
 /**
   * Number of allowed retries sending callback to client when failed.  > _**For example**_: maxretrytime= 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms) 
  **/
  private BigDecimal maxretrytime;

  @ApiModelProperty(example = "1000", value = "in milliseconds")
  @Valid
 /**
   * in milliseconds
  **/
  private BigDecimal delayduration;

  @ApiModelProperty(example = "1000", value = "in milliseconds")
  @Valid
 /**
   * in milliseconds
  **/
  private BigDecimal deplayprogression;
 /**
   * Number of allowed retries sending callback to client when failed.  &gt; _**For example**_: maxretrytime&#x3D; 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms) 
   * @return maxretrytime
  **/
  @JsonProperty("maxretrytime")
  public BigDecimal getMaxretrytime() {
    return maxretrytime;
  }

  public void setMaxretrytime(BigDecimal maxretrytime) {
    this.maxretrytime = maxretrytime;
  }

  public AdminConfigWebhook maxretrytime(BigDecimal maxretrytime) {
    this.maxretrytime = maxretrytime;
    return this;
  }

 /**
   * in milliseconds
   * @return delayduration
  **/
  @JsonProperty("delayduration")
  public BigDecimal getDelayduration() {
    return delayduration;
  }

  public void setDelayduration(BigDecimal delayduration) {
    this.delayduration = delayduration;
  }

  public AdminConfigWebhook delayduration(BigDecimal delayduration) {
    this.delayduration = delayduration;
    return this;
  }

 /**
   * in milliseconds
   * @return deplayprogression
  **/
  @JsonProperty("deplayprogression")
  public BigDecimal getDeplayprogression() {
    return deplayprogression;
  }

  public void setDeplayprogression(BigDecimal deplayprogression) {
    this.deplayprogression = deplayprogression;
  }

  public AdminConfigWebhook deplayprogression(BigDecimal deplayprogression) {
    this.deplayprogression = deplayprogression;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminConfigWebhook {\n");
    
    sb.append("    maxretrytime: ").append(toIndentedString(maxretrytime)).append("\n");
    sb.append("    delayduration: ").append(toIndentedString(delayduration)).append("\n");
    sb.append("    deplayprogression: ").append(toIndentedString(deplayprogression)).append("\n");
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

