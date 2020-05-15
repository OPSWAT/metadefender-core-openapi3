/*
 * user_login.h
 *
 * 
 */

#ifndef _user_login_H_
#define _user_login_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct user_login_t {
    char *session_id; // string

} user_login_t;

user_login_t *user_login_create(
    char *session_id
);

void user_login_free(user_login_t *user_login);

user_login_t *user_login_parseFromJSON(cJSON *user_loginJSON);

cJSON *user_login_convertToJSON(user_login_t *user_login);

#endif /* _user_login_H_ */

