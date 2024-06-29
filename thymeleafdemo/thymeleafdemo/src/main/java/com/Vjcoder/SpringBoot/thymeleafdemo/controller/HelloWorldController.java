package com.Vjcoder.SpringBoot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    //need a controller method to show initial html form
//    @RequestMapping("/showForm")
//    public String showForm(){
//
//        return "helloworld-form";
//    }

//    @GetMapping("/showForm")
//    public String showForm(){
//
//        return "helloworld-form";
//    }

    @GetMapping("/showForm")
    public String showForm(){

        return "helloworld-form";
    }

    //need a controller method to process the HTML Form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //need a controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        //convert the data to all caps(uppercase)
        theName = theName.toUpperCase();

        //create the message
        String result = "Hello " + theName;

        //add message to the model
        model.addAttribute("message" ,result);

        return "helloworld";
    }
//    @RequestMapping("/processFormVersionThree")
//@GetMapping("/processFormVersionThree")
@PostMapping("/processFormVersionThree")

public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        // read the request parameter from the HTML form
//        String theName = request.getParameter("studentName");
        //convert the data to all caps(uppercase)
        theName = theName.toUpperCase();

        //create the message
        String result = "hey! my Friend for noida " + theName;

        //add message to the model
        model.addAttribute("message" ,result);

        return "helloworld";
    }

}
