package com.springbatch.springBatchSameple1.Service;

import com.springbatch.springBatchSameple1.dto.SendNotificationDto;
import reactor.core.publisher.Mono;

public interface OneSignalService {

    Mono<SendNotificationDto> sendNotification();
}
