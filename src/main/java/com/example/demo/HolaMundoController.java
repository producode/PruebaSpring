package com.example.demo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	
	private static final String template = "Hola, %s";
	private final AtomicLong contador = new AtomicLong();
	
	@GetMapping("/saludar")
	public HolaMundo saludar(@RequestParam(value="nombre", defaultValue="Mundo") String nombre) {
		return new HolaMundo(contador.incrementAndGet(), String.format(template, nombre));
	}
	
	@PostMapping("/persona/agregar")
	public Persona crearPersona(@RequestBody Persona nuevaPersona) {
		listaDePersonas.add(nuevaPersona);
		return nuevaPersona;
	}
	
	@GetMapping("/persona/listar")
	public ArrayList<Persona> listarPersonas() {
		return listaDePersonas;
	}
}
