package com.shanks.universalpetcare.event;

import com.shanks.universalpetcare.model.Appointment;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class AppointmentDeclinedEvent extends ApplicationEvent {
    private final Appointment appointment;

    public AppointmentDeclinedEvent(Appointment appointment) {
        super(appointment);
        this.appointment = appointment;
    }
}
