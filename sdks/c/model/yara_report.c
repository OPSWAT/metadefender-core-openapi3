#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "yara_report.h"


char* verdictyara_report_ToString(metadefender_core_yara_report__e verdict) {
    char* verdictArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
	return verdictArray[verdict];
}

metadefender_core_yara_report__e verdictyara_report_FromString(char* verdict){
    int stringToReturn = 0;
    char *verdictArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
    size_t sizeofArray = sizeof(verdictArray) / sizeof(verdictArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(verdict, verdictArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

yara_report_t *yara_report_create(
    object_t *hits,
    ) {
    yara_report_t *yara_report_local_var = malloc(sizeof(yara_report_t));
    if (!yara_report_local_var) {
        return NULL;
    }
    yara_report_local_var->hits = hits;
    yara_report_local_var->verdict = verdict;

    return yara_report_local_var;
}


void yara_report_free(yara_report_t *yara_report) {
    if(NULL == yara_report){
        return ;
    }
    listEntry_t *listEntry;
    object_free(yara_report->hits);
    free(yara_report);
}

cJSON *yara_report_convertToJSON(yara_report_t *yara_report) {
    cJSON *item = cJSON_CreateObject();

    // yara_report->hits
    if(yara_report->hits) { 
    cJSON *hits_object = object_convertToJSON(yara_report->hits);
    if(hits_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hits", hits_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // yara_report->verdict
    
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

yara_report_t *yara_report_parseFromJSON(cJSON *yara_reportJSON){

    yara_report_t *yara_report_local_var = NULL;

    // yara_report->hits
    cJSON *hits = cJSON_GetObjectItemCaseSensitive(yara_reportJSON, "hits");
    object_t *hits_local_object = NULL;
    if (hits) { 
    hits_local_object = object_parseFromJSON(hits); //object
    }

    // yara_report->verdict
    cJSON *verdict = cJSON_GetObjectItemCaseSensitive(yara_reportJSON, "verdict");
    }


    yara_report_local_var = yara_report_create (
        hits ? hits_local_object : NULL,
        );

    return yara_report_local_var;
end:
    return NULL;

}
