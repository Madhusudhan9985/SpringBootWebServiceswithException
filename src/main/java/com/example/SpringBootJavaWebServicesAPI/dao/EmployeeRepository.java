package com.example.SpringBootJavaWebServicesAPI.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootJavaWebServicesAPI.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}