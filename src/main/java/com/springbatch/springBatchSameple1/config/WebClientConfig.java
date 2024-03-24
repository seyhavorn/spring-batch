package com.springbatch.springBatchSameple1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://klocknow-api.abitech.a2hosted.com/api")
                .defaultHeader("Content-Type", "application/json; charset=utf-8")
                .defaultHeader("Accept", "application/json")
                .defaultHeader("IP-Address", "192.168.0.1")
                .defaultHeader("Device-ID", "AA1B5279-E325-4C92-9684-3D6190B6FF24")
                .build();
    }
}
