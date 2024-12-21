package com.example.departmentDoctorServices.dto;

import jakarta.persistence.Column;

public class PatientDto {
    public Long id;
    public String name;
    public String email;
    public String phone;
    public String doctor_name;
    public String disease;
    public Long doctorId;
    public String medication;
}
