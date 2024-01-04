package com.groupeisi.hospital.repository;

import com.groupeisi.hospital.entities.Appointement;
import com.groupeisi.hospital.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
