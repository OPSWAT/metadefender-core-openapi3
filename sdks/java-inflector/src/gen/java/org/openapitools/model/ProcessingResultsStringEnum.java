package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * | scan_result_a                | scan_result_i | |------------------------------|---------------| | No Threat Detected           | 0             | | Infected                     | 1             | | Suspicious                   | 2             | | Failed                       | 3             | | Cleaned / Deleted            | 4             | | Scan Skipped - Whitelisted   | 7             | | Scan Skipped - Blacklisted   | 8             | | Exceeded Archive Depth       | 9             | | Not Scanned                  | 10            | | Encrypted Archive            | 12            | | Exceeded Archive Size        | 13            | | Exceeded Archive File Number | 14            | | Password Protected Document  | 15            | | Exceeded Archive Timeout     | 16            | | File type Mismatch           | 17            | | Potentially Vulnerable File  | 18            | | Canceled                     | 19            | | Sensitive data found         | 20            | | Yara Rule Matched            | 21            | | Potentially Unwanted Program | 22            | | Unsupported file type        | 23            | | In Progress                  | 255           | 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * | scan_result_a                | scan_result_i | |------------------------------|---------------| | No Threat Detected           | 0             | | Infected                     | 1             | | Suspicious                   | 2             | | Failed                       | 3             | | Cleaned / Deleted            | 4             | | Scan Skipped - Whitelisted   | 7             | | Scan Skipped - Blacklisted   | 8             | | Exceeded Archive Depth       | 9             | | Not Scanned                  | 10            | | Encrypted Archive            | 12            | | Exceeded Archive Size        | 13            | | Exceeded Archive File Number | 14            | | Password Protected Document  | 15            | | Exceeded Archive Timeout     | 16            | | File type Mismatch           | 17            | | Potentially Vulnerable File  | 18            | | Canceled                     | 19            | | Sensitive data found         | 20            | | Yara Rule Matched            | 21            | | Potentially Unwanted Program | 22            | | Unsupported file type        | 23            | | In Progress                  | 255           | 
 */
public enum ProcessingResultsStringEnum {
  
  THREAT_DETECTED("Threat Detected"),
  
  INFECTED("Infected"),
  
  SUSPICIOUS("Suspicious"),
  
  FAILED("Failed"),
  
  CLEANED_DELETED("Cleaned / Deleted"),
  
  SCAN_SKIPPED_WHITELISTED("Scan Skipped - Whitelisted"),
  
  SCAN_SKIPPED_BLACKLISTED("Scan Skipped - Blacklisted"),
  
  EXCEEDED_ARCHIVE_DEPTH("Exceeded Archive Depth"),
  
  NOT_SCANNED("Not Scanned"),
  
  ENCRYPTED_ARCHIVE("Encrypted Archive"),
  
  EXCEEDED_ARCHIVE_SIZE("Exceeded Archive Size"),
  
  EXCEEDED_ARCHIVE_FILE_NUMBER("Exceeded Archive File Number"),
  
  PASSWORD_PROTECTED_DOCUMENT("Password Protected Document"),
  
  EXCEEDED_ARCHIVE_TIMEOUT("Exceeded Archive Timeout"),
  
  FILE_TYPE_MISMATCH("File type Mismatch"),
  
  POTENTIALLY_VULNERABLE_FILE("Potentially Vulnerable File"),
  
  CANCELED("Canceled"),
  
  SENSITIVE_DATA_FOUND("Sensitive data found"),
  
  YARA_RULE_MATCHED("Yara Rule Matched"),
  
  POTENTIALLY_UNWANTED_PROGRAM("Potentially Unwanted Program"),
  
  UNSUPPORTED_FILE_TYPE("Unsupported file type"),
  
  IN_PROGRESS("In Progress");

  private String value;

  ProcessingResultsStringEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProcessingResultsStringEnum fromValue(String text) {
    for (ProcessingResultsStringEnum b : ProcessingResultsStringEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


