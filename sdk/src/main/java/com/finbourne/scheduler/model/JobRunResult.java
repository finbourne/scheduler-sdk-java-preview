/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.686
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represent a specific job&#39;s run
 */
@ApiModel(description = "Represent a specific job's run")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JobRunResult {
  public static final String SERIALIZED_NAME_CONSOLE_OUTPUT_URL = "consoleOutputUrl";
  @SerializedName(SERIALIZED_NAME_CONSOLE_OUTPUT_URL)
  private String consoleOutputUrl;

  public static final String SERIALIZED_NAME_RUN_ID = "runId";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private ResourceId jobId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INITIALISED_DATE = "initialisedDate";
  @SerializedName(SERIALIZED_NAME_INITIALISED_DATE)
  private OffsetDateTime initialisedDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Map<String, String> arguments = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_VARIABLES = "environmentVariables";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_VARIABLES)
  private Map<String, String> environmentVariables = null;

  public static final String SERIALIZED_NAME_JOB_STATUS = "jobStatus";
  @SerializedName(SERIALIZED_NAME_JOB_STATUS)
  private String jobStatus;

  public static final String SERIALIZED_NAME_JOB_RESULT = "jobResult";
  @SerializedName(SERIALIZED_NAME_JOB_RESULT)
  private String jobResult;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEDULE_ID = "scheduleId";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_ID)
  private ResourceId scheduleId;

  public static final String SERIALIZED_NAME_RESULT_URL = "resultUrl";
  @SerializedName(SERIALIZED_NAME_RESULT_URL)
  private URI resultUrl;

  public static final String SERIALIZED_NAME_MANUALLY_TRIGGERED_BY = "manuallyTriggeredBy";
  @SerializedName(SERIALIZED_NAME_MANUALLY_TRIGGERED_BY)
  private String manuallyTriggeredBy;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public JobRunResult consoleOutputUrl(String consoleOutputUrl) {
    this.consoleOutputUrl = consoleOutputUrl; 
    return this;
  }

   /**
   * The URL for the console output of the job run
   * @return consoleOutputUrl
  **/
  @ApiModelProperty(value = "The URL for the console output of the job run")
  public String getConsoleOutputUrl() {
    return consoleOutputUrl;
  }

  public void setConsoleOutputUrl(String consoleOutputUrl) {
    this.consoleOutputUrl = consoleOutputUrl;
  }


  public JobRunResult runId(String runId) {
    this.runId = runId; 
    return this;
  }

   /**
   * Unique id of the job run
   * @return runId
  **/
  @ApiModelProperty(value = "Unique id of the job run")
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }


  public JobRunResult jobId(ResourceId jobId) {
    this.jobId = jobId; 
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getJobId() {
    return jobId;
  }

  public void setJobId(ResourceId jobId) {
    this.jobId = jobId;
  }


  public JobRunResult name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the job
   * @return name
  **/
  @ApiModelProperty(value = "Name of the job")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public JobRunResult initialisedDate(OffsetDateTime initialisedDate) {
    this.initialisedDate = initialisedDate; 
    return this;
  }

   /**
   * The date when the job was initialised
   * @return initialisedDate
  **/
  @ApiModelProperty(value = "The date when the job was initialised")
  public OffsetDateTime getInitialisedDate() {
    return initialisedDate;
  }

  public void setInitialisedDate(OffsetDateTime initialisedDate) {
    this.initialisedDate = initialisedDate;
  }


  public JobRunResult startDate(OffsetDateTime startDate) {
    this.startDate = startDate; 
    return this;
  }

   /**
   * The date when the job started running in Scheduler
   * @return startDate
  **/
  @ApiModelProperty(value = "The date when the job started running in Scheduler")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public JobRunResult endDate(OffsetDateTime endDate) {
    this.endDate = endDate; 
    return this;
  }

   /**
   * End date of the job  Defaults to null if the job has not started or not completed yet  If value is null and job has not started, status will be &#x60;Pending&#x60;  If value is null and job has not completed, but is running, status will be &#x60;Running&#x60;
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the job  Defaults to null if the job has not started or not completed yet  If value is null and job has not started, status will be `Pending`  If value is null and job has not completed, but is running, status will be `Running`")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public JobRunResult arguments(Map<String, String> arguments) {
    this.arguments = arguments; 
    return this;
  }

  public JobRunResult putArgumentsItem(String key, String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

   /**
   * All arguments used in in this job run
   * @return arguments
  **/
  @ApiModelProperty(value = "All arguments used in in this job run")
  public Map<String, String> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, String> arguments) {
    this.arguments = arguments;
  }


  public JobRunResult environmentVariables(Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables; 
    return this;
  }

  public JobRunResult putEnvironmentVariablesItem(String key, String environmentVariablesItem) {
    if (this.environmentVariables == null) {
      this.environmentVariables = new HashMap<>();
    }
    this.environmentVariables.put(key, environmentVariablesItem);
    return this;
  }

   /**
   * All environment variables used in this job run
   * @return environmentVariables
  **/
  @ApiModelProperty(value = "All environment variables used in this job run")
  public Map<String, String> getEnvironmentVariables() {
    return environmentVariables;
  }

  public void setEnvironmentVariables(Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
  }


  public JobRunResult jobStatus(String jobStatus) {
    this.jobStatus = jobStatus; 
    return this;
  }

   /**
   * Current job status
   * @return jobStatus
  **/
  @ApiModelProperty(value = "Current job status")
  public String getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(String jobStatus) {
    this.jobStatus = jobStatus;
  }


   /**
   * Description of the job result
   * @return jobResult
  **/
  @ApiModelProperty(value = "Description of the job result")
  public String getJobResult() {
    return jobResult;
  }



  public JobRunResult description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Description of the job
   * @return description
  **/
  @ApiModelProperty(value = "Description of the job")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public JobRunResult scheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId; 
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(ResourceId scheduleId) {
    this.scheduleId = scheduleId;
  }


  public JobRunResult resultUrl(URI resultUrl) {
    this.resultUrl = resultUrl; 
    return this;
  }

   /**
   * URI to results. Defaults to null if not available
   * @return resultUrl
  **/
  @ApiModelProperty(value = "URI to results. Defaults to null if not available")
  public URI getResultUrl() {
    return resultUrl;
  }

  public void setResultUrl(URI resultUrl) {
    this.resultUrl = resultUrl;
  }


  public JobRunResult manuallyTriggeredBy(String manuallyTriggeredBy) {
    this.manuallyTriggeredBy = manuallyTriggeredBy; 
    return this;
  }

   /**
   * UserId of the user that triggered the job.  Defaults to null if job was ran on a Schedule
   * @return manuallyTriggeredBy
  **/
  @ApiModelProperty(value = "UserId of the user that triggered the job.  Defaults to null if job was ran on a Schedule")
  public String getManuallyTriggeredBy() {
    return manuallyTriggeredBy;
  }

  public void setManuallyTriggeredBy(String manuallyTriggeredBy) {
    this.manuallyTriggeredBy = manuallyTriggeredBy;
  }


  public JobRunResult command(String command) {
    this.command = command; 
    return this;
  }

   /**
   * The command used to run the job
   * @return command
  **/
  @ApiModelProperty(value = "The command used to run the job")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public JobRunResult message(String message) {
    this.message = message; 
    return this;
  }

   /**
   * Output message generated by the job runner  Value will be null when the job is in a &#x60;Running&#x60; or &#x60;Pending&#x60; status
   * @return message
  **/
  @ApiModelProperty(value = "Output message generated by the job runner  Value will be null when the job is in a `Running` or `Pending` status")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
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
    sb.append("class JobRunResult {\n");
    sb.append("    consoleOutputUrl: ").append(toIndentedString(consoleOutputUrl)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    initialisedDate: ").append(toIndentedString(initialisedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    environmentVariables: ").append(toIndentedString(environmentVariables)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    resultUrl: ").append(toIndentedString(resultUrl)).append("\n");
    sb.append("    manuallyTriggeredBy: ").append(toIndentedString(manuallyTriggeredBy)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
