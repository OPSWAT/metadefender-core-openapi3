package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class InlineResponse2009   {
  @JsonProperty("data_id")
  private String dataId;

  @JsonProperty("request_time")
  private String requestTime;

  @JsonProperty("status_code")
  private Integer statusCode;

  @JsonProperty("url")
  private String url;

  /**
   * The file submission identifier
   **/
  public InlineResponse2009 dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

  
  @ApiModelProperty(example = "j2939fh3ifoqkhwhr3h9h1h0re", value = "The file submission identifier")
  @JsonProperty("data_id")
  public String getDataId() {
    return dataId;
  }
  public void setDataId(String dataId) {
    this.dataId = dataId;
  }

  /**
   * A timestamp when the request has been made.
   **/
  public InlineResponse2009 requestTime(String requestTime) {
    this.requestTime = requestTime;
    return this;
  }

  
  @ApiModelProperty(example = "", value = "A timestamp when the request has been made.")
  @JsonProperty("request_time")
  public String getRequestTime() {
    return requestTime;
  }
  public void setRequestTime(String requestTime) {
    this.requestTime = requestTime;
  }

  /**
   * What was the returned HTTP status code.
   **/
  public InlineResponse2009 statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @ApiModelProperty(example = "200", value = "What was the returned HTTP status code.")
  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * What was the called URL (should match the `callbackurl` header).
   **/
  public InlineResponse2009 url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://apigateway.corporate.com/metadefender/callbackurl", value = "What was the called URL (should match the `callbackurl` header).")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(dataId, inlineResponse2009.dataId) &&
        Objects.equals(requestTime, inlineResponse2009.requestTime) &&
        Objects.equals(statusCode, inlineResponse2009.statusCode) &&
        Objects.equals(url, inlineResponse2009.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId, requestTime, statusCode, url);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

