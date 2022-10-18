/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.640
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
 * Notification type
 */
@ApiModel(description = "Notification type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Notification {
  public static final String SERIALIZED_NAME_FIRE_ON = "fireOn";
  @SerializedName(SERIALIZED_NAME_FIRE_ON)
  private String fireOn;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private String transport;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private List<String> destination = null;


   /**
   * Condition for the notification
   * @return fireOn
  **/
  @ApiModelProperty(value = "Condition for the notification")
  public String getFireOn() {
    return fireOn;
  }



  public Notification transport(String transport) {
    this.transport = transport; 
    return this;
  }

   /**
   * The type of the notification
   * @return transport
  **/
  @ApiModelProperty(value = "The type of the notification")
  public String getTransport() {
    return transport;
  }

  public void setTransport(String transport) {
    this.transport = transport;
  }


  public Notification destination(List<String> destination) {
    this.destination = destination; 
    return this;
  }

  public Notification addDestinationItem(String destinationItem) {
   
    if (this.destination == null) {
      this.destination = new ArrayList<>();
    }
    this.destination.add(destinationItem);
    return this;
  }

   /**
   * Where the notification should be sent
   * @return destination
  **/
  @ApiModelProperty(value = "Where the notification should be sent")
  public List<String> getDestination() {
    return destination;
  }

  public void setDestination(List<String> destination) {
    this.destination = destination;
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
    sb.append("class Notification {\n");
    sb.append("    fireOn: ").append(toIndentedString(fireOn)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
