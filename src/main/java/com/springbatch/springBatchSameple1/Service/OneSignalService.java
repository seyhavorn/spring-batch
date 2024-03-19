package com.springbatch.springBatchSameple1.Service;

import reactor.core.publisher.Mono;

public interface OneSignalService {

    Mono<Object> sendNotification();
}
