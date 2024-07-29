package com.vjcoder.springboot.crudApidemo.dao;

import com.vjcoder.springboot.crudApidemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

}
