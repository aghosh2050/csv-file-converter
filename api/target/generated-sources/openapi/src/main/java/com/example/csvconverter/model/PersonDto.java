package com.example.csvconverter.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PersonDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-01T23:15:24.133516300+05:30[Asia/Calcutta]")
public class PersonDto {

  private String fullName;

  private Integer yearsOld;

  private String birthDateStr;

  public PersonDto fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  
  @Schema(name = "fullName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public PersonDto yearsOld(Integer yearsOld) {
    this.yearsOld = yearsOld;
    return this;
  }

  /**
   * Get yearsOld
   * @return yearsOld
  */
  
  @Schema(name = "yearsOld", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearsOld")
  public Integer getYearsOld() {
    return yearsOld;
  }

  public void setYearsOld(Integer yearsOld) {
    this.yearsOld = yearsOld;
  }

  public PersonDto birthDateStr(String birthDateStr) {
    this.birthDateStr = birthDateStr;
    return this;
  }

  /**
   * Get birthDateStr
   * @return birthDateStr
  */
  
  @Schema(name = "birthDateStr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDateStr")
  public String getBirthDateStr() {
    return birthDateStr;
  }

  public void setBirthDateStr(String birthDateStr) {
    this.birthDateStr = birthDateStr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonDto personDto = (PersonDto) o;
    return Objects.equals(this.fullName, personDto.fullName) &&
        Objects.equals(this.yearsOld, personDto.yearsOld) &&
        Objects.equals(this.birthDateStr, personDto.birthDateStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, yearsOld, birthDateStr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonDto {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    yearsOld: ").append(toIndentedString(yearsOld)).append("\n");
    sb.append("    birthDateStr: ").append(toIndentedString(birthDateStr)).append("\n");
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

