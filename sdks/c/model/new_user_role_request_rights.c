#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "new_user_role_request_rights.h"



new_user_role_request_rights_t *new_user_role_request_rights_create(
    role_permission_object_t *agents,
    role_permission_object_t *cert,
    role_permission_object_t *configlog,
    role_permission_object_t *engines,
    role_permission_object_t *external,
    role_permission_object_t *license,
    role_permission_object_t *quarantine,
    role_permission_object_t *retention,
    role_permission_object_t *rule,
    role_permission_object_t *scan,
    role_permission_object_t *scanlog,
    role_permission_object_t *skip,
    role_permission_object_t *update,
    role_permission_object_t *updatelog,
    role_permission_object_t *users,
    role_permission_object_t *workflow,
    role_permission_object_t *zone
    ) {
    new_user_role_request_rights_t *new_user_role_request_rights_local_var = malloc(sizeof(new_user_role_request_rights_t));
    if (!new_user_role_request_rights_local_var) {
        return NULL;
    }
    new_user_role_request_rights_local_var->agents = agents;
    new_user_role_request_rights_local_var->cert = cert;
    new_user_role_request_rights_local_var->configlog = configlog;
    new_user_role_request_rights_local_var->engines = engines;
    new_user_role_request_rights_local_var->external = external;
    new_user_role_request_rights_local_var->license = license;
    new_user_role_request_rights_local_var->quarantine = quarantine;
    new_user_role_request_rights_local_var->retention = retention;
    new_user_role_request_rights_local_var->rule = rule;
    new_user_role_request_rights_local_var->scan = scan;
    new_user_role_request_rights_local_var->scanlog = scanlog;
    new_user_role_request_rights_local_var->skip = skip;
    new_user_role_request_rights_local_var->update = update;
    new_user_role_request_rights_local_var->updatelog = updatelog;
    new_user_role_request_rights_local_var->users = users;
    new_user_role_request_rights_local_var->workflow = workflow;
    new_user_role_request_rights_local_var->zone = zone;

    return new_user_role_request_rights_local_var;
}


void new_user_role_request_rights_free(new_user_role_request_rights_t *new_user_role_request_rights) {
    if(NULL == new_user_role_request_rights){
        return ;
    }
    listEntry_t *listEntry;
    role_permission_object_free(new_user_role_request_rights->agents);
    role_permission_object_free(new_user_role_request_rights->cert);
    role_permission_object_free(new_user_role_request_rights->configlog);
    role_permission_object_free(new_user_role_request_rights->engines);
    role_permission_object_free(new_user_role_request_rights->external);
    role_permission_object_free(new_user_role_request_rights->license);
    role_permission_object_free(new_user_role_request_rights->quarantine);
    role_permission_object_free(new_user_role_request_rights->retention);
    role_permission_object_free(new_user_role_request_rights->rule);
    role_permission_object_free(new_user_role_request_rights->scan);
    role_permission_object_free(new_user_role_request_rights->scanlog);
    role_permission_object_free(new_user_role_request_rights->skip);
    role_permission_object_free(new_user_role_request_rights->update);
    role_permission_object_free(new_user_role_request_rights->updatelog);
    role_permission_object_free(new_user_role_request_rights->users);
    role_permission_object_free(new_user_role_request_rights->workflow);
    role_permission_object_free(new_user_role_request_rights->zone);
    free(new_user_role_request_rights);
}

cJSON *new_user_role_request_rights_convertToJSON(new_user_role_request_rights_t *new_user_role_request_rights) {
    cJSON *item = cJSON_CreateObject();

    // new_user_role_request_rights->agents
    if(new_user_role_request_rights->agents) { 
    cJSON *agents_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->agents);
    if(agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agents", agents_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->cert
    if(new_user_role_request_rights->cert) { 
    cJSON *cert_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->cert);
    if(cert_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cert", cert_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->configlog
    if(new_user_role_request_rights->configlog) { 
    cJSON *configlog_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->configlog);
    if(configlog_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configlog", configlog_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->engines
    if(new_user_role_request_rights->engines) { 
    cJSON *engines_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->engines);
    if(engines_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "engines", engines_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->external
    if(new_user_role_request_rights->external) { 
    cJSON *external_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->external);
    if(external_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "external", external_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->license
    if(new_user_role_request_rights->license) { 
    cJSON *license_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->license);
    if(license_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "license", license_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->quarantine
    if(new_user_role_request_rights->quarantine) { 
    cJSON *quarantine_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->quarantine);
    if(quarantine_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quarantine", quarantine_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->retention
    if(new_user_role_request_rights->retention) { 
    cJSON *retention_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->retention);
    if(retention_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retention", retention_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->rule
    if(new_user_role_request_rights->rule) { 
    cJSON *rule_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->scan
    if(new_user_role_request_rights->scan) { 
    cJSON *scan_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->scan);
    if(scan_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan", scan_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->scanlog
    if(new_user_role_request_rights->scanlog) { 
    cJSON *scanlog_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->scanlog);
    if(scanlog_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scanlog", scanlog_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->skip
    if(new_user_role_request_rights->skip) { 
    cJSON *skip_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->skip);
    if(skip_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "skip", skip_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->update
    if(new_user_role_request_rights->update) { 
    cJSON *update_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->update);
    if(update_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "update", update_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->updatelog
    if(new_user_role_request_rights->updatelog) { 
    cJSON *updatelog_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->updatelog);
    if(updatelog_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "updatelog", updatelog_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->users
    if(new_user_role_request_rights->users) { 
    cJSON *users_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->users);
    if(users_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "users", users_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->workflow
    if(new_user_role_request_rights->workflow) { 
    cJSON *workflow_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->workflow);
    if(workflow_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workflow", workflow_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_request_rights->zone
    if(new_user_role_request_rights->zone) { 
    cJSON *zone_local_JSON = role_permission_object_convertToJSON(new_user_role_request_rights->zone);
    if(zone_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "zone", zone_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

new_user_role_request_rights_t *new_user_role_request_rights_parseFromJSON(cJSON *new_user_role_request_rightsJSON){

    new_user_role_request_rights_t *new_user_role_request_rights_local_var = NULL;

    // new_user_role_request_rights->agents
    cJSON *agents = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "agents");
    role_permission_object_t *agents_local_nonprim = NULL;
    if (agents) { 
    agents_local_nonprim = role_permission_object_parseFromJSON(agents); //nonprimitive
    }

    // new_user_role_request_rights->cert
    cJSON *cert = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "cert");
    role_permission_object_t *cert_local_nonprim = NULL;
    if (cert) { 
    cert_local_nonprim = role_permission_object_parseFromJSON(cert); //nonprimitive
    }

    // new_user_role_request_rights->configlog
    cJSON *configlog = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "configlog");
    role_permission_object_t *configlog_local_nonprim = NULL;
    if (configlog) { 
    configlog_local_nonprim = role_permission_object_parseFromJSON(configlog); //nonprimitive
    }

    // new_user_role_request_rights->engines
    cJSON *engines = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "engines");
    role_permission_object_t *engines_local_nonprim = NULL;
    if (engines) { 
    engines_local_nonprim = role_permission_object_parseFromJSON(engines); //nonprimitive
    }

    // new_user_role_request_rights->external
    cJSON *external = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "external");
    role_permission_object_t *external_local_nonprim = NULL;
    if (external) { 
    external_local_nonprim = role_permission_object_parseFromJSON(external); //nonprimitive
    }

    // new_user_role_request_rights->license
    cJSON *license = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "license");
    role_permission_object_t *license_local_nonprim = NULL;
    if (license) { 
    license_local_nonprim = role_permission_object_parseFromJSON(license); //nonprimitive
    }

    // new_user_role_request_rights->quarantine
    cJSON *quarantine = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "quarantine");
    role_permission_object_t *quarantine_local_nonprim = NULL;
    if (quarantine) { 
    quarantine_local_nonprim = role_permission_object_parseFromJSON(quarantine); //nonprimitive
    }

    // new_user_role_request_rights->retention
    cJSON *retention = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "retention");
    role_permission_object_t *retention_local_nonprim = NULL;
    if (retention) { 
    retention_local_nonprim = role_permission_object_parseFromJSON(retention); //nonprimitive
    }

    // new_user_role_request_rights->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "rule");
    role_permission_object_t *rule_local_nonprim = NULL;
    if (rule) { 
    rule_local_nonprim = role_permission_object_parseFromJSON(rule); //nonprimitive
    }

    // new_user_role_request_rights->scan
    cJSON *scan = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "scan");
    role_permission_object_t *scan_local_nonprim = NULL;
    if (scan) { 
    scan_local_nonprim = role_permission_object_parseFromJSON(scan); //nonprimitive
    }

    // new_user_role_request_rights->scanlog
    cJSON *scanlog = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "scanlog");
    role_permission_object_t *scanlog_local_nonprim = NULL;
    if (scanlog) { 
    scanlog_local_nonprim = role_permission_object_parseFromJSON(scanlog); //nonprimitive
    }

    // new_user_role_request_rights->skip
    cJSON *skip = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "skip");
    role_permission_object_t *skip_local_nonprim = NULL;
    if (skip) { 
    skip_local_nonprim = role_permission_object_parseFromJSON(skip); //nonprimitive
    }

    // new_user_role_request_rights->update
    cJSON *update = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "update");
    role_permission_object_t *update_local_nonprim = NULL;
    if (update) { 
    update_local_nonprim = role_permission_object_parseFromJSON(update); //nonprimitive
    }

    // new_user_role_request_rights->updatelog
    cJSON *updatelog = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "updatelog");
    role_permission_object_t *updatelog_local_nonprim = NULL;
    if (updatelog) { 
    updatelog_local_nonprim = role_permission_object_parseFromJSON(updatelog); //nonprimitive
    }

    // new_user_role_request_rights->users
    cJSON *users = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "users");
    role_permission_object_t *users_local_nonprim = NULL;
    if (users) { 
    users_local_nonprim = role_permission_object_parseFromJSON(users); //nonprimitive
    }

    // new_user_role_request_rights->workflow
    cJSON *workflow = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "workflow");
    role_permission_object_t *workflow_local_nonprim = NULL;
    if (workflow) { 
    workflow_local_nonprim = role_permission_object_parseFromJSON(workflow); //nonprimitive
    }

    // new_user_role_request_rights->zone
    cJSON *zone = cJSON_GetObjectItemCaseSensitive(new_user_role_request_rightsJSON, "zone");
    role_permission_object_t *zone_local_nonprim = NULL;
    if (zone) { 
    zone_local_nonprim = role_permission_object_parseFromJSON(zone); //nonprimitive
    }


    new_user_role_request_rights_local_var = new_user_role_request_rights_create (
        agents ? agents_local_nonprim : NULL,
        cert ? cert_local_nonprim : NULL,
        configlog ? configlog_local_nonprim : NULL,
        engines ? engines_local_nonprim : NULL,
        external ? external_local_nonprim : NULL,
        license ? license_local_nonprim : NULL,
        quarantine ? quarantine_local_nonprim : NULL,
        retention ? retention_local_nonprim : NULL,
        rule ? rule_local_nonprim : NULL,
        scan ? scan_local_nonprim : NULL,
        scanlog ? scanlog_local_nonprim : NULL,
        skip ? skip_local_nonprim : NULL,
        update ? update_local_nonprim : NULL,
        updatelog ? updatelog_local_nonprim : NULL,
        users ? users_local_nonprim : NULL,
        workflow ? workflow_local_nonprim : NULL,
        zone ? zone_local_nonprim : NULL
        );

    return new_user_role_request_rights_local_var;
end:
    return NULL;

}
