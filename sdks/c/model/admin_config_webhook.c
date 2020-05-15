#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_config_webhook.h"



admin_config_webhook_t *admin_config_webhook_create(
    double maxretrytime,
    double delayduration,
    double deplayprogression
    ) {
    admin_config_webhook_t *admin_config_webhook_local_var = malloc(sizeof(admin_config_webhook_t));
    if (!admin_config_webhook_local_var) {
        return NULL;
    }
    admin_config_webhook_local_var->maxretrytime = maxretrytime;
    admin_config_webhook_local_var->delayduration = delayduration;
    admin_config_webhook_local_var->deplayprogression = deplayprogression;

    return admin_config_webhook_local_var;
}


void admin_config_webhook_free(admin_config_webhook_t *admin_config_webhook) {
    if(NULL == admin_config_webhook){
        return ;
    }
    listEntry_t *listEntry;
    free(admin_config_webhook);
}

cJSON *admin_config_webhook_convertToJSON(admin_config_webhook_t *admin_config_webhook) {
    cJSON *item = cJSON_CreateObject();

    // admin_config_webhook->maxretrytime
    if(admin_config_webhook->maxretrytime) { 
    if(cJSON_AddNumberToObject(item, "maxretrytime", admin_config_webhook->maxretrytime) == NULL) {
    goto fail; //Numeric
    }
     } 


    // admin_config_webhook->delayduration
    if(admin_config_webhook->delayduration) { 
    if(cJSON_AddNumberToObject(item, "delayduration", admin_config_webhook->delayduration) == NULL) {
    goto fail; //Numeric
    }
     } 


    // admin_config_webhook->deplayprogression
    if(admin_config_webhook->deplayprogression) { 
    if(cJSON_AddNumberToObject(item, "deplayprogression", admin_config_webhook->deplayprogression) == NULL) {
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

admin_config_webhook_t *admin_config_webhook_parseFromJSON(cJSON *admin_config_webhookJSON){

    admin_config_webhook_t *admin_config_webhook_local_var = NULL;

    // admin_config_webhook->maxretrytime
    cJSON *maxretrytime = cJSON_GetObjectItemCaseSensitive(admin_config_webhookJSON, "maxretrytime");
    if (maxretrytime) { 
    if(!cJSON_IsNumber(maxretrytime))
    {
    goto end; //Numeric
    }
    }

    // admin_config_webhook->delayduration
    cJSON *delayduration = cJSON_GetObjectItemCaseSensitive(admin_config_webhookJSON, "delayduration");
    if (delayduration) { 
    if(!cJSON_IsNumber(delayduration))
    {
    goto end; //Numeric
    }
    }

    // admin_config_webhook->deplayprogression
    cJSON *deplayprogression = cJSON_GetObjectItemCaseSensitive(admin_config_webhookJSON, "deplayprogression");
    if (deplayprogression) { 
    if(!cJSON_IsNumber(deplayprogression))
    {
    goto end; //Numeric
    }
    }


    admin_config_webhook_local_var = admin_config_webhook_create (
        maxretrytime ? maxretrytime->valuedouble : 0,
        delayduration ? delayduration->valuedouble : 0,
        deplayprogression ? deplayprogression->valuedouble : 0
        );

    return admin_config_webhook_local_var;
end:
    return NULL;

}
