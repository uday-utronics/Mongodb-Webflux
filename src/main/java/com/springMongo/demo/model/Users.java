package com.springMongo.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Users {
    @MongoId
    private String id;
    //@Id
    private String username;
    private String password;
    private int role;
}
