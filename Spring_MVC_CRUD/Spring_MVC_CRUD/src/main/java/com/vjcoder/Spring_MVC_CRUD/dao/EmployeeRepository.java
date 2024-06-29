package com.vjcoder.Spring_MVC_CRUD.dao;


import com.vjcoder.Spring_MVC_CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}