//package com.springbatch.springBatchSameple1.helpers;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.logging.Logger;
//
//@Component
//@Configuration
//public class OneSignalConfig {
//
//    public static final Logger logger = Logger.getLogger(OneSignalConfig.class.getName());
//
//    @Value("${KLOCKNOW_ONESIGNAL_BASE_URL}")
//    private String onesignalBaseUrl;
//
//    @Value("${KLOCKNOW_ONESIGNAL_CLIENT_APP_ID}")
//    private String oneSignalClientAppId;
//
//    @Value("${KLOCKNOW_ONESIGNAL_CLIENT_APP_ID}")
//    private String oneSignalClientRestApiKey;
//
//    @Value("${KLOCKNOW_ONESIGNAL_KEY}")
//    private String oneSignalKey;
//
//
//    @Bean
//    public WebClient webClient() {
//        return WebClient.builder()
//                .baseUrl("https://klocknow-api.abitech.a2hosted.com/api")
//                .defaultHeader("Content-Type", "application/json; charset=utf-8")
//                .defaultHeader("Accept", "application/json")
//                .defaultHeaders(headers -> headers.set("Authorization", "Basic " + oneSignalClientRestApiKey))
//                .defaultHeader("IP-Address",  "192.168.0.1")
//                .defaultHeader("Device-ID",  "AA1B5279-E325-4C92-9684-3D6190B6FF24")
//                .build();
//    }
//}
