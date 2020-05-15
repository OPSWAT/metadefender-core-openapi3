/*
 * yara_report.h
 *
 * Information on data that matched yara rules
 */

#ifndef _yara_report_H_
#define _yara_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"
#include "scan_result_enum.h"

// Enum  for yara_report

typedef enum  { metadefender_core_yara_report__NULL = 0, metadefender_core_yara_report___0, metadefender_core_yara_report___1, metadefender_core_yara_report___2, metadefender_core_yara_report___3, metadefender_core_yara_report___4 } metadefender_core_yara_report__e;

char* yara_report_verdict_ToString(metadefender_core_yara_report__e verdict);

metadefender_core_yara_report__e yara_report_verdict_FromString(char* verdict);



typedef struct yara_report_t {
    object_t *hits; //object

} yara_report_t;

yara_report_t *yara_report_create(
    object_t *hits,
);

void yara_report_free(yara_report_t *yara_report);

yara_report_t *yara_report_parseFromJSON(cJSON *yara_reportJSON);

cJSON *yara_report_convertToJSON(yara_report_t *yara_report);

#endif /* _yara_report_H_ */

