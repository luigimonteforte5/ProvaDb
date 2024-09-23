package com.dbexample.demo.repositories;

import com.dbexample.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository < Person, Long> {}
