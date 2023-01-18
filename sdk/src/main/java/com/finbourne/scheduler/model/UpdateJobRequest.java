/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.724
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.ArgumentDefinition;
import com.finbourne.scheduler.model.RequiredResources;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request to update a job
 */
@ApiModel(description = "A request to update a job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateJobRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "imageName";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_IMAGE_TAG = "imageTag";
  @SerializedName(SERIALIZED_NAME_IMAGE_TAG)
  private String imageTag;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public static final String SERIALIZED_NAME_MIN_CPU = "minCpu";
  @SerializedName(SERIALIZED_NAME_MIN_CPU)
  private String minCpu;

  public static final String SERIALIZED_NAME_MAX_CPU = "maxCpu";
  @SerializedName(SERIALIZED_NAME_MAX_CPU)
  private String maxCpu;

  public static final String SERIALIZED_NAME_MIN_MEMORY = "minMemory";
  @SerializedName(SERIALIZED_NAME_MIN_MEMORY)
  private String minMemory;

  public static final String SERIALIZED_NAME_MAX_MEMORY = "maxMemory";
  @SerializedName(SERIALIZED_NAME_MAX_MEMORY)
  private String maxMemory;

  public static final String SERIALIZED_NAME_ARGUMENT_DEFINITIONS = "argumentDefinitions";
  @SerializedName(SERIALIZED_NAME_ARGUMENT_DEFINITIONS)
  private Map<String, ArgumentDefinition> argumentDefinitions = new HashMap<>();

  public static final String SERIALIZED_NAME_COMMAND_LINE_ARGUMENT_SEPARATOR = "commandLineArgumentSeparator";
  @SerializedName(SERIALIZED_NAME_COMMAND_LINE_ARGUMENT_SEPARATOR)
  private String commandLineArgumentSeparator;

  public static final String SERIALIZED_NAME_REQUIRED_RESOURCES = "requiredResources";
  @SerializedName(SERIALIZED_NAME_REQUIRED_RESOURCES)
  private RequiredResources requiredResources;


  public UpdateJobRequest name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the job
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the job")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdateJobRequest author(String author) {
    this.author = author; 
    return this;
  }

   /**
   * Author of the job
   * @return author
  **/
  @ApiModelProperty(value = "Author of the job")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public UpdateJobRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Description of this job
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of this job")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateJobRequest imageName(String imageName) {
    this.imageName = imageName; 
    return this;
  }

   /**
   * The name of the Docker image that contains this job
   * @return imageName
  **/
  @ApiModelProperty(required = true, value = "The name of the Docker image that contains this job")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public UpdateJobRequest imageTag(String imageTag) {
    this.imageTag = imageTag; 
    return this;
  }

   /**
   * The tag of the Docker image that contains this job
   * @return imageTag
  **/
  @ApiModelProperty(required = true, value = "The tag of the Docker image that contains this job")
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }


  public UpdateJobRequest command(String command) {
    this.command = command; 
    return this;
  }

   /**
   * The command for running this job
   * @return command
  **/
  @ApiModelProperty(value = "The command for running this job")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public UpdateJobRequest ttl(Integer ttl) {
    this.ttl = ttl; 
    return this;
  }

   /**
   * Time To Live of the job run in seconds  Defaults to 5 minutes(300)
   * @return ttl
  **/
  @ApiModelProperty(value = "Time To Live of the job run in seconds  Defaults to 5 minutes(300)")
  public Integer getTtl() {
    return ttl;
  }

  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }


  public UpdateJobRequest minCpu(String minCpu) {
    this.minCpu = minCpu; 
    return this;
  }

   /**
   * Specifies  minimum number of CPUs to be allocated for the job  Default to 2
   * @return minCpu
  **/
  @ApiModelProperty(value = "Specifies  minimum number of CPUs to be allocated for the job  Default to 2")
  public String getMinCpu() {
    return minCpu;
  }

  public void setMinCpu(String minCpu) {
    this.minCpu = minCpu;
  }


  public UpdateJobRequest maxCpu(String maxCpu) {
    this.maxCpu = maxCpu; 
    return this;
  }

   /**
   * Specifies  maximum number of CPUs to be allocated for the job
   * @return maxCpu
  **/
  @ApiModelProperty(value = "Specifies  maximum number of CPUs to be allocated for the job")
  public String getMaxCpu() {
    return maxCpu;
  }

  public void setMaxCpu(String maxCpu) {
    this.maxCpu = maxCpu;
  }


  public UpdateJobRequest minMemory(String minMemory) {
    this.minMemory = minMemory; 
    return this;
  }

   /**
   * Specifies the minimum amount of memory  to be allocated for the job
   * @return minMemory
  **/
  @ApiModelProperty(value = "Specifies the minimum amount of memory  to be allocated for the job")
  public String getMinMemory() {
    return minMemory;
  }

  public void setMinMemory(String minMemory) {
    this.minMemory = minMemory;
  }


  public UpdateJobRequest maxMemory(String maxMemory) {
    this.maxMemory = maxMemory; 
    return this;
  }

   /**
   * Specifies the maximum amount of memory to be allocated for the job
   * @return maxMemory
  **/
  @ApiModelProperty(value = "Specifies the maximum amount of memory to be allocated for the job")
  public String getMaxMemory() {
    return maxMemory;
  }

  public void setMaxMemory(String maxMemory) {
    this.maxMemory = maxMemory;
  }


  public UpdateJobRequest argumentDefinitions(Map<String, ArgumentDefinition> argumentDefinitions) {
    this.argumentDefinitions = argumentDefinitions; 
    return this;
  }

  public UpdateJobRequest putArgumentDefinitionsItem(String key, ArgumentDefinition argumentDefinitionsItem) {
    this.argumentDefinitions.put(key, argumentDefinitionsItem);
    return this;
  }

   /**
   * All arguments for this job to run
   * @return argumentDefinitions
  **/
  @ApiModelProperty(required = true, value = "All arguments for this job to run")
  public Map<String, ArgumentDefinition> getArgumentDefinitions() {
    return argumentDefinitions;
  }

  public void setArgumentDefinitions(Map<String, ArgumentDefinition> argumentDefinitions) {
    this.argumentDefinitions = argumentDefinitions;
  }


  public UpdateJobRequest commandLineArgumentSeparator(String commandLineArgumentSeparator) {
    this.commandLineArgumentSeparator = commandLineArgumentSeparator; 
    return this;
  }

   /**
   * Value to separate command line arguments  e.g : If a job has a command line argument named &#39;folder&#39; and the runtime value is &#39;s3://path&#39; then this  would be supplied to the command as &#39;folder{separatorValue}s3://path&#39;  Default to a space
   * @return commandLineArgumentSeparator
  **/
  @ApiModelProperty(value = "Value to separate command line arguments  e.g : If a job has a command line argument named 'folder' and the runtime value is 's3://path' then this  would be supplied to the command as 'folder{separatorValue}s3://path'  Default to a space")
  public String getCommandLineArgumentSeparator() {
    return commandLineArgumentSeparator;
  }

  public void setCommandLineArgumentSeparator(String commandLineArgumentSeparator) {
    this.commandLineArgumentSeparator = commandLineArgumentSeparator;
  }


  public UpdateJobRequest requiredResources(RequiredResources requiredResources) {
    this.requiredResources = requiredResources; 
    return this;
  }

   /**
   * Get requiredResources
   * @return requiredResources
  **/
  @ApiModelProperty(required = true, value = "")
  public RequiredResources getRequiredResources() {
    return requiredResources;
  }

  public void setRequiredResources(RequiredResources requiredResources) {
    this.requiredResources = requiredResources;
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
    sb.append("class UpdateJobRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    minCpu: ").append(toIndentedString(minCpu)).append("\n");
    sb.append("    maxCpu: ").append(toIndentedString(maxCpu)).append("\n");
    sb.append("    minMemory: ").append(toIndentedString(minMemory)).append("\n");
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("    argumentDefinitions: ").append(toIndentedString(argumentDefinitions)).append("\n");
    sb.append("    commandLineArgumentSeparator: ").append(toIndentedString(commandLineArgumentSeparator)).append("\n");
    sb.append("    requiredResources: ").append(toIndentedString(requiredResources)).append("\n");
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
