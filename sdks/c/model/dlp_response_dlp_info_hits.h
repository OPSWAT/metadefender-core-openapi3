/*
 * dlp_response_dlp_info_hits.h
 *
 * Detailed results that contains as key the type of matched rule:    * ccn (credit card number),    * ssn (social security number),    * regex_&lt;index&gt; (regular expression with an index in order to differentiate the RegEx rules if there are more.) 
 */

#ifndef _dlp_response_dlp_info_hits_H_
#define _dlp_response_dlp_info_hits_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dlp_response_dlp_info_hits_ccn.h"



typedef struct dlp_response_dlp_info_hits_t {
    struct dlp_response_dlp_info_hits_ccn_t *ccn; //model

} dlp_response_dlp_info_hits_t;

dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_create(
    dlp_response_dlp_info_hits_ccn_t *ccn
);

void dlp_response_dlp_info_hits_free(dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits);

dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits_parseFromJSON(cJSON *dlp_response_dlp_info_hitsJSON);

cJSON *dlp_response_dlp_info_hits_convertToJSON(dlp_response_dlp_info_hits_t *dlp_response_dlp_info_hits);

#endif /* _dlp_response_dlp_info_hits_H_ */

