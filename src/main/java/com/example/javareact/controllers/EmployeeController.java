package com.example.javareact.controllers;

import com.example.javareact.entities.Employee;
import com.example.javareact.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

   @Autowired
   private EmployeeService employeeService;

   @GetMapping("/api/employees")
   public List<Employee> getAll() {
      return employeeService.getAll();
   }

   @GetMapping("/api/employees/{id}")
   public Employee getById(@PathVariable Long id) {
      return employeeService.getById(id);
   }

   @DeleteMapping("/api/employees/{id}")
   public void remove(@PathVariable Long id) {
      employeeService.remove(id);
   }

   @PutMapping("/api/employees/{id}")
   public void update(@RequestBody Employee employee, @PathVariable Long id) {
      employeeService.update(employee, id);
   }

   @PostMapping("/api/employees")
   public void save(@RequestBody Employee employee) {
      employeeService.save(employee);
   }

}
