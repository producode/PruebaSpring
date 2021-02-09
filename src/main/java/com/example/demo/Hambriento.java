package com.example.demo;

public class Hambriento extends Estado {
    @Override
    public void Alimentar(Mascota mascota) {
        mascota.Alegrar(3);
        mascota.CambiarEstado(new Feliz());
    }

    @Override
    public void Jugar(Mascota mascota) {

    }

    @Override
    public boolean estaHambriento() {
        return true;
    }
}
