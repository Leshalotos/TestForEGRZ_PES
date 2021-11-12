package com.alexeykozlov.testUser.services;

import java.util.List;
import java.util.Optional;

import com.alexeykozlov.testUser.DTO.PersonEntityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.alexeykozlov.testUser.entities.PersonEntity;
import com.alexeykozlov.testUser.repositories.PersonRepository;
import com.alexeykozlov.testUser.DTO.PersonEntityDTO;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonEntity createPersonEntity(String name, String surname) {
        PersonEntity personEntity = makePersonEntity(name, surname);
        return personRepository.save(personEntity);
    }

    @Override
    public PersonEntity getPersonEntityById(Integer id) {
        PersonEntity personEntity = personRepository.findById(id).get();
        return personEntity;
    }

    @Override
    public PersonEntity updatePersonEntity(Integer id, String name, String surname) {
        PersonEntity personEntity = makePersonEntity(name, surname);
        personEntity.setId(id);
        return personEntity;
    }

    @Override
    public void deletePersonEntityById(Integer id) {
        personRepository.getById(id);
    }

    // helpMethod
    private PersonEntity makePersonEntity (String name, String surname) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonName(name);
        personEntity.setPersonSurname(surname);
        return personEntity;
    }

    //record test methods
    public void save(PersonEntity personEntity) {
        personRepository.save(personEntity);
    }

    public Optional<PersonEntity> get(Integer id) {
        return personRepository.findById(id);
    }

    public List<PersonEntity> getAll() {
        return personRepository.findAll();
    }

}