#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_1.h"



inline_object_1_t *inline_object_1_create(
    int maxage
    ) {
    inline_object_1_t *inline_object_1_local_var = malloc(sizeof(inline_object_1_t));
    if (!inline_object_1_local_var) {
        return NULL;
    }
    inline_object_1_local_var->maxage = maxage;

    return inline_object_1_local_var;
}


void inline_object_1_free(inline_object_1_t *inline_object_1) {
    if(NULL == inline_object_1){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_object_1);
}

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1) {
    cJSON *item = cJSON_CreateObject();

    // inline_object_1->maxage
    if(inline_object_1->maxage) { 
    if(cJSON_AddNumberToObject(item, "maxage", inline_object_1->maxage) == NULL) {
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

inline_object_1_t *inline_object_1_parseFromJSON(cJSON *inline_object_1JSON){

    inline_object_1_t *inline_object_1_local_var = NULL;

    // inline_object_1->maxage
    cJSON *maxage = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "maxage");
    if (maxage) { 
    if(!cJSON_IsNumber(maxage))
    {
    goto end; //Numeric
    }
    }


    inline_object_1_local_var = inline_object_1_create (
        maxage ? maxage->valuedouble : 0
        );

    return inline_object_1_local_var;
end:
    return NULL;

}
