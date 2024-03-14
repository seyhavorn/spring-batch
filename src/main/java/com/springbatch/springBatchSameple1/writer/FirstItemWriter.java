package com.springbatch.springBatchSameple1.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class FirstItemWriter implements ItemWriter<Long> {

    @Override
    public void write(Chunk<? extends Long> chunk) throws Exception {

//        List<Long> list = (List<Long>) chunk.getItems();
//        for (Long item : list) {
//            System.out.println("Inside Item Writer" + item);
//        }

        System.out.println("Inside Item Writer" + chunk.getItems());
        chunk.getItems().forEach(System.out::println);
    }
}
