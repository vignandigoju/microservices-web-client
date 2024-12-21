package com.example.patientServices.controller;

import com.example.patientServices.entity.Patient;
import com.example.patientServices.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    public PatientService patientService;

    @GetMapping("/getPatientById/{patient_id}")
    public Patient getPatientById(@PathVariable("patient_id") Long patient_id){
        return patientService.getPatientById(patient_id);
    }

    @PostMapping("/addPatient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }
    @GetMapping("/getPatientsByDoctorId/{doctor_id}")
    public List<Patient> getPatientsByDoctorId(@PathVariable ("doctor_id") Long doctor_id){
        return patientService.getPatientsByDoctorId(doctor_id);
    }
}
