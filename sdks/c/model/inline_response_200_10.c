#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_10.h"



inline_response_200_10_t *inline_response_200_10_create(
    int max_file_size,
    char *name
    ) {
    inline_response_200_10_t *inline_response_200_10_local_var = malloc(sizeof(inline_response_200_10_t));
    if (!inline_response_200_10_local_var) {
        return NULL;
    }
    inline_response_200_10_local_var->max_file_size = max_file_size;
    inline_response_200_10_local_var->name = name;

    return inline_response_200_10_local_var;
}


void inline_response_200_10_free(inline_response_200_10_t *inline_response_200_10) {
    if(NULL == inline_response_200_10){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_10->name);
    free(inline_response_200_10);
}

cJSON *inline_response_200_10_convertToJSON(inline_response_200_10_t *inline_response_200_10) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_10->max_file_size
    if(inline_response_200_10->max_file_size) { 
    if(cJSON_AddNumberToObject(item, "max_file_size", inline_response_200_10->max_file_size) == NULL) {
    goto fail; //Numeric
    }
     } 


    // inline_response_200_10->name
    if(inline_response_200_10->name) { 
    if(cJSON_AddStringToObject(item, "name", inline_response_200_10->name) == NULL) {
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

inline_response_200_10_t *inline_response_200_10_parseFromJSON(cJSON *inline_response_200_10JSON){

    inline_response_200_10_t *inline_response_200_10_local_var = NULL;

    // inline_response_200_10->max_file_size
    cJSON *max_file_size = cJSON_GetObjectItemCaseSensitive(inline_response_200_10JSON, "max_file_size");
    if (max_file_size) { 
    if(!cJSON_IsNumber(max_file_size))
    {
    goto end; //Numeric
    }
    }

    // inline_response_200_10->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(inline_response_200_10JSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }


    inline_response_200_10_local_var = inline_response_200_10_create (
        max_file_size ? max_file_size->valuedouble : 0,
        name ? strdup(name->valuestring) : NULL
        );

    return inline_response_200_10_local_var;
end:
    return NULL;

}
