package com.shanks.universalpetcare.service.user;

import com.shanks.universalpetcare.dto.UserDto;
import com.shanks.universalpetcare.model.User;
import com.shanks.universalpetcare.request.RegistrationRequest;
import com.shanks.universalpetcare.request.UserUpdateRequest;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IUserService {
    User register(RegistrationRequest request);

    User update(Long userId, UserUpdateRequest request);

    User findById(Long userId);

    void delete(Long userId);


    List<UserDto> getAllUsers();

    UserDto getUserWithDetails(Long userId) throws SQLException;

    long countVeterinarians();

    long countPatients();

    long countAllUsers();

    Map<String, Map<String,Long>> aggregateUsersByMonthAndType();



    Map<String, Map<String, Long>> aggregateUsersByEnabledStatusAndType();

}
