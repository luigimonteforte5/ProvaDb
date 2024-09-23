package com.dbexample.demo.controllers;

import com.dbexample.demo.entities.Person;
import com.dbexample.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
