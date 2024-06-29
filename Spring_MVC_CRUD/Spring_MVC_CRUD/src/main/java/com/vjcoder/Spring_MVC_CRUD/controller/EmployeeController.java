package com.vjcoder.Spring_MVC_CRUD.controller;

import com.vjcoder.Spring_MVC_CRUD.entity.Employee;
import com.vjcoder.Spring_MVC_CRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        //get the employees from db
        List<Employee> theEmployee = employeeService.findAll();

        //add to the spring model
        theModel.addAttribute("employees" , theEmployee);
        return "list-employees";
    }

}
















