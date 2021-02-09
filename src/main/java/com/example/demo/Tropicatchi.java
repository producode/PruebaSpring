package com.example.demo;

public class Tropicatchi extends Mascota {
    public Tropicatchi(String nombre) {
        super(nombre);
    }

    @Override
    public boolean EstaEnForma(){
        if(this.getMasaMuscular() >= 90){
            return true;
        }
        return false;
    }
}
