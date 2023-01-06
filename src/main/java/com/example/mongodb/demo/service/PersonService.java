package com.example.mongodb.demo.service;

import com.example.mongodb.demo.document.PersonDocument;
import com.example.mongodb.demo.model.PersonResponse;
import com.example.mongodb.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {


    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public PersonResponse createPerson(com.example.mongodb.demo.model.Person person) {
        PersonDocument personDocumentEntity = new PersonDocument();
        personDocumentEntity.setFirstName(person.getFirstName());
        personDocumentEntity.setLastName(person.getLastName());
        personRepository.save(personDocumentEntity);
        PersonResponse personResponse = new PersonResponse();
        personResponse.setId(personDocumentEntity.getPersonId());
        return personResponse;
    }


//    public Person getPersonByName(String name) {
//
//
//    }
}
