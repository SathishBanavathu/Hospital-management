package com.example.Hospital_management_system.controller;

import com.example.Hospital_management_system.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatientController {
    HashMap<Integer, Patient> patientDb = new HashMap<>();
    @PostMapping("/addPatient")
    public String  addPatient (@RequestBody Patient patient)
    {
        patientDb.put(patient.getPatientId(),patient);
       return "Patient added successfully";
    }

    @GetMapping("/getPatientInfo")
    public Patient getPatientInfo(@RequestParam("patientId")Integer patientId)
    {
       Patient patient = patientDb.get(patientId);
       return patient;
    }
@GetMapping("/getAllPatients") 
    public List<Patient> getAllPatient()
    {
        List<Patient> patientList = new ArrayList();
        for (Patient p:patientDb.values()) {
            patientList.add(p);
        }
        return patientList;
    }
@GetMapping("/getPatientByName")
    public Patient getPatientByName(@RequestParam("name")String name)
    {
        for (Patient p:patientDb.values()) {
             if(p.getName().equals(name))
             {
                 return p;
             }
        }
        return null;
    }
@GetMapping("/getPatientsGraterByAge")
    public List<Patient> getPatientsGraterByAge(@RequestParam("age") int age)
    {
        List<Patient> patientList = new ArrayList<>();
        for(Patient p :patientDb.values())
        {
            if(p.getAge()>age)
            {
                patientList.add(p);
            }
        }
        return patientList;
    }


    @GetMapping("/getPatientByAgeAndDisease")
    public List<Patient> getPatientByAgeAndDisease(@RequestParam("age") Integer age,@RequestParam("disease") String disease)
    {
        List<Patient> patientList = new ArrayList<>();
        for(Patient p :patientDb.values())
        {
            if(p.getAge()>age&&p.getDisease().equals(disease))
            {
                patientList.add(p);
            }
        }
        return patientList;
    }

    @PutMapping("/updateDisease")
    public String updateDisease(@RequestParam("patientId") Integer patientId,@RequestParam("disease")String disease)
    {
       if(patientDb.containsKey(patientId))
       {
           Patient patient = patientDb.get(patientId);
           patient.setDisease(disease);
           patientDb.put(patientId,patient);
           return"Updated successfully";
       }
       else
       {
           return "Invalid Patient Id";
       }

    }

    @PutMapping("/updatePatientDetails")
    public String updatePatientDetails(@RequestBody Patient patient)
    {
         int key = patient.getPatientId();

       if(patientDb.containsKey(key))
       {
           patientDb.put(patient.getPatientId(),patient);
           return "Updated successfully";
       }
       else
       {
           return "Patient Details are not Existing";
       }

    }

    @DeleteMapping("/deletePatient")
    public String deletePatient(@RequestParam("patientId") Integer patientId)
    {
        if(patientDb.containsKey(patientId))
        {
            patientDb.remove(patientId);
            return "Deleted successfully";
        }
        else
        {
            return "Invalid Patient Id";
        }
    }
}
