/*
 * user_response.h
 *
 * User object in MetaDefender.
 */

#ifndef _user_response_H_
#define _user_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"



typedef struct user_response_t {
    char *apikey; // string
    int directory_id; //numeric
    char *display_name; // string
    char *email; // string
    char *name; // string
    list_t *roles; //primitive container
    object_t *ui_settings; //object

} user_response_t;

user_response_t *user_response_create(
    char *apikey,
    int directory_id,
    char *display_name,
    char *email,
    char *name,
    list_t *roles,
    object_t *ui_settings
);

void user_response_free(user_response_t *user_response);

user_response_t *user_response_parseFromJSON(cJSON *user_responseJSON);

cJSON *user_response_convertToJSON(user_response_t *user_response);

#endif /* _user_response_H_ */

