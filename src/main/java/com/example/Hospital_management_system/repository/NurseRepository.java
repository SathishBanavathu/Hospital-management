package com.example.Hospital_management_system.repository;

import com.example.Hospital_management_system.model.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class NurseRepository {
    HashMap<Integer, Nurse> nurseDb = new HashMap<>();
    public String addNurse(Nurse nurse)
    {
        nurseDb.put(nurse.getId(),nurse);
        return "Added Successfully";
    }

    public List<Nurse> getAllNurses()
    {
        List<Nurse> allNurses = new ArrayList<>();
        for(Nurse nurse :nurseDb.values())
        {
             allNurses.add(nurse);
        }
        return allNurses;
    }
}
