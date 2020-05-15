#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "yara_sources_object_local_sources.h"


char* stateyara_sources_object_local_sources_ToString(metadefender_core_yara_sources_object_local_sources_STATE_e state) {
    char* stateArray[] =  { "NULL", "disabled", "enabled" };
	return stateArray[state];
}

metadefender_core_yara_sources_object_local_sources_STATE_e stateyara_sources_object_local_sources_FromString(char* state){
    int stringToReturn = 0;
    char *stateArray[] =  { "NULL", "disabled", "enabled" };
    size_t sizeofArray = sizeof(stateArray) / sizeof(stateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(state, stateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

yara_sources_object_local_sources_t *yara_sources_object_local_sources_create(
    char *source,
    metadefender_core_yara_sources_object_local_sources_STATE_e state
    ) {
    yara_sources_object_local_sources_t *yara_sources_object_local_sources_local_var = malloc(sizeof(yara_sources_object_local_sources_t));
    if (!yara_sources_object_local_sources_local_var) {
        return NULL;
    }
    yara_sources_object_local_sources_local_var->source = source;
    yara_sources_object_local_sources_local_var->state = state;

    return yara_sources_object_local_sources_local_var;
}


void yara_sources_object_local_sources_free(yara_sources_object_local_sources_t *yara_sources_object_local_sources) {
    if(NULL == yara_sources_object_local_sources){
        return ;
    }
    listEntry_t *listEntry;
    free(yara_sources_object_local_sources->source);
    free(yara_sources_object_local_sources);
}

cJSON *yara_sources_object_local_sources_convertToJSON(yara_sources_object_local_sources_t *yara_sources_object_local_sources) {
    cJSON *item = cJSON_CreateObject();

    // yara_sources_object_local_sources->source
    if(yara_sources_object_local_sources->source) { 
    if(cJSON_AddStringToObject(item, "source", yara_sources_object_local_sources->source) == NULL) {
    goto fail; //String
    }
     } 


    // yara_sources_object_local_sources->state
    
    if(cJSON_AddStringToObject(item, "state", stateyara_sources_object_local_sources_ToString(yara_sources_object_local_sources->state)) == NULL)
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

yara_sources_object_local_sources_t *yara_sources_object_local_sources_parseFromJSON(cJSON *yara_sources_object_local_sourcesJSON){

    yara_sources_object_local_sources_t *yara_sources_object_local_sources_local_var = NULL;

    // yara_sources_object_local_sources->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(yara_sources_object_local_sourcesJSON, "source");
    if (source) { 
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }
    }

    // yara_sources_object_local_sources->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(yara_sources_object_local_sourcesJSON, "state");
    metadefender_core_yara_sources_object_local_sources_STATE_e stateVariable;
    if (state) { 
    if(!cJSON_IsString(state))
    {
    goto end; //Enum
    }
    stateVariable = stateyara_sources_object_local_sources_FromString(state->valuestring);
    }


    yara_sources_object_local_sources_local_var = yara_sources_object_local_sources_create (
        source ? strdup(source->valuestring) : NULL,
        state ? stateVariable : -1
        );

    return yara_sources_object_local_sources_local_var;
end:
    return NULL;

}
