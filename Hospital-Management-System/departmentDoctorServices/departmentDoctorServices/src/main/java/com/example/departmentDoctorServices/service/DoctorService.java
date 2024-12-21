package com.example.departmentDoctorServices.service;

import com.example.departmentDoctorServices.dto.DoctorDto;
import com.example.departmentDoctorServices.dto.PatientDto;
import com.example.departmentDoctorServices.dto.ResponseDto;
import com.example.departmentDoctorServices.entity.Doctor;
import com.example.departmentDoctorServices.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    private WebClient webClient;

    public Doctor saveDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(Long doctor_id){
        return doctorRepository.findById(doctor_id).orElse(null);
    }
    public List<Doctor> getDoctorBySpecialization(String specialization){
        return doctorRepository.getDoctorBySpecialization(specialization);
    }

    private DoctorDto mapToDoctorDto(Doctor doctor) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setDoctor_id(doctor.getDoctor_id());
        doctorDto.setName(doctor.getName());
        doctorDto.setEmail(doctor.getEmail());
        doctorDto.setPhone(doctor.getPhone());
        doctorDto.setSpecialization(doctor.getSpecialization());
        doctorDto.setSuccess_rate(doctor.getSuccess_rate());
        doctorDto.setYears_of_experience(doctor.getYears_of_experience());
        return doctorDto;
    }

    public ResponseDto getDoctor(Long doctor_id) {
        ResponseDto responseDto = new ResponseDto();
        Doctor doctor = doctorRepository.findById(doctor_id).orElseThrow(() -> new RuntimeException("Doctor not found"));
        DoctorDto doctorDto = mapToDoctorDto(doctor);

        List<PatientDto> patientToList = webClient.get()
                .uri("http://localhost:9097/patient/getPatientsByDoctorId/" + doctor.getDoctor_id())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<PatientDto>>() {})
                .block();

        responseDto.setDoctorDto(doctorDto);
        responseDto.setPatientDto(patientToList);

        return responseDto;
    }
}
