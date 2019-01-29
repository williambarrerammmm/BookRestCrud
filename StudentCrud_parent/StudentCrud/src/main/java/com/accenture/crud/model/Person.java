package com.accenture.crud.model;

public class Person {
	private String nombre;
	private int id;
	private String email;
	
	public Person() {
		super();
	}

	public Person(String nombre, int id, String email) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
