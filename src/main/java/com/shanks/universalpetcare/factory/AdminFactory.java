package com.shanks.universalpetcare.factory;

import com.shanks.universalpetcare.model.Admin;
import com.shanks.universalpetcare.repository.AdminRepository;
import com.shanks.universalpetcare.request.RegistrationRequest;
import com.shanks.universalpetcare.service.role.IRoleService;
import com.shanks.universalpetcare.service.user.UserAttributesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminFactory {
    private final AdminRepository adminRepository;
    private final UserAttributesMapper userAttributesMapper;
    private final IRoleService roleService;


    public Admin createAdmin(RegistrationRequest request) {
        Admin admin = new Admin();
        admin.setRoles(roleService.setUserRole("ADMIN"));
        userAttributesMapper.setCommonAttributes(request, admin);
        return adminRepository.save(admin);
    }
}
