package com.cenfotec.persona.nobuilder;

public class CreatePerson {

	public static void main(String[] args) {
		Person onePerson = new Person("Aguero", "Mario", "Miguel", "Mr", "", 
				                      "Pacto del Jocote", "Alajuela", "Alajuela", false, 
				                      false, false);
		System.out.println(onePerson);
	}

}
