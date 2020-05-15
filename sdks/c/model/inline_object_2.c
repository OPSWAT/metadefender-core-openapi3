#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_2.h"



inline_object_2_t *inline_object_2_create(
    char *old_password,
    char *new_password
    ) {
    inline_object_2_t *inline_object_2_local_var = malloc(sizeof(inline_object_2_t));
    if (!inline_object_2_local_var) {
        return NULL;
    }
    inline_object_2_local_var->old_password = old_password;
    inline_object_2_local_var->new_password = new_password;

    return inline_object_2_local_var;
}


void inline_object_2_free(inline_object_2_t *inline_object_2) {
    if(NULL == inline_object_2){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_object_2->old_password);
    free(inline_object_2->new_password);
    free(inline_object_2);
}

cJSON *inline_object_2_convertToJSON(inline_object_2_t *inline_object_2) {
    cJSON *item = cJSON_CreateObject();

    // inline_object_2->old_password
    if(inline_object_2->old_password) { 
    if(cJSON_AddStringToObject(item, "old_password", inline_object_2->old_password) == NULL) {
    goto fail; //String
    }
     } 


    // inline_object_2->new_password
    if(inline_object_2->new_password) { 
    if(cJSON_AddStringToObject(item, "new_password", inline_object_2->new_password) == NULL) {
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

inline_object_2_t *inline_object_2_parseFromJSON(cJSON *inline_object_2JSON){

    inline_object_2_t *inline_object_2_local_var = NULL;

    // inline_object_2->old_password
    cJSON *old_password = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "old_password");
    if (old_password) { 
    if(!cJSON_IsString(old_password))
    {
    goto end; //String
    }
    }

    // inline_object_2->new_password
    cJSON *new_password = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "new_password");
    if (new_password) { 
    if(!cJSON_IsString(new_password))
    {
    goto end; //String
    }
    }


    inline_object_2_local_var = inline_object_2_create (
        old_password ? strdup(old_password->valuestring) : NULL,
        new_password ? strdup(new_password->valuestring) : NULL
        );

    return inline_object_2_local_var;
end:
    return NULL;

}
