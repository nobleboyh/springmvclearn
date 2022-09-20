package com.luv2code.student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private final LinkedHashMap<String, String> countryList = new LinkedHashMap<>();

    private List<String> operationSystems = new ArrayList<>();
    public Student() {
        countryList.put("AS","Asia");
        countryList.put("EU","Europe");
        countryList.put("AF","Africa");
        countryList.put("AM","Americas");
    }

    public Student(String firstName, String lastName, String country, String favoriteLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
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

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getOperationSystems() {
        return operationSystems;
    }

    public void setOperationSystems(List<String> operationSystems) {
        this.operationSystems = operationSystems;
    }
}
