package com.alexeykozlov.testUser.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person_table")
public class PersonEntity {

    @Id
    @Column(name = "id_person")
    @GenericGenerator(name = "generator", strategy = "increment")

    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "person_name")
    private String PersonName;

    @Column(name = "person_surname")
    private String PersonSurname;

    public PersonEntity() {

    }
}