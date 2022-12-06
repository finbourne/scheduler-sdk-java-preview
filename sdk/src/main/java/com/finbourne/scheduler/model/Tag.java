/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.681
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
import java.time.OffsetDateTime;

/**
 * Represents data of an image&#39;s tag
 */
@ApiModel(description = "Represents data of an image's tag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Tag {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PULL_TIME = "pullTime";
  @SerializedName(SERIALIZED_NAME_PULL_TIME)
  private OffsetDateTime pullTime;

  public static final String SERIALIZED_NAME_PUSH_TIME = "pushTime";
  @SerializedName(SERIALIZED_NAME_PUSH_TIME)
  private OffsetDateTime pushTime;

  public static final String SERIALIZED_NAME_SIGNED = "signed";
  @SerializedName(SERIALIZED_NAME_SIGNED)
  private Boolean signed;

  public static final String SERIALIZED_NAME_IMMUTABLE = "immutable";
  @SerializedName(SERIALIZED_NAME_IMMUTABLE)
  private Boolean immutable;


  public Tag name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The name of the tag
   * @return name
  **/
  @ApiModelProperty(value = "The name of the tag")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Tag pullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime; 
    return this;
  }

   /**
   * The latest pull time
   * @return pullTime
  **/
  @ApiModelProperty(value = "The latest pull time")
  public OffsetDateTime getPullTime() {
    return pullTime;
  }

  public void setPullTime(OffsetDateTime pullTime) {
    this.pullTime = pullTime;
  }


  public Tag pushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime; 
    return this;
  }

   /**
   * The date of the tag&#39;s push
   * @return pushTime
  **/
  @ApiModelProperty(value = "The date of the tag's push")
  public OffsetDateTime getPushTime() {
    return pushTime;
  }

  public void setPushTime(OffsetDateTime pushTime) {
    this.pushTime = pushTime;
  }


  public Tag signed(Boolean signed) {
    this.signed = signed; 
    return this;
  }

   /**
   * Indicates whether the tag is signed
   * @return signed
  **/
  @ApiModelProperty(value = "Indicates whether the tag is signed")
  public Boolean getSigned() {
    return signed;
  }

  public void setSigned(Boolean signed) {
    this.signed = signed;
  }


  public Tag immutable(Boolean immutable) {
    this.immutable = immutable; 
    return this;
  }

   /**
   * Indicates whether the tag is immutable
   * @return immutable
  **/
  @ApiModelProperty(value = "Indicates whether the tag is immutable")
  public Boolean getImmutable() {
    return immutable;
  }

  public void setImmutable(Boolean immutable) {
    this.immutable = immutable;
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
    sb.append("class Tag {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pullTime: ").append(toIndentedString(pullTime)).append("\n");
    sb.append("    pushTime: ").append(toIndentedString(pushTime)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
    sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
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
