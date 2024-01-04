package com.groupeisi.hospital;

import com.groupeisi.hospital.entities.*;
import com.groupeisi.hospital.repository.AppointementRepository;
import com.groupeisi.hospital.repository.ConsultationRepository;
import com.groupeisi.hospital.repository.DoctorRepository;
import com.groupeisi.hospital.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            PatientRepository patientRepository,
            DoctorRepository doctorRepository,
            AppointementRepository appointementRepository,
            ConsultationRepository consultationRepository
            ){
        return args -> {
            //Ajout des patients dans la base de donnee stream.of je lui donne une liste de nom et il me cree ces patients
            /*Stream.of("awa tall","mamadou sow","lucas sall")
                    .forEach(name->{
                        Patient patient = new Patient();
                        patient.setName(name);
                        patient.setBirthdate(new Date());
                        patientRepository.save(patient);
                    });
*/
            //Ajout des docteurs dans la base de donnee stream.of je lui donne une liste de nom et il me cree ces docteurs

            /*Stream.of("Dr Diagne","Dr Samb")
                    .forEach(name->{
                        Doctor doctor = new Doctor();
                        doctor.setName(name);
                        doctor.setEmail(name+"@dkrEmergency.org");
                        doctor.setSpeciality(Math.random()>0.5?"Dentiste":"infirmier");
                        doctorRepository.save(doctor);
                    });*/

            //Patient patient1 = patientRepository.findById(1L).orElse(null);

            /*Patient patient = patientRepository.findByName("khary seye");
            Doctor doctor = doctorRepository.findByName("Dr Diagne");

            Appointement appointement = new Appointement();
            appointement.setDate(new Date());
            appointement.setStatus(Status.PENDING);
            appointement.setPatient(patient);
            appointement.setDoctor(doctor);
            appointementRepository.save(appointement);*/

            Appointement appointement = appointementRepository.findById(1L).get();
            Consultation consultation = new Consultation();
            consultation.setDate_consultation(new Date());
            consultation.setRapport("Rapport RDC n°034");
            consultation.setAppointement(appointement);
            consultationRepository.save(consultation);
        };
    }

}
