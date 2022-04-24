package com.example.SpringBootApp.repository;

import com.example.SpringBootApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


// We don't add @Repository and @Transactional here
// Type of entity, Type of Primary Key
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
