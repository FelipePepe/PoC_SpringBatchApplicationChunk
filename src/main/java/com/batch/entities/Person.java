package com.batch.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="persons")
@Data
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name="last_name")
    private String lastName;

    private String age;

    private String createAt;

}
