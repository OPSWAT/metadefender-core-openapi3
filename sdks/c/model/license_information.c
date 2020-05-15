#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "license_information.h"



license_information_t *license_information_create(
    int days_left,
    char *deployment,
    char *expiration,
    list_t *licensed_engines,
    char *max_node_count,
    int online_activated,
    char *product_id,
    char *product_name
    ) {
    license_information_t *license_information_local_var = malloc(sizeof(license_information_t));
    if (!license_information_local_var) {
        return NULL;
    }
    license_information_local_var->days_left = days_left;
    license_information_local_var->deployment = deployment;
    license_information_local_var->expiration = expiration;
    license_information_local_var->licensed_engines = licensed_engines;
    license_information_local_var->max_node_count = max_node_count;
    license_information_local_var->online_activated = online_activated;
    license_information_local_var->product_id = product_id;
    license_information_local_var->product_name = product_name;

    return license_information_local_var;
}


void license_information_free(license_information_t *license_information) {
    if(NULL == license_information){
        return ;
    }
    listEntry_t *listEntry;
    free(license_information->deployment);
    free(license_information->expiration);
    list_ForEach(listEntry, license_information->licensed_engines) {
        free(listEntry->data);
    }
    list_free(license_information->licensed_engines);
    free(license_information->max_node_count);
    free(license_information->product_id);
    free(license_information->product_name);
    free(license_information);
}

cJSON *license_information_convertToJSON(license_information_t *license_information) {
    cJSON *item = cJSON_CreateObject();

    // license_information->days_left
    if(license_information->days_left) { 
    if(cJSON_AddNumberToObject(item, "days_left", license_information->days_left) == NULL) {
    goto fail; //Numeric
    }
     } 


    // license_information->deployment
    if(license_information->deployment) { 
    if(cJSON_AddStringToObject(item, "deployment", license_information->deployment) == NULL) {
    goto fail; //String
    }
     } 


    // license_information->expiration
    if(license_information->expiration) { 
    if(cJSON_AddStringToObject(item, "expiration", license_information->expiration) == NULL) {
    goto fail; //String
    }
     } 


    // license_information->licensed_engines
    if(license_information->licensed_engines) { 
    cJSON *licensed_engines = cJSON_AddArrayToObject(item, "licensed_engines");
    if(licensed_engines == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *licensed_enginesListEntry;
    list_ForEach(licensed_enginesListEntry, license_information->licensed_engines) {
    if(cJSON_AddStringToObject(licensed_engines, "", (char*)licensed_enginesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // license_information->max_node_count
    if(license_information->max_node_count) { 
    if(cJSON_AddStringToObject(item, "max_node_count", license_information->max_node_count) == NULL) {
    goto fail; //String
    }
     } 


    // license_information->online_activated
    if(license_information->online_activated) { 
    if(cJSON_AddBoolToObject(item, "online_activated", license_information->online_activated) == NULL) {
    goto fail; //Bool
    }
     } 


    // license_information->product_id
    if(license_information->product_id) { 
    if(cJSON_AddStringToObject(item, "product_id", license_information->product_id) == NULL) {
    goto fail; //String
    }
     } 


    // license_information->product_name
    if(license_information->product_name) { 
    if(cJSON_AddStringToObject(item, "product_name", license_information->product_name) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

license_information_t *license_information_parseFromJSON(cJSON *license_informationJSON){

    license_information_t *license_information_local_var = NULL;

    // license_information->days_left
    cJSON *days_left = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "days_left");
    if (days_left) { 
    if(!cJSON_IsNumber(days_left))
    {
    goto end; //Numeric
    }
    }

    // license_information->deployment
    cJSON *deployment = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "deployment");
    if (deployment) { 
    if(!cJSON_IsString(deployment))
    {
    goto end; //String
    }
    }

    // license_information->expiration
    cJSON *expiration = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "expiration");
    if (expiration) { 
    if(!cJSON_IsString(expiration))
    {
    goto end; //String
    }
    }

    // license_information->licensed_engines
    cJSON *licensed_engines = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "licensed_engines");
    list_t *licensed_enginesList;
    if (licensed_engines) { 
    cJSON *licensed_engines_local;
    if(!cJSON_IsArray(licensed_engines)) {
        goto end;//primitive container
    }
    licensed_enginesList = list_create();

    cJSON_ArrayForEach(licensed_engines_local, licensed_engines)
    {
        if(!cJSON_IsString(licensed_engines_local))
        {
            goto end;
        }
        list_addElement(licensed_enginesList , strdup(licensed_engines_local->valuestring));
    }
    }

    // license_information->max_node_count
    cJSON *max_node_count = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "max_node_count");
    if (max_node_count) { 
    if(!cJSON_IsString(max_node_count))
    {
    goto end; //String
    }
    }

    // license_information->online_activated
    cJSON *online_activated = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "online_activated");
    if (online_activated) { 
    if(!cJSON_IsBool(online_activated))
    {
    goto end; //Bool
    }
    }

    // license_information->product_id
    cJSON *product_id = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "product_id");
    if (product_id) { 
    if(!cJSON_IsString(product_id))
    {
    goto end; //String
    }
    }

    // license_information->product_name
    cJSON *product_name = cJSON_GetObjectItemCaseSensitive(license_informationJSON, "product_name");
    if (product_name) { 
    if(!cJSON_IsString(product_name))
    {
    goto end; //String
    }
    }


    license_information_local_var = license_information_create (
        days_left ? days_left->valuedouble : 0,
        deployment ? strdup(deployment->valuestring) : NULL,
        expiration ? strdup(expiration->valuestring) : NULL,
        licensed_engines ? licensed_enginesList : NULL,
        max_node_count ? strdup(max_node_count->valuestring) : NULL,
        online_activated ? online_activated->valueint : 0,
        product_id ? strdup(product_id->valuestring) : NULL,
        product_name ? strdup(product_name->valuestring) : NULL
        );

    return license_information_local_var;
end:
    return NULL;

}
