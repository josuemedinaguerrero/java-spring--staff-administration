package com.example.javareact.controllers;

import com.example.javareact.entities.Customer;
import com.example.javareact.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

   @Autowired
   private CustomerService customerService;

   @GetMapping("/api/customers")
   public List<Customer> getAll() {
      return customerService.getAll();
   }

   @GetMapping("/api/customers/{id}")
      public Customer getById(@PathVariable Long id) {
      return customerService.getById(id);
   }

   @DeleteMapping("/api/customers/{id}")
   public void remove(@PathVariable Long id) {
      customerService.remove(id);
   }

   @PutMapping("/api/customers/{id}")
   public void update(@RequestBody Customer customer, @PathVariable Long id) {
      customerService.update(customer, id);
   }

   @PostMapping("/api/customers")
   public void save(@RequestBody Customer customer) {
      customerService.save(customer);
   }

}
