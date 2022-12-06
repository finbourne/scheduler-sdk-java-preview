/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.682
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

/**
 * Job argument definition
 */
@ApiModel(description = "Job argument definition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArgumentDefinition {
  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private String constraints;

  public static final String SERIALIZED_NAME_PASSED_AS = "passedAs";
  @SerializedName(SERIALIZED_NAME_PASSED_AS)
  private String passedAs;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;


  public ArgumentDefinition dataType(String dataType) {
    this.dataType = dataType; 
    return this;
  }

   /**
   * Data type of the argument
   * @return dataType
  **/
  @ApiModelProperty(required = true, value = "Data type of the argument")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ArgumentDefinition required(Boolean required) {
    this.required = required; 
    return this;
  }

   /**
   * Optionality of the argument
   * @return required
  **/
  @ApiModelProperty(value = "Optionality of the argument")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  public ArgumentDefinition description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Argument description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Argument description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ArgumentDefinition order(Integer order) {
    this.order = order; 
    return this;
  }

   /**
   * The order of the argument
   * @return order
  **/
  @ApiModelProperty(required = true, value = "The order of the argument")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public ArgumentDefinition constraints(String constraints) {
    this.constraints = constraints; 
    return this;
  }

   /**
   * Constrains of the argument value
   * @return constraints
  **/
  @ApiModelProperty(value = "Constrains of the argument value")
  public String getConstraints() {
    return constraints;
  }

  public void setConstraints(String constraints) {
    this.constraints = constraints;
  }


  public ArgumentDefinition passedAs(String passedAs) {
    this.passedAs = passedAs; 
    return this;
  }

   /**
   * Specifies how this argument should be passed in  Allowed values are: CommandLine or EnvironmentVariable    Defaults to: CommandLine
   * @return passedAs
  **/
  @ApiModelProperty(required = true, value = "Specifies how this argument should be passed in  Allowed values are: CommandLine or EnvironmentVariable    Defaults to: CommandLine")
  public String getPassedAs() {
    return passedAs;
  }

  public void setPassedAs(String passedAs) {
    this.passedAs = passedAs;
  }


  public ArgumentDefinition defaultValue(String defaultValue) {
    this.defaultValue = defaultValue; 
    return this;
  }

   /**
   * Specify a default value for this argument if no value is provided  The value needs to be convertible to the associated data type
   * @return defaultValue
  **/
  @ApiModelProperty(value = "Specify a default value for this argument if no value is provided  The value needs to be convertible to the associated data type")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
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
    sb.append("class ArgumentDefinition {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    passedAs: ").append(toIndentedString(passedAs)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
