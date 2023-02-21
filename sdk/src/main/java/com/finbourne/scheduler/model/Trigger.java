/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.764
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.TimeTrigger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Holds different kinds of triggers  A schedule may only have one type of trigger
 */
@ApiModel(description = "Holds different kinds of triggers  A schedule may only have one type of trigger")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Trigger {
  public static final String SERIALIZED_NAME_TIME_TRIGGER = "timeTrigger";
  @SerializedName(SERIALIZED_NAME_TIME_TRIGGER)
  private TimeTrigger timeTrigger;


  public Trigger timeTrigger(TimeTrigger timeTrigger) {
    this.timeTrigger = timeTrigger; 
    return this;
  }

   /**
   * Get timeTrigger
   * @return timeTrigger
  **/
  @ApiModelProperty(value = "")
  public TimeTrigger getTimeTrigger() {
    return timeTrigger;
  }

  public void setTimeTrigger(TimeTrigger timeTrigger) {
    this.timeTrigger = timeTrigger;
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
    sb.append("class Trigger {\n");
    sb.append("    timeTrigger: ").append(toIndentedString(timeTrigger)).append("\n");
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
