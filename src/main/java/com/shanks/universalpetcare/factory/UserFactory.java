package com.shanks.universalpetcare.factory;

import com.shanks.universalpetcare.model.User;
import com.shanks.universalpetcare.request.RegistrationRequest;

public interface UserFactory {
    public User createUser(RegistrationRequest registrationRequest);
}
