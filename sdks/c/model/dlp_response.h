/*
 * dlp_response.h
 *
 * Full report from Proactive DLP
 */

#ifndef _dlp_response_H_
#define _dlp_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dlp_response_dlp_info.h"



typedef struct dlp_response_t {
    struct dlp_response_dlp_info_t *dlp_info; //model

} dlp_response_t;

dlp_response_t *dlp_response_create(
    dlp_response_dlp_info_t *dlp_info
);

void dlp_response_free(dlp_response_t *dlp_response);

dlp_response_t *dlp_response_parseFromJSON(cJSON *dlp_responseJSON);

cJSON *dlp_response_convertToJSON(dlp_response_t *dlp_response);

#endif /* _dlp_response_H_ */

