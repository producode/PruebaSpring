package com.example.demo;

import java.time.LocalTime;

public class Aburrido extends Estado {
    private LocalTime InicioAburrimiento;
    public Aburrido(){
        InicioAburrimiento = LocalTime.now();
    }

    @Override
    public void Alimentar(Mascota mascota) {
        if(java.time.Duration.between(InicioAburrimiento,LocalTime.now()).toMinutes() > 80){
            mascota.CambiarEstado(new Feliz());
        }
    }

    @Override
    public void Jugar(Mascota mascota) {
        mascota.CambiarEstado(new Feliz());
    }

    @Override
    public void Caminar(Mascota mascota,int X, int Y){
        mascota.Alegrar((X+Y));
        mascota.setEnergia(mascota.getEnergia() - X);
    }

    @Override
    public void Descansar(Mascota mascota){
        mascota.setEnergia(mascota.getEnergia() + 2);
    }

    @Override
    public boolean estaAburrido() {
        return true;
    }
}
