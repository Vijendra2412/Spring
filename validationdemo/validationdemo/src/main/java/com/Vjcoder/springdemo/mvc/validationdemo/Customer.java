package com.Vjcoder.springdemo.mvc.validationdemo;

import com.Vjcoder.springdemo.mvc.validationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName = "";

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be Greater Than or equal to Zero")
    @Max(value = 10, message = "Must be Less Than or equal to 10")
    private Integer freePasses;


    @Pattern(regexp = "^[a-zA-Z0-9]{6}" , message = "only 6 chars/digits")
    private String postalCode;


    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    @CourseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
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
}
