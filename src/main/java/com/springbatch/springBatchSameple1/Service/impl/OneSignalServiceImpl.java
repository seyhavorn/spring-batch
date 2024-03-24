package com.springbatch.springBatchSameple1.Service.impl;

import com.springbatch.springBatchSameple1.Service.OneSignalService;
import com.springbatch.springBatchSameple1.dto.LoginDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;


@Service
@AllArgsConstructor
public class OneSignalServiceImpl implements OneSignalService {
    private static final String ONE_SIGNAL_API_URL = "https://jsonplaceholder.typicode.com/posts/1";
    private static final String REST_API_KEY = "YOUR_REST_API_KEY";
    private static final String REST_API_SECRET = "YOUR_REST_API_SECRET";
    private static final Array Header = null;

    private final WebClient webClient;


    @Override
    public Mono<Object> sendNotification() {
        LoginDto loginDto = new LoginDto("joden25", "123456");
        return webClient.post()
                .uri("/login")
                .bodyValue(loginDto)
                .retrieve()
                .bodyToMono(Object.class);
    }


//    private OneSignalConfig oneSignalConfig;
//    private final WebClient webClient;
//
//
//    private Disposable process() {
//        Mono<String> oneSignalResponse = sendNotifications(Map.of());
//        return oneSignalResponse.subscribe();
//    }
//
//
//    private Mono<String> sendNotifications(Map<String, Object> fields) {
//        return webClient.post()
//                .uri("/")
//                .body(BodyInserters.fromValue(fields))
//                .retrieve()
//                .bodyToMono(String.class)
//                .doOnSuccess(response -> {
//                    System.out.println("OneSignal API Response" + response);
//                });
//    }
}
