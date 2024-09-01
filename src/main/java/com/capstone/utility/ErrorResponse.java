package com.capstone.utility;

import lombok.Data;

@Data
public class ErrorResponse {
    public String message;

    ErrorResponse(String message){
        this.message = message;
    }
}
