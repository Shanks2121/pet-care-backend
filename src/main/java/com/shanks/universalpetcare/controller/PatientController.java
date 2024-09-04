package com.shanks.universalpetcare.controller;


import com.shanks.universalpetcare.dto.UserDto;
import com.shanks.universalpetcare.response.ApiResponse;
import com.shanks.universalpetcare.service.patient.IPatientService;
import com.shanks.universalpetcare.utils.FeedBackMessage;
import com.shanks.universalpetcare.utils.UrlMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(UrlMapping.PATIENTS)
public class PatientController {
    private final IPatientService patientService;

    @GetMapping(UrlMapping.GET_ALL_PATIENTS)
    public ResponseEntity<ApiResponse> getAllPatients() {
        List<UserDto> patients = patientService.getPatients();
        return ResponseEntity.ok(new ApiResponse(FeedBackMessage.RESOURCE_FOUND, patients));
    }
}
