/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.665
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
import java.util.ArrayList;
import java.util.List;

/**
 * Information related to a jobs required access to resources
 */
@ApiModel(description = "Information related to a jobs required access to resources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequiredResources {
  public static final String SERIALIZED_NAME_LUSID_APIS = "lusidApis";
  @SerializedName(SERIALIZED_NAME_LUSID_APIS)
  private List<String> lusidApis = null;

  public static final String SERIALIZED_NAME_LUSID_FILE_SYSTEM = "lusidFileSystem";
  @SerializedName(SERIALIZED_NAME_LUSID_FILE_SYSTEM)
  private List<String> lusidFileSystem = null;

  public static final String SERIALIZED_NAME_EXTERNAL_CALLS = "externalCalls";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CALLS)
  private List<String> externalCalls = null;


  public RequiredResources lusidApis(List<String> lusidApis) {
    this.lusidApis = lusidApis; 
    return this;
  }

  public RequiredResources addLusidApisItem(String lusidApisItem) {
   
    if (this.lusidApis == null) {
      this.lusidApis = new ArrayList<>();
    }
    this.lusidApis.add(lusidApisItem);
    return this;
  }

   /**
   * List of LUSID APIs the job needs access to
   * @return lusidApis
  **/
  @ApiModelProperty(value = "List of LUSID APIs the job needs access to")
  public List<String> getLusidApis() {
    return lusidApis;
  }

  public void setLusidApis(List<String> lusidApis) {
    this.lusidApis = lusidApis;
  }


  public RequiredResources lusidFileSystem(List<String> lusidFileSystem) {
    this.lusidFileSystem = lusidFileSystem; 
    return this;
  }

  public RequiredResources addLusidFileSystemItem(String lusidFileSystemItem) {
   
    if (this.lusidFileSystem == null) {
      this.lusidFileSystem = new ArrayList<>();
    }
    this.lusidFileSystem.add(lusidFileSystemItem);
    return this;
  }

   /**
   * List of S3 bucket or folder names that the job can access
   * @return lusidFileSystem
  **/
  @ApiModelProperty(value = "List of S3 bucket or folder names that the job can access")
  public List<String> getLusidFileSystem() {
    return lusidFileSystem;
  }

  public void setLusidFileSystem(List<String> lusidFileSystem) {
    this.lusidFileSystem = lusidFileSystem;
  }


  public RequiredResources externalCalls(List<String> externalCalls) {
    this.externalCalls = externalCalls; 
    return this;
  }

  public RequiredResources addExternalCallsItem(String externalCallsItem) {
   
    if (this.externalCalls == null) {
      this.externalCalls = new ArrayList<>();
    }
    this.externalCalls.add(externalCallsItem);
    return this;
  }

   /**
   * External URLs that the job can call
   * @return externalCalls
  **/
  @ApiModelProperty(value = "External URLs that the job can call")
  public List<String> getExternalCalls() {
    return externalCalls;
  }

  public void setExternalCalls(List<String> externalCalls) {
    this.externalCalls = externalCalls;
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
    sb.append("class RequiredResources {\n");
    sb.append("    lusidApis: ").append(toIndentedString(lusidApis)).append("\n");
    sb.append("    lusidFileSystem: ").append(toIndentedString(lusidFileSystem)).append("\n");
    sb.append("    externalCalls: ").append(toIndentedString(externalCalls)).append("\n");
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
