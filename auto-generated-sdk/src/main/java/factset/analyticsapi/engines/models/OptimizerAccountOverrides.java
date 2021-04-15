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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OptimizerAccountOverrides
 */
@JsonPropertyOrder({
  OptimizerAccountOverrides.JSON_PROPERTY_PORTFOLIO,
  OptimizerAccountOverrides.JSON_PROPERTY_BENCHMARK,
  OptimizerAccountOverrides.JSON_PROPERTY_RISK_MODEL_ID,
  OptimizerAccountOverrides.JSON_PROPERTY_CURRENCY
})

public class OptimizerAccountOverrides implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private String portfolio;

  public static final String JSON_PROPERTY_BENCHMARK = "benchmark";
  private String benchmark;

  public static final String JSON_PROPERTY_RISK_MODEL_ID = "riskModelId";
  private String riskModelId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;


  public OptimizerAccountOverrides portfolio(String portfolio) {
    
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Portfolio
   * @return portfolio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Portfolio")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortfolio() {
    return portfolio;
  }


  public void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }


  public OptimizerAccountOverrides benchmark(String benchmark) {
    
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Benchmark
   * @return benchmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Benchmark")
  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBenchmark() {
    return benchmark;
  }


  public void setBenchmark(String benchmark) {
    this.benchmark = benchmark;
  }


  public OptimizerAccountOverrides riskModelId(String riskModelId) {
    
    this.riskModelId = riskModelId;
    return this;
  }

   /**
   * Risk model
   * @return riskModelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk model")
  @JsonProperty(JSON_PROPERTY_RISK_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskModelId() {
    return riskModelId;
  }


  public void setRiskModelId(String riskModelId) {
    this.riskModelId = riskModelId;
  }


  public OptimizerAccountOverrides currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerAccountOverrides optimizerAccountOverrides = (OptimizerAccountOverrides) o;
    return Objects.equals(this.portfolio, optimizerAccountOverrides.portfolio) &&
        Objects.equals(this.benchmark, optimizerAccountOverrides.benchmark) &&
        Objects.equals(this.riskModelId, optimizerAccountOverrides.riskModelId) &&
        Objects.equals(this.currency, optimizerAccountOverrides.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolio, benchmark, riskModelId, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerAccountOverrides {\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    riskModelId: ").append(toIndentedString(riskModelId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
