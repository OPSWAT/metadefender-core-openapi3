#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_stat_nodes_engines.h"


char* engine_type_stat_nodes_engines_ToString(metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type) {
    char* engine_typeArray[] =  { "NULL", "av", "archive", "filetype" };
	return engine_typeArray[engine_type];
}

metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type_stat_nodes_engines_FromString(char* engine_type){
    int stringToReturn = 0;
    char *engine_typeArray[] =  { "NULL", "av", "archive", "filetype" };
    size_t sizeofArray = sizeof(engine_typeArray) / sizeof(engine_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(engine_type, engine_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

_stat_nodes_engines_t *_stat_nodes_engines_create(
    int active,
    char *db_ver,
    char *def_time,
    char *eng_name,
    char *eng_ver,
    metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type,
    char *id
    ) {
    _stat_nodes_engines_t *_stat_nodes_engines_local_var = malloc(sizeof(_stat_nodes_engines_t));
    if (!_stat_nodes_engines_local_var) {
        return NULL;
    }
    _stat_nodes_engines_local_var->active = active;
    _stat_nodes_engines_local_var->db_ver = db_ver;
    _stat_nodes_engines_local_var->def_time = def_time;
    _stat_nodes_engines_local_var->eng_name = eng_name;
    _stat_nodes_engines_local_var->eng_ver = eng_ver;
    _stat_nodes_engines_local_var->engine_type = engine_type;
    _stat_nodes_engines_local_var->id = id;

    return _stat_nodes_engines_local_var;
}


void _stat_nodes_engines_free(_stat_nodes_engines_t *_stat_nodes_engines) {
    if(NULL == _stat_nodes_engines){
        return ;
    }
    listEntry_t *listEntry;
    free(_stat_nodes_engines->db_ver);
    free(_stat_nodes_engines->def_time);
    free(_stat_nodes_engines->eng_name);
    free(_stat_nodes_engines->eng_ver);
    free(_stat_nodes_engines->id);
    free(_stat_nodes_engines);
}

cJSON *_stat_nodes_engines_convertToJSON(_stat_nodes_engines_t *_stat_nodes_engines) {
    cJSON *item = cJSON_CreateObject();

    // _stat_nodes_engines->active
    if(_stat_nodes_engines->active) { 
    if(cJSON_AddBoolToObject(item, "active", _stat_nodes_engines->active) == NULL) {
    goto fail; //Bool
    }
     } 


    // _stat_nodes_engines->db_ver
    if(_stat_nodes_engines->db_ver) { 
    if(cJSON_AddStringToObject(item, "db_ver", _stat_nodes_engines->db_ver) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_engines->def_time
    if(_stat_nodes_engines->def_time) { 
    if(cJSON_AddStringToObject(item, "def_time", _stat_nodes_engines->def_time) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_engines->eng_name
    if(_stat_nodes_engines->eng_name) { 
    if(cJSON_AddStringToObject(item, "eng_name", _stat_nodes_engines->eng_name) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_engines->eng_ver
    if(_stat_nodes_engines->eng_ver) { 
    if(cJSON_AddStringToObject(item, "eng_ver", _stat_nodes_engines->eng_ver) == NULL) {
    goto fail; //String
    }
     } 


    // _stat_nodes_engines->engine_type
    
    if(cJSON_AddStringToObject(item, "engine_type", engine_type_stat_nodes_engines_ToString(_stat_nodes_engines->engine_type)) == NULL)
    {
    goto fail; //Enum
    }
    


    // _stat_nodes_engines->id
    if(_stat_nodes_engines->id) { 
    if(cJSON_AddStringToObject(item, "id", _stat_nodes_engines->id) == NULL) {
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

_stat_nodes_engines_t *_stat_nodes_engines_parseFromJSON(cJSON *_stat_nodes_enginesJSON){

    _stat_nodes_engines_t *_stat_nodes_engines_local_var = NULL;

    // _stat_nodes_engines->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "active");
    if (active) { 
    if(!cJSON_IsBool(active))
    {
    goto end; //Bool
    }
    }

    // _stat_nodes_engines->db_ver
    cJSON *db_ver = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "db_ver");
    if (db_ver) { 
    if(!cJSON_IsString(db_ver))
    {
    goto end; //String
    }
    }

    // _stat_nodes_engines->def_time
    cJSON *def_time = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "def_time");
    if (def_time) { 
    if(!cJSON_IsString(def_time))
    {
    goto end; //String
    }
    }

    // _stat_nodes_engines->eng_name
    cJSON *eng_name = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "eng_name");
    if (eng_name) { 
    if(!cJSON_IsString(eng_name))
    {
    goto end; //String
    }
    }

    // _stat_nodes_engines->eng_ver
    cJSON *eng_ver = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "eng_ver");
    if (eng_ver) { 
    if(!cJSON_IsString(eng_ver))
    {
    goto end; //String
    }
    }

    // _stat_nodes_engines->engine_type
    cJSON *engine_type = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "engine_type");
    metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_typeVariable;
    if (engine_type) { 
    if(!cJSON_IsString(engine_type))
    {
    goto end; //Enum
    }
    engine_typeVariable = engine_type_stat_nodes_engines_FromString(engine_type->valuestring);
    }

    // _stat_nodes_engines->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(_stat_nodes_enginesJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }


    _stat_nodes_engines_local_var = _stat_nodes_engines_create (
        active ? active->valueint : 0,
        db_ver ? strdup(db_ver->valuestring) : NULL,
        def_time ? strdup(def_time->valuestring) : NULL,
        eng_name ? strdup(eng_name->valuestring) : NULL,
        eng_ver ? strdup(eng_ver->valuestring) : NULL,
        engine_type ? engine_typeVariable : -1,
        id ? strdup(id->valuestring) : NULL
        );

    return _stat_nodes_engines_local_var;
end:
    return NULL;

}
