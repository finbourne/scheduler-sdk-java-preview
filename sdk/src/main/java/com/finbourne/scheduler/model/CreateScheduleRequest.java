/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.669
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
public class CreateScheduleRequest {
  public static final String SERIALIZED_NAME_SCHEDULE_ID = "scheduleId";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ID)
  private ResourceId scheduleId;

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


  public CreateScheduleRequest scheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId; 
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId;
  }


  public CreateScheduleRequest jobId(ResourceId jobId) {
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


  public CreateScheduleRequest name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * A display name for this Schedule
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A display name for this Schedule")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateScheduleRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * A description of the Schedule
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of the Schedule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CreateScheduleRequest author(String author) {
    this.author = author; 
    return this;
  }

   /**
   * Name of the author of this schedule
   * @return author
  **/
  @ApiModelProperty(value = "Name of the author of this schedule")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public CreateScheduleRequest owner(String owner) {
    this.owner = owner; 
    return this;
  }

   /**
   * Name of owner of this schedule
   * @return owner
  **/
  @ApiModelProperty(value = "Name of owner of this schedule")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  public CreateScheduleRequest arguments(Map<String, String> arguments) {
    this.arguments = arguments; 
    return this;
  }

  public CreateScheduleRequest putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * All arguments specified by this Schedule that will be passed in to the Job
   * @return arguments
  **/
  @ApiModelProperty(value = "All arguments specified by this Schedule that will be passed in to the Job")
  public Map<String, String> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  public CreateScheduleRequest trigger(Trigger trigger) {
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


  public CreateScheduleRequest notifications(List<Notification> notifications) {
    this.notifications = notifications; 
    return this;
  }

  public CreateScheduleRequest addNotificationsItem(Notification notificationsItem) {
   
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Notifications for this Schedule
   * @return notifications
  **/
  @ApiModelProperty(required = true, value = "Notifications for this Schedule")
  public List<Notification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }


  public CreateScheduleRequest enabled(Boolean enabled) {
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
    sb.append("class CreateScheduleRequest {\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
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
