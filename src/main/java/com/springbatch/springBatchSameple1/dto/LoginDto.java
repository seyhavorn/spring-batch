package com.springbatch.springBatchSameple1.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;

    public LoginDto(String username, String s) {
        this.username = username;
        this.password = s;
    }
}
