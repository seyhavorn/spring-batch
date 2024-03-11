package com.springbatch.springBatchSameple1.batch;

import com.springbatch.springBatchSameple1.Enitity.BookEntity;
import com.springbatch.springBatchSameple1.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class BookWrite implements ItemWriter<BookEntity> {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public void write(Chunk<? extends BookEntity> chunk) throws Exception {
        log.info("Writing {} books", chunk.getItems().size());
        bookRepository.saveAll(chunk.getItems());
    }
    
}
