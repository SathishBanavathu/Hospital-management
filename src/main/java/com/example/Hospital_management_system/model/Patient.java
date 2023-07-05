package com.example.Hospital_management_system.model;

public class Patient {
    private String name;
    private int patientId;
    private String disease;
    private int age;

    public Patient(String name, int patientId, String disease, int age) {
        this.name = name;
        this.patientId = patientId;
        this.disease = disease;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
