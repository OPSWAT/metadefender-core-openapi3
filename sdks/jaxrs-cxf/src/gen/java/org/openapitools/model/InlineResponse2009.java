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

public class InlineResponse2009  {
  
  @ApiModelProperty(example = "j2939fh3ifoqkhwhr3h9h1h0re", value = "The file submission identifier")
 /**
   * The file submission identifier
  **/
  private String dataId;

  @ApiModelProperty(example = "", value = "A timestamp when the request has been made.")
 /**
   * A timestamp when the request has been made.
  **/
  private String requestTime;

  @ApiModelProperty(example = "200", value = "What was the returned HTTP status code.")
 /**
   * What was the returned HTTP status code.
  **/
  private Integer statusCode;

  @ApiModelProperty(example = "https://apigateway.corporate.com/metadefender/callbackurl", value = "What was the called URL (should match the `callbackurl` header).")
 /**
   * What was the called URL (should match the `callbackurl` header).
  **/
  private String url;
 /**
   * The file submission identifier
   * @return dataId
  **/
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  public InlineResponse2009 dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

 /**
   * A timestamp when the request has been made.
   * @return requestTime
  **/
  @JsonProperty("request_time")
  public String getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }

  public InlineResponse2009 requestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

 /**
   * What was the returned HTTP status code.
   * @return statusCode
  **/
  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public InlineResponse2009 statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * What was the called URL (should match the &#x60;callbackurl&#x60; header).
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InlineResponse2009 url(String url) {
    this.url = url;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

