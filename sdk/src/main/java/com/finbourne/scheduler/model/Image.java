/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.765
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.ScanReport;
import com.finbourne.scheduler.model.Tag;
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
 * Represents the metadata of an image
 */
@ApiModel(description = "Represents the metadata of an image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Image {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PUSH_TIME = "pushTime";
  @SerializedName(SERIALIZED_NAME_PUSH_TIME)
  private OffsetDateTime pushTime;

  public static final String SERIALIZED_NAME_PULL_TIME = "pullTime";
  @SerializedName(SERIALIZED_NAME_PULL_TIME)
  private OffsetDateTime pullTime;

  public static final String SERIALIZED_NAME_DIGEST = "digest";
  @SerializedName(SERIALIZED_NAME_DIGEST)
  private String digest;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;

  public static final String SERIALIZED_NAME_SCAN_REPORT = "scanReport";
  @SerializedName(SERIALIZED_NAME_SCAN_REPORT)
  private ScanReport scanReport;


  public Image name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the image
   * @return name
  **/
  @ApiModelProperty(value = "Name of the image")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Image pushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime; 
    return this;
  }

   /**
   * The push time of the image
   * @return pushTime
  **/
  @ApiModelProperty(value = "The push time of the image")
  public OffsetDateTime getPushTime() {
    return pushTime;
  }

  public void setPushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime;
  }


  public Image pullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime; 
    return this;
  }

   /**
   * The latest pull time of the image
   * @return pullTime
  **/
  @ApiModelProperty(value = "The latest pull time of the image")
  public OffsetDateTime getPullTime() {
    return pullTime;
  }

  public void setPullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime;
  }


  public Image digest(String digest) {
    this.digest = digest; 
    return this;
  }

   /**
   * The digest of the image
   * @return digest
  **/
  @ApiModelProperty(value = "The digest of the image")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }


  public Image size(Long size) {
    this.size = size; 
    return this;
  }

   /**
   * The size of the image (in bytes)
   * @return size
  **/
  @ApiModelProperty(value = "The size of the image (in bytes)")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  public Image tags(List<Tag> tags) {
    this.tags = tags; 
    return this;
  }

  public Image addTagsItem(Tag tagsItem) {
   
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags of the image
   * @return tags
  **/
  @ApiModelProperty(value = "The tags of the image")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public Image scanReport(ScanReport scanReport) {
    this.scanReport = scanReport; 
    return this;
  }

   /**
   * Get scanReport
   * @return scanReport
  **/
  @ApiModelProperty(value = "")
  public ScanReport getScanReport() {
    return scanReport;
  }

  public void setScanReport(ScanReport scanReport) {
    this.scanReport = scanReport;
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
    sb.append("class Image {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
    sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    scanReport: ").append(toIndentedString(scanReport)).append("\n");
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
