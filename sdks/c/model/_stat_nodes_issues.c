#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_stat_nodes_issues.h"



_stat_nodes_issues_t *_stat_nodes_issues_create(
    char *description,
    char *severity
    ) {
    _stat_nodes_issues_t *_stat_nodes_issues_local_var = malloc(sizeof(_stat_nodes_issues_t));
    if (!_stat_nodes_issues_local_var) {
        return NULL;
    }
    _stat_nodes_issues_local_var->description = description;
    _stat_nodes_issues_local_var->severity = severity;

    return _stat_nodes_issues_local_var;
}


void _stat_nodes_issues_free(_stat_nodes_issues_t *_stat_nodes_issues) {
    if(NULL == _stat_nodes_issues){
        return ;
    }
    listEntry_t *listEntry;
    free(_stat_nodes_issues->description);
    free(_stat_nodes_issues->severity);
    free(_stat_nodes_issues);
}

cJSON *_stat_nodes_issues_convertToJSON(_stat_nodes_issues_t *_stat_nodes_issues) {
    cJSON *item = cJSON_CreateObject();

    // _stat_nodes_issues->description
    if(_stat_nodes_issues->description) { 
    if(cJSON_AddStringToObject(item, "description", _stat_nodes_issues->description) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_issues->severity
    if(_stat_nodes_issues->severity) { 
    if(cJSON_AddStringToObject(item, "severity", _stat_nodes_issues->severity) == NULL) {
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

_stat_nodes_issues_t *_stat_nodes_issues_parseFromJSON(cJSON *_stat_nodes_issuesJSON){

    _stat_nodes_issues_t *_stat_nodes_issues_local_var = NULL;

    // _stat_nodes_issues->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(_stat_nodes_issuesJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // _stat_nodes_issues->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(_stat_nodes_issuesJSON, "severity");
    if (severity) { 
    if(!cJSON_IsString(severity))
    {
    goto end; //String
    }
    }


    _stat_nodes_issues_local_var = _stat_nodes_issues_create (
        description ? strdup(description->valuestring) : NULL,
        severity ? strdup(severity->valuestring) : NULL
        );

    return _stat_nodes_issues_local_var;
end:
    return NULL;

}
