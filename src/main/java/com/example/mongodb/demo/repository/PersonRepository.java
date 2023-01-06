package com.example.mongodb.demo.repository;

import com.example.mongodb.demo.document.PersonDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<PersonDocument, Long> {
//    @Query("{name:'?0'}")
//    PersonDocument findByName(String name);
}
