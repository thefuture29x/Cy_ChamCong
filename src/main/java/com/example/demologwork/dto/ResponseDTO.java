package com.example.demologwork.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDTO {

    private static final long serialVersionUID = 1L;

    private String version = "1.0";
    private String message;
    private String result;
    private Object data;

    public ResponseDTO(String message, String result, Object data) {
        this.message = message;
        this.result = result;
        this.data = data;
    }

    public static ResponseDTO of(Object data, String prefix) {
        return new ResponseDTO(data != null ? prefix.concat(" successfully!") : prefix.concat(" failed!"), data != null ? "SUCCESS" : "ERROR", data);
    }
}
