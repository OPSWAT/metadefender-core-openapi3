/*
 * new_user_role_response.h
 *
 * 
 */

#ifndef _new_user_role_response_H_
#define _new_user_role_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "new_user_role_request.h"
#include "new_user_role_request_rights.h"
#include "new_user_role_response_all_of.h"



typedef struct new_user_role_response_t {
    char *name; // string
    char *display_name; // string
    struct new_user_role_request_rights_t *rights; //model
    int editable; //boolean
    int id; //numeric

} new_user_role_response_t;

new_user_role_response_t *new_user_role_response_create(
    char *name,
    char *display_name,
    new_user_role_request_rights_t *rights,
    int editable,
    int id
);

void new_user_role_response_free(new_user_role_response_t *new_user_role_response);

new_user_role_response_t *new_user_role_response_parseFromJSON(cJSON *new_user_role_responseJSON);

cJSON *new_user_role_response_convertToJSON(new_user_role_response_t *new_user_role_response);

#endif /* _new_user_role_response_H_ */

