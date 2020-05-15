package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible overall and per engine analysis results:   | scan_result_i | scan_result_a                |   |---------------|------------------------------|   | 0             | No Threat Detected           |   | 1             | Infected                     |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Cleaned / Deleted            |   | 7             | Scan Skipped - Whitelisted   |   | 8             | Scan Skipped - Blacklisted   |   | 9             | Exceeded Archive Depth       |   | 10            | Not Scanned                  |   | 12            | Encrypted Archive            |   | 13            | Exceeded Archive Size        |   | 14            | Exceeded Archive File Number |   | 15            | Password Protected Document  |   | 16            | Exceeded Archive Timeout     |   | 17            | File type Mismatch           |   | 18            | Potentially Vulnerable File  |   | 19            | Canceled                     |   | 20            | Sensitive data found         |   | 21            | Yara Rule Matched            |   | 22            | Potentially Unwanted Program |   | 23            | Unsupported file type        |   | 255           | In Progress                  | 
 */
public enum ProcessingResultsIndexEnum {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_10(10),
  
  NUMBER_12(12),
  
  NUMBER_13(13),
  
  NUMBER_14(14),
  
  NUMBER_15(15),
  
  NUMBER_16(16),
  
  NUMBER_17(17),
  
  NUMBER_18(18),
  
  NUMBER_19(19),
  
  NUMBER_20(20),
  
  NUMBER_21(21),
  
  NUMBER_22(22),
  
  NUMBER_23(23),
  
  NUMBER_255(255);

  private Integer value;

  ProcessingResultsIndexEnum(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProcessingResultsIndexEnum fromValue(Integer value) {
    for (ProcessingResultsIndexEnum b : ProcessingResultsIndexEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
  
}

