package com.example.demo;

public class Mascota {
    private String Nombre;
    private int Felicidad;
    private int Hambre;
    private int Energia;
    private Estado estado;
    private int MasaMuscular;

    public Mascota(String nombre){
        this.Nombre = nombre;
        this.Felicidad = 5;
        this.Hambre = 0;
        this.Energia = 80;
        this.estado = new Feliz();
        this.MasaMuscular = 10;
    }

    public void Alimentar(){
        estado.Alimentar(this);
    }

    public void Jugar(){
        estado.Jugar(this);
    }

    public void Alegrar(int cantidad){
        Felicidad = Felicidad + cantidad;
        if(Felicidad >= 15 & estado.estaFeliz() == false){
            estado = new Feliz();
        }
    }

    public void CambiarEstado(Estado nuevoEstado){
        estado = nuevoEstado;
    }

    public void setEnergia(int energia) {
        Energia = energia;
        if(Energia < 0){
            Energia = 0;
        }
        else if(Energia > 100){
            Energia = 100;
        }
        if(Energia < 40 & this.estado.estaFeliz()){
            this.estado = new Cansado();
        }
    }

    public void setFelicidad(int felicidad) {
        Felicidad = felicidad;
        if(Felicidad < 0){
            Felicidad = 0;
        }
        else if(Felicidad > 100){
            Felicidad = 100;
        }
    }

    public void setHambre(int hambre) {
        Hambre = hambre;
        if(Hambre < 0){
            Hambre = 0;
        }
        else if(Hambre > 100){
            Hambre = 100;
        }
    }

    public boolean PuedeJugar(){
        return true;
    }

    public boolean EstaEnForma(){
        return false;
    }

    public void descansar(int tiempo){
        getEstado().Descansar(this);
    }

    public String Hablar(){
        return getEstado().Hablar(this);
    }

    public boolean EstaHambriento(){
        return getEstado().estaHambriento();
    }

    public boolean EstaFeliz(){
        return getEstado().estaFeliz();
    }

    public boolean EstaAburrido(){
        return getEstado().estaAburrido();
    }

    public void caminar(int X,int Y){
        estado.Caminar(this,X,Y);
    }

    public String getNombre() {
        return Nombre;
    }

    public int getFelicidad() {
        return Felicidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getEnergia() {
        return Energia;
    }

    public int getHambre() {
        return Hambre;
    }

    public int getMasaMuscular() {
        return MasaMuscular;
    }
}
