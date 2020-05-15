#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_1.h"



inline_response_200_1_t *inline_response_200_1_create(
    int maxage
    ) {
    inline_response_200_1_t *inline_response_200_1_local_var = malloc(sizeof(inline_response_200_1_t));
    if (!inline_response_200_1_local_var) {
        return NULL;
    }
    inline_response_200_1_local_var->maxage = maxage;

    return inline_response_200_1_local_var;
}


void inline_response_200_1_free(inline_response_200_1_t *inline_response_200_1) {
    if(NULL == inline_response_200_1){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_1);
}

cJSON *inline_response_200_1_convertToJSON(inline_response_200_1_t *inline_response_200_1) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_1->maxage
    if(inline_response_200_1->maxage) { 
    if(cJSON_AddNumberToObject(item, "maxage", inline_response_200_1->maxage) == NULL) {
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

inline_response_200_1_t *inline_response_200_1_parseFromJSON(cJSON *inline_response_200_1JSON){

    inline_response_200_1_t *inline_response_200_1_local_var = NULL;

    // inline_response_200_1->maxage
    cJSON *maxage = cJSON_GetObjectItemCaseSensitive(inline_response_200_1JSON, "maxage");
    if (maxage) { 
    if(!cJSON_IsNumber(maxage))
    {
    goto end; //Numeric
    }
    }


    inline_response_200_1_local_var = inline_response_200_1_create (
        maxage ? maxage->valuedouble : 0
        );

    return inline_response_200_1_local_var;
end:
    return NULL;

}
