/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.762
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.ActionId;
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
 * IdSelectorDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdSelectorDefinition {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private Map<String, String> identifier = new HashMap<>();

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<ActionId> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public IdSelectorDefinition identifier(Map<String, String> identifier) {
    this.identifier = identifier; 
    return this;
  }

  public IdSelectorDefinition putIdentifierItem(String key, String identifierItem) {
    this.identifier.put(key, identifierItem);
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, String> getIdentifier() {
    return identifier;
  }

  public void setIdentifier(Map<String, String> identifier) {
    this.identifier = identifier;
  }


  public IdSelectorDefinition actions(List<ActionId> actions) {
    this.actions = actions; 
    return this;
  }

  public IdSelectorDefinition addActionsItem(ActionId actionsItem) {
   
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ActionId> getActions() {
    return actions;
  }

  public void setActions(List<ActionId> actions) {
    this.actions = actions;
  }


  public IdSelectorDefinition name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IdSelectorDefinition description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    sb.append("class IdSelectorDefinition {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
