package com.example.mongodb.demo.controller;

import com.example.mongodb.demo.model.Person;
import com.example.mongodb.demo.model.PersonResponse;
import com.example.mongodb.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonService personService;
@Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> createPerson(@RequestBody Person person) {
        PersonResponse personResponse = personService.createPerson(person);
        return new ResponseEntity<>(personResponse, HttpStatus.OK);
    }
//    @GetMapping(value = "/persons/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Person> getPersonByName(@RequestParam String name  ){
//        Person person=personService.getPersonByName(name);
//        return new ResponseEntity<>(person,HttpStatus.OK);
//    }
}
