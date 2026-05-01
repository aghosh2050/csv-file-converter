package com.example.csvconverter.api.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonControllerImplTest {

    @Test
    void testGetPersons() {
        PersonControllerImpl controller = new PersonControllerImpl();
        ResponseEntity<List<com.example.csvconverter.model.PersonDto>> response = controller.getPersons();
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(0, response.getBody().size());
    }
}