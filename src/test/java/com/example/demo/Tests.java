package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    Entrenador entrenador;
    @Before
    public void init(){
        entrenador = new Entrenador("asketchup",10);
        Mascota bolsillomon = new Memetchi("Meme");
        Mascota bolsillomon2 = new Tropicatchi("tropicana");
        entrenador.AgregarMascota(bolsillomon);
        entrenador.AgregarMascota(bolsillomon2);
    }

    @Test
    public void Comer(){
        Mascota mascotaActual = entrenador.getMascotas().get(0);
        entrenador.Alimentar(mascotaActual);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),6);
    }

    @Test
    public void Dormir(){
        Mascota mascotaActual = entrenador.getMascotas().get(0);
        entrenador.Descansar(mascotaActual);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),90);
    }

    @Test
    public void PuedeJugar(){
        Assert.assertEquals(entrenador.PuedeJugar(entrenador.getMascotas().get(0)),true);
    }

    @Test
    public void CuanFelizEsta(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
    }

    @Test
    public void DeHambrientoAContento(){
        entrenador.getMascotas().get(0).CambiarEstado(new Hambriento());
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),false);
        entrenador.getMascotas().get(0).Alimentar();
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),true);
    }

    @Test
    public void comerContento(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        entrenador.getMascotas().get(0).Alimentar();
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),6);
    }

    @Test
    public void AburridoMenosDe80Minutos(){
        entrenador.getMascotas().get(0).CambiarEstado(new Aburrido());
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        entrenador.getMascotas().get(0).Alimentar();
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
    }

    @Test
    public void JugarContentoHastaHambriento(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        entrenador.getMascotas().get(0).Jugar();
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),7);
        entrenador.getMascotas().get(0).Jugar();
        entrenador.getMascotas().get(0).Jugar();
        entrenador.getMascotas().get(0).Jugar();
        entrenador.getMascotas().get(0).Jugar();
        entrenador.getMascotas().get(0).Jugar();
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaHambriento(),true);
    }

    @Test
    public void JugarAbuirridoHastaContento(){
        entrenador.getMascotas().get(0).CambiarEstado(new Aburrido());
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),false);
        entrenador.getMascotas().get(0).Jugar();
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),true);
    }

    @Test
    public void HambrientoNoJuega(){
        entrenador.getMascotas().get(0).CambiarEstado(new Hambriento());
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),false);
        entrenador.getMascotas().get(0).Jugar();
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),false);
    }

    @Test
    public void PonerseEnForma(){
        Assert.assertEquals(entrenador.getMascotas().get(1).EstaEnForma(),false);
        entrenador.Moverse(0,1);
        entrenador.Moverse(0,2);
        entrenador.Moverse(0,3);
        entrenador.Moverse(0,4);
        entrenador.Moverse(0,5);
        entrenador.Moverse(0,4);
        entrenador.Moverse(0,3);
        entrenador.Moverse(0,2);
        entrenador.Moverse(0,1);
        Assert.assertEquals(entrenador.getMascotas().get(1).EstaEnForma(),true);
    }

    @Test
    public void PonerseHambriento(){
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaHambriento(),false);
        entrenador.Moverse(0,1);
        entrenador.Moverse(0,2);
        entrenador.Moverse(0,3);
        entrenador.Moverse(0,4);
        entrenador.Moverse(0,5);
        entrenador.Moverse(0,4);
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaHambriento(),true);
    }

    @Test
    public void CaminarAburrido(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        entrenador.Moverse(5,5);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),15);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),75);
    }

    @Test
    public void AburridoADescansar(){
        entrenador.getMascotas().get(0).CambiarEstado(new Aburrido());
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        entrenador.getMascotas().get(0).descansar(20);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),82);
    }

    @Test
    public void SePoneContenta(){
        entrenador.getMascotas().get(0).CambiarEstado(new Aburrido());
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        entrenador.Moverse(5,6);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),16);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),75);
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaFeliz(),true);
    }

    @Test
    public void ContentaCamina(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),5);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        entrenador.Moverse(5,10);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),35);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),70);
    }

    @Test
    public void SeCansa(){
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        Assert.assertEquals(entrenador.getMascotas().get(0).Hablar(),"pica pica");
        entrenador.Moverse(5,45);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),35);
        Assert.assertEquals(entrenador.getMascotas().get(0).Hablar(),"estoy cansado prro, a mimir");
    }

    @Test
    public void CansadoCamina(){
        entrenador.Moverse(40,0);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),85);
        entrenador.getMascotas().get(0).CambiarEstado(new Cansado());
        entrenador.Moverse(0,0);
        Assert.assertEquals(entrenador.getMascotas().get(0).getFelicidad(),65);
    }

    @Test
    public void CansadoDescansa(){
        entrenador.Moverse(0,20);
        entrenador.getMascotas().get(0).CambiarEstado(new Cansado());
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),60);
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaAburrido(),false);
        entrenador.getMascotas().get(0).descansar(20);
        Assert.assertEquals(entrenador.getMascotas().get(0).getEnergia(),80);
        Assert.assertEquals(entrenador.getMascotas().get(0).EstaAburrido(),true);
    }
}
