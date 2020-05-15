#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "av_engine_scan_report.h"



av_engine_scan_report_t *av_engine_scan_report_create(
    char *def_time,
    char *eng_id,
    char *location,
    int scan_result_i,
    int scan_time,
    char *threat_found,
    int wait_time
    ) {
    av_engine_scan_report_t *av_engine_scan_report_local_var = malloc(sizeof(av_engine_scan_report_t));
    if (!av_engine_scan_report_local_var) {
        return NULL;
    }
    av_engine_scan_report_local_var->def_time = def_time;
    av_engine_scan_report_local_var->eng_id = eng_id;
    av_engine_scan_report_local_var->location = location;
    av_engine_scan_report_local_var->scan_result_i = scan_result_i;
    av_engine_scan_report_local_var->scan_time = scan_time;
    av_engine_scan_report_local_var->threat_found = threat_found;
    av_engine_scan_report_local_var->wait_time = wait_time;

    return av_engine_scan_report_local_var;
}


void av_engine_scan_report_free(av_engine_scan_report_t *av_engine_scan_report) {
    if(NULL == av_engine_scan_report){
        return ;
    }
    listEntry_t *listEntry;
    free(av_engine_scan_report->def_time);
    free(av_engine_scan_report->eng_id);
    free(av_engine_scan_report->location);
    free(av_engine_scan_report->threat_found);
    free(av_engine_scan_report);
}

cJSON *av_engine_scan_report_convertToJSON(av_engine_scan_report_t *av_engine_scan_report) {
    cJSON *item = cJSON_CreateObject();

    // av_engine_scan_report->def_time
    if(av_engine_scan_report->def_time) { 
    if(cJSON_AddStringToObject(item, "def_time", av_engine_scan_report->def_time) == NULL) {
    goto fail; //String
    }
     } 


    // av_engine_scan_report->eng_id
    if(av_engine_scan_report->eng_id) { 
    if(cJSON_AddStringToObject(item, "eng_id", av_engine_scan_report->eng_id) == NULL) {
    goto fail; //String
    }
     } 


    // av_engine_scan_report->location
    if(av_engine_scan_report->location) { 
    if(cJSON_AddStringToObject(item, "location", av_engine_scan_report->location) == NULL) {
    goto fail; //String
    }
     } 


    // av_engine_scan_report->scan_result_i
    if(av_engine_scan_report->scan_result_i) { 
    if(cJSON_AddNumberToObject(item, "scan_result_i", av_engine_scan_report->scan_result_i) == NULL) {
    goto fail; //Numeric
    }
     } 


    // av_engine_scan_report->scan_time
    if(av_engine_scan_report->scan_time) { 
    if(cJSON_AddNumberToObject(item, "scan_time", av_engine_scan_report->scan_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // av_engine_scan_report->threat_found
    if(av_engine_scan_report->threat_found) { 
    if(cJSON_AddStringToObject(item, "threat_found", av_engine_scan_report->threat_found) == NULL) {
    goto fail; //String
    }
     } 


    // av_engine_scan_report->wait_time
    if(av_engine_scan_report->wait_time) { 
    if(cJSON_AddNumberToObject(item, "wait_time", av_engine_scan_report->wait_time) == NULL) {
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

av_engine_scan_report_t *av_engine_scan_report_parseFromJSON(cJSON *av_engine_scan_reportJSON){

    av_engine_scan_report_t *av_engine_scan_report_local_var = NULL;

    // av_engine_scan_report->def_time
    cJSON *def_time = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "def_time");
    if (def_time) { 
    if(!cJSON_IsString(def_time))
    {
    goto end; //String
    }
    }

    // av_engine_scan_report->eng_id
    cJSON *eng_id = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "eng_id");
    if (eng_id) { 
    if(!cJSON_IsString(eng_id))
    {
    goto end; //String
    }
    }

    // av_engine_scan_report->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "location");
    if (location) { 
    if(!cJSON_IsString(location))
    {
    goto end; //String
    }
    }

    // av_engine_scan_report->scan_result_i
    cJSON *scan_result_i = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "scan_result_i");
    if (scan_result_i) { 
    if(!cJSON_IsNumber(scan_result_i))
    {
    goto end; //Numeric
    }
    }

    // av_engine_scan_report->scan_time
    cJSON *scan_time = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "scan_time");
    if (scan_time) { 
    if(!cJSON_IsNumber(scan_time))
    {
    goto end; //Numeric
    }
    }

    // av_engine_scan_report->threat_found
    cJSON *threat_found = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "threat_found");
    if (threat_found) { 
    if(!cJSON_IsString(threat_found))
    {
    goto end; //String
    }
    }

    // av_engine_scan_report->wait_time
    cJSON *wait_time = cJSON_GetObjectItemCaseSensitive(av_engine_scan_reportJSON, "wait_time");
    if (wait_time) { 
    if(!cJSON_IsNumber(wait_time))
    {
    goto end; //Numeric
    }
    }


    av_engine_scan_report_local_var = av_engine_scan_report_create (
        def_time ? strdup(def_time->valuestring) : NULL,
        eng_id ? strdup(eng_id->valuestring) : NULL,
        location ? strdup(location->valuestring) : NULL,
        scan_result_i ? scan_result_i->valuedouble : 0,
        scan_time ? scan_time->valuedouble : 0,
        threat_found ? strdup(threat_found->valuestring) : NULL,
        wait_time ? wait_time->valuedouble : 0
        );

    return av_engine_scan_report_local_var;
end:
    return NULL;

}
