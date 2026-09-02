package com.argenclima;
import java.util.HashMap;

public class Localidad implements Lugar{

    HashMap<Integer,Double> temperaturas = new HashMap<Integer,Double>();

    private String nombre;
    private double temperaturaMedia;

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double temperaturaPromedio(int anio){
        return temperaturas.get(anio);
    }

}
