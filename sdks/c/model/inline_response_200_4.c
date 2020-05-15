#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_4.h"



inline_response_200_4_t *inline_response_200_4_create(
    char *result
    ) {
    inline_response_200_4_t *inline_response_200_4_local_var = malloc(sizeof(inline_response_200_4_t));
    if (!inline_response_200_4_local_var) {
        return NULL;
    }
    inline_response_200_4_local_var->result = result;

    return inline_response_200_4_local_var;
}


void inline_response_200_4_free(inline_response_200_4_t *inline_response_200_4) {
    if(NULL == inline_response_200_4){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_4->result);
    free(inline_response_200_4);
}

cJSON *inline_response_200_4_convertToJSON(inline_response_200_4_t *inline_response_200_4) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_4->result
    if(inline_response_200_4->result) { 
    if(cJSON_AddStringToObject(item, "result", inline_response_200_4->result) == NULL) {
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

inline_response_200_4_t *inline_response_200_4_parseFromJSON(cJSON *inline_response_200_4JSON){

    inline_response_200_4_t *inline_response_200_4_local_var = NULL;

    // inline_response_200_4->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(inline_response_200_4JSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }


    inline_response_200_4_local_var = inline_response_200_4_create (
        result ? strdup(result->valuestring) : NULL
        );

    return inline_response_200_4_local_var;
end:
    return NULL;

}
