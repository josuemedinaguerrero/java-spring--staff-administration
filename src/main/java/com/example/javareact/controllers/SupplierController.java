package com.example.javareact.controllers;

import com.example.javareact.entities.Customer;
import com.example.javareact.entities.Supplier;
import com.example.javareact.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

   @Autowired
   private SupplierService supplierService;

   @GetMapping("/api/suppliers")
   public List<Supplier> getAll() {
      return supplierService.getAll();
   }

   @GetMapping("/api/suppliers/{id}")
   public Supplier getById(@PathVariable Long id) {
      return supplierService.getById(id);
   }

   @DeleteMapping("/api/suppliers/{id}")
   public void remove(@PathVariable Long id) {
      supplierService.remove(id);
   }

   @PutMapping("/api/suppliers/{id}")
   public void update(@RequestBody Supplier supplier, @PathVariable Long id) {
      supplierService.update(supplier, id);
   }

   @PostMapping("/api/suppliers")
   public void save(@RequestBody Supplier supplier) {
      supplierService.save(supplier);
   }

}
