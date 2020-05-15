/*
 * user_request.h
 *
 * 
 */

#ifndef _user_request_H_
#define _user_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"
#include "user_request_all_of.h"
#include "user_response.h"



typedef struct user_request_t {
    char *apikey; // string
    int directory_id; //numeric
    char *display_name; // string
    char *email; // string
    char *name; // string
    list_t *roles; //primitive container
    object_t *ui_settings; //object
    char *password; // string

} user_request_t;

user_request_t *user_request_create(
    char *apikey,
    int directory_id,
    char *display_name,
    char *email,
    char *name,
    list_t *roles,
    object_t *ui_settings,
    char *password
);

void user_request_free(user_request_t *user_request);

user_request_t *user_request_parseFromJSON(cJSON *user_requestJSON);

cJSON *user_request_convertToJSON(user_request_t *user_request);

#endif /* _user_request_H_ */

