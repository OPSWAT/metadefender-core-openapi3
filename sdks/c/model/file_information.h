/*
 * file_information.h
 *
 * basic information of the scanned file
 */

#ifndef _file_information_H_
#define _file_information_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct file_information_t {
    char *display_name; // string
    int file_size; //numeric
    char *file_type; // string
    char *file_type_description; // string
    char *md5; // string
    char *sha1; // string
    char *sha256; // string
    char *upload_timestamp; // string

} file_information_t;

file_information_t *file_information_create(
    char *display_name,
    int file_size,
    char *file_type,
    char *file_type_description,
    char *md5,
    char *sha1,
    char *sha256,
    char *upload_timestamp
);

void file_information_free(file_information_t *file_information);

file_information_t *file_information_parseFromJSON(cJSON *file_informationJSON);

cJSON *file_information_convertToJSON(file_information_t *file_information);

#endif /* _file_information_H_ */

