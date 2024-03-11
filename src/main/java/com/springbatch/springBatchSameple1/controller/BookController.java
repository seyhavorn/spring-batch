package com.springbatch.springBatchSameple1.controller;


import com.springbatch.springBatchSameple1.Enitity.BookEntity;
import com.springbatch.springBatchSameple1.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
@Slf4j
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public List<BookEntity> getAll() {
        return bookRepository.findAll();
    }
}
