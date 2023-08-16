package com.practice.practice.service;

import com.practice.practice.mapper.PracticeMapper;
import com.practice.practice.model.PracticeDto;
import com.practice.practice.model.PracticeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.practice.repository.PracticeRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PracticeService {


    @Autowired
    PracticeRepository repo;

    @Autowired
    PracticeMapper practiceMapper;

    public PracticeDto addPlayer(PracticeDto practiceDto) {
        PracticeModel model= repo.save(practiceMapper.practiceDtoToPracticeModel(practiceDto));
        return practiceMapper.practiceModelTopracticeDto(model);

    }

    public List<PracticeDto> showPlayers() {
        List<PracticeModel> model = repo.findAll();
        return model.stream().map(m-> practiceMapper.practiceModelTopracticeDto(m)).collect(Collectors.toList());

    }
}
