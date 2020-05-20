package com.jpamanytomanyprg.jpamanytomanydemo.controller;

import com.jpamanytomanyprg.jpamanytomanydemo.model.Customer;
import com.jpamanytomanyprg.jpamanytomanydemo.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(value="/save")
    public String addCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return "Customer saved";
    }
}
