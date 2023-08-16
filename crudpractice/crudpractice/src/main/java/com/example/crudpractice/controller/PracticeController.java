package com.example.crudpractice.controller;

import com.example.crudpractice.practiceservice.PracticeService;
import com.example.crudpractice.model.PracticeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("practice")
public class PracticeController {

    @Autowired
    PracticeService practiceService;

    @GetMapping("find")
    public String showPractice() {
        return "hey its working";
    }

    @GetMapping("findit")
    public String find(@RequestParam int id) throws FileNotFoundException {
        return practiceService.findById(id);
    }

    @PostMapping("adding")
    public String addPractice(@RequestBody PracticeModel practice) {
        return practiceService.addElement(practice);
    }

    @PutMapping("update")
    public String update(@RequestBody PracticeModel practiceModel) {
        return practiceService.update(practiceModel);
    }

    @DeleteMapping("delete")
    public String delete(@RequestParam int id) {
        return practiceService.delete(id);
    }

    @GetMapping("findall")
    public List<String> findAll() {
        return practiceService.findAll();
    }


}
