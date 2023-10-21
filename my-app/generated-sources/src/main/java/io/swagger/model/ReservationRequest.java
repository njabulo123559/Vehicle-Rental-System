package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-19T18:37:39.108177982Z[GMT]")


public class ReservationRequest   {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("carId")
  private Integer carId = null;

  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  @JsonProperty("pickUpLocation")
  private String pickUpLocation = null;

  @JsonProperty("dropoffLocation")
  private String dropoffLocation = null;

  public ReservationRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public ReservationRequest carId(Integer carId) {
    this.carId = carId;
    return this;
  }

  /**
   * Get carId
   * @return carId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  public ReservationRequest fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public ReservationRequest toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public ReservationRequest pickUpLocation(String pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
    return this;
  }

  /**
   * Get pickUpLocation
   * @return pickUpLocation
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPickUpLocation() {
    return pickUpLocation;
  }

  public void setPickUpLocation(String pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
  }

  public ReservationRequest dropoffLocation(String dropoffLocation) {
    this.dropoffLocation = dropoffLocation;
    return this;
  }

  /**
   * Get dropoffLocation
   * @return dropoffLocation
   **/
  @Schema(description = "")
  
    public String getDropoffLocation() {
    return dropoffLocation;
  }

  public void setDropoffLocation(String dropoffLocation) {
    this.dropoffLocation = dropoffLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationRequest reservationRequest = (ReservationRequest) o;
    return Objects.equals(this.userId, reservationRequest.userId) &&
        Objects.equals(this.carId, reservationRequest.carId) &&
        Objects.equals(this.fromDate, reservationRequest.fromDate) &&
        Objects.equals(this.toDate, reservationRequest.toDate) &&
        Objects.equals(this.pickUpLocation, reservationRequest.pickUpLocation) &&
        Objects.equals(this.dropoffLocation, reservationRequest.dropoffLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, carId, fromDate, toDate, pickUpLocation, dropoffLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    carId: ").append(toIndentedString(carId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    pickUpLocation: ").append(toIndentedString(pickUpLocation)).append("\n");
    sb.append("    dropoffLocation: ").append(toIndentedString(dropoffLocation)).append("\n");
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
