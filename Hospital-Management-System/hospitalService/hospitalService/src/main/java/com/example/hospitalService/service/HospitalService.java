package com.example.hospitalService.service;

import com.example.hospitalService.Dto.DoctorDto;
import com.example.hospitalService.Dto.HospitalDto;
import com.example.hospitalService.Dto.PatientDto;
import com.example.hospitalService.Dto.ResponseDto;
import com.example.hospitalService.entity.Hospital;
import com.example.hospitalService.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepo;

    @Autowired
    private WebClient.Builder webClientBuilder;


    public Hospital addHospital(Hospital hospital) {
        return hospitalRepo.save(hospital);
    }


    public ResponseDto getHospital(Long hospitalId) {
        ResponseDto responseDto = new ResponseDto();
        Hospital hospital = hospitalRepo.findById(hospitalId)
                .orElseThrow(() -> new RuntimeException("Hospital not found"));
        HospitalDto hospitalDto = mapToHospital(hospital);
        // Fetch flights for the airline
        List<DoctorDto> doctorDtoList = webClientBuilder.baseUrl("http://localhost:9093")
                .build()
                .get()
                .uri("/doctor/" + hospital.getHospital_id())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<DoctorDto>>() {})
                .block();

        // Fetch passengers for each flight
        for (DoctorDto doctorDto : doctorDtoList) {
            List<PatientDto> patientDtoList = webClientBuilder.baseUrl("http://localhost:9097   ")
                    .build()
                    .get()
                    .uri("/patient/" + doctorDto.getDoctor_id())
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<PatientDto>>() {})
                    .block();

            doctorDto.setPatientDtoList(patientDtoList);
        }

        responseDto.setHospitalDto(hospitalDto);
        responseDto.setDoctorDto(doctorDtoList);

        return responseDto;
    }

    private HospitalDto mapToHospital(Hospital hospital) {
        HospitalDto dto = new HospitalDto();
        dto.setHospital_name(hospital.getHospital_name());
        dto.setHospital_id(hospital.getHospital_id());
        dto.setAddress(hospital.getAddress());
        return dto;
    }
}