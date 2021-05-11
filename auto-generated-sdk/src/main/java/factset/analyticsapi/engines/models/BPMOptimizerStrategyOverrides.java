/*
 * Engines API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3:[pa,spar,vault,pub,fi,axp,afi,npo,bpm,fpo,others],v1:[fiab]
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
import factset.analyticsapi.engines.models.BPMOptimizerStrategyAlphaOverride;
import factset.analyticsapi.engines.models.ConstraintAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import factset.analyticsapi.engines.JSON;


/**
 * BPMOptimizerStrategyOverrides
 */
@JsonPropertyOrder({
  BPMOptimizerStrategyOverrides.JSON_PROPERTY_CONSTRAINTS,
  BPMOptimizerStrategyOverrides.JSON_PROPERTY_ALPHA,
  BPMOptimizerStrategyOverrides.JSON_PROPERTY_TAX,
  BPMOptimizerStrategyOverrides.JSON_PROPERTY_TRANSACTION_COST
})
@javax.annotation.Generated(value = "CustomJavaClientCodegen")
public class BPMOptimizerStrategyOverrides implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private java.util.List<ConstraintAction> constraints = null;

  public static final String JSON_PROPERTY_ALPHA = "alpha";
  private BPMOptimizerStrategyAlphaOverride alpha;

  public static final String JSON_PROPERTY_TAX = "tax";
  private String tax;

  public static final String JSON_PROPERTY_TRANSACTION_COST = "transactionCost";
  private String transactionCost;


  public BPMOptimizerStrategyOverrides constraints(java.util.List<ConstraintAction> constraints) {
    this.constraints = constraints;
    return this;
  }

  public BPMOptimizerStrategyOverrides addConstraintsItem(ConstraintAction constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new java.util.ArrayList<ConstraintAction>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * List of constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of constraints")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ConstraintAction> getConstraints() {
    return constraints;
  }


  public void setConstraints(java.util.List<ConstraintAction> constraints) {
    this.constraints = constraints;
  }


  public BPMOptimizerStrategyOverrides alpha(BPMOptimizerStrategyAlphaOverride alpha) {
    this.alpha = alpha;
    return this;
  }

   /**
   * Get alpha
   * @return alpha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALPHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BPMOptimizerStrategyAlphaOverride getAlpha() {
    return alpha;
  }


  public void setAlpha(BPMOptimizerStrategyAlphaOverride alpha) {
    this.alpha = alpha;
  }


  public BPMOptimizerStrategyOverrides tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax  Can be set to \&quot;\&quot; for local
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax  Can be set to \"\" for local")
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTax() {
    return tax;
  }


  public void setTax(String tax) {
    this.tax = tax;
  }


  public BPMOptimizerStrategyOverrides transactionCost(String transactionCost) {
    this.transactionCost = transactionCost;
    return this;
  }

   /**
   * Transaction cost  Can be set to \&quot;\&quot; for local
   * @return transactionCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction cost  Can be set to \"\" for local")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionCost() {
    return transactionCost;
  }


  public void setTransactionCost(String transactionCost) {
    this.transactionCost = transactionCost;
  }


  /**
   * Return true if this BPMOptimizerStrategyOverrides object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BPMOptimizerStrategyOverrides bpMOptimizerStrategyOverrides = (BPMOptimizerStrategyOverrides) o;
    return Objects.equals(this.constraints, bpMOptimizerStrategyOverrides.constraints) &&
        Objects.equals(this.alpha, bpMOptimizerStrategyOverrides.alpha) &&
        Objects.equals(this.tax, bpMOptimizerStrategyOverrides.tax) &&
        Objects.equals(this.transactionCost, bpMOptimizerStrategyOverrides.transactionCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, alpha, tax, transactionCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BPMOptimizerStrategyOverrides {\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    transactionCost: ").append(toIndentedString(transactionCost)).append("\n");
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

