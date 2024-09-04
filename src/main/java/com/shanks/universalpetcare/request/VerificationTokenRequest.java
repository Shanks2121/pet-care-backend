package com.shanks.universalpetcare.request;

import com.shanks.universalpetcare.model.User;
import lombok.Data;

import java.util.Date;

@Data
public class VerificationTokenRequest {
    private String token;
    private Date expirationTime;
    private User user;
}
