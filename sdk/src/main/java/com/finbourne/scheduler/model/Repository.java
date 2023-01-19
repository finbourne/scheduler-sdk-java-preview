/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.728
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.scheduler.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.scheduler.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representation of a repository
 */
@ApiModel(description = "An object representation of a repository")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Repository {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATION_TIME = "creationTime";
  @SerializedName(SERIALIZED_NAME_CREATION_TIME)
  private OffsetDateTime creationTime;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PULL_COUNT = "pullCount";
  @SerializedName(SERIALIZED_NAME_PULL_COUNT)
  private Long pullCount;

  public static final String SERIALIZED_NAME_IMAGE_COUNT = "imageCount";
  @SerializedName(SERIALIZED_NAME_IMAGE_COUNT)
  private Long imageCount;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private Link images;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Repository name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The identifier of the repository
   * @return name
  **/
  @ApiModelProperty(value = "The identifier of the repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Repository creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime; 
    return this;
  }

   /**
   * Date of  repository creation
   * @return creationTime
  **/
  @ApiModelProperty(value = "Date of  repository creation")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }


  public Repository lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate; 
    return this;
  }

   /**
   * The last update of the repository
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "The last update of the repository")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public Repository description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Description of the repository
   * @return description
  **/
  @ApiModelProperty(value = "Description of the repository")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Repository pullCount(Long pullCount) {
    this.pullCount = pullCount; 
    return this;
  }

   /**
   * Number of times images were pulled from this repository
   * @return pullCount
  **/
  @ApiModelProperty(value = "Number of times images were pulled from this repository")
  public Long getPullCount() {
    return pullCount;
  }

  public void setPullCount(Long pullCount) {
    this.pullCount = pullCount;
  }


  public Repository imageCount(Long imageCount) {
    this.imageCount = imageCount; 
    return this;
  }

   /**
   * The number of versions of this image
   * @return imageCount
  **/
  @ApiModelProperty(value = "The number of versions of this image")
  public Long getImageCount() {
    return imageCount;
  }

  public void setImageCount(Long imageCount) {
    this.imageCount = imageCount;
  }


  public Repository images(Link images) {
    this.images = images; 
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public Link getImages() {
    return images;
  }

  public void setImages(Link images) {
    this.images = images;
  }


  public Repository links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Repository addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class Repository {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pullCount: ").append(toIndentedString(pullCount)).append("\n");
    sb.append("    imageCount: ").append(toIndentedString(imageCount)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
