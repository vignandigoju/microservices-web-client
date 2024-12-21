package com.example.departmentDoctorServices.controller;

import com.example.departmentDoctorServices.dto.ResponseDto;
import com.example.departmentDoctorServices.entity.Doctor;
import com.example.departmentDoctorServices.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/addDoctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/getDoctor/{doctor_id}")
    public Doctor getDoctorById(@PathVariable("doctor_id") Long doctor_id){
        return doctorService.getDoctorById(doctor_id);
    }

    @GetMapping("/getDoctors/{specialization}")
    public List<Doctor> getDoctorsBySpecialization(@PathVariable("specialization") String specialization){
        return doctorService.getDoctorBySpecialization(specialization);
    }

    @GetMapping("withPatient/{doctor_id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("doctor_id") Long doctor_id){
        ResponseDto responseDto = doctorService.getDoctor(doctor_id);
        return ResponseEntity.ok(responseDto);
    }


}
