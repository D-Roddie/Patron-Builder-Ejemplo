package com.cenfotec.persona.withbuilder;

import com.cenfotec.persona.withbuilder.Person.PersonBuilder;

public class CreatePerson {

	public static void main(String[] args) {
		
		Person unaPersona;
		PersonBuilder builder = new Person.PersonBuilder("Mario", "Alajuela", "Alajuela");
		
		System.out.println(builder.createPerson());
		builder = builder.lastName("Aguero");
		System.out.println(builder.createPerson());
		builder = builder.salutation("Mr").streetAddress("Pacto del Jocote");
		unaPersona = builder.createPerson();
		System.out.println(unaPersona.toString());
	}

}
