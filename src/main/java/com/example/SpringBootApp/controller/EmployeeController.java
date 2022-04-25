package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.exception.ResourceNotFoundException;
import com.example.SpringBootApp.model.Employee;
import com.example.SpringBootApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Typical standard way of referring to the release version 1 of any application
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get All Employees
    //Sends the data as a list in json format as mentioned below
    //  [
    //     {"id":1,"firstName":"kanav","lastName":"vashisht","emailId":"kanav@gmail.com"},
    //     {"id":2,"firstName":"tony","lastName":"stark","emailId":"tony@stark.com"}
    //  ]
//    -------------------------------Information related to CORS---------------------------------------------------
//    if You use spring boot , you should add origin link in the @CrossOrigin annotation
//
//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/yourPath")
//    You can find detailed instruction in the https://spring.io/guides/gs/rest-service-cors/
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


    // create employee rest api
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


    // get employee by id REST API
    //ResponseEntity for sending HTTP Status
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow( ()-> new ResourceNotFoundException("Employee does not exist with Id: " + id));
        //Sending Ok status always as even if we dont get any employee from a particular Id,
        // it shouldn't be treated as error.
        return ResponseEntity.ok(employee) ;
    }


    //Update Employee REST API
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow( ()-> new ResourceNotFoundException("Employee does not exist with Id: " + id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        employeeRepository.save(employee);
        return ResponseEntity.ok(employee);
    }

}
