/*
 * role_permission_object.h
 *
 * An object defining the permission set allowed on MetaDefender individual role.
 */

#ifndef _role_permission_object_H_
#define _role_permission_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct role_permission_object_t {

} role_permission_object_t;

role_permission_object_t *role_permission_object_create(
);

void role_permission_object_free(role_permission_object_t *role_permission_object);

role_permission_object_t *role_permission_object_parseFromJSON(cJSON *role_permission_objectJSON);

cJSON *role_permission_object_convertToJSON(role_permission_object_t *role_permission_object);

#endif /* _role_permission_object_H_ */

