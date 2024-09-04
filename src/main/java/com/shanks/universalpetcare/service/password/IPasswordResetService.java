package com.shanks.universalpetcare.service.password;

import com.shanks.universalpetcare.model.User;

import java.util.Optional;

public interface IPasswordResetService {

    Optional<User> findUserByPasswordResetToken(String token);
    void requestPasswordReset(String email);
    String resetPassword(String password, User user);
}
