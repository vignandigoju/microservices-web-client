package com.example.patientServices.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="patientinfo")
public class Patient {
    @Id
    public Long id;
    public String name;
    public String email;
    public String phone;
    public String doctor_name;
    public String disease;
    @Column(name = "doctorId")
    public Long doctorId;
    public String medication;

    public Long getPatient_id() {
        return id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatient_id(Long patient_id) {
        this.id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Long getDoctor_id() {
        return doctorId;
    }

    public void setDoctor_id(Long doctor_id) {
        this.doctorId = doctor_id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }


    public Patient() {
    }

    public Patient(Long patient_id, String name, String email, String phone, String doctor, String disease, Long doctor_id, String medication) {
        this.id = patient_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.disease = disease;
        this.doctorId = doctor_id;
        this.medication = medication;
    }
}
