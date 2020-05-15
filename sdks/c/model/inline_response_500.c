#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_500.h"



inline_response_500_t *inline_response_500_create(
    char *err
    ) {
    inline_response_500_t *inline_response_500_local_var = malloc(sizeof(inline_response_500_t));
    if (!inline_response_500_local_var) {
        return NULL;
    }
    inline_response_500_local_var->err = err;

    return inline_response_500_local_var;
}


void inline_response_500_free(inline_response_500_t *inline_response_500) {
    if(NULL == inline_response_500){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_500->err);
    free(inline_response_500);
}

cJSON *inline_response_500_convertToJSON(inline_response_500_t *inline_response_500) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_500->err
    if(inline_response_500->err) { 
    if(cJSON_AddStringToObject(item, "err", inline_response_500->err) == NULL) {
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

inline_response_500_t *inline_response_500_parseFromJSON(cJSON *inline_response_500JSON){

    inline_response_500_t *inline_response_500_local_var = NULL;

    // inline_response_500->err
    cJSON *err = cJSON_GetObjectItemCaseSensitive(inline_response_500JSON, "err");
    if (err) { 
    if(!cJSON_IsString(err))
    {
    goto end; //String
    }
    }


    inline_response_500_local_var = inline_response_500_create (
        err ? strdup(err->valuestring) : NULL
        );

    return inline_response_500_local_var;
end:
    return NULL;

}
