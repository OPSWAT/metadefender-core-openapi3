#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response_dlp_info_hits_ccn.h"



dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_create(
    char *display_name,
    list_t *hits
    ) {
    dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_local_var = malloc(sizeof(dlp_response_dlp_info_hits_ccn_t));
    if (!dlp_response_dlp_info_hits_ccn_local_var) {
        return NULL;
    }
    dlp_response_dlp_info_hits_ccn_local_var->display_name = display_name;
    dlp_response_dlp_info_hits_ccn_local_var->hits = hits;

    return dlp_response_dlp_info_hits_ccn_local_var;
}


void dlp_response_dlp_info_hits_ccn_free(dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn) {
    if(NULL == dlp_response_dlp_info_hits_ccn){
        return ;
    }
    listEntry_t *listEntry;
    free(dlp_response_dlp_info_hits_ccn->display_name);
    list_ForEach(listEntry, dlp_response_dlp_info_hits_ccn->hits) {
        dlp_rule_match_result_free(listEntry->data);
    }
    list_free(dlp_response_dlp_info_hits_ccn->hits);
    free(dlp_response_dlp_info_hits_ccn);
}

cJSON *dlp_response_dlp_info_hits_ccn_convertToJSON(dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response_dlp_info_hits_ccn->display_name
    if(dlp_response_dlp_info_hits_ccn->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", dlp_response_dlp_info_hits_ccn->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // dlp_response_dlp_info_hits_ccn->hits
    if(dlp_response_dlp_info_hits_ccn->hits) { 
    cJSON *hits = cJSON_AddArrayToObject(item, "hits");
    if(hits == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *hitsListEntry;
    if (dlp_response_dlp_info_hits_ccn->hits) {
    list_ForEach(hitsListEntry, dlp_response_dlp_info_hits_ccn->hits) {
    cJSON *itemLocal = dlp_rule_match_result_convertToJSON(hitsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(hits, itemLocal);
    }
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_parseFromJSON(cJSON *dlp_response_dlp_info_hits_ccnJSON){

    dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_local_var = NULL;

    // dlp_response_dlp_info_hits_ccn->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_info_hits_ccnJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // dlp_response_dlp_info_hits_ccn->hits
    cJSON *hits = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_info_hits_ccnJSON, "hits");
    list_t *hitsList;
    if (hits) { 
    cJSON *hits_local_nonprimitive;
    if(!cJSON_IsArray(hits)){
        goto end; //nonprimitive container
    }

    hitsList = list_create();

    cJSON_ArrayForEach(hits_local_nonprimitive,hits )
    {
        if(!cJSON_IsObject(hits_local_nonprimitive)){
            goto end;
        }
        dlp_rule_match_result_t *hitsItem = dlp_rule_match_result_parseFromJSON(hits_local_nonprimitive);

        list_addElement(hitsList, hitsItem);
    }
    }


    dlp_response_dlp_info_hits_ccn_local_var = dlp_response_dlp_info_hits_ccn_create (
        display_name ? strdup(display_name->valuestring) : NULL,
        hits ? hitsList : NULL
        );

    return dlp_response_dlp_info_hits_ccn_local_var;
end:
    return NULL;

}
