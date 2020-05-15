cmake_minimum_required (VERSION 2.6)
project (CGenerator)

cmake_policy(SET CMP0063 NEW)

set(CMAKE_C_VISIBILITY_PRESET default)
set(CMAKE_CXX_VISIBILITY_PRESET default)
set(CMAKE_VISIBILITY_INLINES_HIDDEN OFF)
set(CMAKE_BUILD_TYPE Debug)

set(pkgName "metadefender_core")

find_package(CURL 7.58.0 REQUIRED)
if(CURL_FOUND)
	include_directories(${CURL_INCLUDE_DIR})
	set(PLATFORM_LIBRARIES ${PLATFORM_LIBRARIES} ${CURL_LIBRARIES} )
else(CURL_FOUND)
	message(FATAL_ERROR "Could not find the CURL library and development files.")
endif()

set(SRCS
    src/list.c
    src/apiKey.c
    src/apiClient.c
    external/cJSON.c
    model/object.c
    model/_stat_nodes_engines.c
    model/_stat_nodes_issues.c
    model/_stat_nodes_statuses.c
    model/admin_config_session.c
    model/admin_config_update.c
    model/admin_config_update_disabledupdate.c
    model/admin_config_webhook.c
    model/analysis_result.c
    model/analysis_result_process_info.c
    model/analysis_result_process_info_post_processing.c
    model/av_engine_scan_report.c
    model/batch_id.c
    model/batch_response.c
    model/batch_response_batch_files.c
    model/batch_response_batch_files_files_in_batch.c
    model/batch_response_batch_files_process_info.c
    model/batch_response_process_info.c
    model/batch_response_scan_results.c
    model/deep_cdr_details.c
    model/deep_cdr_details_details.c
    model/dlp_response.c
    model/dlp_response_dlp_info.c
    model/dlp_response_dlp_info_hits.c
    model/dlp_response_dlp_info_hits_ccn.c
    model/dlp_response_dlp_info_metadata_removal.c
    model/dlp_response_dlp_info_redact.c
    model/dlp_response_dlp_info_watermark.c
    model/dlp_rule_match_result.c
    model/file_information.c
    model/inline_object.c
    model/inline_object_1.c
    model/inline_object_2.c
    model/inline_response_200.c
    model/inline_response_200_1.c
    model/inline_response_200_10.c
    model/inline_response_200_11.c
    model/inline_response_200_12.c
    model/inline_response_200_13.c
    model/inline_response_200_2.c
    model/inline_response_200_3.c
    model/inline_response_200_4.c
    model/inline_response_200_5.c
    model/inline_response_200_6.c
    model/inline_response_200_7.c
    model/inline_response_200_7_issues.c
    model/inline_response_200_7_issues_general.c
    model/inline_response_200_7_issues_source.c
    model/inline_response_200_8.c
    model/inline_response_200_9.c
    model/inline_response_400.c
    model/inline_response_403.c
    model/inline_response_500.c
    model/license_information.c
    model/metascan_report.c
    model/metascan_report_scan_details.c
    model/new_user_role_request.c
    model/new_user_role_request_rights.c
    model/new_user_role_response.c
    model/new_user_role_response_all_of.c
    model/processing_results_index_enum.c
    model/processing_results_string_enum.c
    model/role_permission_object.c
    model/scan_result_enum.c
    model/skip_list.c
    model/user_login.c
    model/user_request.c
    model/user_request_all_of.c
    model/user_response.c
    model/vulnerability_response.c
    model/vulnerability_response_result.c
    model/vulnerability_response_result_details.c
    model/vulnerability_response_result_details_cvss.c
    model/vulnerability_response_result_detected_product.c
    model/vulnerability_response_result_detected_product_product.c
    model/vulnerability_response_result_detected_product_vendor.c
    model/vulnerability_response_result_detected_product_version_data.c
    model/vulnerability_response_result_vulnerabilites.c
    model/yara_report.c
    model/yara_sources_object.c
    model/yara_sources_object_http_sources.c
    model/yara_sources_object_local_sources.c
    api/AdminAPI.c
    api/AnalysisAPI.c
    api/AuthAPI.c
    api/BatchAPI.c
    api/ConfigAPI.c
    api/EnginesAPI.c
    api/LicenseAPI.c
    api/StatsAPI.c
    api/YaraAPI.c

)

set(HDRS
    include/apiClient.h
    include/list.h
    include/keyValuePair.h
    external/cJSON.h
    model/object.h
    model/_stat_nodes_engines.h
    model/_stat_nodes_issues.h
    model/_stat_nodes_statuses.h
    model/admin_config_session.h
    model/admin_config_update.h
    model/admin_config_update_disabledupdate.h
    model/admin_config_webhook.h
    model/analysis_result.h
    model/analysis_result_process_info.h
    model/analysis_result_process_info_post_processing.h
    model/av_engine_scan_report.h
    model/batch_id.h
    model/batch_response.h
    model/batch_response_batch_files.h
    model/batch_response_batch_files_files_in_batch.h
    model/batch_response_batch_files_process_info.h
    model/batch_response_process_info.h
    model/batch_response_scan_results.h
    model/deep_cdr_details.h
    model/deep_cdr_details_details.h
    model/dlp_response.h
    model/dlp_response_dlp_info.h
    model/dlp_response_dlp_info_hits.h
    model/dlp_response_dlp_info_hits_ccn.h
    model/dlp_response_dlp_info_metadata_removal.h
    model/dlp_response_dlp_info_redact.h
    model/dlp_response_dlp_info_watermark.h
    model/dlp_rule_match_result.h
    model/file_information.h
    model/inline_object.h
    model/inline_object_1.h
    model/inline_object_2.h
    model/inline_response_200.h
    model/inline_response_200_1.h
    model/inline_response_200_10.h
    model/inline_response_200_11.h
    model/inline_response_200_12.h
    model/inline_response_200_13.h
    model/inline_response_200_2.h
    model/inline_response_200_3.h
    model/inline_response_200_4.h
    model/inline_response_200_5.h
    model/inline_response_200_6.h
    model/inline_response_200_7.h
    model/inline_response_200_7_issues.h
    model/inline_response_200_7_issues_general.h
    model/inline_response_200_7_issues_source.h
    model/inline_response_200_8.h
    model/inline_response_200_9.h
    model/inline_response_400.h
    model/inline_response_403.h
    model/inline_response_500.h
    model/license_information.h
    model/metascan_report.h
    model/metascan_report_scan_details.h
    model/new_user_role_request.h
    model/new_user_role_request_rights.h
    model/new_user_role_response.h
    model/new_user_role_response_all_of.h
    model/processing_results_index_enum.h
    model/processing_results_string_enum.h
    model/role_permission_object.h
    model/scan_result_enum.h
    model/skip_list.h
    model/user_login.h
    model/user_request.h
    model/user_request_all_of.h
    model/user_response.h
    model/vulnerability_response.h
    model/vulnerability_response_result.h
    model/vulnerability_response_result_details.h
    model/vulnerability_response_result_details_cvss.h
    model/vulnerability_response_result_detected_product.h
    model/vulnerability_response_result_detected_product_product.h
    model/vulnerability_response_result_detected_product_vendor.h
    model/vulnerability_response_result_detected_product_version_data.h
    model/vulnerability_response_result_vulnerabilites.h
    model/yara_report.h
    model/yara_sources_object.h
    model/yara_sources_object_http_sources.h
    model/yara_sources_object_local_sources.h
    api/AdminAPI.h
    api/AnalysisAPI.h
    api/AuthAPI.h
    api/BatchAPI.h
    api/ConfigAPI.h
    api/EnginesAPI.h
    api/LicenseAPI.h
    api/StatsAPI.h
    api/YaraAPI.h

)

# Add library with project file with projectname as library name
add_library(${pkgName} SHARED ${SRCS} ${HDRS})
# Link dependent libraries
target_link_libraries(${pkgName} ${CURL_LIBRARIES} )
#install library to destination
install(TARGETS ${pkgName} DESTINATION ${CMAKE_INSTALL_PREFIX})

# Setting file variables to null
set(SRCS "")
set(HDRS "")


## This section shows how to use the above compiled libary to compile the source files
## set source files
#set(SRCS
#    unit-tests/manual-AdminAPI.c
#    unit-tests/manual-AnalysisAPI.c
#    unit-tests/manual-AuthAPI.c
#    unit-tests/manual-BatchAPI.c
#    unit-tests/manual-ConfigAPI.c
#    unit-tests/manual-EnginesAPI.c
#    unit-tests/manual-LicenseAPI.c
#    unit-tests/manual-StatsAPI.c
#    unit-tests/manual-YaraAPI.c
#)

##set header files
#set(HDRS
#)

## loop over all files in SRCS variable
#foreach(SOURCE_FILE ${SRCS})
#    # Get only the file name from the file as add_executable doesnot support executable with slash("/")
#    get_filename_component(FILE_NAME_ONLY ${SOURCE_FILE} NAME_WE)
#    # Remove .c from the file name and set it as executable name
#    string( REPLACE ".c" "" EXECUTABLE_FILE ${FILE_NAME_ONLY})
#    # Add executable for every source file in  SRCS
#    add_executable(unit-${EXECUTABLE_FILE} ${SOURCE_FILE})
#    # Link above created libary to executable and dependent libary curl
#    target_link_libraries(unit-${EXECUTABLE_FILE} ${CURL_LIBRARIES} ${pkgName} )
#endforeach(SOURCE_FILE ${SRCS})
