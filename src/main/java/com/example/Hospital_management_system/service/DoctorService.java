package com.example.Hospital_management_system.service;

import com.example.Hospital_management_system.model.Doctor;
import com.example.Hospital_management_system.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    public String addDoctor(Doctor doctor)
    {
       return doctorRepository.addDoctor(doctor);
    }

    public List<Doctor> BasedOnSpecialization( String specialization)
    {
        List<Doctor> result = new ArrayList<>();
        for(Doctor doctor :doctorRepository.getAllDoctors())
        {
            if(doctor.getSpecialization().equalsIgnoreCase(specialization))
            {
                result.add(doctor);
            }
        }
        return result;
    }
}
