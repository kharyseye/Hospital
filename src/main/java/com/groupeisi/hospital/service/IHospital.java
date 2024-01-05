package com.groupeisi.hospital.service;

import com.groupeisi.hospital.entities.Appointement;
import com.groupeisi.hospital.entities.Consultation;
import com.groupeisi.hospital.entities.Doctor;
import com.groupeisi.hospital.entities.Patient;

public interface IHospital {
    Patient savePatient(Patient patient);
    Doctor saveDoctor(Doctor doctor);
    Appointement saveAppointement(Appointement appointement);
    Consultation saveConsultation(Consultation consultation);
}
