package com.example.demo;

import java.security.PublicKey;

public class Feliz extends Estado {
    private int NroDeJuegos;

    public Feliz(){
        NroDeJuegos = 0;
    }

    @Override
    public void Alimentar(Mascota mascota) {
        mascota.Alegrar(1);
    }

    @Override
    public void Jugar(Mascota mascota) {
        mascota.Alegrar(2);
        NroDeJuegos += 1;
        if(NroDeJuegos == 5){
            mascota.CambiarEstado(new Hambriento());
        }
    }

    @Override
    public void Caminar(Mascota mascota,int X, int Y){
        mascota.Alegrar(2*(X+Y));
        mascota.setEnergia(mascota.getEnergia() - Y);
    }

    @Override
    public boolean estaFeliz(){
        return true;
    }

    @Override
    public String Hablar(Mascota mascota){
        return "pica pica";
    }
}
