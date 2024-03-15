package com.springbatch.springBatchSameple1.Service.impl;

import com.springbatch.springBatchSameple1.Service.OneSignalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class OneSignalServiceImpl implements OneSignalService {


    private static final String ONE_SIGNAL_API_URL = "https://onesignal.com/api/v1/notifications";
    private static final String REST_API_KEY = "YOUR_REST_API_KEY";

    private final RestTemplate restTemplate;


    @Override
    public void sendNotification(String message) {
        System.out.println("Hello World!");
    }
}
