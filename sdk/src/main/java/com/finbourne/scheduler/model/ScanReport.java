/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.706
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.ScanSummary;
import com.finbourne.scheduler.model.Vulnerability;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the details of a security scan of an image
 */
@ApiModel(description = "Represents the details of a security scan of an image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScanReport {
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_SCAN_DURATION = "scanDuration";
  @SerializedName(SERIALIZED_NAME_SCAN_DURATION)
  private Integer scanDuration;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private ScanSummary summary;

  public static final String SERIALIZED_NAME_VULNERABILITIES = "vulnerabilities";
  @SerializedName(SERIALIZED_NAME_VULNERABILITIES)
  private List<Vulnerability> vulnerabilities = null;


  public ScanReport severity(String severity) {
    this.severity = severity; 
    return this;
  }

   /**
   * The overall severity. For example : \&quot;High\&quot; or \&quot;None\&quot;
   * @return severity
  **/
  @ApiModelProperty(value = "The overall severity. For example : \"High\" or \"None\"")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public ScanReport status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * The status of the report
   * @return status
  **/
  @ApiModelProperty(value = "The status of the report")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ScanReport startTime(OffsetDateTime startTime) {
    this.startTime = startTime; 
    return this;
  }

   /**
   * The start time of the scanning process
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time of the scanning process")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ScanReport endTime(OffsetDateTime endTime) {
    this.endTime = endTime; 
    return this;
  }

   /**
   * The end time of the scanning process
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time of the scanning process")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ScanReport scanDuration(Integer scanDuration) {
    this.scanDuration = scanDuration; 
    return this;
  }

   /**
   * The duration of the scan in seconds
   * @return scanDuration
  **/
  @ApiModelProperty(value = "The duration of the scan in seconds")
  public Integer getScanDuration() {
    return scanDuration;
  }

  public void setScanDuration(Integer scanDuration) {
    this.scanDuration = scanDuration;
  }


  public ScanReport summary(ScanSummary summary) {
    this.summary = summary; 
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public ScanSummary getSummary() {
    return summary;
  }

  public void setSummary(ScanSummary summary) {
    this.summary = summary;
  }


  public ScanReport vulnerabilities(List<Vulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities; 
    return this;
  }

  public ScanReport addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
   
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    return this;
  }

   /**
   * List of Finbourne.Scheduler.WebApi.Dtos.Harbor.Vulnerability
   * @return vulnerabilities
  **/
  @ApiModelProperty(value = "List of Finbourne.Scheduler.WebApi.Dtos.Harbor.Vulnerability")
  public List<Vulnerability> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanReport {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    scanDuration: ").append(toIndentedString(scanDuration)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
