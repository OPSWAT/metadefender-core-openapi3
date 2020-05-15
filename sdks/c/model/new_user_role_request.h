/*
 * new_user_role_request.h
 *
 * MetaDefender user role describing object.
 */

#ifndef _new_user_role_request_H_
#define _new_user_role_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "new_user_role_request_rights.h"



typedef struct new_user_role_request_t {
    char *name; // string
    char *display_name; // string
    struct new_user_role_request_rights_t *rights; //model

} new_user_role_request_t;

new_user_role_request_t *new_user_role_request_create(
    char *name,
    char *display_name,
    new_user_role_request_rights_t *rights
);

void new_user_role_request_free(new_user_role_request_t *new_user_role_request);

new_user_role_request_t *new_user_role_request_parseFromJSON(cJSON *new_user_role_requestJSON);

cJSON *new_user_role_request_convertToJSON(new_user_role_request_t *new_user_role_request);

#endif /* _new_user_role_request_H_ */

