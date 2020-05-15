#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_403.h"



inline_response_403_t *inline_response_403_create(
    char *err
    ) {
    inline_response_403_t *inline_response_403_local_var = malloc(sizeof(inline_response_403_t));
    if (!inline_response_403_local_var) {
        return NULL;
    }
    inline_response_403_local_var->err = err;

    return inline_response_403_local_var;
}


void inline_response_403_free(inline_response_403_t *inline_response_403) {
    if(NULL == inline_response_403){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_403->err);
    free(inline_response_403);
}

cJSON *inline_response_403_convertToJSON(inline_response_403_t *inline_response_403) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_403->err
    if(inline_response_403->err) { 
    if(cJSON_AddStringToObject(item, "err", inline_response_403->err) == NULL) {
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

inline_response_403_t *inline_response_403_parseFromJSON(cJSON *inline_response_403JSON){

    inline_response_403_t *inline_response_403_local_var = NULL;

    // inline_response_403->err
    cJSON *err = cJSON_GetObjectItemCaseSensitive(inline_response_403JSON, "err");
    if (err) { 
    if(!cJSON_IsString(err))
    {
    goto end; //String
    }
    }


    inline_response_403_local_var = inline_response_403_create (
        err ? strdup(err->valuestring) : NULL
        );

    return inline_response_403_local_var;
end:
    return NULL;

}
