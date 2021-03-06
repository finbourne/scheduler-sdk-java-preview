/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.520
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Trigger based on activity from an S3 bucket
 */
@ApiModel(description = "Trigger based on activity from an S3 bucket")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BucketWatcherTrigger {
  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String file;

  public static final String SERIALIZED_NAME_POLL_PERIOD = "pollPeriod";
  @SerializedName(SERIALIZED_NAME_POLL_PERIOD)
  private Integer pollPeriod;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;


  public BucketWatcherTrigger file(String file) {
    this.file = file; 
    return this;
  }

   /**
   * The file name or partial path of the file that will trigger the job  E.G: &#x60;fileName&#x60; or &#x60;folder1/folder2/someFileName&#x60;
   * @return file
  **/
  @ApiModelProperty(value = "The file name or partial path of the file that will trigger the job  E.G: `fileName` or `folder1/folder2/someFileName`")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }


  public BucketWatcherTrigger pollPeriod(Integer pollPeriod) {
    this.pollPeriod = pollPeriod; 
    return this;
  }

   /**
   * The frequency, in seconds, at which to poll the S3 bucket for the file.  Defaults to 5.
   * minimum: 1
   * maximum: 86400
   * @return pollPeriod
  **/
  @ApiModelProperty(value = "The frequency, in seconds, at which to poll the S3 bucket for the file.  Defaults to 5.")
  public Integer getPollPeriod() {
    return pollPeriod;
  }

  public void setPollPeriod(Integer pollPeriod) {
    this.pollPeriod = pollPeriod;
  }


  public BucketWatcherTrigger bucket(String bucket) {
    this.bucket = bucket; 
    return this;
  }

   /**
   * The S3 bucket where to watch for the trigger file
   * @return bucket
  **/
  @ApiModelProperty(value = "The S3 bucket where to watch for the trigger file")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
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
    sb.append("class BucketWatcherTrigger {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    pollPeriod: ").append(toIndentedString(pollPeriod)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
