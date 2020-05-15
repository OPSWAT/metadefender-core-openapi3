#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_config_update_disabledupdate.h"



admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_create(
    char *days,
    int from,
    int to
    ) {
    admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_local_var = malloc(sizeof(admin_config_update_disabledupdate_t));
    if (!admin_config_update_disabledupdate_local_var) {
        return NULL;
    }
    admin_config_update_disabledupdate_local_var->days = days;
    admin_config_update_disabledupdate_local_var->from = from;
    admin_config_update_disabledupdate_local_var->to = to;

    return admin_config_update_disabledupdate_local_var;
}


void admin_config_update_disabledupdate_free(admin_config_update_disabledupdate_t *admin_config_update_disabledupdate) {
    if(NULL == admin_config_update_disabledupdate){
        return ;
    }
    listEntry_t *listEntry;
    free(admin_config_update_disabledupdate->days);
    free(admin_config_update_disabledupdate);
}

cJSON *admin_config_update_disabledupdate_convertToJSON(admin_config_update_disabledupdate_t *admin_config_update_disabledupdate) {
    cJSON *item = cJSON_CreateObject();

    // admin_config_update_disabledupdate->days
    if(admin_config_update_disabledupdate->days) { 
    if(cJSON_AddStringToObject(item, "days", admin_config_update_disabledupdate->days) == NULL) {
    goto fail; //String
    }
     } 


    // admin_config_update_disabledupdate->from
    if(admin_config_update_disabledupdate->from) { 
    if(cJSON_AddNumberToObject(item, "from", admin_config_update_disabledupdate->from) == NULL) {
    goto fail; //Numeric
    }
     } 


    // admin_config_update_disabledupdate->to
    if(admin_config_update_disabledupdate->to) { 
    if(cJSON_AddNumberToObject(item, "to", admin_config_update_disabledupdate->to) == NULL) {
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

admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_parseFromJSON(cJSON *admin_config_update_disabledupdateJSON){

    admin_config_update_disabledupdate_t *admin_config_update_disabledupdate_local_var = NULL;

    // admin_config_update_disabledupdate->days
    cJSON *days = cJSON_GetObjectItemCaseSensitive(admin_config_update_disabledupdateJSON, "days");
    if (days) { 
    if(!cJSON_IsString(days))
    {
    goto end; //String
    }
    }

    // admin_config_update_disabledupdate->from
    cJSON *from = cJSON_GetObjectItemCaseSensitive(admin_config_update_disabledupdateJSON, "from");
    if (from) { 
    if(!cJSON_IsNumber(from))
    {
    goto end; //Numeric
    }
    }

    // admin_config_update_disabledupdate->to
    cJSON *to = cJSON_GetObjectItemCaseSensitive(admin_config_update_disabledupdateJSON, "to");
    if (to) { 
    if(!cJSON_IsNumber(to))
    {
    goto end; //Numeric
    }
    }


    admin_config_update_disabledupdate_local_var = admin_config_update_disabledupdate_create (
        days ? strdup(days->valuestring) : NULL,
        from ? from->valuedouble : 0,
        to ? to->valuedouble : 0
        );

    return admin_config_update_disabledupdate_local_var;
end:
    return NULL;

}
