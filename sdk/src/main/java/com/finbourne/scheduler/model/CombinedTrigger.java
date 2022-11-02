/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.651
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.DaysOfWeek;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A file based triggered constrained by a time window  Supports the ability to specify multiple trigger files,  to choose whether a schedule is triggered for every file or first file,  has the option to trigger the schedule at the end of the time window, if any or no files arrived
 */
@ApiModel(description = "A file based triggered constrained by a time window  Supports the ability to specify multiple trigger files,  to choose whether a schedule is triggered for every file or first file,  has the option to trigger the schedule at the end of the time window, if any or no files arrived")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CombinedTrigger {
  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String file;

  public static final String SERIALIZED_NAME_POLL_PERIOD = "pollPeriod";
  @SerializedName(SERIALIZED_NAME_POLL_PERIOD)
  private Integer pollPeriod;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_TRIGGER_EVERY_FILE = "triggerEveryFile";
  @SerializedName(SERIALIZED_NAME_TRIGGER_EVERY_FILE)
  private Boolean triggerEveryFile;

  public static final String SERIALIZED_NAME_END_OF_TIME_WINDOW_OPTION = "endOfTimeWindowOption";
  @SerializedName(SERIALIZED_NAME_END_OF_TIME_WINDOW_OPTION)
  private String endOfTimeWindowOption;

  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "daysAvailable";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private DaysOfWeek daysAvailable;


  public CombinedTrigger startTime(String startTime) {
    this.startTime = startTime; 
    return this;
  }

   /**
   * The start of the time window when a file can arrive to trigger the schedule  Cannot exceed 24 hours
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "The start of the time window when a file can arrive to trigger the schedule  Cannot exceed 24 hours")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public CombinedTrigger endTime(String endTime) {
    this.endTime = endTime; 
    return this;
  }

   /**
   * The end of the time window when a file can arrive to trigger the schedule  Must be after the Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime and cannot exceed 24 hours
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "The end of the time window when a file can arrive to trigger the schedule  Must be after the Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime and cannot exceed 24 hours")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public CombinedTrigger file(String file) {
    this.file = file; 
    return this;
  }

   /**
   * The file name or partial path of the file that will trigger the job  E.G: &#x60;fileName&#x60; or &#x60;folder1/folder2/someFileName&#x60;
   * @return file
  **/
  @ApiModelProperty(required = true, value = "The file name or partial path of the file that will trigger the job  E.G: `fileName` or `folder1/folder2/someFileName`")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }


  public CombinedTrigger pollPeriod(Integer pollPeriod) {
    this.pollPeriod = pollPeriod; 
    return this;
  }

   /**
   * The frequency, in seconds, at which to poll the S3 bucket for the file.  Must be lower than the difference in seconds between Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndTime and Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime  Defaults to 5.
   * minimum: 1
   * maximum: 86400
   * @return pollPeriod
  **/
  @ApiModelProperty(value = "The frequency, in seconds, at which to poll the S3 bucket for the file.  Must be lower than the difference in seconds between Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndTime and Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.StartTime  Defaults to 5.")
  public Integer getPollPeriod() {
    return pollPeriod;
  }

  public void setPollPeriod(Integer pollPeriod) {
    this.pollPeriod = pollPeriod;
  }


  public CombinedTrigger bucket(String bucket) {
    this.bucket = bucket; 
    return this;
  }

   /**
   * The S3 bucket where to watch for the trigger file
   * @return bucket
  **/
  @ApiModelProperty(required = true, value = "The S3 bucket where to watch for the trigger file")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public CombinedTrigger triggerEveryFile(Boolean triggerEveryFile) {
    this.triggerEveryFile = triggerEveryFile; 
    return this;
  }

   /**
   * Specify whether to trigger every time the file is updated
   * @return triggerEveryFile
  **/
  @ApiModelProperty(value = "Specify whether to trigger every time the file is updated")
  public Boolean getTriggerEveryFile() {
    return triggerEveryFile;
  }

  public void setTriggerEveryFile(Boolean triggerEveryFile) {
    this.triggerEveryFile = triggerEveryFile;
  }


  public CombinedTrigger endOfTimeWindowOption(String endOfTimeWindowOption) {
    this.endOfTimeWindowOption = endOfTimeWindowOption; 
    return this;
  }

   /**
   * Specifies the behaviour of the trigger when the time window ends  Available options are \&quot;Always\&quot;, \&quot;NoFile\&quot;, \&quot;FileReceived\&quot;, \&quot;Never\&quot;  Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndOfTimeWindowOption
   * @return endOfTimeWindowOption
  **/
  @ApiModelProperty(required = true, value = "Specifies the behaviour of the trigger when the time window ends  Available options are \"Always\", \"NoFile\", \"FileReceived\", \"Never\"  Finbourne.Scheduler.WebApi.Dtos.CombinedTrigger.EndOfTimeWindowOption")
  public String getEndOfTimeWindowOption() {
    return endOfTimeWindowOption;
  }

  public void setEndOfTimeWindowOption(String endOfTimeWindowOption) {
    this.endOfTimeWindowOption = endOfTimeWindowOption;
  }


  public CombinedTrigger daysAvailable(DaysOfWeek daysAvailable) {
    this.daysAvailable = daysAvailable; 
    return this;
  }

   /**
   * Get daysAvailable
   * @return daysAvailable
  **/
  @ApiModelProperty(required = true, value = "")
  public DaysOfWeek getDaysAvailable() {
    return daysAvailable;
  }

  public void setDaysAvailable(DaysOfWeek daysAvailable) {
    this.daysAvailable = daysAvailable;
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
    sb.append("class CombinedTrigger {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    pollPeriod: ").append(toIndentedString(pollPeriod)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    triggerEveryFile: ").append(toIndentedString(triggerEveryFile)).append("\n");
    sb.append("    endOfTimeWindowOption: ").append(toIndentedString(endOfTimeWindowOption)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
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
