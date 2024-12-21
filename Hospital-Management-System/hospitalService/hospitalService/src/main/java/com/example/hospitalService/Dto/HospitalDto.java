package com.example.hospitalService.Dto;

public class HospitalDto {
    public Long  hospital_id;
    public String hospital_name;
    public String address;

    public HospitalDto(Long hospital_id, String address, String hospital_name) {
        this.hospital_id = hospital_id;
        this.address = address;
        this.hospital_name = hospital_name;
    }

    public HospitalDto() {
    }

    public HospitalDto(Long hospital_id) {
        this.hospital_id = hospital_id;
    }

    public Long getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(Long hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
