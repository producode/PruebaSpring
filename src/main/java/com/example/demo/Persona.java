package com.example.demo;

public class Persona {
	private String nombre;
	private int edad;
	private String trabajo;
	
	public Persona(String nombre, int edad, String trabajo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setTrabajo(trabajo);
	}

	public Persona(Persona nuevaPersona) {
		this.setNombre(nuevaPersona.getNombre());
		this.setEdad(nuevaPersona.getEdad());
		this.setTrabajo(nuevaPersona.getTrabajo());
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
	
	
}
