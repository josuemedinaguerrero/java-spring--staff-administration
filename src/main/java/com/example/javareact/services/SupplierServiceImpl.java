package com.example.javareact.services;

import com.example.javareact.entities.Customer;
import com.example.javareact.entities.Supplier;
import com.example.javareact.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

   @Autowired
   private SupplierRepository supplierRepository;

   @Override
   public List<Supplier> getAll() {
      return (List<Supplier>) supplierRepository.findAll();
   }

   @Override
   public Supplier getById(Long id) {
      return supplierRepository.findById(id).get();
   }

   @Override
   public void remove(Long id) {
      supplierRepository.deleteById(id);
   }

   @Override
   public void update(Supplier supplierUpdate, Long id) {
      Supplier customer = supplierRepository.findById(id).get();
      if (supplierUpdate.getName() != null) customer.setName(supplierUpdate.getName());
      if (supplierUpdate.getContact() != null) customer.setContact(supplierUpdate.getContact());
      if (supplierUpdate.getPhone() != null) customer.setPhone(supplierUpdate.getPhone());
      if (supplierUpdate.getAddress() != null) customer.setAddress(supplierUpdate.getAddress());
      supplierRepository.save(customer);
   }

   @Override
   public void save(Supplier supplier) {
      supplierRepository.save(supplier);
   }

}
