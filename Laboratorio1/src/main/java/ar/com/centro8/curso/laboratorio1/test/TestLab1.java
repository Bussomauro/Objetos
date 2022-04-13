package ar.com.centro8.curso.laboratorio1.test;

import ar.com.centro8.curso.laboratorio1.entities.Auto;
import ar.com.centro8.curso.laboratorio1.entities.AutoClasico;
import ar.com.centro8.curso.laboratorio1.entities.AutoNuevo;
import ar.com.centro8.curso.laboratorio1.entities.Radio;

public class TestLab1 {
    public static void main(String[] args) {
        
        System.out.println("-- r1 --");
        Radio r1 = new Radio("Pioneer");
        System.out.println(r1);
        
        System.out.println("-- r2 --");
        Radio r2 = new Radio("Sony");
        System.out.println(r2);
        
        System.out.println("-- r3 --");
        Radio r3 = new Radio("Yamaha");
        System.out.println(r3);
        
        System.out.println("-- a1 --");
        Auto a1 = new Auto("Fiat", "Punto", "Verde", 1500000);
        a1.setRadio("Sony");
        System.out.println(a1);

        System.out.println("-- ac1 --");
        AutoClasico ac1 = new AutoClasico("Renault", "12", "Gris");
        ac1.setRadio("Pioneer");
        System.out.println(ac1);

        System.out.println("-- ac2 --");
        AutoClasico ac2 = new AutoClasico("Toyota", "Corolla", "Blanco", 2500000);
        ac2.setRadio("Panasonic");
        System.out.println(ac2);

        System.out.println("-- an1 --");
        AutoNuevo an1 = new AutoNuevo("Chevrolet", "Corsa", "Negro", "Sanyo");
        an1.setRadio("Sony");
        System.out.println(an1);
        
        System.out.println("-- an2 --");
        AutoNuevo an2 = new AutoNuevo("Fiat", "Uno", "Rojo", 900000, "Panasonic");
        an2.setRadio("Sony");
        System.out.println(an2);
    }
}
