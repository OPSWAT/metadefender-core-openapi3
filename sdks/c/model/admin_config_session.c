#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_config_session.h"



admin_config_session_t *admin_config_session_create(
    int absolute_session_timeout,
    int allow_cross_ip_sessions,
    int allow_duplicate_session,
    int session_timeout
    ) {
    admin_config_session_t *admin_config_session_local_var = malloc(sizeof(admin_config_session_t));
    if (!admin_config_session_local_var) {
        return NULL;
    }
    admin_config_session_local_var->absolute_session_timeout = absolute_session_timeout;
    admin_config_session_local_var->allow_cross_ip_sessions = allow_cross_ip_sessions;
    admin_config_session_local_var->allow_duplicate_session = allow_duplicate_session;
    admin_config_session_local_var->session_timeout = session_timeout;

    return admin_config_session_local_var;
}


void admin_config_session_free(admin_config_session_t *admin_config_session) {
    if(NULL == admin_config_session){
        return ;
    }
    listEntry_t *listEntry;
    free(admin_config_session);
}

cJSON *admin_config_session_convertToJSON(admin_config_session_t *admin_config_session) {
    cJSON *item = cJSON_CreateObject();

    // admin_config_session->absolute_session_timeout
    if(admin_config_session->absolute_session_timeout) { 
    if(cJSON_AddNumberToObject(item, "absoluteSessionTimeout", admin_config_session->absolute_session_timeout) == NULL) {
    goto fail; //Numeric
    }
     } 


    // admin_config_session->allow_cross_ip_sessions
    if(admin_config_session->allow_cross_ip_sessions) { 
    if(cJSON_AddBoolToObject(item, "allowCrossIpSessions", admin_config_session->allow_cross_ip_sessions) == NULL) {
    goto fail; //Bool
    }
     } 


    // admin_config_session->allow_duplicate_session
    if(admin_config_session->allow_duplicate_session) { 
    if(cJSON_AddBoolToObject(item, "allowDuplicateSession", admin_config_session->allow_duplicate_session) == NULL) {
    goto fail; //Bool
    }
     } 


    // admin_config_session->session_timeout
    if(admin_config_session->session_timeout) { 
    if(cJSON_AddNumberToObject(item, "sessionTimeout", admin_config_session->session_timeout) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

admin_config_session_t *admin_config_session_parseFromJSON(cJSON *admin_config_sessionJSON){

    admin_config_session_t *admin_config_session_local_var = NULL;

    // admin_config_session->absolute_session_timeout
    cJSON *absolute_session_timeout = cJSON_GetObjectItemCaseSensitive(admin_config_sessionJSON, "absoluteSessionTimeout");
    if (absolute_session_timeout) { 
    if(!cJSON_IsNumber(absolute_session_timeout))
    {
    goto end; //Numeric
    }
    }

    // admin_config_session->allow_cross_ip_sessions
    cJSON *allow_cross_ip_sessions = cJSON_GetObjectItemCaseSensitive(admin_config_sessionJSON, "allowCrossIpSessions");
    if (allow_cross_ip_sessions) { 
    if(!cJSON_IsBool(allow_cross_ip_sessions))
    {
    goto end; //Bool
    }
    }

    // admin_config_session->allow_duplicate_session
    cJSON *allow_duplicate_session = cJSON_GetObjectItemCaseSensitive(admin_config_sessionJSON, "allowDuplicateSession");
    if (allow_duplicate_session) { 
    if(!cJSON_IsBool(allow_duplicate_session))
    {
    goto end; //Bool
    }
    }

    // admin_config_session->session_timeout
    cJSON *session_timeout = cJSON_GetObjectItemCaseSensitive(admin_config_sessionJSON, "sessionTimeout");
    if (session_timeout) { 
    if(!cJSON_IsNumber(session_timeout))
    {
    goto end; //Numeric
    }
    }


    admin_config_session_local_var = admin_config_session_create (
        absolute_session_timeout ? absolute_session_timeout->valuedouble : 0,
        allow_cross_ip_sessions ? allow_cross_ip_sessions->valueint : 0,
        allow_duplicate_session ? allow_duplicate_session->valueint : 0,
        session_timeout ? session_timeout->valuedouble : 0
        );

    return admin_config_session_local_var;
end:
    return NULL;

}
