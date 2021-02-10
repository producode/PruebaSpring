package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.junit.Before;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	
	private Entrenador entrenador = new Entrenador("asketchup",10);
    private Mascota bolsillomon = new Memetchi("Meme");
    private Mascota bolsillomon2 = new Tropicatchi("tropicana");
	
    private ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	
	private static final String template = "Hola, %s";
	private final AtomicLong contador = new AtomicLong();
	
	@GetMapping("/saludar")
	public HolaMundo saludar(@RequestParam(value="nombre", defaultValue="Mundo") String nombre) {
		return new HolaMundo(contador.incrementAndGet(), String.format(template, nombre));
	}
	
	@GetMapping("/entrenador/listar")
	public ArrayList<Entrenador> listarPersonas() {
		return entrenadores;
	}
	
	@GetMapping("/entrenador/obtener")
	public Entrenador obtenerEntrenador(@RequestParam String nombre) {
		return entrenadores.stream().filter((entrenador) -> entrenador.getNombre() == nombre).findFirst().get();
	}
	
	@GetMapping("/entrenador/buscar")
	public List<Entrenador> buscarEntrenador(@RequestParam String nombre) {
		return entrenadores.stream().filter((entrenador) -> entrenador.getNombre() == nombre).collect(Collectors.toList());
	}
	
	@PostMapping("/entrenador/crear")
	public Entrenador crearPersona(@RequestBody Entrenador nuevoEntrenador) {
		entrenadores.add(nuevoEntrenador);
		return nuevoEntrenador;
	}
	
	@PostMapping("/mascota/crear")
	public Mascota crearMascota(@RequestBody Mascota nuevaMascota, @RequestParam String nombreEntrenador) {
		return new Memetchi("Meme");
	}
}
