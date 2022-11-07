package com.Restful.Api.repositories;


import com.Restful.Api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee , Long> {

    public List<Employee>  findByFirstName (String firstName);

  // public List<Employee>  empSearch(String firstName ,String lastName);


}
