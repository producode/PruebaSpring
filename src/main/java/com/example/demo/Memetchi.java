package com.example.demo;

public class Memetchi extends Mascota {
    public Memetchi(String nombre) {
        super(nombre);
    }

    @Override
    public String Hablar(){
        if(this.EstaHambriento()) {
            return "Tengo hambre pvto, alimentame prro";
        }
        return getEstado().Hablar(this);
    }

    @Override
    public void caminar(int X, int Y) {
        setHambre(getHambre() + 5);
        if(getHambre() >= 25 & EstaHambriento() == false){
            CambiarEstado(new Hambriento());
        }
        super.caminar(X, Y);
    }
}
