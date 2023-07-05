package com.example.Hospital_management_system.controller;

import com.example.Hospital_management_system.model.Nurse;
import com.example.Hospital_management_system.service.NurseService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/nurse")
public class NurseController {

    NurseService nurseService = new NurseService();
    @PostMapping("/add")
    public String addNurse(@RequestBody Nurse nurse)
    {
        String ans =nurseService.addNurse(nurse);
        return ans;
    }
    @GetMapping("/getById")
    public Nurse getById(@RequestParam("id") Integer id)
    {
        Nurse nurse =nurseService.getById(id);
        return nurse;
    }
}
