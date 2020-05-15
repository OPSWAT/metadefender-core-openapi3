#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_12.h"


char* engine_typeinline_response_200_12_ToString(metadefender_core_inline_response_200_12_ENGINETYPE_e engine_type) {
    char* engine_typeArray[] =  { "NULL", "av", "archive", "filetype" };
	return engine_typeArray[engine_type];
}

metadefender_core_inline_response_200_12_ENGINETYPE_e engine_typeinline_response_200_12_FromString(char* engine_type){
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
char* stateinline_response_200_12_ToString(metadefender_core_inline_response_200_12_STATE_e state) {
    char* stateArray[] =  { "NULL", "downloading", "downloaded", "staging", "production", "removed", "temporary failed", "permanently failed", "content invalid", "download failed" };
	return stateArray[state];
}

metadefender_core_inline_response_200_12_STATE_e stateinline_response_200_12_FromString(char* state){
    int stringToReturn = 0;
    char *stateArray[] =  { "NULL", "downloading", "downloaded", "staging", "production", "removed", "temporary failed", "permanently failed", "content invalid", "download failed" };
    size_t sizeofArray = sizeof(stateArray) / sizeof(stateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(state, stateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

inline_response_200_12_t *inline_response_200_12_create(
    int active,
    char *def_time,
    int download_progress,
    char *download_time,
    char *eng_id,
    char *eng_name,
    char *eng_type,
    char *eng_ver,
    metadefender_core_inline_response_200_12_ENGINETYPE_e engine_type,
    metadefender_core_inline_response_200_12_STATE_e state
    ) {
    inline_response_200_12_t *inline_response_200_12_local_var = malloc(sizeof(inline_response_200_12_t));
    if (!inline_response_200_12_local_var) {
        return NULL;
    }
    inline_response_200_12_local_var->active = active;
    inline_response_200_12_local_var->def_time = def_time;
    inline_response_200_12_local_var->download_progress = download_progress;
    inline_response_200_12_local_var->download_time = download_time;
    inline_response_200_12_local_var->eng_id = eng_id;
    inline_response_200_12_local_var->eng_name = eng_name;
    inline_response_200_12_local_var->eng_type = eng_type;
    inline_response_200_12_local_var->eng_ver = eng_ver;
    inline_response_200_12_local_var->engine_type = engine_type;
    inline_response_200_12_local_var->state = state;

    return inline_response_200_12_local_var;
}


void inline_response_200_12_free(inline_response_200_12_t *inline_response_200_12) {
    if(NULL == inline_response_200_12){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_12->def_time);
    free(inline_response_200_12->download_time);
    free(inline_response_200_12->eng_id);
    free(inline_response_200_12->eng_name);
    free(inline_response_200_12->eng_type);
    free(inline_response_200_12->eng_ver);
    free(inline_response_200_12);
}

cJSON *inline_response_200_12_convertToJSON(inline_response_200_12_t *inline_response_200_12) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_12->active
    if(inline_response_200_12->active) { 
    if(cJSON_AddBoolToObject(item, "active", inline_response_200_12->active) == NULL) {
    goto fail; //Bool
    }
     } 


    // inline_response_200_12->def_time
    if(inline_response_200_12->def_time) { 
    if(cJSON_AddStringToObject(item, "def_time", inline_response_200_12->def_time) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->download_progress
    if(inline_response_200_12->download_progress) { 
    if(cJSON_AddNumberToObject(item, "download_progress", inline_response_200_12->download_progress) == NULL) {
    goto fail; //Numeric
    }
     } 


    // inline_response_200_12->download_time
    if(inline_response_200_12->download_time) { 
    if(cJSON_AddStringToObject(item, "download_time", inline_response_200_12->download_time) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->eng_id
    if(inline_response_200_12->eng_id) { 
    if(cJSON_AddStringToObject(item, "eng_id", inline_response_200_12->eng_id) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->eng_name
    if(inline_response_200_12->eng_name) { 
    if(cJSON_AddStringToObject(item, "eng_name", inline_response_200_12->eng_name) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->eng_type
    if(inline_response_200_12->eng_type) { 
    if(cJSON_AddStringToObject(item, "eng_type", inline_response_200_12->eng_type) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->eng_ver
    if(inline_response_200_12->eng_ver) { 
    if(cJSON_AddStringToObject(item, "eng_ver", inline_response_200_12->eng_ver) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_12->engine_type
    
    if(cJSON_AddStringToObject(item, "engine_type", engine_typeinline_response_200_12_ToString(inline_response_200_12->engine_type)) == NULL)
    {
    goto fail; //Enum
    }
    


    // inline_response_200_12->state
    
    if(cJSON_AddStringToObject(item, "state", stateinline_response_200_12_ToString(inline_response_200_12->state)) == NULL)
    {
    goto fail; //Enum
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_200_12_t *inline_response_200_12_parseFromJSON(cJSON *inline_response_200_12JSON){

    inline_response_200_12_t *inline_response_200_12_local_var = NULL;

    // inline_response_200_12->active
    cJSON *active = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "active");
    if (active) { 
    if(!cJSON_IsBool(active))
    {
    goto end; //Bool
    }
    }

    // inline_response_200_12->def_time
    cJSON *def_time = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "def_time");
    if (def_time) { 
    if(!cJSON_IsString(def_time))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->download_progress
    cJSON *download_progress = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "download_progress");
    if (download_progress) { 
    if(!cJSON_IsNumber(download_progress))
    {
    goto end; //Numeric
    }
    }

    // inline_response_200_12->download_time
    cJSON *download_time = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "download_time");
    if (download_time) { 
    if(!cJSON_IsString(download_time))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->eng_id
    cJSON *eng_id = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "eng_id");
    if (eng_id) { 
    if(!cJSON_IsString(eng_id))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->eng_name
    cJSON *eng_name = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "eng_name");
    if (eng_name) { 
    if(!cJSON_IsString(eng_name))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->eng_type
    cJSON *eng_type = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "eng_type");
    if (eng_type) { 
    if(!cJSON_IsString(eng_type))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->eng_ver
    cJSON *eng_ver = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "eng_ver");
    if (eng_ver) { 
    if(!cJSON_IsString(eng_ver))
    {
    goto end; //String
    }
    }

    // inline_response_200_12->engine_type
    cJSON *engine_type = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "engine_type");
    metadefender_core_inline_response_200_12_ENGINETYPE_e engine_typeVariable;
    if (engine_type) { 
    if(!cJSON_IsString(engine_type))
    {
    goto end; //Enum
    }
    engine_typeVariable = engine_typeinline_response_200_12_FromString(engine_type->valuestring);
    }

    // inline_response_200_12->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(inline_response_200_12JSON, "state");
    metadefender_core_inline_response_200_12_STATE_e stateVariable;
    if (state) { 
    if(!cJSON_IsString(state))
    {
    goto end; //Enum
    }
    stateVariable = stateinline_response_200_12_FromString(state->valuestring);
    }


    inline_response_200_12_local_var = inline_response_200_12_create (
        active ? active->valueint : 0,
        def_time ? strdup(def_time->valuestring) : NULL,
        download_progress ? download_progress->valuedouble : 0,
        download_time ? strdup(download_time->valuestring) : NULL,
        eng_id ? strdup(eng_id->valuestring) : NULL,
        eng_name ? strdup(eng_name->valuestring) : NULL,
        eng_type ? strdup(eng_type->valuestring) : NULL,
        eng_ver ? strdup(eng_ver->valuestring) : NULL,
        engine_type ? engine_typeVariable : -1,
        state ? stateVariable : -1
        );

    return inline_response_200_12_local_var;
end:
    return NULL;

}
