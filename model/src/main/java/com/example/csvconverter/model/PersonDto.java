package com.example.csvconverter.model;

import java.time.LocalDate;

public class PersonDto {
    private String fullName;
    private int yearsOld;
    private String birthDateStr;

    // Getters and setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getYearsOld() { return yearsOld; }
    public void setYearsOld(int yearsOld) { this.yearsOld = yearsOld; }
    public String getBirthDateStr() { return birthDateStr; }
    public void setBirthDateStr(String birthDateStr) { this.birthDateStr = birthDateStr; }
}