package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * API object for /admin/config/session
 **/

@ApiModel(description = "API object for /admin/config/session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class AdminConfigSession   {
  @JsonProperty("absoluteSessionTimeout")
  private Integer absoluteSessionTimeout;

  @JsonProperty("allowCrossIpSessions")
  private Boolean allowCrossIpSessions;

  @JsonProperty("allowDuplicateSession")
  private Boolean allowDuplicateSession;

  @JsonProperty("sessionTimeout")
  private Integer sessionTimeout;

  /**
   * The interval (in milliseconds) for overall session length timeout (regardless of activity).
   **/
  public AdminConfigSession absoluteSessionTimeout(Integer absoluteSessionTimeout) {
    this.absoluteSessionTimeout = absoluteSessionTimeout;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "The interval (in milliseconds) for overall session length timeout (regardless of activity).")
  @JsonProperty("absoluteSessionTimeout")
  public Integer getAbsoluteSessionTimeout() {
    return absoluteSessionTimeout;
  }
  public void setAbsoluteSessionTimeout(Integer absoluteSessionTimeout) {
    this.absoluteSessionTimeout = absoluteSessionTimeout;
  }

  /**
   * Allow requests from the same user to come from different IPs.
   **/
  public AdminConfigSession allowCrossIpSessions(Boolean allowCrossIpSessions) {
    this.allowCrossIpSessions = allowCrossIpSessions;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Allow requests from the same user to come from different IPs.")
  @JsonProperty("allowCrossIpSessions")
  public Boolean getAllowCrossIpSessions() {
    return allowCrossIpSessions;
  }
  public void setAllowCrossIpSessions(Boolean allowCrossIpSessions) {
    this.allowCrossIpSessions = allowCrossIpSessions;
  }

  /**
   * Allow same user to have multiple active sessions.
   **/
  public AdminConfigSession allowDuplicateSession(Boolean allowDuplicateSession) {
    this.allowDuplicateSession = allowDuplicateSession;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Allow same user to have multiple active sessions.")
  @JsonProperty("allowDuplicateSession")
  public Boolean getAllowDuplicateSession() {
    return allowDuplicateSession;
  }
  public void setAllowDuplicateSession(Boolean allowDuplicateSession) {
    this.allowDuplicateSession = allowDuplicateSession;
  }

  /**
   * The interval (in milliseconds) for the user's session timeout, based on last activity. Timer starts after the last activity for the apikey.
   **/
  public AdminConfigSession sessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }

  
  @ApiModelProperty(example = "300000", value = "The interval (in milliseconds) for the user's session timeout, based on last activity. Timer starts after the last activity for the apikey.")
  @JsonProperty("sessionTimeout")
  public Integer getSessionTimeout() {
    return sessionTimeout;
  }
  public void setSessionTimeout(Integer sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminConfigSession adminConfigSession = (AdminConfigSession) o;
    return Objects.equals(absoluteSessionTimeout, adminConfigSession.absoluteSessionTimeout) &&
        Objects.equals(allowCrossIpSessions, adminConfigSession.allowCrossIpSessions) &&
        Objects.equals(allowDuplicateSession, adminConfigSession.allowDuplicateSession) &&
        Objects.equals(sessionTimeout, adminConfigSession.sessionTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteSessionTimeout, allowCrossIpSessions, allowDuplicateSession, sessionTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

