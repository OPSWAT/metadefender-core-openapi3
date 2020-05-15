#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200.h"



inline_response_200_t *inline_response_200_create(
    int cleanuprange
    ) {
    inline_response_200_t *inline_response_200_local_var = malloc(sizeof(inline_response_200_t));
    if (!inline_response_200_local_var) {
        return NULL;
    }
    inline_response_200_local_var->cleanuprange = cleanuprange;

    return inline_response_200_local_var;
}


void inline_response_200_free(inline_response_200_t *inline_response_200) {
    if(NULL == inline_response_200){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200);
}

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200->cleanuprange
    if(inline_response_200->cleanuprange) { 
    if(cJSON_AddNumberToObject(item, "cleanuprange", inline_response_200->cleanuprange) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_200_t *inline_response_200_parseFromJSON(cJSON *inline_response_200JSON){

    inline_response_200_t *inline_response_200_local_var = NULL;

    // inline_response_200->cleanuprange
    cJSON *cleanuprange = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "cleanuprange");
    if (cleanuprange) { 
    if(!cJSON_IsNumber(cleanuprange))
    {
    goto end; //Numeric
    }
    }


    inline_response_200_local_var = inline_response_200_create (
        cleanuprange ? cleanuprange->valuedouble : 0
        );

    return inline_response_200_local_var;
end:
    return NULL;

}
