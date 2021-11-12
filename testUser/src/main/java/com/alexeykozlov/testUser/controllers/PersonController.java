package com.alexeykozlov.testUser.controllers;

import com.alexeykozlov.testUser.DTO.PersonEntityDTO;
import com.alexeykozlov.testUser.entities.PersonEntity;
import com.alexeykozlov.testUser.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonServiceImpl personServiceImpl;

    @Autowired
    public PersonController (PersonServiceImpl personServiceImpl) {
        this.personServiceImpl = personServiceImpl;
    }

    public PersonController() {

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PersonEntity> createPerson(@RequestBody PersonEntityDTO personEntityDTO) {
        PersonEntity personEntity = personServiceImpl.createPersonEntity(personEntityDTO.getPersonName(), personEntityDTO.getPersonSurname() );
        return ResponseEntity.ok(personEntity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<PersonEntity> getPersonById(@PathVariable("id") Integer id) {
        PersonEntity personEntity = personServiceImpl.getPersonEntityById(id);
        return ResponseEntity.ok(personEntity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public PersonEntity updatePerson(@RequestBody PersonEntityDTO personEntityDTO, @PathVariable("id") Integer id) {
    return personServiceImpl.updatePersonEntity(id, personEntityDTO.getPersonName(), personEntityDTO.getPersonSurname());
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable("id") Integer id) {
    personServiceImpl.deletePersonEntityById(id);
    }
}
