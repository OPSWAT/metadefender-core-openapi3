/*
 * av_engine_scan_report.h
 *
 * Scan report per each engine.
 */

#ifndef _av_engine_scan_report_H_
#define _av_engine_scan_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct av_engine_scan_report_t {
    char *def_time; // string
    char *eng_id; // string
    char *location; // string
    int scan_result_i; //numeric
    int scan_time; //numeric
    char *threat_found; // string
    int wait_time; //numeric

} av_engine_scan_report_t;

av_engine_scan_report_t *av_engine_scan_report_create(
    char *def_time,
    char *eng_id,
    char *location,
    int scan_result_i,
    int scan_time,
    char *threat_found,
    int wait_time
);

void av_engine_scan_report_free(av_engine_scan_report_t *av_engine_scan_report);

av_engine_scan_report_t *av_engine_scan_report_parseFromJSON(cJSON *av_engine_scan_reportJSON);

cJSON *av_engine_scan_report_convertToJSON(av_engine_scan_report_t *av_engine_scan_report);

#endif /* _av_engine_scan_report_H_ */

