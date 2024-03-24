package com.springbatch.springBatchSameple1.dto;

import lombok.Data;

@Data
public class SendNotificationDto {
    private String userId;
    private String id;
    private String title;
    private String body;
}
