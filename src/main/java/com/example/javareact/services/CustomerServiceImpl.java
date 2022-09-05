package com.example.javareact.services;

import com.example.javareact.entities.Customer;
import com.example.javareact.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

   @Autowired
   private CustomerRepository customerRepository;

   @Override
   public List<Customer> getAll() {
      return (List<Customer>) customerRepository.findAll();
   }

   @Override
   public Customer getById(Long id) {
      return customerRepository.findById(id).get();
   }

   @Override
   public void remove(Long id) {
      customerRepository.deleteById(id);
   }

   @Override
   public void update(Customer customerUpdate, Long id) {
      Customer customer = customerRepository.findById(id).get();
      if (customerUpdate.getFirstname() != null) customer.setFirstname(customerUpdate.getFirstname());
      if (customerUpdate.getLastname() != null) customer.setLastname(customerUpdate.getLastname());
      if (customerUpdate.getPhone() != null) customer.setPhone(customerUpdate.getPhone());
      if (customerUpdate.getPhone() != null) customer.setAddress(customerUpdate.getAddress());
      customerRepository.save(customer);
   }

   @Override
   public void save(Customer customer) {
      customerRepository.save(customer);
   }

}
