package com.example.Hospital_management_system.service;

import com.example.Hospital_management_system.model.Nurse;
import com.example.Hospital_management_system.repository.NurseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseService {

  NurseRepository nurseRepository = new NurseRepository();
  public String addNurse(Nurse nurse)
  {
    String ans =nurseRepository.addNurse(nurse);
    return ans;
  }

  public Nurse getById(int id)
  {
    List<Nurse> allNurses = nurseRepository.getAllNurses();
    for(Nurse n :allNurses)
    {
      if(n.getId()==id)
      {
        return n;
      }
    }
    return null;
  }
}
