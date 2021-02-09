package com.example.demo;

import java.util.ArrayList;

public class Entrenador {
    private String Nombre;
    private int Edad;
    private ArrayList<Mascota> mascotas;
    private int posicionX;
    private int posicionY;

    public Entrenador(String nombre, int edad){
        this.Nombre = nombre;
        this.Edad = edad;
        this.posicionX = 0;
        this.posicionY = 0;
    }

    public void AgregarMascota(Mascota nuevaMascota){
        this.mascotas.add(nuevaMascota);
    }

    public void Moverse(int AxisX, int AxisY){
        for (Mascota mascota : mascotas){
            mascota.caminar(posicionX-AxisX,posicionY-AxisY);
        }
    }

    public void Descansar(Mascota mascota){
        mascota.descansar(20);
    }

    public void Alimentar(Mascota mascota){
        mascota.Alimentar();
    }

    public void Jugar(Mascota mascota){
        mascota.Jugar();
    }

    public boolean PuedeJugar(Mascota mascota){
        return mascota.PuedeJugar();
    }

    public boolean EstaEnForma(Mascota mascota){
        return mascota.EstaEnForma();
    }

    public String HablarConBolsillomon(Mascota mascota){
        return mascota.Hablar();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
}
