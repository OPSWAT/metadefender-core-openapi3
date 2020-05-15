/*
 * admin_config_update.h
 *
 * API object for /admin/config/update
 */

#ifndef _admin_config_update_H_
#define _admin_config_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "admin_config_update_disabledupdate.h"

// Enum SOURCE for admin_config_update

typedef enum  { metadefender_core_admin_config_update_SOURCE_NULL = 0, metadefender_core_admin_config_update_SOURCE_internet, metadefender_core_admin_config_update_SOURCE_folder, metadefender_core_admin_config_update_SOURCE_manual } metadefender_core_admin_config_update_SOURCE_e;

char* admin_config_update_source_ToString(metadefender_core_admin_config_update_SOURCE_e source);

metadefender_core_admin_config_update_SOURCE_e admin_config_update_source_FromString(char* source);



typedef struct admin_config_update_t {
    int autoupdateperiod; //numeric
    int deleteafterimport; //boolean
    list_t *disabledupdate; //nonprimitive container
    char *pickupfolder; // string
    metadefender_core_admin_config_update_SOURCE_e source; //enum

} admin_config_update_t;

admin_config_update_t *admin_config_update_create(
    int autoupdateperiod,
    int deleteafterimport,
    list_t *disabledupdate,
    char *pickupfolder,
    metadefender_core_admin_config_update_SOURCE_e source
);

void admin_config_update_free(admin_config_update_t *admin_config_update);

admin_config_update_t *admin_config_update_parseFromJSON(cJSON *admin_config_updateJSON);

cJSON *admin_config_update_convertToJSON(admin_config_update_t *admin_config_update);

#endif /* _admin_config_update_H_ */

