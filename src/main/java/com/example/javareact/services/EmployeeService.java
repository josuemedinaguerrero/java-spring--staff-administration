package com.example.javareact.services;

import com.example.javareact.entities.Customer;
import com.example.javareact.entities.Employee;

import java.util.List;

public interface EmployeeService {

   List<Employee> getAll();
   Employee getById(Long id);
   void remove(Long id);
   void update(Employee employee, Long id);
   void save(Employee employee);

}
