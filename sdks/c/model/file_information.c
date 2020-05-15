#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "file_information.h"



file_information_t *file_information_create(
    char *display_name,
    int file_size,
    char *file_type,
    char *file_type_description,
    char *md5,
    char *sha1,
    char *sha256,
    char *upload_timestamp
    ) {
    file_information_t *file_information_local_var = malloc(sizeof(file_information_t));
    if (!file_information_local_var) {
        return NULL;
    }
    file_information_local_var->display_name = display_name;
    file_information_local_var->file_size = file_size;
    file_information_local_var->file_type = file_type;
    file_information_local_var->file_type_description = file_type_description;
    file_information_local_var->md5 = md5;
    file_information_local_var->sha1 = sha1;
    file_information_local_var->sha256 = sha256;
    file_information_local_var->upload_timestamp = upload_timestamp;

    return file_information_local_var;
}


void file_information_free(file_information_t *file_information) {
    if(NULL == file_information){
        return ;
    }
    listEntry_t *listEntry;
    free(file_information->display_name);
    free(file_information->file_type);
    free(file_information->file_type_description);
    free(file_information->md5);
    free(file_information->sha1);
    free(file_information->sha256);
    free(file_information->upload_timestamp);
    free(file_information);
}

cJSON *file_information_convertToJSON(file_information_t *file_information) {
    cJSON *item = cJSON_CreateObject();

    // file_information->display_name
    if(file_information->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", file_information->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->file_size
    if(file_information->file_size) { 
    if(cJSON_AddNumberToObject(item, "file_size", file_information->file_size) == NULL) {
    goto fail; //Numeric
    }
     } 


    // file_information->file_type
    if(file_information->file_type) { 
    if(cJSON_AddStringToObject(item, "file_type", file_information->file_type) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->file_type_description
    if(file_information->file_type_description) { 
    if(cJSON_AddStringToObject(item, "file_type_description", file_information->file_type_description) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->md5
    if(file_information->md5) { 
    if(cJSON_AddStringToObject(item, "md5", file_information->md5) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->sha1
    if(file_information->sha1) { 
    if(cJSON_AddStringToObject(item, "sha1", file_information->sha1) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->sha256
    if(file_information->sha256) { 
    if(cJSON_AddStringToObject(item, "sha256", file_information->sha256) == NULL) {
    goto fail; //String
    }
     } 


    // file_information->upload_timestamp
    if(file_information->upload_timestamp) { 
    if(cJSON_AddStringToObject(item, "upload_timestamp", file_information->upload_timestamp) == NULL) {
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

file_information_t *file_information_parseFromJSON(cJSON *file_informationJSON){

    file_information_t *file_information_local_var = NULL;

    // file_information->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // file_information->file_size
    cJSON *file_size = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "file_size");
    if (file_size) { 
    if(!cJSON_IsNumber(file_size))
    {
    goto end; //Numeric
    }
    }

    // file_information->file_type
    cJSON *file_type = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "file_type");
    if (file_type) { 
    if(!cJSON_IsString(file_type))
    {
    goto end; //String
    }
    }

    // file_information->file_type_description
    cJSON *file_type_description = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "file_type_description");
    if (file_type_description) { 
    if(!cJSON_IsString(file_type_description))
    {
    goto end; //String
    }
    }

    // file_information->md5
    cJSON *md5 = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "md5");
    if (md5) { 
    if(!cJSON_IsString(md5))
    {
    goto end; //String
    }
    }

    // file_information->sha1
    cJSON *sha1 = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "sha1");
    if (sha1) { 
    if(!cJSON_IsString(sha1))
    {
    goto end; //String
    }
    }

    // file_information->sha256
    cJSON *sha256 = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "sha256");
    if (sha256) { 
    if(!cJSON_IsString(sha256))
    {
    goto end; //String
    }
    }

    // file_information->upload_timestamp
    cJSON *upload_timestamp = cJSON_GetObjectItemCaseSensitive(file_informationJSON, "upload_timestamp");
    if (upload_timestamp) { 
    if(!cJSON_IsString(upload_timestamp))
    {
    goto end; //String
    }
    }


    file_information_local_var = file_information_create (
        display_name ? strdup(display_name->valuestring) : NULL,
        file_size ? file_size->valuedouble : 0,
        file_type ? strdup(file_type->valuestring) : NULL,
        file_type_description ? strdup(file_type_description->valuestring) : NULL,
        md5 ? strdup(md5->valuestring) : NULL,
        sha1 ? strdup(sha1->valuestring) : NULL,
        sha256 ? strdup(sha256->valuestring) : NULL,
        upload_timestamp ? strdup(upload_timestamp->valuestring) : NULL
        );

    return file_information_local_var;
end:
    return NULL;

}
