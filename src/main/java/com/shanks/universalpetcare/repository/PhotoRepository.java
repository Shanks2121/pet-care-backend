package com.shanks.universalpetcare.repository;

import com.shanks.universalpetcare.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
