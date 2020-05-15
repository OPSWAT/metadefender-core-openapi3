/*
 * admin_config_session.h
 *
 * API object for /admin/config/session
 */

#ifndef _admin_config_session_H_
#define _admin_config_session_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct admin_config_session_t {
    int absolute_session_timeout; //numeric
    int allow_cross_ip_sessions; //boolean
    int allow_duplicate_session; //boolean
    int session_timeout; //numeric

} admin_config_session_t;

admin_config_session_t *admin_config_session_create(
    int absolute_session_timeout,
    int allow_cross_ip_sessions,
    int allow_duplicate_session,
    int session_timeout
);

void admin_config_session_free(admin_config_session_t *admin_config_session);

admin_config_session_t *admin_config_session_parseFromJSON(cJSON *admin_config_sessionJSON);

cJSON *admin_config_session_convertToJSON(admin_config_session_t *admin_config_session);

#endif /* _admin_config_session_H_ */

