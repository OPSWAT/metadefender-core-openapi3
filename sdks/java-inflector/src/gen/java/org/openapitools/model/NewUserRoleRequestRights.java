package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RolePermissionObject;



/**
 * A list of rights for each permission
 **/

@ApiModel(description = "A list of rights for each permission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-05-15T23:49:39.082677Z[UTC]")
public class NewUserRoleRequestRights   {
  @JsonProperty("agents")
  private RolePermissionObject agents = null;

  @JsonProperty("cert")
  private RolePermissionObject cert = null;

  @JsonProperty("configlog")
  private RolePermissionObject configlog = null;

  @JsonProperty("engines")
  private RolePermissionObject engines = null;

  @JsonProperty("external")
  private RolePermissionObject external = null;

  @JsonProperty("license")
  private RolePermissionObject license = null;

  @JsonProperty("quarantine")
  private RolePermissionObject quarantine = null;

  @JsonProperty("retention")
  private RolePermissionObject retention = null;

  @JsonProperty("rule")
  private RolePermissionObject rule = null;

  @JsonProperty("scan")
  private RolePermissionObject scan = null;

  @JsonProperty("scanlog")
  private RolePermissionObject scanlog = null;

  @JsonProperty("skip")
  private RolePermissionObject skip = null;

  @JsonProperty("update")
  private RolePermissionObject update = null;

  @JsonProperty("updatelog")
  private RolePermissionObject updatelog = null;

  @JsonProperty("users")
  private RolePermissionObject users = null;

  @JsonProperty("workflow")
  private RolePermissionObject workflow = null;

  @JsonProperty("zone")
  private RolePermissionObject zone = null;

  /**
   * What permissions are allowed for Node.
   **/
  public NewUserRoleRequestRights agents(RolePermissionObject agents) {
    this.agents = agents;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for Node.")
  @JsonProperty("agents")
  public RolePermissionObject getAgents() {
    return agents;
  }
  public void setAgents(RolePermissionObject agents) {
    this.agents = agents;
  }

  /**
   * What permissions are allowed for Certificates.
   **/
  public NewUserRoleRequestRights cert(RolePermissionObject cert) {
    this.cert = cert;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for Certificates.")
  @JsonProperty("cert")
  public RolePermissionObject getCert() {
    return cert;
  }
  public void setCert(RolePermissionObject cert) {
    this.cert = cert;
  }

  /**
   * What permissions are allowed for Configuration logs.
   **/
  public NewUserRoleRequestRights configlog(RolePermissionObject configlog) {
    this.configlog = configlog;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for Configuration logs.")
  @JsonProperty("configlog")
  public RolePermissionObject getConfiglog() {
    return configlog;
  }
  public void setConfiglog(RolePermissionObject configlog) {
    this.configlog = configlog;
  }

  /**
   * What permissions are allowed for Engines and Modules.
   **/
  public NewUserRoleRequestRights engines(RolePermissionObject engines) {
    this.engines = engines;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for Engines and Modules.")
  @JsonProperty("engines")
  public RolePermissionObject getEngines() {
    return engines;
  }
  public void setEngines(RolePermissionObject engines) {
    this.engines = engines;
  }

  /**
   * What permissions are allowed for External actions (External Scanner/Post Actions).
   **/
  public NewUserRoleRequestRights external(RolePermissionObject external) {
    this.external = external;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for External actions (External Scanner/Post Actions).")
  @JsonProperty("external")
  public RolePermissionObject getExternal() {
    return external;
  }
  public void setExternal(RolePermissionObject external) {
    this.external = external;
  }

  /**
   * What permissions are allowed for managing the License.
   **/
  public NewUserRoleRequestRights license(RolePermissionObject license) {
    this.license = license;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the License.")
  @JsonProperty("license")
  public RolePermissionObject getLicense() {
    return license;
  }
  public void setLicense(RolePermissionObject license) {
    this.license = license;
  }

  /**
   * What permissions are allowed for managing the Quarantine.
   **/
  public NewUserRoleRequestRights quarantine(RolePermissionObject quarantine) {
    this.quarantine = quarantine;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the Quarantine.")
  @JsonProperty("quarantine")
  public RolePermissionObject getQuarantine() {
    return quarantine;
  }
  public void setQuarantine(RolePermissionObject quarantine) {
    this.quarantine = quarantine;
  }

  /**
   * What permissions are allowed for managing the retention policies.
   **/
  public NewUserRoleRequestRights retention(RolePermissionObject retention) {
    this.retention = retention;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the retention policies.")
  @JsonProperty("retention")
  public RolePermissionObject getRetention() {
    return retention;
  }
  public void setRetention(RolePermissionObject retention) {
    this.retention = retention;
  }

  /**
   * What permissions are allowed for managing the workflow rules.
   **/
  public NewUserRoleRequestRights rule(RolePermissionObject rule) {
    this.rule = rule;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the workflow rules.")
  @JsonProperty("rule")
  public RolePermissionObject getRule() {
    return rule;
  }
  public void setRule(RolePermissionObject rule) {
    this.rule = rule;
  }

  /**
   * What permissions are allowed for managing analysis actions.
   **/
  public NewUserRoleRequestRights scan(RolePermissionObject scan) {
    this.scan = scan;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing analysis actions.")
  @JsonProperty("scan")
  public RolePermissionObject getScan() {
    return scan;
  }
  public void setScan(RolePermissionObject scan) {
    this.scan = scan;
  }

  /**
   * What permissions are allowed for managing the analysis logs.
   **/
  public NewUserRoleRequestRights scanlog(RolePermissionObject scanlog) {
    this.scanlog = scanlog;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the analysis logs.")
  @JsonProperty("scanlog")
  public RolePermissionObject getScanlog() {
    return scanlog;
  }
  public void setScanlog(RolePermissionObject scanlog) {
    this.scanlog = scanlog;
  }

  /**
   * What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory.
   **/
  public NewUserRoleRequestRights skip(RolePermissionObject skip) {
    this.skip = skip;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory.")
  @JsonProperty("skip")
  public RolePermissionObject getSkip() {
    return skip;
  }
  public void setSkip(RolePermissionObject skip) {
    this.skip = skip;
  }

  /**
   * What permissions are allowed for managing the update configuration.
   **/
  public NewUserRoleRequestRights update(RolePermissionObject update) {
    this.update = update;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the update configuration.")
  @JsonProperty("update")
  public RolePermissionObject getUpdate() {
    return update;
  }
  public void setUpdate(RolePermissionObject update) {
    this.update = update;
  }

  /**
   * What permissions are allowed for managing the update logs.
   **/
  public NewUserRoleRequestRights updatelog(RolePermissionObject updatelog) {
    this.updatelog = updatelog;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the update logs.")
  @JsonProperty("updatelog")
  public RolePermissionObject getUpdatelog() {
    return updatelog;
  }
  public void setUpdatelog(RolePermissionObject updatelog) {
    this.updatelog = updatelog;
  }

  /**
   * What permissions are allowed for managing the users.
   **/
  public NewUserRoleRequestRights users(RolePermissionObject users) {
    this.users = users;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the users.")
  @JsonProperty("users")
  public RolePermissionObject getUsers() {
    return users;
  }
  public void setUsers(RolePermissionObject users) {
    this.users = users;
  }

  /**
   * What permissions are allowed for managing the workflow templates.
   **/
  public NewUserRoleRequestRights workflow(RolePermissionObject workflow) {
    this.workflow = workflow;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the workflow templates.")
  @JsonProperty("workflow")
  public RolePermissionObject getWorkflow() {
    return workflow;
  }
  public void setWorkflow(RolePermissionObject workflow) {
    this.workflow = workflow;
  }

  /**
   * What permissions are allowed for managing the network zones.
   **/
  public NewUserRoleRequestRights zone(RolePermissionObject zone) {
    this.zone = zone;
    return this;
  }

  
  @ApiModelProperty(value = "What permissions are allowed for managing the network zones.")
  @JsonProperty("zone")
  public RolePermissionObject getZone() {
    return zone;
  }
  public void setZone(RolePermissionObject zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserRoleRequestRights newUserRoleRequestRights = (NewUserRoleRequestRights) o;
    return Objects.equals(agents, newUserRoleRequestRights.agents) &&
        Objects.equals(cert, newUserRoleRequestRights.cert) &&
        Objects.equals(configlog, newUserRoleRequestRights.configlog) &&
        Objects.equals(engines, newUserRoleRequestRights.engines) &&
        Objects.equals(external, newUserRoleRequestRights.external) &&
        Objects.equals(license, newUserRoleRequestRights.license) &&
        Objects.equals(quarantine, newUserRoleRequestRights.quarantine) &&
        Objects.equals(retention, newUserRoleRequestRights.retention) &&
        Objects.equals(rule, newUserRoleRequestRights.rule) &&
        Objects.equals(scan, newUserRoleRequestRights.scan) &&
        Objects.equals(scanlog, newUserRoleRequestRights.scanlog) &&
        Objects.equals(skip, newUserRoleRequestRights.skip) &&
        Objects.equals(update, newUserRoleRequestRights.update) &&
        Objects.equals(updatelog, newUserRoleRequestRights.updatelog) &&
        Objects.equals(users, newUserRoleRequestRights.users) &&
        Objects.equals(workflow, newUserRoleRequestRights.workflow) &&
        Objects.equals(zone, newUserRoleRequestRights.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, cert, configlog, engines, external, license, quarantine, retention, rule, scan, scanlog, skip, update, updatelog, users, workflow, zone);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

