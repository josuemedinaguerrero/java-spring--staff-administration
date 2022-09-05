package com.example.javareact.services;

import com.example.javareact.entities.Customer;
import com.example.javareact.entities.Employee;
import com.example.javareact.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   @Autowired
   private EmployeeRepository employeeRepository;

   @Override
   public List<Employee> getAll() {
      return (List<Employee>) employeeRepository.findAll();
   }

   @Override
   public Employee getById(Long id) {
      return employeeRepository.findById(id).get();
   }

   @Override
   public void remove(Long id) {
      employeeRepository.deleteById(id);
   }

   @Override
   public void update(Employee employeeUpdate, Long id) {
      Employee employee = employeeRepository.findById(id).get();
      if (employeeUpdate.getFirstname() != null) employee.setFirstname(employeeUpdate.getFirstname());
      if (employeeUpdate.getLastname() != null) employee.setLastname(employeeUpdate.getLastname());
      if (employeeUpdate.getPhone() != null) employee.setPhone(employeeUpdate.getPhone());
      if (employeeUpdate.getPhone() != null) employee.setAddress(employeeUpdate.getAddress());
      employeeRepository.save(employee);
   }

   @Override
   public void save(Employee employee) {
      employeeRepository.save(employee);
   }

}
