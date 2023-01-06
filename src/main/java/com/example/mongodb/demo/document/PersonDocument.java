package com.example.mongodb.demo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "person")
public class PersonDocument {
//    @Id
    private Long personId;
    private String firstName;
    private String lastName;
}
