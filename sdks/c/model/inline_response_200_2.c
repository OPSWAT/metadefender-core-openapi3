#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_2.h"


char* resultinline_response_200_2_ToString(metadefender_core_inline_response_200_2_RESULT_e result) {
    char* resultArray[] =  { "NULL", "Engine is pinned", "Database is pinned", "Both engine and database are pinned" };
	return resultArray[result];
}

metadefender_core_inline_response_200_2_RESULT_e resultinline_response_200_2_FromString(char* result){
    int stringToReturn = 0;
    char *resultArray[] =  { "NULL", "Engine is pinned", "Database is pinned", "Both engine and database are pinned" };
    size_t sizeofArray = sizeof(resultArray) / sizeof(resultArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(result, resultArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

inline_response_200_2_t *inline_response_200_2_create(
    metadefender_core_inline_response_200_2_RESULT_e result
    ) {
    inline_response_200_2_t *inline_response_200_2_local_var = malloc(sizeof(inline_response_200_2_t));
    if (!inline_response_200_2_local_var) {
        return NULL;
    }
    inline_response_200_2_local_var->result = result;

    return inline_response_200_2_local_var;
}


void inline_response_200_2_free(inline_response_200_2_t *inline_response_200_2) {
    if(NULL == inline_response_200_2){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_2);
}

cJSON *inline_response_200_2_convertToJSON(inline_response_200_2_t *inline_response_200_2) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_2->result
    
    if(cJSON_AddStringToObject(item, "result", resultinline_response_200_2_ToString(inline_response_200_2->result)) == NULL)
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

inline_response_200_2_t *inline_response_200_2_parseFromJSON(cJSON *inline_response_200_2JSON){

    inline_response_200_2_t *inline_response_200_2_local_var = NULL;

    // inline_response_200_2->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(inline_response_200_2JSON, "result");
    metadefender_core_inline_response_200_2_RESULT_e resultVariable;
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //Enum
    }
    resultVariable = resultinline_response_200_2_FromString(result->valuestring);
    }


    inline_response_200_2_local_var = inline_response_200_2_create (
        result ? resultVariable : -1
        );

    return inline_response_200_2_local_var;
end:
    return NULL;

}
