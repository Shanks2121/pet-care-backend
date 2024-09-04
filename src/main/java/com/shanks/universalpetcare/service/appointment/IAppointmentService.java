package com.shanks.universalpetcare.service.appointment;

import com.shanks.universalpetcare.dto.AppointmentDto;
import com.shanks.universalpetcare.model.Appointment;
import com.shanks.universalpetcare.request.AppointmentUpdateRequest;
import com.shanks.universalpetcare.request.BookAppointmentRequest;

import java.util.List;
import java.util.Map;

public interface IAppointmentService {
    Appointment createAppointment(BookAppointmentRequest appointment, Long sender, Long recipient);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Long id, AppointmentUpdateRequest request);


    void deleteAppointment(Long id);
    Appointment getAppointmentById(Long id);
    Appointment getAppointmentByNo(String appointmentNo);
    List<AppointmentDto> getUserAppointments(Long userId);
    Appointment cancelAppointment(Long appointmentId);

    Appointment approveAppointment(Long appointmentId);

    Appointment declineAppointment(Long appointmentId);

    long countAppointment();

    List<Map<String, Object>> getAppointmentSummary();

    List<Long> getAppointmentIds();

    void setAppointmentStatus(Long appointmentId);
}
