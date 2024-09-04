package com.shanks.universalpetcare.service.role;

import com.shanks.universalpetcare.model.Role;

import java.util.List;
import java.util.Set;

public interface IRoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    Role getRoleByName(String roleName);
    void saveRole(Role role);

    Set<Role> setUserRole(String userType);

    // Collection<Role> setUserRoles(List<String> roles);
    
}
