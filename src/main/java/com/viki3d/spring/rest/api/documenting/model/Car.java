package com.viki3d.spring.rest.api.documenting.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Car
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-28T12:22:48.707Z[GMT]")


public class Car   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("brand")
  private String brand = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("color")
  private String color = null;

  public Car id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Constructs a specific car.
   *
   * @param brand Car's brand.
   * @param model Car's model.
   * @param color Car's color.
   */
  public Car(long id, String brand, String model, String color) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.color = color;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Car brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=2,max=20)   public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Car model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=2,max=20)   public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Car color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @Schema(required = true, description = "")
      @NotNull

  @Size(min=3,max=20)   public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.id, car.id) &&
        Objects.equals(this.brand, car.brand) &&
        Objects.equals(this.model, car.model) &&
        Objects.equals(this.color, car.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brand, model, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
