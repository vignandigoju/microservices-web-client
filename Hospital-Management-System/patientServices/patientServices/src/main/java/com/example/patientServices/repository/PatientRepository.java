package com.example.patientServices.repository;

import com.example.patientServices.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> getPatientsByDoctorId(Long doctor_id);
}
