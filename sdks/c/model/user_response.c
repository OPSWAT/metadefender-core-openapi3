#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_response.h"



user_response_t *user_response_create(
    char *apikey,
    int directory_id,
    char *display_name,
    char *email,
    char *name,
    list_t *roles,
    object_t *ui_settings
    ) {
    user_response_t *user_response_local_var = malloc(sizeof(user_response_t));
    if (!user_response_local_var) {
        return NULL;
    }
    user_response_local_var->apikey = apikey;
    user_response_local_var->directory_id = directory_id;
    user_response_local_var->display_name = display_name;
    user_response_local_var->email = email;
    user_response_local_var->name = name;
    user_response_local_var->roles = roles;
    user_response_local_var->ui_settings = ui_settings;

    return user_response_local_var;
}


void user_response_free(user_response_t *user_response) {
    if(NULL == user_response){
        return ;
    }
    listEntry_t *listEntry;
    free(user_response->apikey);
    free(user_response->display_name);
    free(user_response->email);
    free(user_response->name);
    list_ForEach(listEntry, user_response->roles) {
        free(listEntry->data);
    }
    list_free(user_response->roles);
    object_free(user_response->ui_settings);
    free(user_response);
}

cJSON *user_response_convertToJSON(user_response_t *user_response) {
    cJSON *item = cJSON_CreateObject();

    // user_response->apikey
    if(user_response->apikey) { 
    if(cJSON_AddStringToObject(item, "apikey", user_response->apikey) == NULL) {
    goto fail; //String
    }
     } 


    // user_response->directory_id
    if(user_response->directory_id) { 
    if(cJSON_AddNumberToObject(item, "directory_id", user_response->directory_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_response->display_name
    if(user_response->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", user_response->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // user_response->email
    if(user_response->email) { 
    if(cJSON_AddStringToObject(item, "email", user_response->email) == NULL) {
    goto fail; //String
    }
     } 


    // user_response->name
    if(user_response->name) { 
    if(cJSON_AddStringToObject(item, "name", user_response->name) == NULL) {
    goto fail; //String
    }
     } 


    // user_response->roles
    if(user_response->roles) { 
    cJSON *roles = cJSON_AddArrayToObject(item, "roles");
    if(roles == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rolesListEntry;
    list_ForEach(rolesListEntry, user_response->roles) {
    if(cJSON_AddStringToObject(roles, "", (char*)rolesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // user_response->ui_settings
    if(user_response->ui_settings) { 
    cJSON *ui_settings_object = object_convertToJSON(user_response->ui_settings);
    if(ui_settings_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ui_settings", ui_settings_object);
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

user_response_t *user_response_parseFromJSON(cJSON *user_responseJSON){

    user_response_t *user_response_local_var = NULL;

    // user_response->apikey
    cJSON *apikey = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "apikey");
    if (apikey) { 
    if(!cJSON_IsString(apikey))
    {
    goto end; //String
    }
    }

    // user_response->directory_id
    cJSON *directory_id = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "directory_id");
    if (directory_id) { 
    if(!cJSON_IsNumber(directory_id))
    {
    goto end; //Numeric
    }
    }

    // user_response->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // user_response->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // user_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // user_response->roles
    cJSON *roles = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "roles");
    list_t *rolesList;
    if (roles) { 
    cJSON *roles_local;
    if(!cJSON_IsArray(roles)) {
        goto end;//primitive container
    }
    rolesList = list_create();

    cJSON_ArrayForEach(roles_local, roles)
    {
        if(!cJSON_IsString(roles_local))
        {
            goto end;
        }
        list_addElement(rolesList , strdup(roles_local->valuestring));
    }
    }

    // user_response->ui_settings
    cJSON *ui_settings = cJSON_GetObjectItemCaseSensitive(user_responseJSON, "ui_settings");
    object_t *ui_settings_local_object = NULL;
    if (ui_settings) { 
    ui_settings_local_object = object_parseFromJSON(ui_settings); //object
    }


    user_response_local_var = user_response_create (
        apikey ? strdup(apikey->valuestring) : NULL,
        directory_id ? directory_id->valuedouble : 0,
        display_name ? strdup(display_name->valuestring) : NULL,
        email ? strdup(email->valuestring) : NULL,
        name ? strdup(name->valuestring) : NULL,
        roles ? rolesList : NULL,
        ui_settings ? ui_settings_local_object : NULL
        );

    return user_response_local_var;
end:
    return NULL;

}
