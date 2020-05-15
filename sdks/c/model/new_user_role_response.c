#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "new_user_role_response.h"



new_user_role_response_t *new_user_role_response_create(
    char *name,
    char *display_name,
    new_user_role_request_rights_t *rights,
    int editable,
    int id
    ) {
    new_user_role_response_t *new_user_role_response_local_var = malloc(sizeof(new_user_role_response_t));
    if (!new_user_role_response_local_var) {
        return NULL;
    }
    new_user_role_response_local_var->name = name;
    new_user_role_response_local_var->display_name = display_name;
    new_user_role_response_local_var->rights = rights;
    new_user_role_response_local_var->editable = editable;
    new_user_role_response_local_var->id = id;

    return new_user_role_response_local_var;
}


void new_user_role_response_free(new_user_role_response_t *new_user_role_response) {
    if(NULL == new_user_role_response){
        return ;
    }
    listEntry_t *listEntry;
    free(new_user_role_response->name);
    free(new_user_role_response->display_name);
    new_user_role_request_rights_free(new_user_role_response->rights);
    free(new_user_role_response);
}

cJSON *new_user_role_response_convertToJSON(new_user_role_response_t *new_user_role_response) {
    cJSON *item = cJSON_CreateObject();

    // new_user_role_response->name
    if(new_user_role_response->name) { 
    if(cJSON_AddStringToObject(item, "name", new_user_role_response->name) == NULL) {
    goto fail; //String
    }
     } 


    // new_user_role_response->display_name
    if(new_user_role_response->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", new_user_role_response->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // new_user_role_response->rights
    if(new_user_role_response->rights) { 
    cJSON *rights_local_JSON = new_user_role_request_rights_convertToJSON(new_user_role_response->rights);
    if(rights_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rights", rights_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // new_user_role_response->editable
    if (!new_user_role_response->editable) {
        goto fail;
    }
    
    if(cJSON_AddBoolToObject(item, "editable", new_user_role_response->editable) == NULL) {
    goto fail; //Bool
    }


    // new_user_role_response->id
    if (!new_user_role_response->id) {
        goto fail;
    }
    
    if(cJSON_AddNumberToObject(item, "id", new_user_role_response->id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

new_user_role_response_t *new_user_role_response_parseFromJSON(cJSON *new_user_role_responseJSON){

    new_user_role_response_t *new_user_role_response_local_var = NULL;

    // new_user_role_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(new_user_role_responseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // new_user_role_response->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(new_user_role_responseJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // new_user_role_response->rights
    cJSON *rights = cJSON_GetObjectItemCaseSensitive(new_user_role_responseJSON, "rights");
    new_user_role_request_rights_t *rights_local_nonprim = NULL;
    if (rights) { 
    rights_local_nonprim = new_user_role_request_rights_parseFromJSON(rights); //nonprimitive
    }

    // new_user_role_response->editable
    cJSON *editable = cJSON_GetObjectItemCaseSensitive(new_user_role_responseJSON, "editable");
    if (!editable) {
        goto end;
    }

    
    if(!cJSON_IsBool(editable))
    {
    goto end; //Bool
    }

    // new_user_role_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(new_user_role_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    new_user_role_response_local_var = new_user_role_response_create (
        name ? strdup(name->valuestring) : NULL,
        display_name ? strdup(display_name->valuestring) : NULL,
        rights ? rights_local_nonprim : NULL,
        editable->valueint,
        id->valuedouble
        );

    return new_user_role_response_local_var;
end:
    return NULL;

}
