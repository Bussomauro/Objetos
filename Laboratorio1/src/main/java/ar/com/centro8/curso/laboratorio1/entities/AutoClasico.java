package ar.com.centro8.curso.laboratorio1.entities;

public class AutoClasico extends Auto {

    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    public AutoClasico(String marca, String modelo, String color, double precio) {
        super(marca, modelo, color, precio);
    }

    @Override
    public void setRadio(String marcaRadio) {
        super.setRadio(marcaRadio);
    }

    @Override
    public String toString() {
        return  "AutoClasico [" + super.toString() +"]";
    }

    
    
}
