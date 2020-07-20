package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
