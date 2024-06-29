package com.vjcoder.Spring_MVC_CRUD.service;
import com.vjcoder.Spring_MVC_CRUD.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}