package com.shanks.universalpetcare.service.patient;

import com.shanks.universalpetcare.dto.UserDto;

import java.util.List;

public interface IPatientService {
    List<UserDto> getPatients();
}
