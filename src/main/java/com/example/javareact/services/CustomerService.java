package com.example.javareact.services;

import com.example.javareact.entities.Customer;

import java.util.List;

public interface CustomerService {

   List<Customer> getAll();
   Customer getById(Long id);
   void remove(Long id);
   void update(Customer customer, Long id);
   void save(Customer customer);

}
