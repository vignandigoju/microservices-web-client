package com.example.hospitalService.Dto;

import java.util.List;

public class DoctorDto {

    public Long doctor_id;
    public String name;
    public String specialization;
    public String years_of_experience;
    public String success_rate;
    public String phone;
    public  String email;
    public List<PatientDto> patientDtoList;

    public List<PatientDto> getPatientDtoList() {
        return patientDtoList;
    }

    public void setPatientDtoList(List<PatientDto> patientDtoList) {
        this.patientDtoList = patientDtoList;
    }

    public Long getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(String years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public String getSuccess_rate() {
        return success_rate;
    }

    public void setSuccess_rate(String success_rate) {
        this.success_rate = success_rate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
