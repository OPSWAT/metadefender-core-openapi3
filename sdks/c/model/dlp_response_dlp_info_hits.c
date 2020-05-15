#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response_dlp_info_hits.h"



dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_create(
    dlp_response_dlp_info_hits_ccn_t *ccn
    ) {
    dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_local_var = malloc(sizeof(dlp_response_dlp_info_hits_t));
    if (!dlp_response_dlp_info_hits_local_var) {
        return NULL;
    }
    dlp_response_dlp_info_hits_local_var->ccn = ccn;

    return dlp_response_dlp_info_hits_local_var;
}


void dlp_response_dlp_info_hits_free(dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits) {
    if(NULL == dlp_response_dlp_info_hits){
        return ;
    }
    listEntry_t *listEntry;
    dlp_response_dlp_info_hits_ccn_free(dlp_response_dlp_info_hits->ccn);
    free(dlp_response_dlp_info_hits);
}

cJSON *dlp_response_dlp_info_hits_convertToJSON(dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response_dlp_info_hits->ccn
    if(dlp_response_dlp_info_hits->ccn) { 
    cJSON *ccn_local_JSON = dlp_response_dlp_info_hits_ccn_convertToJSON(dlp_response_dlp_info_hits->ccn);
    if(ccn_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ccn", ccn_local_JSON);
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

dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_parseFromJSON(cJSON *dlp_response_dlp_info_hitsJSON){

    dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_local_var = NULL;

    // dlp_response_dlp_info_hits->ccn
    cJSON *ccn = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_info_hitsJSON, "ccn");
    dlp_response_dlp_info_hits_ccn_t *ccn_local_nonprim = NULL;
    if (ccn) { 
    ccn_local_nonprim = dlp_response_dlp_info_hits_ccn_parseFromJSON(ccn); //nonprimitive
    }


    dlp_response_dlp_info_hits_local_var = dlp_response_dlp_info_hits_create (
        ccn ? ccn_local_nonprim : NULL
        );

    return dlp_response_dlp_info_hits_local_var;
end:
    return NULL;

}
