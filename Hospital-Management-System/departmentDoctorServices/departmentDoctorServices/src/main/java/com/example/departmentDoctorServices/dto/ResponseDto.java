package com.example.departmentDoctorServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private DoctorDto doctorDto;
    private List<PatientDto> patientDto;

    public DoctorDto getDoctorDto() {
        return doctorDto;
    }

    public void setDoctorDto(DoctorDto doctorDto) {
        this.doctorDto = doctorDto;
    }

    public List<PatientDto> getPatientDto() {
        return patientDto;
    }

    public void setPatientDto(List<PatientDto> patientDto) {
        this.patientDto = patientDto;
    }
}