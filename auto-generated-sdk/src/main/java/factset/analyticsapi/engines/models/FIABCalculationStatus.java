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
import factset.analyticsapi.engines.models.EventSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import factset.analyticsapi.engines.JSON;


/**
 * FIABCalculationStatus
 */
@JsonPropertyOrder({
  FIABCalculationStatus.JSON_PROPERTY_ID,
  FIABCalculationStatus.JSON_PROPERTY_STATUS,
  FIABCalculationStatus.JSON_PROPERTY_STARTDATETIME,
  FIABCalculationStatus.JSON_PROPERTY_COMPLETIONDATETIME,
  FIABCalculationStatus.JSON_PROPERTY_PROGRESS,
  FIABCalculationStatus.JSON_PROPERTY_BATCHEVENTS
})
@javax.annotation.Generated(value = "CustomJavaClientCodegen")
public class FIABCalculationStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    INPROGRESS("InProgress"),
    
    DONE("Done"),
    
    PAUSED("Paused"),
    
    CANCELLED("Cancelled"),
    
    ERROR("Error");

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

  public static final String JSON_PROPERTY_STARTDATETIME = "startdatetime";
  private OffsetDateTime startdatetime;

  public static final String JSON_PROPERTY_COMPLETIONDATETIME = "completiondatetime";
  private OffsetDateTime completiondatetime;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private Integer progress;

  public static final String JSON_PROPERTY_BATCHEVENTS = "batchevents";
  private java.util.List<EventSummary> batchevents = null;


  public FIABCalculationStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FIABCalculationStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public FIABCalculationStatus startdatetime(OffsetDateTime startdatetime) {
    this.startdatetime = startdatetime;
    return this;
  }

   /**
   * Get startdatetime
   * @return startdatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STARTDATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartdatetime() {
    return startdatetime;
  }


  public void setStartdatetime(OffsetDateTime startdatetime) {
    this.startdatetime = startdatetime;
  }


  public FIABCalculationStatus completiondatetime(OffsetDateTime completiondatetime) {
    this.completiondatetime = completiondatetime;
    return this;
  }

   /**
   * Get completiondatetime
   * @return completiondatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETIONDATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletiondatetime() {
    return completiondatetime;
  }


  public void setCompletiondatetime(OffsetDateTime completiondatetime) {
    this.completiondatetime = completiondatetime;
  }


  public FIABCalculationStatus progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProgress() {
    return progress;
  }


  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  public FIABCalculationStatus batchevents(java.util.List<EventSummary> batchevents) {
    this.batchevents = batchevents;
    return this;
  }

  public FIABCalculationStatus addBatcheventsItem(EventSummary batcheventsItem) {
    if (this.batchevents == null) {
      this.batchevents = new java.util.ArrayList<EventSummary>();
    }
    this.batchevents.add(batcheventsItem);
    return this;
  }

   /**
   * Get batchevents
   * @return batchevents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCHEVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<EventSummary> getBatchevents() {
    return batchevents;
  }


  public void setBatchevents(java.util.List<EventSummary> batchevents) {
    this.batchevents = batchevents;
  }


  /**
   * Return true if this FIABCalculationStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIABCalculationStatus fiABCalculationStatus = (FIABCalculationStatus) o;
    return Objects.equals(this.id, fiABCalculationStatus.id) &&
        Objects.equals(this.status, fiABCalculationStatus.status) &&
        Objects.equals(this.startdatetime, fiABCalculationStatus.startdatetime) &&
        Objects.equals(this.completiondatetime, fiABCalculationStatus.completiondatetime) &&
        Objects.equals(this.progress, fiABCalculationStatus.progress) &&
        Objects.equals(this.batchevents, fiABCalculationStatus.batchevents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, startdatetime, completiondatetime, progress, batchevents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIABCalculationStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startdatetime: ").append(toIndentedString(startdatetime)).append("\n");
    sb.append("    completiondatetime: ").append(toIndentedString(completiondatetime)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    batchevents: ").append(toIndentedString(batchevents)).append("\n");
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

