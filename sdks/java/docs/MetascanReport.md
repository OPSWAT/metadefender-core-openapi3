

# MetascanReport

Result of the scanning process.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataId** | **String** | Data ID of the requested file |  [optional]
**progressPercentage** | **Integer** | Track analysis progress until reaches 100. |  [optional]
**scanAllResultA** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string |  [optional]
**scanAllResultI** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. |  [optional]
**startTime** | **String** | Timestamp when the scanning process starts. |  [optional]
**totalAvs** | **Integer** | Total number of scanning engines used as part of this analysis. |  [optional]
**totalTime** | **Integer** | Total time elapsed during scan (in milliseconds). |  [optional]
**scanDetails** | [**MetascanReportScanDetails**](MetascanReportScanDetails.md) |  |  [optional]



