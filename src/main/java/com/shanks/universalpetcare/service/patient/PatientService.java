package com.shanks.universalpetcare.service.patient;

import com.shanks.universalpetcare.dto.EntityConverter;
import com.shanks.universalpetcare.dto.UserDto;
import com.shanks.universalpetcare.model.Patient;
import com.shanks.universalpetcare.model.User;
import com.shanks.universalpetcare.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientService {
        private final PatientRepository patientRepository;
        private final EntityConverter<User, UserDto> entityConverter;


        @Override
        public List<UserDto> getPatients() {
            List<Patient> patients = patientRepository.findAll();
            return patients.stream()
                    .map(po -> entityConverter.mapEntityToDto(po, UserDto.class)).toList();
        }
}
