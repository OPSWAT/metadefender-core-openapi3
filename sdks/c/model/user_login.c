#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_login.h"



user_login_t *user_login_create(
    char *session_id
    ) {
    user_login_t *user_login_local_var = malloc(sizeof(user_login_t));
    if (!user_login_local_var) {
        return NULL;
    }
    user_login_local_var->session_id = session_id;

    return user_login_local_var;
}


void user_login_free(user_login_t *user_login) {
    if(NULL == user_login){
        return ;
    }
    listEntry_t *listEntry;
    free(user_login->session_id);
    free(user_login);
}

cJSON *user_login_convertToJSON(user_login_t *user_login) {
    cJSON *item = cJSON_CreateObject();

    // user_login->session_id
    if (!user_login->session_id) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "session_id", user_login->session_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_login_t *user_login_parseFromJSON(cJSON *user_loginJSON){

    user_login_t *user_login_local_var = NULL;

    // user_login->session_id
    cJSON *session_id = cJSON_GetObjectItemCaseSensitive(user_loginJSON, "session_id");
    if (!session_id) {
        goto end;
    }

    
    if(!cJSON_IsString(session_id))
    {
    goto end; //String
    }


    user_login_local_var = user_login_create (
        strdup(session_id->valuestring)
        );

    return user_login_local_var;
end:
    return NULL;

}
