#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "role_permission_object.h"



role_permission_object_t *role_permission_object_create(
    ) {
    role_permission_object_t *role_permission_object_local_var = malloc(sizeof(role_permission_object_t));
    if (!role_permission_object_local_var) {
        return NULL;
    }

    return role_permission_object_local_var;
}


void role_permission_object_free(role_permission_object_t *role_permission_object) {
    if(NULL == role_permission_object){
        return ;
    }
    listEntry_t *listEntry;
    free(role_permission_object);
}

cJSON *role_permission_object_convertToJSON(role_permission_object_t *role_permission_object) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

role_permission_object_t *role_permission_object_parseFromJSON(cJSON *role_permission_objectJSON){

    role_permission_object_t *role_permission_object_local_var = NULL;


    role_permission_object_local_var = role_permission_object_create (
        );

    return role_permission_object_local_var;
end:
    return NULL;

}
