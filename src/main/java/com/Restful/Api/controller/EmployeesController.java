package com.Restful.Api.controller;

import com.Restful.Api.model.Employee;
import com.Restful.Api.repositories.EmployeeRepository;
import com.Restful.Api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeesController {

        @Autowired
        private EmployeeService empService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {

        return empService.getAllEmployee();
    }


    @GetMapping("/getEmpById")
    public Employee getEmpById(@RequestParam Long id) {

        return empService.getEmployeeById(id);
    }

    @GetMapping("/getEmpByName")
    public List<Employee> getEmpByFirstName(@RequestParam String firstName) {

        return empService.getEmpByFirstName(firstName);
    }

/*
    @GetMapping("/empSearch")
    public List<Employee> empSearch(@RequestParam String firstName, @RequestParam String lastname) {

        return empService.getEmpSearch(firstName,lastname);
    }
*/

    @PostMapping("/employee")
    public  String newEmployee (@RequestBody Employee newEmp){
        empService.addEmp(newEmp);

        return "saved new employee successfully";

    }




 }
