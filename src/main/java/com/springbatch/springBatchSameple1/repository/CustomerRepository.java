package com.springbatch.springBatchSameple1.repository;


import com.springbatch.springBatchSameple1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
