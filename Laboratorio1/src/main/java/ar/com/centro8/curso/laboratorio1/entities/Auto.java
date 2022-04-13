package ar.com.centro8.curso.laboratorio1.entities;

import java.text.DecimalFormat;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private Radio radio;
    
    /**
     * Constructor Auto sin radio ni precio
     * @param marca
     * @param modelo
     * @param color
     */
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    /**
     * Constructor Auto con precio sin radio
     * @param marca
     * @param modelo
     * @param color
     * @param precio
     */
    public Auto(String marca, String modelo, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    /**
     * Constructor Auto sin precio con radio
     * @param marca
     * @param modelo
     * @param color
     * @param marcaRadio
     */
    public Auto(String marca, String modelo, String color, String marcaRadio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = new Radio(marcaRadio);
    }
    /**
     * Constructor Auto con precio con radio
     * @param marca
     * @param modelo
     * @param color
     * @param precio
     * @param marcaRadio
     */
    public Auto(String marca, String modelo, String color, double precio, String marcaRadio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.radio = new Radio(marcaRadio);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + df.format(precio) + ", radio=" + radio + "]";
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Radio getRadio() {
        return radio;
    }
    public void setRadio(String marcaRadio) {
        this.radio = new Radio(marcaRadio);
    }

    
}
