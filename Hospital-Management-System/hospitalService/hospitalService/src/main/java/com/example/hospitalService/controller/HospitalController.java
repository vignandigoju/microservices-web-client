package com.example.hospitalService.controller;

import com.example.hospitalService.Dto.ResponseDto;
import com.example.hospitalService.entity.Hospital;
import com.example.hospitalService.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/addhospital")
    public ResponseEntity<Hospital> addHospital(@RequestBody Hospital hospital){
        return ResponseEntity.ok(hospitalService.addHospital(hospital));

    }
    @GetMapping("{hosptialid}")
    public ResponseEntity<ResponseDto> getPatient(@PathVariable("hospital_id") Long hospital_id){
        ResponseDto responseDto = hospitalService.getHospital(hospital_id);
        return ResponseEntity.ok(responseDto);
    }
}
