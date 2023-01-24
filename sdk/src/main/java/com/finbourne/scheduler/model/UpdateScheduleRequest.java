/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.739
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.Notification;
import com.finbourne.scheduler.model.ResourceId;
import com.finbourne.scheduler.model.Trigger;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a schedule definition
 */
@ApiModel(description = "Create a schedule definition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateScheduleRequest {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private ResourceId jobId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Map<String, String> arguments = null;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private Trigger trigger;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<Notification> notifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;


  public UpdateScheduleRequest jobId(ResourceId jobId) {
    this.jobId = jobId; 
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getJobId() {
    return jobId;
  }

  public void setJobId(ResourceId jobId) {
    this.jobId = jobId;
  }


  public UpdateScheduleRequest name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The updated name of the schedule
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The updated name of the schedule")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdateScheduleRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The updated description of the schedule
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The updated description of the schedule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateScheduleRequest author(String author) {
    this.author = author; 
    return this;
  }

   /**
   * The updated author of the schedule
   * @return author
  **/
  @ApiModelProperty(value = "The updated author of the schedule")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public UpdateScheduleRequest owner(String owner) {
    this.owner = owner; 
    return this;
  }

   /**
   * The update owner of the schedule
   * @return owner
  **/
  @ApiModelProperty(value = "The update owner of the schedule")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public UpdateScheduleRequest arguments(Map<String, String> arguments) {
    this.arguments = arguments; 
    return this;
  }

  public UpdateScheduleRequest putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * Updated arguments to be passed to the job  Note: The new arguments will completely replace old arguments
   * @return arguments
  **/
  @ApiModelProperty(value = "Updated arguments to be passed to the job  Note: The new arguments will completely replace old arguments")
  public Map<String, String> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  public UpdateScheduleRequest trigger(Trigger trigger) {
    this.trigger = trigger; 
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @ApiModelProperty(value = "")
  public Trigger getTrigger() {
    return trigger;
  }

  public void setTrigger(Trigger trigger) {
    this.trigger = trigger;
  }


  public UpdateScheduleRequest notifications(List<Notification> notifications) {
    this.notifications = notifications; 
    return this;
  }

  public UpdateScheduleRequest addNotificationsItem(Notification notificationsItem) {
   
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Updated notifications for this schedule
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "Updated notifications for this schedule")
  public List<Notification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }


  public UpdateScheduleRequest enabled(Boolean enabled) {
    this.enabled = enabled; 
    return this;
  }

   /**
   * Specify whether schedule is enabled or not  Defaults to true
   * @return enabled
  **/
  @ApiModelProperty(value = "Specify whether schedule is enabled or not  Defaults to true")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
    sb.append("class UpdateScheduleRequest {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
