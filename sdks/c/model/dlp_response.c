#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response.h"



dlp_response_t *dlp_response_create(
    dlp_response_dlp_info_t *dlp_info
    ) {
    dlp_response_t *dlp_response_local_var = malloc(sizeof(dlp_response_t));
    if (!dlp_response_local_var) {
        return NULL;
    }
    dlp_response_local_var->dlp_info = dlp_info;

    return dlp_response_local_var;
}


void dlp_response_free(dlp_response_t *dlp_response) {
    if(NULL == dlp_response){
        return ;
    }
    listEntry_t *listEntry;
    dlp_response_dlp_info_free(dlp_response->dlp_info);
    free(dlp_response);
}

cJSON *dlp_response_convertToJSON(dlp_response_t *dlp_response) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response->dlp_info
    if(dlp_response->dlp_info) { 
    cJSON *dlp_info_local_JSON = dlp_response_dlp_info_convertToJSON(dlp_response->dlp_info);
    if(dlp_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dlp_info", dlp_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dlp_response_t *dlp_response_parseFromJSON(cJSON *dlp_responseJSON){

    dlp_response_t *dlp_response_local_var = NULL;

    // dlp_response->dlp_info
    cJSON *dlp_info = cJSON_GetObjectItemCaseSensitive(dlp_responseJSON, "dlp_info");
    dlp_response_dlp_info_t *dlp_info_local_nonprim = NULL;
    if (dlp_info) { 
    dlp_info_local_nonprim = dlp_response_dlp_info_parseFromJSON(dlp_info); //nonprimitive
    }


    dlp_response_local_var = dlp_response_create (
        dlp_info ? dlp_info_local_nonprim : NULL
        );

    return dlp_response_local_var;
end:
    return NULL;

}
