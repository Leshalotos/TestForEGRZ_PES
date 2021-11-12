package com.alexeykozlov.testUser;

import com.alexeykozlov.testUser.controllers.PersonController;
import com.alexeykozlov.testUser.entities.PersonEntity;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoControllerTest {

    @Test
    public void testGetUserById() {
        PersonController personController = new PersonController();
        ResponseEntity<PersonEntity> personEntity = personController.getPersonById(1);
        assertEquals(1, personEntity.getBody().getId().intValue());
    }
}
