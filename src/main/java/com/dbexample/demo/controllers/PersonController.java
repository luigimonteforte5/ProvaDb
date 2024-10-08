package com.dbexample.demo.controllers;

import com.dbexample.demo.entities.Person;
import com.dbexample.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("/person/{id}")
	public ResponseEntity<?> getPerson ( @PathVariable Long id ){
		Person found = personService.getPersonById(id);
		if (found != null){
			return ResponseEntity.ok(found);
		}else{
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/person")
	public ResponseEntity<?> addPerson (@RequestBody Person person){
		personService.addPerson(person);
		return ResponseEntity.ok(person);
	}

}
