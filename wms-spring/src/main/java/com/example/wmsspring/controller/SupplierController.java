package com.example.wmsspring.controller;

import com.example.wmsspring.model.Supplier;
import com.example.wmsspring.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping("/suppliers")
    private List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }
}
