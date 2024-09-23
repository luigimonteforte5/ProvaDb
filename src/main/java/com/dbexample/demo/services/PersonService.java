package com.dbexample.demo.services;

import com.dbexample.demo.entities.Person;
import com.dbexample.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public Person getPersonById (Long id){
		Optional<Person> found = personRepository.findById(id);

		return found.orElse(null);
	}
}
