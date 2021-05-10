/*
 * Engines API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v2:[pa,spar,vault,pub],v1:[fiab,fi,axp,afi,npo,bpm,fpo]
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package factset.analyticsapi.engines.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import factset.analyticsapi.engines.JSON;


/**
 * CalculationStatusSummary
 */
@JsonPropertyOrder({
  CalculationStatusSummary.JSON_PROPERTY_STATUS,
  CalculationStatusSummary.JSON_PROPERTY_UNITS,
  CalculationStatusSummary.JSON_PROPERTY_REQUEST_TIME,
  CalculationStatusSummary.JSON_PROPERTY_LAST_POLL_TIME
})
@javax.annotation.Generated(value = "CustomJavaClientCodegen")
public class CalculationStatusSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The status of the calculation.
   */
  public enum StatusEnum {
    QUEUED("Queued"),
    
    EXECUTING("Executing"),
    
    COMPLETED("Completed"),
    
    CANCELLED("Cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_UNITS = "units";
  private Integer units;

  public static final String JSON_PROPERTY_REQUEST_TIME = "requestTime";
  private OffsetDateTime requestTime;

  public static final String JSON_PROPERTY_LAST_POLL_TIME = "lastPollTime";
  private OffsetDateTime lastPollTime;


  public CalculationStatusSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the calculation.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the calculation.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CalculationStatusSummary units(Integer units) {
    this.units = units;
    return this;
  }

   /**
   * Number of calculation units in batch.
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of calculation units in batch.")
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnits() {
    return units;
  }


  public void setUnits(Integer units) {
    this.units = units;
  }


  public CalculationStatusSummary requestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
    return this;
  }

   /**
   * Request time of calculation.
   * @return requestTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request time of calculation.")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRequestTime() {
    return requestTime;
  }


  public void setRequestTime(OffsetDateTime requestTime) {
    this.requestTime = requestTime;
  }


  public CalculationStatusSummary lastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
    return this;
  }

   /**
   * Last poll time of calculation.
   * @return lastPollTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last poll time of calculation.")
  @JsonProperty(JSON_PROPERTY_LAST_POLL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastPollTime() {
    return lastPollTime;
  }


  public void setLastPollTime(OffsetDateTime lastPollTime) {
    this.lastPollTime = lastPollTime;
  }


  /**
   * Return true if this CalculationStatusSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculationStatusSummary calculationStatusSummary = (CalculationStatusSummary) o;
    return Objects.equals(this.status, calculationStatusSummary.status) &&
        Objects.equals(this.units, calculationStatusSummary.units) &&
        Objects.equals(this.requestTime, calculationStatusSummary.requestTime) &&
        Objects.equals(this.lastPollTime, calculationStatusSummary.lastPollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, units, requestTime, lastPollTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculationStatusSummary {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    requestTime: ").append(toIndentedString(requestTime)).append("\n");
    sb.append("    lastPollTime: ").append(toIndentedString(lastPollTime)).append("\n");
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

