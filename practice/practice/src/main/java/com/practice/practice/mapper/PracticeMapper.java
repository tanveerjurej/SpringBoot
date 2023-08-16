package com.practice.practice.mapper;

import com.practice.practice.model.PracticeDto;
import com.practice.practice.model.PracticeModel;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class PracticeMapper {

    public PracticeDto practiceModelTopracticeDto(PracticeModel practiceModel) {
        if (Objects.isNull(practiceModel)) {
            return null;
        }
        PracticeDto practiceDto = new PracticeDto();
        practiceDto.setId(practiceModel.getId());
        practiceDto.setName(practiceModel.getName());
        practiceDto.setSport(practiceModel.getSport());
        practiceDto.setAge(practiceModel.getAge());
        return practiceDto;

    }
    public PracticeModel practiceDtoToPracticeModel(PracticeDto practiceDto){
        PracticeModel practiceModel= new PracticeModel();
        practiceModel.setId(practiceDto.getId());
        practiceModel.setName(practiceDto.getName());
        practiceModel.setSport(practiceDto.getSport());
        practiceModel.setAge(practiceDto.getAge());
        return practiceModel;
    }

}
