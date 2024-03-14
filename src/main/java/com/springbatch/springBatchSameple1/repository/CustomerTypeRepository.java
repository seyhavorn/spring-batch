package com.springbatch.springBatchSameple1.repository;

import com.springbatch.springBatchSameple1.entity.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
