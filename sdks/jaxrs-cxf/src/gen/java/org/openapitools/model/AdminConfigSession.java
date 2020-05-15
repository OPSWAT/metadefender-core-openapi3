package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
  * API object for /admin/config/session
 **/
@ApiModel(description="API object for /admin/config/session")
public class AdminConfigSession  {
  
  @ApiModelProperty(example = "0", value = "The interval (in milliseconds) for overall session length timeout (regardless of activity).")
 /**
   * The interval (in milliseconds) for overall session length timeout (regardless of activity).
  **/
  private Integer absoluteSessionTimeout;

  @ApiModelProperty(example = "true", value = "Allow requests from the same user to come from different IPs.")
 /**
   * Allow requests from the same user to come from different IPs.
  **/
  private Boolean allowCrossIpSessions;

  @ApiModelProperty(example = "true", value = "Allow same user to have multiple active sessions.")
 /**
   * Allow same user to have multiple active sessions.
  **/
  private Boolean allowDuplicateSession;

  @ApiModelProperty(example = "300000", value = "The interval (in milliseconds) for the user's session timeout, based on last activity. Timer starts after the last activity for the apikey.")
 /**
   * The interval (in milliseconds) for the user's session timeout, based on last activity. Timer starts after the last activity for the apikey.
  **/
  private Integer sessionTimeout;
 /**
   * The interval (in milliseconds) for overall session length timeout (regardless of activity).
   * @return absoluteSessionTimeout
  **/
  @JsonProperty("absoluteSessionTimeout")
  public Integer getAbsoluteSessionTimeout() {
    return absoluteSessionTimeout;
  }

  public void setAbsoluteSessionTimeout(Integer absoluteSessionTimeout) {
    this.absoluteSessionTimeout = absoluteSessionTimeout;
  }

  public AdminConfigSession absoluteSessionTimeout(Integer absoluteSessionTimeout) {
    this.absoluteSessionTimeout = absoluteSessionTimeout;
    return this;
  }

 /**
   * Allow requests from the same user to come from different IPs.
   * @return allowCrossIpSessions
  **/
  @JsonProperty("allowCrossIpSessions")
  public Boolean getAllowCrossIpSessions() {
    return allowCrossIpSessions;
  }

  public void setAllowCrossIpSessions(Boolean allowCrossIpSessions) {
    this.allowCrossIpSessions = allowCrossIpSessions;
  }

  public AdminConfigSession allowCrossIpSessions(Boolean allowCrossIpSessions) {
    this.allowCrossIpSessions = allowCrossIpSessions;
    return this;
  }

 /**
   * Allow same user to have multiple active sessions.
   * @return allowDuplicateSession
  **/
  @JsonProperty("allowDuplicateSession")
  public Boolean getAllowDuplicateSession() {
    return allowDuplicateSession;
  }

  public void setAllowDuplicateSession(Boolean allowDuplicateSession) {
    this.allowDuplicateSession = allowDuplicateSession;
  }

  public AdminConfigSession allowDuplicateSession(Boolean allowDuplicateSession) {
    this.allowDuplicateSession = allowDuplicateSession;
    return this;
  }

 /**
   * The interval (in milliseconds) for the user&#39;s session timeout, based on last activity. Timer starts after the last activity for the apikey.
   * @return sessionTimeout
  **/
  @JsonProperty("sessionTimeout")
  public Integer getSessionTimeout() {
    return sessionTimeout;
  }

  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public AdminConfigSession sessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminConfigSession {\n");
    
    sb.append("    absoluteSessionTimeout: ").append(toIndentedString(absoluteSessionTimeout)).append("\n");
    sb.append("    allowCrossIpSessions: ").append(toIndentedString(allowCrossIpSessions)).append("\n");
    sb.append("    allowDuplicateSession: ").append(toIndentedString(allowDuplicateSession)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
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

