package com.example.csvconverter.batch.processor;

import com.example.csvconverter.model.Person;
import com.example.csvconverter.model.PersonDto;
import com.example.csvconverter.utility.DateUtils;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class PersonItemProcessor implements ItemProcessor<Person, PersonDto> {

    @Override
    public PersonDto process(Person person) throws Exception {
        PersonDto dto = new PersonDto();
        dto.setFullName(person.getName());
        dto.setYearsOld(person.getAge());
        dto.setBirthDateStr(DateUtils.formatDate(person.getBirthDate()));
        return dto;
    }
}