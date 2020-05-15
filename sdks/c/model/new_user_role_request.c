#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "new_user_role_request.h"



new_user_role_request_t *new_user_role_request_create(
    char *name,
    char *display_name,
    new_user_role_request_rights_t *rights
    ) {
    new_user_role_request_t *new_user_role_request_local_var = malloc(sizeof(new_user_role_request_t));
    if (!new_user_role_request_local_var) {
        return NULL;
    }
    new_user_role_request_local_var->name = name;
    new_user_role_request_local_var->display_name = display_name;
    new_user_role_request_local_var->rights = rights;

    return new_user_role_request_local_var;
}


void new_user_role_request_free(new_user_role_request_t *new_user_role_request) {
    if(NULL == new_user_role_request){
        return ;
    }
    listEntry_t *listEntry;
    free(new_user_role_request->name);
    free(new_user_role_request->display_name);
    new_user_role_request_rights_free(new_user_role_request->rights);
    free(new_user_role_request);
}

cJSON *new_user_role_request_convertToJSON(new_user_role_request_t *new_user_role_request) {
    cJSON *item = cJSON_CreateObject();

    // new_user_role_request->name
    if(new_user_role_request->name) { 
    if(cJSON_AddStringToObject(item, "name", new_user_role_request->name) == NULL) {
    goto fail; //String
    }
     } 


    // new_user_role_request->display_name
    if(new_user_role_request->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", new_user_role_request->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // new_user_role_request->rights
    if(new_user_role_request->rights) { 
    cJSON *rights_local_JSON = new_user_role_request_rights_convertToJSON(new_user_role_request->rights);
    if(rights_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rights", rights_local_JSON);
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

new_user_role_request_t *new_user_role_request_parseFromJSON(cJSON *new_user_role_requestJSON){

    new_user_role_request_t *new_user_role_request_local_var = NULL;

    // new_user_role_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(new_user_role_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // new_user_role_request->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(new_user_role_requestJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // new_user_role_request->rights
    cJSON *rights = cJSON_GetObjectItemCaseSensitive(new_user_role_requestJSON, "rights");
    new_user_role_request_rights_t *rights_local_nonprim = NULL;
    if (rights) { 
    rights_local_nonprim = new_user_role_request_rights_parseFromJSON(rights); //nonprimitive
    }


    new_user_role_request_local_var = new_user_role_request_create (
        name ? strdup(name->valuestring) : NULL,
        display_name ? strdup(display_name->valuestring) : NULL,
        rights ? rights_local_nonprim : NULL
        );

    return new_user_role_request_local_var;
end:
    return NULL;

}
