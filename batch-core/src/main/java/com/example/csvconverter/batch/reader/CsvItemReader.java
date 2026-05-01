package com.example.csvconverter.batch.reader;

import com.example.csvconverter.model.Person;
import com.example.csvconverter.utility.CsvParser;
import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class CsvItemReader implements ItemReader<Person> {

    private Iterator<Person> iterator;

    public CsvItemReader() {
        // Load from sample-input.csv
        List<Person> persons = CsvParser.parseCsv("sample-input.csv");
        this.iterator = persons.iterator();
    }

    @Override
    public Person read() {
        return iterator.hasNext() ? iterator.next() : null;
    }
}