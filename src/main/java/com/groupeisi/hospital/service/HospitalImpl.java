package com.groupeisi.hospital.service;

import com.groupeisi.hospital.entities.Appointement;
import com.groupeisi.hospital.entities.Consultation;
import com.groupeisi.hospital.entities.Doctor;
import com.groupeisi.hospital.entities.Patient;
import com.groupeisi.hospital.repository.AppointementRepository;
import com.groupeisi.hospital.repository.ConsultationRepository;
import com.groupeisi.hospital.repository.DoctorRepository;
import com.groupeisi.hospital.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalImpl implements IHospital {
    private PatientRepository patientRepository;
    private DoctorRepository doctorRepository;
    private AppointementRepository appointementRepository;
    private ConsultationRepository consultationRepository;

    public HospitalImpl(PatientRepository patientRepository, DoctorRepository doctorRepository, AppointementRepository appointementRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointementRepository = appointementRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient) ;
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Appointement saveAppointement(Appointement appointement) {
        return appointementRepository.save(appointement);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
