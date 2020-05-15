#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_11.h"



inline_response_200_11_t *inline_response_200_11_create(
    char *product_id,
    char *version
    ) {
    inline_response_200_11_t *inline_response_200_11_local_var = malloc(sizeof(inline_response_200_11_t));
    if (!inline_response_200_11_local_var) {
        return NULL;
    }
    inline_response_200_11_local_var->product_id = product_id;
    inline_response_200_11_local_var->version = version;

    return inline_response_200_11_local_var;
}


void inline_response_200_11_free(inline_response_200_11_t *inline_response_200_11) {
    if(NULL == inline_response_200_11){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_11->product_id);
    free(inline_response_200_11->version);
    free(inline_response_200_11);
}

cJSON *inline_response_200_11_convertToJSON(inline_response_200_11_t *inline_response_200_11) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_11->product_id
    if(inline_response_200_11->product_id) { 
    if(cJSON_AddStringToObject(item, "product_id", inline_response_200_11->product_id) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_11->version
    if(inline_response_200_11->version) { 
    if(cJSON_AddStringToObject(item, "version", inline_response_200_11->version) == NULL) {
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

inline_response_200_11_t *inline_response_200_11_parseFromJSON(cJSON *inline_response_200_11JSON){

    inline_response_200_11_t *inline_response_200_11_local_var = NULL;

    // inline_response_200_11->product_id
    cJSON *product_id = cJSON_GetObjectItemCaseSensitive(inline_response_200_11JSON, "product_id");
    if (product_id) { 
    if(!cJSON_IsString(product_id))
    {
    goto end; //String
    }
    }

    // inline_response_200_11->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(inline_response_200_11JSON, "version");
    if (version) { 
    if(!cJSON_IsString(version))
    {
    goto end; //String
    }
    }


    inline_response_200_11_local_var = inline_response_200_11_create (
        product_id ? strdup(product_id->valuestring) : NULL,
        version ? strdup(version->valuestring) : NULL
        );

    return inline_response_200_11_local_var;
end:
    return NULL;

}
