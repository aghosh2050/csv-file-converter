package com.example.csvconverter.batch.writer;

import com.example.csvconverter.model.PersonDto;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class CsvItemWriter implements ItemWriter<PersonDto> {

    @Override
    public void write(Chunk<? extends PersonDto> chunk) throws Exception {
        try (FileWriter writer = new FileWriter("output.csv", true)) {
            for (PersonDto dto : chunk) {
                writer.write(dto.getFullName() + "," + dto.getYearsOld() + "," + dto.getBirthDateStr() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to output.csv", e);
        }
    }
}