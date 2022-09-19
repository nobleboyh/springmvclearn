package com.luv2code.student;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private final LinkedHashMap<String, String> countryList = new LinkedHashMap<>();
    public Student() {
        countryList.put("AS","Asia");
        countryList.put("EU","Europe");
        countryList.put("AF","Africa");
        countryList.put("AM","Americas");
    }

    public Student(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryList() {
        return countryList;
    }
}
