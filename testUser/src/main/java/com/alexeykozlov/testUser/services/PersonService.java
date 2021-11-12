package com.alexeykozlov.testUser.services;

import com.alexeykozlov.testUser.DTO.PersonEntityDTO;
import com.alexeykozlov.testUser.entities.PersonEntity;

public interface PersonService {
    public PersonEntity createPersonEntity (String name, String surName);
    public PersonEntity getPersonEntityById (Integer id);
    public PersonEntity updatePersonEntity (Integer id, String name, String surname);
    public void deletePersonEntityById (Integer id);
}
