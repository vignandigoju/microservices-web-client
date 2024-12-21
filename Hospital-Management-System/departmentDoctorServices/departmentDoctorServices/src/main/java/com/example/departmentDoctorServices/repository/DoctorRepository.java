package com.example.departmentDoctorServices.repository;

import com.example.departmentDoctorServices.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> getDoctorBySpecialization(String doctor);
}
