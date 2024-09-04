package com.shanks.universalpetcare.repository;

import com.shanks.universalpetcare.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
