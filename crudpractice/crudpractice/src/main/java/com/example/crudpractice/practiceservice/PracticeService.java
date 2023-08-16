package com.example.crudpractice.practiceservice;

import com.example.crudpractice.jpa.PracticeRepo;
import com.example.crudpractice.model.PracticeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class PracticeService {

    @Autowired
    PracticeRepo repo;


    public String addElement(PracticeModel practice) {

        return String.valueOf(repo.save(practice));
    }

    public String update(PracticeModel practiceModel) {
        repo.save(practiceModel);
        return "Ok Done";
    }

    public String delete(int id) {
        repo.deleteById(id);
        return "hey you deleted";
    }

    public String findById(int id) {



        return String.valueOf(repo.findById(id));
    }

    public List<String> findAll() {
        return Collections.singletonList(String.valueOf(repo.findAll()));
    }
}
