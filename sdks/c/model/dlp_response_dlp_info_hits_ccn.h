/*
 * dlp_response_dlp_info_hits_ccn.h
 *
 * 
 */

#ifndef _dlp_response_dlp_info_hits_ccn_H_
#define _dlp_response_dlp_info_hits_ccn_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dlp_rule_match_result.h"



typedef struct dlp_response_dlp_info_hits_ccn_t {
    char *display_name; // string
    list_t *hits; //nonprimitive container

} dlp_response_dlp_info_hits_ccn_t;

dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_create(
    char *display_name,
    list_t *hits
);

void dlp_response_dlp_info_hits_ccn_free(dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn);

dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn_parseFromJSON(cJSON *dlp_response_dlp_info_hits_ccnJSON);

cJSON *dlp_response_dlp_info_hits_ccn_convertToJSON(dlp_response_dlp_info_hits_ccn_t *dlp_response_dlp_info_hits_ccn);

#endif /* _dlp_response_dlp_info_hits_ccn_H_ */

