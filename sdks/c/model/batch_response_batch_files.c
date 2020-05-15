#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response_batch_files.h"



batch_response_batch_files_t *batch_response_batch_files_create(
    int batch_count,
    list_t *files_in_batch,
    int first_index,
    int page_size
    ) {
    batch_response_batch_files_t *batch_response_batch_files_local_var = malloc(sizeof(batch_response_batch_files_t));
    if (!batch_response_batch_files_local_var) {
        return NULL;
    }
    batch_response_batch_files_local_var->batch_count = batch_count;
    batch_response_batch_files_local_var->files_in_batch = files_in_batch;
    batch_response_batch_files_local_var->first_index = first_index;
    batch_response_batch_files_local_var->page_size = page_size;

    return batch_response_batch_files_local_var;
}


void batch_response_batch_files_free(batch_response_batch_files_t *batch_response_batch_files) {
    if(NULL == batch_response_batch_files){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, batch_response_batch_files->files_in_batch) {
        batch_response_batch_files_files_in_batch_free(listEntry->data);
    }
    list_free(batch_response_batch_files->files_in_batch);
    free(batch_response_batch_files);
}

cJSON *batch_response_batch_files_convertToJSON(batch_response_batch_files_t *batch_response_batch_files) {
    cJSON *item = cJSON_CreateObject();

    // batch_response_batch_files->batch_count
    if(batch_response_batch_files->batch_count) { 
    if(cJSON_AddNumberToObject(item, "batch_count", batch_response_batch_files->batch_count) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files->files_in_batch
    if(batch_response_batch_files->files_in_batch) { 
    cJSON *files_in_batch = cJSON_AddArrayToObject(item, "files_in_batch");
    if(files_in_batch == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *files_in_batchListEntry;
    if (batch_response_batch_files->files_in_batch) {
    list_ForEach(files_in_batchListEntry, batch_response_batch_files->files_in_batch) {
    cJSON *itemLocal = batch_response_batch_files_files_in_batch_convertToJSON(files_in_batchListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(files_in_batch, itemLocal);
    }
    }
     } 


    // batch_response_batch_files->first_index
    if(batch_response_batch_files->first_index) { 
    if(cJSON_AddNumberToObject(item, "first_index", batch_response_batch_files->first_index) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files->page_size
    if(batch_response_batch_files->page_size) { 
    if(cJSON_AddNumberToObject(item, "page_size", batch_response_batch_files->page_size) == NULL) {
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

batch_response_batch_files_t *batch_response_batch_files_parseFromJSON(cJSON *batch_response_batch_filesJSON){

    batch_response_batch_files_t *batch_response_batch_files_local_var = NULL;

    // batch_response_batch_files->batch_count
    cJSON *batch_count = cJSON_GetObjectItemCaseSensitive(batch_response_batch_filesJSON, "batch_count");
    if (batch_count) { 
    if(!cJSON_IsNumber(batch_count))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files->files_in_batch
    cJSON *files_in_batch = cJSON_GetObjectItemCaseSensitive(batch_response_batch_filesJSON, "files_in_batch");
    list_t *files_in_batchList;
    if (files_in_batch) { 
    cJSON *files_in_batch_local_nonprimitive;
    if(!cJSON_IsArray(files_in_batch)){
        goto end; //nonprimitive container
    }

    files_in_batchList = list_create();

    cJSON_ArrayForEach(files_in_batch_local_nonprimitive,files_in_batch )
    {
        if(!cJSON_IsObject(files_in_batch_local_nonprimitive)){
            goto end;
        }
        batch_response_batch_files_files_in_batch_t *files_in_batchItem = batch_response_batch_files_files_in_batch_parseFromJSON(files_in_batch_local_nonprimitive);

        list_addElement(files_in_batchList, files_in_batchItem);
    }
    }

    // batch_response_batch_files->first_index
    cJSON *first_index = cJSON_GetObjectItemCaseSensitive(batch_response_batch_filesJSON, "first_index");
    if (first_index) { 
    if(!cJSON_IsNumber(first_index))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files->page_size
    cJSON *page_size = cJSON_GetObjectItemCaseSensitive(batch_response_batch_filesJSON, "page_size");
    if (page_size) { 
    if(!cJSON_IsNumber(page_size))
    {
    goto end; //Numeric
    }
    }


    batch_response_batch_files_local_var = batch_response_batch_files_create (
        batch_count ? batch_count->valuedouble : 0,
        files_in_batch ? files_in_batchList : NULL,
        first_index ? first_index->valuedouble : 0,
        page_size ? page_size->valuedouble : 0
        );

    return batch_response_batch_files_local_var;
end:
    return NULL;

}
