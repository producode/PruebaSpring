package com.example.demo;

public class Cansado extends Estado {
    @Override
    public void Caminar(Mascota mascota, int X, int Y) {
        mascota.setFelicidad(mascota.getFelicidad() - 20);
    }

    @Override
    public void Descansar(Mascota mascota) {
        mascota.setEnergia(mascota.getEnergia() + 20);
        if(mascota.getEnergia() > 80){
            mascota.CambiarEstado(new Aburrido());
        }
    }

    @Override
    public String Hablar(Mascota mascota) {
        return "estoy cansado prro, a mimir";
    }
}
