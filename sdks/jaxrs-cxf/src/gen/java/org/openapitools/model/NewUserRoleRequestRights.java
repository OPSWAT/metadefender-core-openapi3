package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RolePermissionObject;
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
  * A list of rights for each permission
 **/
@ApiModel(description="A list of rights for each permission")
public class NewUserRoleRequestRights  {
  
  @ApiModelProperty(value = "What permissions are allowed for Node.")
  @Valid
 /**
   * What permissions are allowed for Node.
  **/
  private RolePermissionObject agents = null;

  @ApiModelProperty(value = "What permissions are allowed for Certificates.")
  @Valid
 /**
   * What permissions are allowed for Certificates.
  **/
  private RolePermissionObject cert = null;

  @ApiModelProperty(value = "What permissions are allowed for Configuration logs.")
  @Valid
 /**
   * What permissions are allowed for Configuration logs.
  **/
  private RolePermissionObject configlog = null;

  @ApiModelProperty(value = "What permissions are allowed for Engines and Modules.")
  @Valid
 /**
   * What permissions are allowed for Engines and Modules.
  **/
  private RolePermissionObject engines = null;

  @ApiModelProperty(value = "What permissions are allowed for External actions (External Scanner/Post Actions).")
  @Valid
 /**
   * What permissions are allowed for External actions (External Scanner/Post Actions).
  **/
  private RolePermissionObject external = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the License.")
  @Valid
 /**
   * What permissions are allowed for managing the License.
  **/
  private RolePermissionObject license = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the Quarantine.")
  @Valid
 /**
   * What permissions are allowed for managing the Quarantine.
  **/
  private RolePermissionObject quarantine = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the retention policies.")
  @Valid
 /**
   * What permissions are allowed for managing the retention policies.
  **/
  private RolePermissionObject retention = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the workflow rules.")
  @Valid
 /**
   * What permissions are allowed for managing the workflow rules.
  **/
  private RolePermissionObject rule = null;

  @ApiModelProperty(value = "What permissions are allowed for managing analysis actions.")
  @Valid
 /**
   * What permissions are allowed for managing analysis actions.
  **/
  private RolePermissionObject scan = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the analysis logs.")
  @Valid
 /**
   * What permissions are allowed for managing the analysis logs.
  **/
  private RolePermissionObject scanlog = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory.")
  @Valid
 /**
   * What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory.
  **/
  private RolePermissionObject skip = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the update configuration.")
  @Valid
 /**
   * What permissions are allowed for managing the update configuration.
  **/
  private RolePermissionObject update = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the update logs.")
  @Valid
 /**
   * What permissions are allowed for managing the update logs.
  **/
  private RolePermissionObject updatelog = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the users.")
  @Valid
 /**
   * What permissions are allowed for managing the users.
  **/
  private RolePermissionObject users = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the workflow templates.")
  @Valid
 /**
   * What permissions are allowed for managing the workflow templates.
  **/
  private RolePermissionObject workflow = null;

  @ApiModelProperty(value = "What permissions are allowed for managing the network zones.")
  @Valid
 /**
   * What permissions are allowed for managing the network zones.
  **/
  private RolePermissionObject zone = null;
 /**
   * What permissions are allowed for Node.
   * @return agents
  **/
  @JsonProperty("agents")
  public RolePermissionObject getAgents() {
    return agents;
  }

  public void setAgents(RolePermissionObject agents) {
    this.agents = agents;
  }

  public NewUserRoleRequestRights agents(RolePermissionObject agents) {
    this.agents = agents;
    return this;
  }

 /**
   * What permissions are allowed for Certificates.
   * @return cert
  **/
  @JsonProperty("cert")
  public RolePermissionObject getCert() {
    return cert;
  }

  public void setCert(RolePermissionObject cert) {
    this.cert = cert;
  }

  public NewUserRoleRequestRights cert(RolePermissionObject cert) {
    this.cert = cert;
    return this;
  }

 /**
   * What permissions are allowed for Configuration logs.
   * @return configlog
  **/
  @JsonProperty("configlog")
  public RolePermissionObject getConfiglog() {
    return configlog;
  }

  public void setConfiglog(RolePermissionObject configlog) {
    this.configlog = configlog;
  }

  public NewUserRoleRequestRights configlog(RolePermissionObject configlog) {
    this.configlog = configlog;
    return this;
  }

 /**
   * What permissions are allowed for Engines and Modules.
   * @return engines
  **/
  @JsonProperty("engines")
  public RolePermissionObject getEngines() {
    return engines;
  }

  public void setEngines(RolePermissionObject engines) {
    this.engines = engines;
  }

  public NewUserRoleRequestRights engines(RolePermissionObject engines) {
    this.engines = engines;
    return this;
  }

 /**
   * What permissions are allowed for External actions (External Scanner/Post Actions).
   * @return external
  **/
  @JsonProperty("external")
  public RolePermissionObject getExternal() {
    return external;
  }

  public void setExternal(RolePermissionObject external) {
    this.external = external;
  }

  public NewUserRoleRequestRights external(RolePermissionObject external) {
    this.external = external;
    return this;
  }

 /**
   * What permissions are allowed for managing the License.
   * @return license
  **/
  @JsonProperty("license")
  public RolePermissionObject getLicense() {
    return license;
  }

  public void setLicense(RolePermissionObject license) {
    this.license = license;
  }

  public NewUserRoleRequestRights license(RolePermissionObject license) {
    this.license = license;
    return this;
  }

 /**
   * What permissions are allowed for managing the Quarantine.
   * @return quarantine
  **/
  @JsonProperty("quarantine")
  public RolePermissionObject getQuarantine() {
    return quarantine;
  }

  public void setQuarantine(RolePermissionObject quarantine) {
    this.quarantine = quarantine;
  }

  public NewUserRoleRequestRights quarantine(RolePermissionObject quarantine) {
    this.quarantine = quarantine;
    return this;
  }

 /**
   * What permissions are allowed for managing the retention policies.
   * @return retention
  **/
  @JsonProperty("retention")
  public RolePermissionObject getRetention() {
    return retention;
  }

  public void setRetention(RolePermissionObject retention) {
    this.retention = retention;
  }

  public NewUserRoleRequestRights retention(RolePermissionObject retention) {
    this.retention = retention;
    return this;
  }

 /**
   * What permissions are allowed for managing the workflow rules.
   * @return rule
  **/
  @JsonProperty("rule")
  public RolePermissionObject getRule() {
    return rule;
  }

  public void setRule(RolePermissionObject rule) {
    this.rule = rule;
  }

  public NewUserRoleRequestRights rule(RolePermissionObject rule) {
    this.rule = rule;
    return this;
  }

 /**
   * What permissions are allowed for managing analysis actions.
   * @return scan
  **/
  @JsonProperty("scan")
  public RolePermissionObject getScan() {
    return scan;
  }

  public void setScan(RolePermissionObject scan) {
    this.scan = scan;
  }

  public NewUserRoleRequestRights scan(RolePermissionObject scan) {
    this.scan = scan;
    return this;
  }

 /**
   * What permissions are allowed for managing the analysis logs.
   * @return scanlog
  **/
  @JsonProperty("scanlog")
  public RolePermissionObject getScanlog() {
    return scanlog;
  }

  public void setScanlog(RolePermissionObject scanlog) {
    this.scanlog = scanlog;
  }

  public NewUserRoleRequestRights scanlog(RolePermissionObject scanlog) {
    this.scanlog = scanlog;
    return this;
  }

 /**
   * What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory.
   * @return skip
  **/
  @JsonProperty("skip")
  public RolePermissionObject getSkip() {
    return skip;
  }

  public void setSkip(RolePermissionObject skip) {
    this.skip = skip;
  }

  public NewUserRoleRequestRights skip(RolePermissionObject skip) {
    this.skip = skip;
    return this;
  }

 /**
   * What permissions are allowed for managing the update configuration.
   * @return update
  **/
  @JsonProperty("update")
  public RolePermissionObject getUpdate() {
    return update;
  }

  public void setUpdate(RolePermissionObject update) {
    this.update = update;
  }

  public NewUserRoleRequestRights update(RolePermissionObject update) {
    this.update = update;
    return this;
  }

 /**
   * What permissions are allowed for managing the update logs.
   * @return updatelog
  **/
  @JsonProperty("updatelog")
  public RolePermissionObject getUpdatelog() {
    return updatelog;
  }

  public void setUpdatelog(RolePermissionObject updatelog) {
    this.updatelog = updatelog;
  }

  public NewUserRoleRequestRights updatelog(RolePermissionObject updatelog) {
    this.updatelog = updatelog;
    return this;
  }

 /**
   * What permissions are allowed for managing the users.
   * @return users
  **/
  @JsonProperty("users")
  public RolePermissionObject getUsers() {
    return users;
  }

  public void setUsers(RolePermissionObject users) {
    this.users = users;
  }

  public NewUserRoleRequestRights users(RolePermissionObject users) {
    this.users = users;
    return this;
  }

 /**
   * What permissions are allowed for managing the workflow templates.
   * @return workflow
  **/
  @JsonProperty("workflow")
  public RolePermissionObject getWorkflow() {
    return workflow;
  }

  public void setWorkflow(RolePermissionObject workflow) {
    this.workflow = workflow;
  }

  public NewUserRoleRequestRights workflow(RolePermissionObject workflow) {
    this.workflow = workflow;
    return this;
  }

 /**
   * What permissions are allowed for managing the network zones.
   * @return zone
  **/
  @JsonProperty("zone")
  public RolePermissionObject getZone() {
    return zone;
  }

  public void setZone(RolePermissionObject zone) {
    this.zone = zone;
  }

  public NewUserRoleRequestRights zone(RolePermissionObject zone) {
    this.zone = zone;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRoleRequestRights {\n");
    
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    configlog: ").append(toIndentedString(configlog)).append("\n");
    sb.append("    engines: ").append(toIndentedString(engines)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    quarantine: ").append(toIndentedString(quarantine)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    scan: ").append(toIndentedString(scan)).append("\n");
    sb.append("    scanlog: ").append(toIndentedString(scanlog)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    updatelog: ").append(toIndentedString(updatelog)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

