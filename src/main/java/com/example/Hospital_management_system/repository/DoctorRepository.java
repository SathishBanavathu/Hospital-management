package com.example.Hospital_management_system.repository;

import com.example.Hospital_management_system.model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;

public class DoctorRepository {

    HashMap<Integer, Doctor> doctorDb = new HashMap();

    public String addDoctor(Doctor doctor)
    {
        doctorDb.put(doctor.getId(), doctor);
        return"Doctor Added Successfully";
    }

    public ArrayList<Doctor> getAllDoctors()
    {
        ArrayList<Doctor> allDoctors = new ArrayList<Doctor>();
        for (Doctor doctor:doctorDb.values()) {
            allDoctors.add(doctor);
        }
        return allDoctors;
    }

}
