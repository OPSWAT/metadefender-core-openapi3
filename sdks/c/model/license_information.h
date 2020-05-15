/*
 * license_information.h
 *
 * Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left)
 */

#ifndef _license_information_H_
#define _license_information_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct license_information_t {
    int days_left; //numeric
    char *deployment; // string
    char *expiration; // string
    list_t *licensed_engines; //primitive container
    char *max_node_count; // string
    int online_activated; //boolean
    char *product_id; // string
    char *product_name; // string

} license_information_t;

license_information_t *license_information_create(
    int days_left,
    char *deployment,
    char *expiration,
    list_t *licensed_engines,
    char *max_node_count,
    int online_activated,
    char *product_id,
    char *product_name
);

void license_information_free(license_information_t *license_information);

license_information_t *license_information_parseFromJSON(cJSON *license_informationJSON);

cJSON *license_information_convertToJSON(license_information_t *license_information);

#endif /* _license_information_H_ */

