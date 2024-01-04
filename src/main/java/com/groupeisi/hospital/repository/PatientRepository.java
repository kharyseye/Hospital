package com.groupeisi.hospital.repository;

import com.groupeisi.hospital.entities.Appointement;
import com.groupeisi.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByName(String name);
}
