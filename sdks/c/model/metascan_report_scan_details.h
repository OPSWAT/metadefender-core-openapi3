/*
 * metascan_report_scan_details.h
 *
 * Scan results for each antivirus engine. The key is the name of the antivirus engine and the value is the result of the antivirus engine
 */

#ifndef _metascan_report_scan_details_H_
#define _metascan_report_scan_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "av_engine_scan_report.h"



typedef struct metascan_report_scan_details_t {
    struct av_engine_scan_report_t *clam_av; //model

} metascan_report_scan_details_t;

metascan_report_scan_details_t *metascan_report_scan_details_create(
    av_engine_scan_report_t *clam_av
);

void metascan_report_scan_details_free(metascan_report_scan_details_t *metascan_report_scan_details);

metascan_report_scan_details_t *metascan_report_scan_details_parseFromJSON(cJSON *metascan_report_scan_detailsJSON);

cJSON *metascan_report_scan_details_convertToJSON(metascan_report_scan_details_t *metascan_report_scan_details);

#endif /* _metascan_report_scan_details_H_ */

