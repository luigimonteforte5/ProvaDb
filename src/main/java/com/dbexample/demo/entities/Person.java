package com.dbexample.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "persone")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;

	private String first_name;

	private String last_name;

	private int age;


}
