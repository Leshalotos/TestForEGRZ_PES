package com.alexeykozlov.testUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alexeykozlov.testUser.entities.PersonEntity;
import com.alexeykozlov.testUser.DTO.PersonEntityDTO;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Integer> {

}