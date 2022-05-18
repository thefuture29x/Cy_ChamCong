package com.example.demologwork.jwt.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ResetPasswordRequest {
    private String token;
    private String password;
    private String confirm_pass;
}
