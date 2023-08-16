package com.practice.practice.controller;


import com.practice.practice.model.PracticeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.practice.practice.service.PracticeService;

import java.util.List;

@RestController
@RequestMapping("player")
public class PracticeController {


    @Autowired
    PracticeService practiceService;



    @GetMapping("add")
    public PracticeDto addPlayer(@RequestBody PracticeDto practiceDto){
        return practiceService.addPlayer(practiceDto);
    }

    @PostMapping("showAll")
    public List<PracticeDto> showAll(){
        return practiceService.showPlayers();
    }








}
