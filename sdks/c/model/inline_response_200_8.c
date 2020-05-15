#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_8.h"



inline_response_200_8_t *inline_response_200_8_create(
    char *data_id
    ) {
    inline_response_200_8_t *inline_response_200_8_local_var = malloc(sizeof(inline_response_200_8_t));
    if (!inline_response_200_8_local_var) {
        return NULL;
    }
    inline_response_200_8_local_var->data_id = data_id;

    return inline_response_200_8_local_var;
}


void inline_response_200_8_free(inline_response_200_8_t *inline_response_200_8) {
    if(NULL == inline_response_200_8){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_8->data_id);
    free(inline_response_200_8);
}

cJSON *inline_response_200_8_convertToJSON(inline_response_200_8_t *inline_response_200_8) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_8->data_id
    if (!inline_response_200_8->data_id) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "data_id", inline_response_200_8->data_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_200_8_t *inline_response_200_8_parseFromJSON(cJSON *inline_response_200_8JSON){

    inline_response_200_8_t *inline_response_200_8_local_var = NULL;

    // inline_response_200_8->data_id
    cJSON *data_id = cJSON_GetObjectItemCaseSensitive(inline_response_200_8JSON, "data_id");
    if (!data_id) {
        goto end;
    }

    
    if(!cJSON_IsString(data_id))
    {
    goto end; //String
    }


    inline_response_200_8_local_var = inline_response_200_8_create (
        strdup(data_id->valuestring)
        );

    return inline_response_200_8_local_var;
end:
    return NULL;

}
