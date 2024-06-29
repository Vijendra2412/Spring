package com.Vjcoder.SpringBoot.thymeleafdemo.controller;

import com.Vjcoder.SpringBoot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("#{'${countries}'.split(',')}")
    private List<String> countries;

    @Value("#{'${languages}'.split(',')}")
    private List<String> languages;

    @GetMapping("/")
    public String showForm(Model theModel) {
        // Create a student object
        Student theStudent = new Student();
        // Add student object to the model
        theModel.addAttribute("student", theStudent);
        // Add the list of countries to the model
        theModel.addAttribute("countries", countries);
        // Add the list of languages to the model
        theModel.addAttribute("languages", languages);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // Log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }
}
