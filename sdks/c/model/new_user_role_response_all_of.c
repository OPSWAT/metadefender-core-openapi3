#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "new_user_role_response_all_of.h"



new_user_role_response_all_of_t *new_user_role_response_all_of_create(
    int editable,
    int id
    ) {
    new_user_role_response_all_of_t *new_user_role_response_all_of_local_var = malloc(sizeof(new_user_role_response_all_of_t));
    if (!new_user_role_response_all_of_local_var) {
        return NULL;
    }
    new_user_role_response_all_of_local_var->editable = editable;
    new_user_role_response_all_of_local_var->id = id;

    return new_user_role_response_all_of_local_var;
}


void new_user_role_response_all_of_free(new_user_role_response_all_of_t *new_user_role_response_all_of) {
    if(NULL == new_user_role_response_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(new_user_role_response_all_of);
}

cJSON *new_user_role_response_all_of_convertToJSON(new_user_role_response_all_of_t *new_user_role_response_all_of) {
    cJSON *item = cJSON_CreateObject();

    // new_user_role_response_all_of->editable
    if (!new_user_role_response_all_of->editable) {
        goto fail;
    }
    
    if(cJSON_AddBoolToObject(item, "editable", new_user_role_response_all_of->editable) == NULL) {
    goto fail; //Bool
    }


    // new_user_role_response_all_of->id
    if (!new_user_role_response_all_of->id) {
        goto fail;
    }
    
    if(cJSON_AddNumberToObject(item, "id", new_user_role_response_all_of->id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

new_user_role_response_all_of_t *new_user_role_response_all_of_parseFromJSON(cJSON *new_user_role_response_all_ofJSON){

    new_user_role_response_all_of_t *new_user_role_response_all_of_local_var = NULL;

    // new_user_role_response_all_of->editable
    cJSON *editable = cJSON_GetObjectItemCaseSensitive(new_user_role_response_all_ofJSON, "editable");
    if (!editable) {
        goto end;
    }

    
    if(!cJSON_IsBool(editable))
    {
    goto end; //Bool
    }

    // new_user_role_response_all_of->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(new_user_role_response_all_ofJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    new_user_role_response_all_of_local_var = new_user_role_response_all_of_create (
        editable->valueint,
        id->valuedouble
        );

    return new_user_role_response_all_of_local_var;
end:
    return NULL;

}
