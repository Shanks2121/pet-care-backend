package com.shanks.universalpetcare.factory;

import com.shanks.universalpetcare.exception.AlreadyExistsException;
import com.shanks.universalpetcare.model.User;
import com.shanks.universalpetcare.repository.UserRepository;
import com.shanks.universalpetcare.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SimpleUSerFactory implements UserFactory {
    private final UserRepository userRepository;
    private final VeterinarianFactory veterinarianFactory;
    private final PatientFactory patientFactory;
    private final AdminFactory adminFactory;
    private final PasswordEncoder passwordEncoder;



    @Override
    public User createUser(RegistrationRequest registrationRequest) {
        if(userRepository.existsByEmail(registrationRequest.getEmail())) {
            throw new AlreadyExistsException("Oops! "+registrationRequest.getEmail()+ " already exists!" );
        }
         registrationRequest.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));

        switch (registrationRequest.getUserType()) {
            case "VET" ->{return veterinarianFactory.createVeterinarian(registrationRequest);
            }
            case "PATIENT" -> { return  patientFactory.createPatient(registrationRequest);
            }
            case "ADMIN" -> {return adminFactory.createAdmin(registrationRequest);
            }
            default -> {
                return null;
            }
        }


    }
}
