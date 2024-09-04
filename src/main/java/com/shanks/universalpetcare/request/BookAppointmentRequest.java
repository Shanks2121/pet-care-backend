package com.shanks.universalpetcare.request;

import com.shanks.universalpetcare.model.Appointment;
import com.shanks.universalpetcare.model.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookAppointmentRequest {
    private Appointment appointment;
    private List<Pet> pets;
}
