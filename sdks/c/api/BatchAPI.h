#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/batch_id.h"
#include "../model/batch_response.h"
#include "../model/inline_response_400.h"
#include "../model/inline_response_500.h"
#include "../model/object.h"


// Cancel Batch
//
// When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      
//
object_t*
BatchAPI_batchCancel(apiClient_t *apiClient, char * batchId , char * apikey );


// Close Batch
//
// The batch will be closed and files can no longer can be added to the current batch.      
//
batch_response_t*
BatchAPI_batchClose(apiClient_t *apiClient, char * batchId , char * apikey );


// Initiate Batch
//
// Create a new batch and retrieve the batch_id
//
batch_id_t*
BatchAPI_batchCreate(apiClient_t *apiClient, char * apikey , char * rule , char * user_agent , char * user_data );


// Download Signed Batch Result
//
// Download digitally signed status report for the entire batch
//
void
BatchAPI_batchSignedResult(apiClient_t *apiClient, char * batchId , char * apikey );


// Status of Batch Analysis
//
// Retrieve status report for the entire batch
//
batch_response_t*
BatchAPI_batchStatus(apiClient_t *apiClient, char * batchId , char * apikey );


