package com.shanks.universalpetcare.service.password;

import com.shanks.universalpetcare.request.ChangePasswordRequest;

public interface IChangePasswordService {
    void changePassword(Long userId, ChangePasswordRequest request);
}
