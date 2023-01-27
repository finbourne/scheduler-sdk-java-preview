/*
 * FINBOURNE Scheduler API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.750
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
 * ScanSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScanSummary {
  public static final String SERIALIZED_NAME_FIXABLE = "fixable";
  @SerializedName(SERIALIZED_NAME_FIXABLE)
  private Integer fixable;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_CRITICAL = "critical";
  @SerializedName(SERIALIZED_NAME_CRITICAL)
  private Integer critical;

  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Integer high;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Integer medium;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Integer low;

  public static final String SERIALIZED_NAME_NEGLIGIBLE = "negligible";
  @SerializedName(SERIALIZED_NAME_NEGLIGIBLE)
  private Integer negligible;

  public static final String SERIALIZED_NAME_UNKNOWN = "unknown";
  @SerializedName(SERIALIZED_NAME_UNKNOWN)
  private Integer unknown;


  public ScanSummary fixable(Integer fixable) {
    this.fixable = fixable; 
    return this;
  }

   /**
   * The number of vulnerabilities that have a known fix
   * @return fixable
  **/
  @ApiModelProperty(value = "The number of vulnerabilities that have a known fix")
  public Integer getFixable() {
    return fixable;
  }

  public void setFixable(Integer fixable) {
    this.fixable = fixable;
  }


  public ScanSummary total(Integer total) {
    this.total = total; 
    return this;
  }

   /**
   * The total number of vulnerabilities
   * @return total
  **/
  @ApiModelProperty(value = "The total number of vulnerabilities")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public ScanSummary critical(Integer critical) {
    this.critical = critical; 
    return this;
  }

   /**
   * The number of Critical severity vulnerabilities
   * @return critical
  **/
  @ApiModelProperty(value = "The number of Critical severity vulnerabilities")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }


  public ScanSummary high(Integer high) {
    this.high = high; 
    return this;
  }

   /**
   * The number of High severity vulnerabilities
   * @return high
  **/
  @ApiModelProperty(value = "The number of High severity vulnerabilities")
  public Integer getHigh() {
    return high;
  }

  public void setHigh(Integer high) {
    this.high = high;
  }


  public ScanSummary medium(Integer medium) {
    this.medium = medium; 
    return this;
  }

   /**
   * The number of Medium severity vulnerabilities
   * @return medium
  **/
  @ApiModelProperty(value = "The number of Medium severity vulnerabilities")
  public Integer getMedium() {
    return medium;
  }

  public void setMedium(Integer medium) {
    this.medium = medium;
  }


  public ScanSummary low(Integer low) {
    this.low = low; 
    return this;
  }

   /**
   * The number of Low severity vulnerabilities
   * @return low
  **/
  @ApiModelProperty(value = "The number of Low severity vulnerabilities")
  public Integer getLow() {
    return low;
  }

  public void setLow(Integer low) {
    this.low = low;
  }


  public ScanSummary negligible(Integer negligible) {
    this.negligible = negligible; 
    return this;
  }

   /**
   * The number of Negligible severity vulnerabilities
   * @return negligible
  **/
  @ApiModelProperty(value = "The number of Negligible severity vulnerabilities")
  public Integer getNegligible() {
    return negligible;
  }

  public void setNegligible(Integer negligible) {
    this.negligible = negligible;
  }


  public ScanSummary unknown(Integer unknown) {
    this.unknown = unknown; 
    return this;
  }

   /**
   * The number of Unknown severity vulnerabilities
   * @return unknown
  **/
  @ApiModelProperty(value = "The number of Unknown severity vulnerabilities")
  public Integer getUnknown() {
    return unknown;
  }

  public void setUnknown(Integer unknown) {
    this.unknown = unknown;
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
    sb.append("class ScanSummary {\n");
    sb.append("    fixable: ").append(toIndentedString(fixable)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    negligible: ").append(toIndentedString(negligible)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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
