package ar.com.centro8.curso.laboratorio1.entities;

public class AutoNuevo extends Auto {

    public AutoNuevo(String marca, String modelo, String color, String marcaRadio) {
        super(marca, modelo, color, marcaRadio);
    }

    public AutoNuevo(String marca, String modelo, String color, double precio, String marcaRadio) {
        super(marca, modelo, color, precio, marcaRadio);
    }

    @Override
    public void setRadio(String marcaRadio) {
        super.setRadio(marcaRadio);
    }

    @Override
    public String toString() {
        return "AutoNuevo [" + super.toString() + "]";
    }


    
    
    
}
