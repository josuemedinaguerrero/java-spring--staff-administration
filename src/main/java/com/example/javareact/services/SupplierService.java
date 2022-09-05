package com.example.javareact.services;

import com.example.javareact.entities.Customer;
import com.example.javareact.entities.Supplier;

import java.util.List;

public interface SupplierService {

   List<Supplier> getAll();
   Supplier getById(Long id);
   void remove(Long id);
   void update(Supplier supplier, Long id);
   void save(Supplier customer);

}
