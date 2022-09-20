package com.luv2code.customer;


import com.luv2code.customer.helpers.CourseCode;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    @NotNull(message = "First name is required field")
    @Size(min = 1, message = "First name is required field")
    private String firstName;

    @NotNull(message = "Last name is required field")
    @Size(min = 1, message = "Last name is required field")
    private String lastName;

    @Max(value = 10, message = "not bigger than 10")
    @Min(value = 0, message = "not smaller than 0")
    @NotNull
    private Integer freePasses;

    @CourseCode(value = "COU", message = "Course code must be started with COU")
    private String course;
    public Customer() {
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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
