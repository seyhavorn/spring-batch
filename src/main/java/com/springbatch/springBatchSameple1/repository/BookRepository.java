package com.springbatch.springBatchSameple1.repository;

import com.springbatch.springBatchSameple1.Enitity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
