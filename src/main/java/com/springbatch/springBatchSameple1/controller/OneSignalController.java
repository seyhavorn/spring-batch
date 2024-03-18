package com.springbatch.springBatchSameple1.controller;

import com.springbatch.springBatchSameple1.Service.OneSignalService;
import com.springbatch.springBatchSameple1.dto.SendNotificationDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class OneSignalController {

    private final OneSignalService oneSignalService;

    @RequestMapping("/onesignal")
    public Mono<SendNotificationDto> sendNotification() {
        return oneSignalService.sendNotification();
    }

}
