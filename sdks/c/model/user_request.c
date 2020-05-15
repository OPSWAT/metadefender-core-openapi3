#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_request.h"



user_request_t *user_request_create(
    char *apikey,
    int directory_id,
    char *display_name,
    char *email,
    char *name,
    list_t *roles,
    object_t *ui_settings,
    char *password
    ) {
    user_request_t *user_request_local_var = malloc(sizeof(user_request_t));
    if (!user_request_local_var) {
        return NULL;
    }
    user_request_local_var->apikey = apikey;
    user_request_local_var->directory_id = directory_id;
    user_request_local_var->display_name = display_name;
    user_request_local_var->email = email;
    user_request_local_var->name = name;
    user_request_local_var->roles = roles;
    user_request_local_var->ui_settings = ui_settings;
    user_request_local_var->password = password;

    return user_request_local_var;
}


void user_request_free(user_request_t *user_request) {
    if(NULL == user_request){
        return ;
    }
    listEntry_t *listEntry;
    free(user_request->apikey);
    free(user_request->display_name);
    free(user_request->email);
    free(user_request->name);
    list_ForEach(listEntry, user_request->roles) {
        free(listEntry->data);
    }
    list_free(user_request->roles);
    object_free(user_request->ui_settings);
    free(user_request->password);
    free(user_request);
}

cJSON *user_request_convertToJSON(user_request_t *user_request) {
    cJSON *item = cJSON_CreateObject();

    // user_request->apikey
    if(user_request->apikey) { 
    if(cJSON_AddStringToObject(item, "apikey", user_request->apikey) == NULL) {
    goto fail; //String
    }
     } 


    // user_request->directory_id
    if(user_request->directory_id) { 
    if(cJSON_AddNumberToObject(item, "directory_id", user_request->directory_id) == NULL) {
    goto fail; //Numeric
    }
     } 


    // user_request->display_name
    if(user_request->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", user_request->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // user_request->email
    if(user_request->email) { 
    if(cJSON_AddStringToObject(item, "email", user_request->email) == NULL) {
    goto fail; //String
    }
     } 


    // user_request->name
    if(user_request->name) { 
    if(cJSON_AddStringToObject(item, "name", user_request->name) == NULL) {
    goto fail; //String
    }
     } 


    // user_request->roles
    if(user_request->roles) { 
    cJSON *roles = cJSON_AddArrayToObject(item, "roles");
    if(roles == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rolesListEntry;
    list_ForEach(rolesListEntry, user_request->roles) {
    if(cJSON_AddStringToObject(roles, "", (char*)rolesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // user_request->ui_settings
    if(user_request->ui_settings) { 
    cJSON *ui_settings_object = object_convertToJSON(user_request->ui_settings);
    if(ui_settings_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ui_settings", ui_settings_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // user_request->password
    if(user_request->password) { 
    if(cJSON_AddStringToObject(item, "password", user_request->password) == NULL) {
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

user_request_t *user_request_parseFromJSON(cJSON *user_requestJSON){

    user_request_t *user_request_local_var = NULL;

    // user_request->apikey
    cJSON *apikey = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "apikey");
    if (apikey) { 
    if(!cJSON_IsString(apikey))
    {
    goto end; //String
    }
    }

    // user_request->directory_id
    cJSON *directory_id = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "directory_id");
    if (directory_id) { 
    if(!cJSON_IsNumber(directory_id))
    {
    goto end; //Numeric
    }
    }

    // user_request->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // user_request->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "email");
    if (email) { 
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }
    }

    // user_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // user_request->roles
    cJSON *roles = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "roles");
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

    // user_request->ui_settings
    cJSON *ui_settings = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "ui_settings");
    object_t *ui_settings_local_object = NULL;
    if (ui_settings) { 
    ui_settings_local_object = object_parseFromJSON(ui_settings); //object
    }

    // user_request->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(user_requestJSON, "password");
    if (password) { 
    if(!cJSON_IsString(password))
    {
    goto end; //String
    }
    }


    user_request_local_var = user_request_create (
        apikey ? strdup(apikey->valuestring) : NULL,
        directory_id ? directory_id->valuedouble : 0,
        display_name ? strdup(display_name->valuestring) : NULL,
        email ? strdup(email->valuestring) : NULL,
        name ? strdup(name->valuestring) : NULL,
        roles ? rolesList : NULL,
        ui_settings ? ui_settings_local_object : NULL,
        password ? strdup(password->valuestring) : NULL
        );

    return user_request_local_var;
end:
    return NULL;

}
