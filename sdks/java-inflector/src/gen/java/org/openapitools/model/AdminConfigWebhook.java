package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Webhook configuration details.
 **/

@ApiModel(description = "Webhook configuration details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AdminConfigWebhook   {
  @JsonProperty("maxretrytime")
  private BigDecimal maxretrytime;

  @JsonProperty("delayduration")
  private BigDecimal delayduration;

  @JsonProperty("deplayprogression")
  private BigDecimal deplayprogression;

  /**
   * Number of allowed retries sending callback to client when failed.  > _**For example**_: maxretrytime= 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms) 
   **/
  public AdminConfigWebhook maxretrytime(BigDecimal maxretrytime) {
    this.maxretrytime = maxretrytime;
    return this;
  }

  
  @ApiModelProperty(example = "3", value = "Number of allowed retries sending callback to client when failed.  > _**For example**_: maxretrytime= 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms) ")
  @JsonProperty("maxretrytime")
  public BigDecimal getMaxretrytime() {
    return maxretrytime;
  }
  public void setMaxretrytime(BigDecimal maxretrytime) {
    this.maxretrytime = maxretrytime;
  }

  /**
   * in milliseconds
   **/
  public AdminConfigWebhook delayduration(BigDecimal delayduration) {
    this.delayduration = delayduration;
    return this;
  }

  
  @ApiModelProperty(example = "1000", value = "in milliseconds")
  @JsonProperty("delayduration")
  public BigDecimal getDelayduration() {
    return delayduration;
  }
  public void setDelayduration(BigDecimal delayduration) {
    this.delayduration = delayduration;
  }

  /**
   * in milliseconds
   **/
  public AdminConfigWebhook deplayprogression(BigDecimal deplayprogression) {
    this.deplayprogression = deplayprogression;
    return this;
  }

  
  @ApiModelProperty(example = "1000", value = "in milliseconds")
  @JsonProperty("deplayprogression")
  public BigDecimal getDeplayprogression() {
    return deplayprogression;
  }
  public void setDeplayprogression(BigDecimal deplayprogression) {
    this.deplayprogression = deplayprogression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminConfigWebhook adminConfigWebhook = (AdminConfigWebhook) o;
    return Objects.equals(maxretrytime, adminConfigWebhook.maxretrytime) &&
        Objects.equals(delayduration, adminConfigWebhook.delayduration) &&
        Objects.equals(deplayprogression, adminConfigWebhook.deplayprogression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxretrytime, delayduration, deplayprogression);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

