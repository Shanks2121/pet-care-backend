package com.shanks.universalpetcare.dto;

import com.shanks.universalpetcare.enums.AppointmentStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
public class AppointmentDto {
    private Long id;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private LocalDate createdAt;
    private String reason;
    private AppointmentStatus status;
    private String appointmentNo;
    private PatientDto patient;
    private VeterinarianDto veterinarian;
    private List<PetDto> pets;
}
