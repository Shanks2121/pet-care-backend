package com.shanks.universalpetcare.request;

import lombok.Data;

@Data
public class PasswordResetRequest {
    private String token;
    private String newPassword;
    
}
