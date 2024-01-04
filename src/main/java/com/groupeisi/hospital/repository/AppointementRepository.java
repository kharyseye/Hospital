package com.groupeisi.hospital.repository;

import com.groupeisi.hospital.entities.Appointement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointementRepository extends JpaRepository<Appointement, Long> {
}
