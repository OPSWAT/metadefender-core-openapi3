#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metascan_report_scan_details.h"



metascan_report_scan_details_t *metascan_report_scan_details_create(
    av_engine_scan_report_t *clam_av
    ) {
    metascan_report_scan_details_t *metascan_report_scan_details_local_var = malloc(sizeof(metascan_report_scan_details_t));
    if (!metascan_report_scan_details_local_var) {
        return NULL;
    }
    metascan_report_scan_details_local_var->clam_av = clam_av;

    return metascan_report_scan_details_local_var;
}


void metascan_report_scan_details_free(metascan_report_scan_details_t *metascan_report_scan_details) {
    if(NULL == metascan_report_scan_details){
        return ;
    }
    listEntry_t *listEntry;
    av_engine_scan_report_free(metascan_report_scan_details->clam_av);
    free(metascan_report_scan_details);
}

cJSON *metascan_report_scan_details_convertToJSON(metascan_report_scan_details_t *metascan_report_scan_details) {
    cJSON *item = cJSON_CreateObject();

    // metascan_report_scan_details->clam_av
    if(metascan_report_scan_details->clam_av) { 
    cJSON *clam_av_local_JSON = av_engine_scan_report_convertToJSON(metascan_report_scan_details->clam_av);
    if(clam_av_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ClamAV", clam_av_local_JSON);
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

metascan_report_scan_details_t *metascan_report_scan_details_parseFromJSON(cJSON *metascan_report_scan_detailsJSON){

    metascan_report_scan_details_t *metascan_report_scan_details_local_var = NULL;

    // metascan_report_scan_details->clam_av
    cJSON *clam_av = cJSON_GetObjectItemCaseSensitive(metascan_report_scan_detailsJSON, "ClamAV");
    av_engine_scan_report_t *clam_av_local_nonprim = NULL;
    if (clam_av) { 
    clam_av_local_nonprim = av_engine_scan_report_parseFromJSON(clam_av); //nonprimitive
    }


    metascan_report_scan_details_local_var = metascan_report_scan_details_create (
        clam_av ? clam_av_local_nonprim : NULL
        );

    return metascan_report_scan_details_local_var;
end:
    return NULL;

}
