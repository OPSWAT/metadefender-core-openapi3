/*
 * admin_config_webhook.h
 *
 * Webhook configuration details.
 */

#ifndef _admin_config_webhook_H_
#define _admin_config_webhook_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct admin_config_webhook_t {
    double maxretrytime; //numeric
    double delayduration; //numeric
    double deplayprogression; //numeric

} admin_config_webhook_t;

admin_config_webhook_t *admin_config_webhook_create(
    double maxretrytime,
    double delayduration,
    double deplayprogression
);

void admin_config_webhook_free(admin_config_webhook_t *admin_config_webhook);

admin_config_webhook_t *admin_config_webhook_parseFromJSON(cJSON *admin_config_webhookJSON);

cJSON *admin_config_webhook_convertToJSON(admin_config_webhook_t *admin_config_webhook);

#endif /* _admin_config_webhook_H_ */

