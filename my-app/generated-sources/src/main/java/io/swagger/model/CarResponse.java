package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CarResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-19T18:37:39.108177982Z[GMT]")


public class CarResponse   {
  @JsonProperty("vin")
  private Integer vin = null;

  @JsonProperty("make")
  private String make = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("mileage")
  private BigDecimal mileage = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("ownerId")
  private Integer ownerId = null;

  @JsonProperty("engine")
  private String engine = null;

  @JsonProperty("transmission")
  private String transmission = null;

  @JsonProperty("fuelType")
  private String fuelType = null;

  @JsonProperty("features")
  @Valid
  private List<String> features = null;

  public CarResponse vin(Integer vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Get vin
   * @return vin
   **/
  @Schema(description = "")
  
    public Integer getVin() {
    return vin;
  }

  public void setVin(Integer vin) {
    this.vin = vin;
  }

  public CarResponse make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
   **/
  @Schema(description = "")
  
    public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public CarResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(description = "")
  
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CarResponse year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   **/
  @Schema(description = "")
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public CarResponse color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(description = "")
  
    public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public CarResponse mileage(BigDecimal mileage) {
    this.mileage = mileage;
    return this;
  }

  /**
   * Get mileage
   * @return mileage
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getMileage() {
    return mileage;
  }

  public void setMileage(BigDecimal mileage) {
    this.mileage = mileage;
  }

  public CarResponse price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CarResponse ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   **/
  @Schema(description = "")
  
    public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public CarResponse engine(String engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
   **/
  @Schema(description = "")
  
    public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public CarResponse transmission(String transmission) {
    this.transmission = transmission;
    return this;
  }

  /**
   * Get transmission
   * @return transmission
   **/
  @Schema(description = "")
  
    public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public CarResponse fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  /**
   * Get fuelType
   * @return fuelType
   **/
  @Schema(description = "")
  
    public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public CarResponse features(List<String> features) {
    this.features = features;
    return this;
  }

  public CarResponse addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<String>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   **/
  @Schema(description = "")
  
    public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarResponse carResponse = (CarResponse) o;
    return Objects.equals(this.vin, carResponse.vin) &&
        Objects.equals(this.make, carResponse.make) &&
        Objects.equals(this.model, carResponse.model) &&
        Objects.equals(this.year, carResponse.year) &&
        Objects.equals(this.color, carResponse.color) &&
        Objects.equals(this.mileage, carResponse.mileage) &&
        Objects.equals(this.price, carResponse.price) &&
        Objects.equals(this.ownerId, carResponse.ownerId) &&
        Objects.equals(this.engine, carResponse.engine) &&
        Objects.equals(this.transmission, carResponse.transmission) &&
        Objects.equals(this.fuelType, carResponse.fuelType) &&
        Objects.equals(this.features, carResponse.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vin, make, model, year, color, mileage, price, ownerId, engine, transmission, fuelType, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarResponse {\n");
    
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
