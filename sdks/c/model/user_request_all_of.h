/*
 * user_request_all_of.h
 *
 * 
 */

#ifndef _user_request_all_of_H_
#define _user_request_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct user_request_all_of_t {
    char *password; // string

} user_request_all_of_t;

user_request_all_of_t *user_request_all_of_create(
    char *password
);

void user_request_all_of_free(user_request_all_of_t *user_request_all_of);

user_request_all_of_t *user_request_all_of_parseFromJSON(cJSON *user_request_all_ofJSON);

cJSON *user_request_all_of_convertToJSON(user_request_all_of_t *user_request_all_of);

#endif /* _user_request_all_of_H_ */

