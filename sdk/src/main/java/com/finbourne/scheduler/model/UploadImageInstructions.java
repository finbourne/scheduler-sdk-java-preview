/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.691
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
 * UploadImageInstructions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UploadImageInstructions {
  public static final String SERIALIZED_NAME_DOCKER_LOGIN_COMMAND = "dockerLoginCommand";
  @SerializedName(SERIALIZED_NAME_DOCKER_LOGIN_COMMAND)
  private String dockerLoginCommand;

  public static final String SERIALIZED_NAME_BUILD_VERSIONED_DOCKER_IMAGE_COMMAND = "buildVersionedDockerImageCommand";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSIONED_DOCKER_IMAGE_COMMAND)
  private String buildVersionedDockerImageCommand;

  public static final String SERIALIZED_NAME_TAG_VERSIONED_DOCKER_IMAGE_COMMAND = "tagVersionedDockerImageCommand";
  @SerializedName(SERIALIZED_NAME_TAG_VERSIONED_DOCKER_IMAGE_COMMAND)
  private String tagVersionedDockerImageCommand;

  public static final String SERIALIZED_NAME_PUSH_VERSIONED_DOCKER_IMAGE_COMMAND = "pushVersionedDockerImageCommand";
  @SerializedName(SERIALIZED_NAME_PUSH_VERSIONED_DOCKER_IMAGE_COMMAND)
  private String pushVersionedDockerImageCommand;

  public static final String SERIALIZED_NAME_TAG_LATEST_DOCKER_IMAGE_COMMAND = "tagLatestDockerImageCommand";
  @SerializedName(SERIALIZED_NAME_TAG_LATEST_DOCKER_IMAGE_COMMAND)
  private String tagLatestDockerImageCommand;

  public static final String SERIALIZED_NAME_PUSH_LATEST_DOCKER_IMAGE_COMMAND = "pushLatestDockerImageCommand";
  @SerializedName(SERIALIZED_NAME_PUSH_LATEST_DOCKER_IMAGE_COMMAND)
  private String pushLatestDockerImageCommand;

  public static final String SERIALIZED_NAME_EXPIRY_TIME = "expiryTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_TIME)
  private OffsetDateTime expiryTime;


  public UploadImageInstructions dockerLoginCommand(String dockerLoginCommand) {
    this.dockerLoginCommand = dockerLoginCommand; 
    return this;
  }

   /**
   * Get dockerLoginCommand
   * @return dockerLoginCommand
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDockerLoginCommand() {
    return dockerLoginCommand;
  }

  public void setDockerLoginCommand(String dockerLoginCommand) {
    this.dockerLoginCommand = dockerLoginCommand;
  }


  public UploadImageInstructions buildVersionedDockerImageCommand(String buildVersionedDockerImageCommand) {
    this.buildVersionedDockerImageCommand = buildVersionedDockerImageCommand; 
    return this;
  }

   /**
   * Get buildVersionedDockerImageCommand
   * @return buildVersionedDockerImageCommand
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBuildVersionedDockerImageCommand() {
    return buildVersionedDockerImageCommand;
  }

  public void setBuildVersionedDockerImageCommand(String buildVersionedDockerImageCommand) {
    this.buildVersionedDockerImageCommand = buildVersionedDockerImageCommand;
  }


  public UploadImageInstructions tagVersionedDockerImageCommand(String tagVersionedDockerImageCommand) {
    this.tagVersionedDockerImageCommand = tagVersionedDockerImageCommand; 
    return this;
  }

   /**
   * Get tagVersionedDockerImageCommand
   * @return tagVersionedDockerImageCommand
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTagVersionedDockerImageCommand() {
    return tagVersionedDockerImageCommand;
  }

  public void setTagVersionedDockerImageCommand(String tagVersionedDockerImageCommand) {
    this.tagVersionedDockerImageCommand = tagVersionedDockerImageCommand;
  }


  public UploadImageInstructions pushVersionedDockerImageCommand(String pushVersionedDockerImageCommand) {
    this.pushVersionedDockerImageCommand = pushVersionedDockerImageCommand; 
    return this;
  }

   /**
   * Get pushVersionedDockerImageCommand
   * @return pushVersionedDockerImageCommand
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPushVersionedDockerImageCommand() {
    return pushVersionedDockerImageCommand;
  }

  public void setPushVersionedDockerImageCommand(String pushVersionedDockerImageCommand) {
    this.pushVersionedDockerImageCommand = pushVersionedDockerImageCommand;
  }


  public UploadImageInstructions tagLatestDockerImageCommand(String tagLatestDockerImageCommand) {
    this.tagLatestDockerImageCommand = tagLatestDockerImageCommand; 
    return this;
  }

   /**
   * Get tagLatestDockerImageCommand
   * @return tagLatestDockerImageCommand
  **/
  @ApiModelProperty(value = "")
  public String getTagLatestDockerImageCommand() {
    return tagLatestDockerImageCommand;
  }

  public void setTagLatestDockerImageCommand(String tagLatestDockerImageCommand) {
    this.tagLatestDockerImageCommand = tagLatestDockerImageCommand;
  }


  public UploadImageInstructions pushLatestDockerImageCommand(String pushLatestDockerImageCommand) {
    this.pushLatestDockerImageCommand = pushLatestDockerImageCommand; 
    return this;
  }

   /**
   * Get pushLatestDockerImageCommand
   * @return pushLatestDockerImageCommand
  **/
  @ApiModelProperty(value = "")
  public String getPushLatestDockerImageCommand() {
    return pushLatestDockerImageCommand;
  }

  public void setPushLatestDockerImageCommand(String pushLatestDockerImageCommand) {
    this.pushLatestDockerImageCommand = pushLatestDockerImageCommand;
  }


  public UploadImageInstructions expiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime; 
    return this;
  }

   /**
   * Get expiryTime
   * @return expiryTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
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
    sb.append("class UploadImageInstructions {\n");
    sb.append("    dockerLoginCommand: ").append(toIndentedString(dockerLoginCommand)).append("\n");
    sb.append("    buildVersionedDockerImageCommand: ").append(toIndentedString(buildVersionedDockerImageCommand)).append("\n");
    sb.append("    tagVersionedDockerImageCommand: ").append(toIndentedString(tagVersionedDockerImageCommand)).append("\n");
    sb.append("    pushVersionedDockerImageCommand: ").append(toIndentedString(pushVersionedDockerImageCommand)).append("\n");
    sb.append("    tagLatestDockerImageCommand: ").append(toIndentedString(tagLatestDockerImageCommand)).append("\n");
    sb.append("    pushLatestDockerImageCommand: ").append(toIndentedString(pushLatestDockerImageCommand)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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
