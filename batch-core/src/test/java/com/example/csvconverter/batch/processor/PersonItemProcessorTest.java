package com.example.csvconverter.batch.processor;

import com.example.csvconverter.model.Person;
import com.example.csvconverter.model.PersonDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonItemProcessorTest {

    @Test
    void testProcess() throws Exception {
        PersonItemProcessor processor = new PersonItemProcessor();
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setBirthDate(LocalDate.of(1993, 1, 1));

        PersonDto dto = processor.process(person);

        assertEquals("John Doe", dto.getFullName());
        assertEquals(30, dto.getYearsOld());
        assertEquals("1993-01-01", dto.getBirthDateStr());
    }
}