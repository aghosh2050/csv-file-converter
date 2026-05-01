package com.example.csvconverter.api.spec;

import com.example.csvconverter.model.PersonDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-01T00:00:00.000Z[Etc/UTC]")
public interface PersonApi {

    @Operation(summary = "Get all persons", operationId = "getPersons", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful response") })
    @RequestMapping(value = "/persons",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PersonDto>> getPersons();

}