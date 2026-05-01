package com.example.csvconverter.api.controller;

import com.example.csvconverter.api.spec.PersonApi;
import com.example.csvconverter.model.PersonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonControllerImpl implements PersonApi {

    @Override
    public ResponseEntity<List<PersonDto>> getPersons() {
        // Sample implementation - return empty list
        return ResponseEntity.ok(List.of());
    }
}