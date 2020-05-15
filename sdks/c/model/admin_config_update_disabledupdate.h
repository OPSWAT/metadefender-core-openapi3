/*
 * admin_config_update_disabledupdate.h
 *
 * The JSON below mean that from Friday to Sunday (week starts on Monday (1), ends on Sunday (7)) from 8:00 to 16:00 you do not want to distribute packages. &lt;i&gt;From and to is the distance in minutes from 0:00 (8:00 → 480 minutes, 16:00 → 960 minutes)&lt;i&gt; 
 */

#ifndef _admin_config_update_disabledupdate_H_
#define _admin_config_update_disabledupdate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct admin_config_update_disabledupdate_t {
    char *days; // string
    int from; //numeric
    int to; //numeric

} admin_config_update_disabledupdate_t;

admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_create(
    char *days,
    int from,
    int to
);

void admin_config_update_disabledupdate_free(admin_config_update_disabledupdate_t *admin_config_update_disabledupdate);

admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_parseFromJSON(cJSON *admin_config_update_disabledupdateJSON);

cJSON *admin_config_update_disabledupdate_convertToJSON(admin_config_update_disabledupdate_t *admin_config_update_disabledupdate);

#endif /* _admin_config_update_disabledupdate_H_ */

