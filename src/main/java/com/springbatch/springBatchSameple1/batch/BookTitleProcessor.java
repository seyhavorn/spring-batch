package com.springbatch.springBatchSameple1.batch;

import com.springbatch.springBatchSameple1.Enitity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class BookTitleProcessor implements ItemProcessor<BookEntity, BookEntity> {


    @Override
    public BookEntity process(BookEntity item) throws Exception {
        log.info("Processing title for {}", item);
        item.setTitle(item.getTitle().toUpperCase());
        return item;
    }
}
