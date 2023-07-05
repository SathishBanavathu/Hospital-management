package com.example.Hospital_management_system.controller;

import com.example.Hospital_management_system.model.Doctor;
import com.example.Hospital_management_system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/add")
    public String addDoctor(@RequestBody Doctor doctor)
    {
        return doctorService.addDoctor(doctor);
    }
    @GetMapping("/basedOnSpecialization")
    public List<Doctor> BasedOnSpecialization(@RequestParam("specialization") String specialization)
    {
      return doctorService.BasedOnSpecialization(specialization);
    }
}
