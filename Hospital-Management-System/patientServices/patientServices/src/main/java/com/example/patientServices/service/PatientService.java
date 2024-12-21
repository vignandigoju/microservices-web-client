package com.example.patientServices.service;

import com.example.patientServices.entity.Patient;
import com.example.patientServices.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    public PatientRepository patientRepository;

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }
    public Patient getPatientById(Long patient_id){
        return patientRepository.findById(patient_id).orElse(null);
    }
    public List<Patient> getPatientsByDoctorId(Long doctor_id){
        return patientRepository.getPatientsByDoctorId(doctor_id);
    }
}
