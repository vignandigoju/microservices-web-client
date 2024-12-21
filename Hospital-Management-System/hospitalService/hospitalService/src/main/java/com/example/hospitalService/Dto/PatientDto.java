package com.example.hospitalService.Dto;

public class PatientDto {

        public Long id;
        public String name;
        public String email;
        public String phone;
        public String doctor_name;
        public String disease;
        public Long doctorId;
        public String medication;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
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

        public String getDoctor_name() {
                return doctor_name;
        }

        public void setDoctor_name(String doctor_name) {
                this.doctor_name = doctor_name;
        }

        public String getDisease() {
                return disease;
        }

        public void setDisease(String disease) {
                this.disease = disease;
        }

        public Long getDoctorId() {
                return doctorId;
        }

        public void setDoctorId(Long doctorId) {
                this.doctorId = doctorId;
        }

        public String getMedication() {
                return medication;
        }

        public void setMedication(String medication) {
                this.medication = medication;
        }
}


