#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/UNKNOWN_BASE_TYPE.h"
#include "../model/inline_response_500.h"
#include "../model/license_information.h"
#include "../model/object.h"


// Activate license
//
// This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.
//
void
LicenseAPI_licenseActivation(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE );


// Get Current License Information
//
// Fetch all details about the licensing status of the product.
//
license_information_t*
LicenseAPI_licenseGet(apiClient_t *apiClient, char * apikey );


// Upload license key
//
// Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      
//
void
LicenseAPI_licenseUpload(apiClient_t *apiClient, char * apikey , char * body );


