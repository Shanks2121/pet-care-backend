package com.shanks.universalpetcare.factory;

import com.shanks.universalpetcare.model.Patient;
import com.shanks.universalpetcare.repository.PatientRepository;
import com.shanks.universalpetcare.request.RegistrationRequest;
import com.shanks.universalpetcare.service.role.IRoleService;
import com.shanks.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientFactory {
    private final PatientRepository patientRepository;
    private final UserAttributesMapper userAttributesMapper;
    private final IRoleService roleService;

    public Patient createPatient(RegistrationRequest request) {
        Patient patient = new Patient();
        patient.setRoles(roleService.setUserRole("PATIENT"));
        userAttributesMapper.setCommonAttributes(request, patient);
        return patientRepository.save(patient);
    }
}
