#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_5.h"



inline_response_200_5_t *inline_response_200_5_create(
    char *result
    ) {
    inline_response_200_5_t *inline_response_200_5_local_var = malloc(sizeof(inline_response_200_5_t));
    if (!inline_response_200_5_local_var) {
        return NULL;
    }
    inline_response_200_5_local_var->result = result;

    return inline_response_200_5_local_var;
}


void inline_response_200_5_free(inline_response_200_5_t *inline_response_200_5) {
    if(NULL == inline_response_200_5){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_5->result);
    free(inline_response_200_5);
}

cJSON *inline_response_200_5_convertToJSON(inline_response_200_5_t *inline_response_200_5) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_5->result
    if(inline_response_200_5->result) { 
    if(cJSON_AddStringToObject(item, "result", inline_response_200_5->result) == NULL) {
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

inline_response_200_5_t *inline_response_200_5_parseFromJSON(cJSON *inline_response_200_5JSON){

    inline_response_200_5_t *inline_response_200_5_local_var = NULL;

    // inline_response_200_5->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(inline_response_200_5JSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }


    inline_response_200_5_local_var = inline_response_200_5_create (
        result ? strdup(result->valuestring) : NULL
        );

    return inline_response_200_5_local_var;
end:
    return NULL;

}
