#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_id.h"



batch_id_t *batch_id_create(
    char *batch_id
    ) {
    batch_id_t *batch_id_local_var = malloc(sizeof(batch_id_t));
    if (!batch_id_local_var) {
        return NULL;
    }
    batch_id_local_var->batch_id = batch_id;

    return batch_id_local_var;
}


void batch_id_free(batch_id_t *batch_id) {
    if(NULL == batch_id){
        return ;
    }
    listEntry_t *listEntry;
    free(batch_id->batch_id);
    free(batch_id);
}

cJSON *batch_id_convertToJSON(batch_id_t *batch_id) {
    cJSON *item = cJSON_CreateObject();

    // batch_id->batch_id
    if (!batch_id->batch_id) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "batch_id", batch_id->batch_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

batch_id_t *batch_id_parseFromJSON(cJSON *batch_idJSON){

    batch_id_t *batch_id_local_var = NULL;

    // batch_id->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(batch_idJSON, "batch_id");
    if (!batch_id) {
        goto end;
    }

    
    if(!cJSON_IsString(batch_id))
    {
    goto end; //String
    }


    batch_id_local_var = batch_id_create (
        strdup(batch_id->valuestring)
        );

    return batch_id_local_var;
end:
    return NULL;

}
