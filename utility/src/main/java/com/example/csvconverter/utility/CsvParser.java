package com.example.csvconverter.utility;

import com.example.csvconverter.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public static List<Person> parseCsv(String filePath) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Person person = new Person();
                    person.setName(parts[0]);
                    person.setAge(Integer.parseInt(parts[1]));
                    person.setBirthDate(LocalDate.parse(parts[2]));
                    persons.add(person);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV file", e);
        }
        return persons;
    }
}