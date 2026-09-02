package com.argenclima;
import java.util.HashMap;

public class Localidad implements Lugar{

  private String nombre;
  HashMap<Integer,Double> temperaturasPorAnio;

  public Localidad(String nombre, HashMap<Integer,Double> temperaturas) {
    this.nombre = nombre;
    this.temperaturasPorAnio = temperaturas;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double temperaturaPromedio(int anio){
    return temperaturasPorAnio.get(anio);
  }

}
