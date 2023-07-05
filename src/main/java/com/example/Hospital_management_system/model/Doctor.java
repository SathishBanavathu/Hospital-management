package com.example.Hospital_management_system.model;

public class Doctor {
    private String name;
    private int id;
    private int age;
    private String specialization;

    public Doctor(String name, int id, int age, String specialization) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
