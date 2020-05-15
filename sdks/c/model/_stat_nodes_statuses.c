#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_stat_nodes_statuses.h"



_stat_nodes_statuses_t *_stat_nodes_statuses_create(
    char *address,
    int cpu_cores,
    list_t *engines,
    int free_disk_space,
    char *id,
    list_t *issues,
    int load,
    char *os,
    int scan_queue,
    int total_memory,
    char *version
    ) {
    _stat_nodes_statuses_t *_stat_nodes_statuses_local_var = malloc(sizeof(_stat_nodes_statuses_t));
    if (!_stat_nodes_statuses_local_var) {
        return NULL;
    }
    _stat_nodes_statuses_local_var->address = address;
    _stat_nodes_statuses_local_var->cpu_cores = cpu_cores;
    _stat_nodes_statuses_local_var->engines = engines;
    _stat_nodes_statuses_local_var->free_disk_space = free_disk_space;
    _stat_nodes_statuses_local_var->id = id;
    _stat_nodes_statuses_local_var->issues = issues;
    _stat_nodes_statuses_local_var->load = load;
    _stat_nodes_statuses_local_var->os = os;
    _stat_nodes_statuses_local_var->scan_queue = scan_queue;
    _stat_nodes_statuses_local_var->total_memory = total_memory;
    _stat_nodes_statuses_local_var->version = version;

    return _stat_nodes_statuses_local_var;
}


void _stat_nodes_statuses_free(_stat_nodes_statuses_t *_stat_nodes_statuses) {
    if(NULL == _stat_nodes_statuses){
        return ;
    }
    listEntry_t *listEntry;
    free(_stat_nodes_statuses->address);
    list_ForEach(listEntry, _stat_nodes_statuses->engines) {
        _stat_nodes_engines_free(listEntry->data);
    }
    list_free(_stat_nodes_statuses->engines);
    free(_stat_nodes_statuses->id);
    list_ForEach(listEntry, _stat_nodes_statuses->issues) {
        _stat_nodes_issues_free(listEntry->data);
    }
    list_free(_stat_nodes_statuses->issues);
    free(_stat_nodes_statuses->os);
    free(_stat_nodes_statuses->version);
    free(_stat_nodes_statuses);
}

cJSON *_stat_nodes_statuses_convertToJSON(_stat_nodes_statuses_t *_stat_nodes_statuses) {
    cJSON *item = cJSON_CreateObject();

    // _stat_nodes_statuses->address
    if(_stat_nodes_statuses->address) { 
    if(cJSON_AddStringToObject(item, "address", _stat_nodes_statuses->address) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_statuses->cpu_cores
    if(_stat_nodes_statuses->cpu_cores) { 
    if(cJSON_AddNumberToObject(item, "cpu_cores", _stat_nodes_statuses->cpu_cores) == NULL) {
    goto fail; //Numeric
    }
     } 


    // _stat_nodes_statuses->engines
    if(_stat_nodes_statuses->engines) { 
    cJSON *engines = cJSON_AddArrayToObject(item, "engines");
    if(engines == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *enginesListEntry;
    if (_stat_nodes_statuses->engines) {
    list_ForEach(enginesListEntry, _stat_nodes_statuses->engines) {
    cJSON *itemLocal = _stat_nodes_engines_convertToJSON(enginesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(engines, itemLocal);
    }
    }
     } 


    // _stat_nodes_statuses->free_disk_space
    if(_stat_nodes_statuses->free_disk_space) { 
    if(cJSON_AddNumberToObject(item, "free_disk_space", _stat_nodes_statuses->free_disk_space) == NULL) {
    goto fail; //Numeric
    }
     } 


    // _stat_nodes_statuses->id
    if(_stat_nodes_statuses->id) { 
    if(cJSON_AddStringToObject(item, "id", _stat_nodes_statuses->id) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_statuses->issues
    if(_stat_nodes_statuses->issues) { 
    cJSON *issues = cJSON_AddArrayToObject(item, "issues");
    if(issues == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *issuesListEntry;
    if (_stat_nodes_statuses->issues) {
    list_ForEach(issuesListEntry, _stat_nodes_statuses->issues) {
    cJSON *itemLocal = _stat_nodes_issues_convertToJSON(issuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(issues, itemLocal);
    }
    }
     } 


    // _stat_nodes_statuses->load
    if(_stat_nodes_statuses->load) { 
    if(cJSON_AddNumberToObject(item, "load", _stat_nodes_statuses->load) == NULL) {
    goto fail; //Numeric
    }
     } 


    // _stat_nodes_statuses->os
    if(_stat_nodes_statuses->os) { 
    if(cJSON_AddStringToObject(item, "os", _stat_nodes_statuses->os) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_statuses->scan_queue
    if(_stat_nodes_statuses->scan_queue) { 
    if(cJSON_AddNumberToObject(item, "scan_queue", _stat_nodes_statuses->scan_queue) == NULL) {
    goto fail; //Numeric
    }
     } 


    // _stat_nodes_statuses->total_memory
    if(_stat_nodes_statuses->total_memory) { 
    if(cJSON_AddNumberToObject(item, "total_memory", _stat_nodes_statuses->total_memory) == NULL) {
    goto fail; //Numeric
    }
     } 


    // _stat_nodes_statuses->version
    if(_stat_nodes_statuses->version) { 
    if(cJSON_AddStringToObject(item, "version", _stat_nodes_statuses->version) == NULL) {
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

_stat_nodes_statuses_t *_stat_nodes_statuses_parseFromJSON(cJSON *_stat_nodes_statusesJSON){

    _stat_nodes_statuses_t *_stat_nodes_statuses_local_var = NULL;

    // _stat_nodes_statuses->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "address");
    if (address) { 
    if(!cJSON_IsString(address))
    {
    goto end; //String
    }
    }

    // _stat_nodes_statuses->cpu_cores
    cJSON *cpu_cores = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "cpu_cores");
    if (cpu_cores) { 
    if(!cJSON_IsNumber(cpu_cores))
    {
    goto end; //Numeric
    }
    }

    // _stat_nodes_statuses->engines
    cJSON *engines = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "engines");
    list_t *enginesList;
    if (engines) { 
    cJSON *engines_local_nonprimitive;
    if(!cJSON_IsArray(engines)){
        goto end; //nonprimitive container
    }

    enginesList = list_create();

    cJSON_ArrayForEach(engines_local_nonprimitive,engines )
    {
        if(!cJSON_IsObject(engines_local_nonprimitive)){
            goto end;
        }
        _stat_nodes_engines_t *enginesItem = _stat_nodes_engines_parseFromJSON(engines_local_nonprimitive);

        list_addElement(enginesList, enginesItem);
    }
    }

    // _stat_nodes_statuses->free_disk_space
    cJSON *free_disk_space = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "free_disk_space");
    if (free_disk_space) { 
    if(!cJSON_IsNumber(free_disk_space))
    {
    goto end; //Numeric
    }
    }

    // _stat_nodes_statuses->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // _stat_nodes_statuses->issues
    cJSON *issues = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "issues");
    list_t *issuesList;
    if (issues) { 
    cJSON *issues_local_nonprimitive;
    if(!cJSON_IsArray(issues)){
        goto end; //nonprimitive container
    }

    issuesList = list_create();

    cJSON_ArrayForEach(issues_local_nonprimitive,issues )
    {
        if(!cJSON_IsObject(issues_local_nonprimitive)){
            goto end;
        }
        _stat_nodes_issues_t *issuesItem = _stat_nodes_issues_parseFromJSON(issues_local_nonprimitive);

        list_addElement(issuesList, issuesItem);
    }
    }

    // _stat_nodes_statuses->load
    cJSON *load = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "load");
    if (load) { 
    if(!cJSON_IsNumber(load))
    {
    goto end; //Numeric
    }
    }

    // _stat_nodes_statuses->os
    cJSON *os = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "os");
    if (os) { 
    if(!cJSON_IsString(os))
    {
    goto end; //String
    }
    }

    // _stat_nodes_statuses->scan_queue
    cJSON *scan_queue = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "scan_queue");
    if (scan_queue) { 
    if(!cJSON_IsNumber(scan_queue))
    {
    goto end; //Numeric
    }
    }

    // _stat_nodes_statuses->total_memory
    cJSON *total_memory = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "total_memory");
    if (total_memory) { 
    if(!cJSON_IsNumber(total_memory))
    {
    goto end; //Numeric
    }
    }

    // _stat_nodes_statuses->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(_stat_nodes_statusesJSON, "version");
    if (version) { 
    if(!cJSON_IsString(version))
    {
    goto end; //String
    }
    }


    _stat_nodes_statuses_local_var = _stat_nodes_statuses_create (
        address ? strdup(address->valuestring) : NULL,
        cpu_cores ? cpu_cores->valuedouble : 0,
        engines ? enginesList : NULL,
        free_disk_space ? free_disk_space->valuedouble : 0,
        id ? strdup(id->valuestring) : NULL,
        issues ? issuesList : NULL,
        load ? load->valuedouble : 0,
        os ? strdup(os->valuestring) : NULL,
        scan_queue ? scan_queue->valuedouble : 0,
        total_memory ? total_memory->valuedouble : 0,
        version ? strdup(version->valuestring) : NULL
        );

    return _stat_nodes_statuses_local_var;
end:
    return NULL;

}
