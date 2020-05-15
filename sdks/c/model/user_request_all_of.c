#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_request_all_of.h"



user_request_all_of_t *user_request_all_of_create(
    char *password
    ) {
    user_request_all_of_t *user_request_all_of_local_var = malloc(sizeof(user_request_all_of_t));
    if (!user_request_all_of_local_var) {
        return NULL;
    }
    user_request_all_of_local_var->password = password;

    return user_request_all_of_local_var;
}


void user_request_all_of_free(user_request_all_of_t *user_request_all_of) {
    if(NULL == user_request_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(user_request_all_of->password);
    free(user_request_all_of);
}

cJSON *user_request_all_of_convertToJSON(user_request_all_of_t *user_request_all_of) {
    cJSON *item = cJSON_CreateObject();

    // user_request_all_of->password
    if(user_request_all_of->password) { 
    if(cJSON_AddStringToObject(item, "password", user_request_all_of->password) == NULL) {
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

user_request_all_of_t *user_request_all_of_parseFromJSON(cJSON *user_request_all_ofJSON){

    user_request_all_of_t *user_request_all_of_local_var = NULL;

    // user_request_all_of->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(user_request_all_ofJSON, "password");
    if (password) { 
    if(!cJSON_IsString(password))
    {
    goto end; //String
    }
    }


    user_request_all_of_local_var = user_request_all_of_create (
        password ? strdup(password->valuestring) : NULL
        );

    return user_request_all_of_local_var;
end:
    return NULL;

}
