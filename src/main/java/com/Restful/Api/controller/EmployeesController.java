package com.Restful.Api.controller;

import com.Restful.Api.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {

    @GetMapping("/Employees")
    public List<Employee> getAllEmployee() {

        List<Employee>  emps = new ArrayList<Employee>();

        emps.add(new Employee(1,"ayham","alkhalaf",1000,"Syria 11111"));
        emps.add(new Employee(2,"ahmad","alkhalaf",2000,"Syria 2222"));
        emps.add(new Employee(3,"asmaa","alkhalaf",3000,"Syria 33333"));
        emps.add(new Employee(4,"tya","alkhalaf",4000,"Syria 44444"));
        emps.add(new Employee(5,"ali","alkhalaf",5000,"Syria  55555"));

        return emps;



    }
 }
