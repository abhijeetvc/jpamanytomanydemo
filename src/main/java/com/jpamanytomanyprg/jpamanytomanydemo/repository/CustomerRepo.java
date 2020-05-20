package com.jpamanytomanyprg.jpamanytomanydemo.repository;

import com.jpamanytomanyprg.jpamanytomanydemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
