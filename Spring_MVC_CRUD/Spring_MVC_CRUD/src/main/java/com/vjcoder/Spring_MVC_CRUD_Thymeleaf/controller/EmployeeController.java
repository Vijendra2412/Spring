package com.vjcoder.Spring_MVC_CRUD_Thymeleaf.controller;

import com.vjcoder.Spring_MVC_CRUD_Thymeleaf.entity.Employee;
import com.vjcoder.Spring_MVC_CRUD_Thymeleaf.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String   showFormForAdd(Model theModel){
        // create model attribute to bind form data
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee" ,theEmployee);
        return "employees/employees-form";
    }

    @GetMapping ("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel) {
        //get the employee from the service
        Employee theEmployee = employeeService.findById(theId);

//        set employee in the model to prepopulate the form
        theModel.addAttribute("employee",theEmployee);

//        send over to our form

        return "employees/employees-form";
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        // Save the employee
        employeeService.save(theEmployee);

        //use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

}
















