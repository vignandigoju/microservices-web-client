package com.example.hospitalService.Dto;

import java.util.List;

public class ResponseDto {

    private HospitalDto hospitalDto;
    private List<DoctorDto> doctorDto;
    private List<PatientDto> patientDto;

    public HospitalDto getHospitalDto() {
        return hospitalDto;
    }

    public void setHospitalDto(HospitalDto hospitalDto) {
        this.hospitalDto = hospitalDto;
    }

    public List<DoctorDto> getDoctorDto() {
        return doctorDto;
    }

    public void setDoctorDto(List<DoctorDto> doctorDto) {
        this.doctorDto = doctorDto;
    }

    public List<PatientDto> getPatientDto() {
        return patientDto;
    }

    public void setPatientDto(List<PatientDto> patientDto) {
        this.patientDto = patientDto;
    }
}
