package com.example.demologwork.jwt.payload.request;

import com.example.demologwork.dto.LogWorkDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
<<<<<<< HEAD:src/main/java/com/example/demologwork/model/Request.java
public class Request {
    private long id;
    private String title;
    private String content;
    private String timeRequest;
    private boolean status;
    private LogWork logWork;
=======
@AllArgsConstructor
public class ForgotPasswordRequest {
    private String email;
>>>>>>> 5bb6b2b2fcb0c03ddac77b22fa601cae001b6d81:src/main/java/com/example/demologwork/jwt/payload/request/ForgotPasswordRequest.java
}
