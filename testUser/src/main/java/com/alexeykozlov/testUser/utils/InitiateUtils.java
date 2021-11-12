package com.alexeykozlov.testUser.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.alexeykozlov.testUser.entities.PersonEntity;
import com.alexeykozlov.testUser.services.PersonServiceImpl;

import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final PersonServiceImpl personServiceImpl;

    public InitiateUtils (PersonServiceImpl personServiceImpl) {
        this.personServiceImpl = personServiceImpl;
    }

    @Override
    public void run(String... args) throws Exception {

        PersonEntity personEntity_1 = new PersonEntity();
        personEntity_1.setPersonName("Alex");
        personEntity_1.setPersonSurname("Kozlov");

        PersonEntity personEntity_2 = new PersonEntity();
        personEntity_2.setPersonName("Person_2");
        personEntity_2.setPersonSurname("Surname_Person_2");

        PersonEntity personEntity_3 = new PersonEntity();
        personEntity_3.setPersonName("Person_3");
        personEntity_3.setPersonSurname("Surname_Person_3");

        personServiceImpl.save(personEntity_1);
        personServiceImpl.save(personEntity_2);
        personServiceImpl.save(personEntity_3);

        PersonEntity myPersonEntity = personServiceImpl.get(1).get();
        System.out.println(myPersonEntity);

        List<PersonEntity> all = personServiceImpl.getAll();

        for (PersonEntity entity : all) {
            System.out.println(entity);
        }
    }
}
