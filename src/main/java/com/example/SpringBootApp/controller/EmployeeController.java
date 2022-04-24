package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.model.Employee;
import com.example.SpringBootApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


    //create employee rest api
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
