package com.shanks.universalpetcare.factory;

import com.shanks.universalpetcare.model.Veterinarian;
import com.shanks.universalpetcare.repository.VeterinarianRepository;
import com.shanks.universalpetcare.request.RegistrationRequest;
import com.shanks.universalpetcare.service.role.IRoleService;
import com.shanks.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VeterinarianFactory {
    private final VeterinarianRepository veterinarianRepository;
    private final UserAttributesMapper userAttributesMapper;
    private final IRoleService roleService;

    public Veterinarian createVeterinarian(RegistrationRequest request) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setRoles(roleService.setUserRole("VET"));
        userAttributesMapper.setCommonAttributes(request, veterinarian);
        veterinarian.setSpecialization(request.getSpecialization());
        return veterinarianRepository.save(veterinarian);
    }
}
