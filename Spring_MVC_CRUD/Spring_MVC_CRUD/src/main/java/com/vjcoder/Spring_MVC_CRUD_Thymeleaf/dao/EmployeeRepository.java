package com.vjcoder.Spring_MVC_CRUD_Thymeleaf.dao;


import com.vjcoder.Spring_MVC_CRUD_Thymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();

}