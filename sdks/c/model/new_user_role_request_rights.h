/*
 * new_user_role_request_rights.h
 *
 * A list of rights for each permission
 */

#ifndef _new_user_role_request_rights_H_
#define _new_user_role_request_rights_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "role_permission_object.h"



typedef struct new_user_role_request_rights_t {
    struct role_permission_object_t *agents; //model
    struct role_permission_object_t *cert; //model
    struct role_permission_object_t *configlog; //model
    struct role_permission_object_t *engines; //model
    struct role_permission_object_t *external; //model
    struct role_permission_object_t *license; //model
    struct role_permission_object_t *quarantine; //model
    struct role_permission_object_t *retention; //model
    struct role_permission_object_t *rule; //model
    struct role_permission_object_t *scan; //model
    struct role_permission_object_t *scanlog; //model
    struct role_permission_object_t *skip; //model
    struct role_permission_object_t *update; //model
    struct role_permission_object_t *updatelog; //model
    struct role_permission_object_t *users; //model
    struct role_permission_object_t *workflow; //model
    struct role_permission_object_t *zone; //model

} new_user_role_request_rights_t;

new_user_role_request_rights_t *new_user_role_request_rights_create(
    role_permission_object_t *agents,
    role_permission_object_t *cert,
    role_permission_object_t *configlog,
    role_permission_object_t *engines,
    role_permission_object_t *external,
    role_permission_object_t *license,
    role_permission_object_t *quarantine,
    role_permission_object_t *retention,
    role_permission_object_t *rule,
    role_permission_object_t *scan,
    role_permission_object_t *scanlog,
    role_permission_object_t *skip,
    role_permission_object_t *update,
    role_permission_object_t *updatelog,
    role_permission_object_t *users,
    role_permission_object_t *workflow,
    role_permission_object_t *zone
);

void new_user_role_request_rights_free(new_user_role_request_rights_t *new_user_role_request_rights);

new_user_role_request_rights_t *new_user_role_request_rights_parseFromJSON(cJSON *new_user_role_request_rightsJSON);

cJSON *new_user_role_request_rights_convertToJSON(new_user_role_request_rights_t *new_user_role_request_rights);

#endif /* _new_user_role_request_rights_H_ */

