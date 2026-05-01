package com.example.csvconverter.utility;

import com.example.csvconverter.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvParserTest {

    @Test
    void testParseCsv() {
        // Assuming sample-input.csv exists with content: John,30,1993-01-01
        List<Person> persons = CsvParser.parseCsv("src/main/resources/sample-input.csv");
        assertEquals(1, persons.size());
        assertEquals("John", persons.get(0).getName());
    }
}