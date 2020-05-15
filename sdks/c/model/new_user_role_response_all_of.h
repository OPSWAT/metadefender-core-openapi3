/*
 * new_user_role_response_all_of.h
 *
 * 
 */

#ifndef _new_user_role_response_all_of_H_
#define _new_user_role_response_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct new_user_role_response_all_of_t {
    int editable; //boolean
    int id; //numeric

} new_user_role_response_all_of_t;

new_user_role_response_all_of_t *new_user_role_response_all_of_create(
    int editable,
    int id
);

void new_user_role_response_all_of_free(new_user_role_response_all_of_t *new_user_role_response_all_of);

new_user_role_response_all_of_t *new_user_role_response_all_of_parseFromJSON(cJSON *new_user_role_response_all_ofJSON);

cJSON *new_user_role_response_all_of_convertToJSON(new_user_role_response_all_of_t *new_user_role_response_all_of);

#endif /* _new_user_role_response_all_of_H_ */

