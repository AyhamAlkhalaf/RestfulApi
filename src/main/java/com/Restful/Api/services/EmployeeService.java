package com.Restful.Api.services;

import com.Restful.Api.model.Employee;
import com.Restful.Api.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id).orElseThrow(null);

    }

    public List<Employee> getEmpByFirstName(String firstName) {

        return employeeRepository.findByFirstName(firstName);
    }
/*
    public List<Employee>  getEmpSearch(String firstName,String lastName){

        return employeeRepository.empSearch(firstName,lastName);
    }
*/

    public void addEmp(Employee newEmp) {
        employeeRepository.save(newEmp);
    }


}

