package com.groupeisi.hospital.repository;

import com.groupeisi.hospital.entities.Appointement;
import com.groupeisi.hospital.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByName(String name);
}
