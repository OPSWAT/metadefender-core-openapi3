#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object.h"



inline_object_t *inline_object_create(
    char *user,
    char *password
    ) {
    inline_object_t *inline_object_local_var = malloc(sizeof(inline_object_t));
    if (!inline_object_local_var) {
        return NULL;
    }
    inline_object_local_var->user = user;
    inline_object_local_var->password = password;

    return inline_object_local_var;
}


void inline_object_free(inline_object_t *inline_object) {
    if(NULL == inline_object){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_object->user);
    free(inline_object->password);
    free(inline_object);
}

cJSON *inline_object_convertToJSON(inline_object_t *inline_object) {
    cJSON *item = cJSON_CreateObject();

    // inline_object->user
    if(inline_object->user) { 
    if(cJSON_AddStringToObject(item, "user", inline_object->user) == NULL) {
    goto fail; //String
    }
     } 


    // inline_object->password
    if(inline_object->password) { 
    if(cJSON_AddStringToObject(item, "password", inline_object->password) == NULL) {
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

inline_object_t *inline_object_parseFromJSON(cJSON *inline_objectJSON){

    inline_object_t *inline_object_local_var = NULL;

    // inline_object->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(inline_objectJSON, "user");
    if (user) { 
    if(!cJSON_IsString(user))
    {
    goto end; //String
    }
    }

    // inline_object->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(inline_objectJSON, "password");
    if (password) { 
    if(!cJSON_IsString(password))
    {
    goto end; //String
    }
    }


    inline_object_local_var = inline_object_create (
        user ? strdup(user->valuestring) : NULL,
        password ? strdup(password->valuestring) : NULL
        );

    return inline_object_local_var;
end:
    return NULL;

}
