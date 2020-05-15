/*
 * dlp_rule_match_result.h
 *
 * An entry detailing the match.
 */

#ifndef _dlp_rule_match_result_H_
#define _dlp_rule_match_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum CERTAINTY for dlp_rule_match_result

typedef enum  { metadefender_core_dlp_rule_match_result_CERTAINTY_NULL = 0, metadefender_core_dlp_rule_match_result_CERTAINTY_Very Low, metadefender_core_dlp_rule_match_result_CERTAINTY_Low, metadefender_core_dlp_rule_match_result_CERTAINTY_Medium, metadefender_core_dlp_rule_match_result_CERTAINTY_High, metadefender_core_dlp_rule_match_result_CERTAINTY_Very High } metadefender_core_dlp_rule_match_result_CERTAINTY_e;

char* dlp_rule_match_result_certainty_ToString(metadefender_core_dlp_rule_match_result_CERTAINTY_e certainty);

metadefender_core_dlp_rule_match_result_CERTAINTY_e dlp_rule_match_result_certainty_FromString(char* certainty);

// Enum SEVERITY for dlp_rule_match_result

typedef enum  { metadefender_core_dlp_rule_match_result_SEVERITY_NULL = 0, metadefender_core_dlp_rule_match_result_SEVERITY__0, metadefender_core_dlp_rule_match_result_SEVERITY__1 } metadefender_core_dlp_rule_match_result_SEVERITY_e;

char* dlp_rule_match_result_severity_ToString(metadefender_core_dlp_rule_match_result_SEVERITY_e severity);

metadefender_core_dlp_rule_match_result_SEVERITY_e dlp_rule_match_result_severity_FromString(char* severity);



typedef struct dlp_rule_match_result_t {
    char *after; // string
    char *before; // string
    metadefender_core_dlp_rule_match_result_CERTAINTY_e certainty; //enum
    int certainty_score; //numeric
    char *hit; // string
    int is_redacted; //boolean
    int severity; //numeric

} dlp_rule_match_result_t;

dlp_rule_match_result_t *dlp_rule_match_result_create(
    char *after,
    char *before,
    metadefender_core_dlp_rule_match_result_CERTAINTY_e certainty,
    int certainty_score,
    char *hit,
    int is_redacted,
    int severity
);

void dlp_rule_match_result_free(dlp_rule_match_result_t *dlp_rule_match_result);

dlp_rule_match_result_t *dlp_rule_match_result_parseFromJSON(cJSON *dlp_rule_match_resultJSON);

cJSON *dlp_rule_match_result_convertToJSON(dlp_rule_match_result_t *dlp_rule_match_result);

#endif /* _dlp_rule_match_result_H_ */

