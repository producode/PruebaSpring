package com.example.demo;

public abstract class Estado {
    public void Alimentar(Mascota mascota){}

    public void Jugar(Mascota mascota){}

    public void Caminar(Mascota mascota, int X, int Y){}

    public String Hablar(Mascota mascota){
        return "pica pica";
    }

    public boolean estaFeliz(){
        return false;
    }

    public void Descansar(Mascota mascota){mascota.setEnergia(mascota.getEnergia() + 10);}

    public boolean estaAburrido(){return false;}

    public boolean estaHambriento(){return false;}
}
