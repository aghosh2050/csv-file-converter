package com.example.csvconverter.batch.config;

import com.example.csvconverter.batch.processor.PersonItemProcessor;
import com.example.csvconverter.batch.reader.CsvItemReader;
import com.example.csvconverter.batch.writer.CsvItemWriter;
import com.example.csvconverter.model.Person;
import com.example.csvconverter.model.PersonDto;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class CsvBatchConfig {

    @Bean
    public ItemReader<Person> reader() {
        return new CsvItemReader();
    }

    @Bean
    public ItemProcessor<Person, PersonDto> processor() {
        return new PersonItemProcessor();
    }

    @Bean
    public ItemWriter<PersonDto> writer() {
        return new CsvItemWriter();
    }

    @Bean
    public Step csvStep(JobRepository jobRepository, PlatformTransactionManager transactionManager,
                        ItemReader<Person> reader, ItemProcessor<Person, PersonDto> processor,
                        ItemWriter<PersonDto> writer) {
        return new StepBuilder("csvStep", jobRepository)
                .<Person, PersonDto>chunk(10, transactionManager)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Job csvJob(JobRepository jobRepository, Step csvStep) {
        return new JobBuilder("csvJob", jobRepository)
                .start(csvStep)
                .build();
    }
}