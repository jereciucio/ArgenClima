package com.argenclima;
import java.util.HashMap;

public class Localidad implements Lugar{

  private String nombre;
  private HashMap<Integer,Double> temperaturasPorAnio;

  public Localidad(String nombre) {
    this.nombre = nombre;
    this.temperaturasPorAnio = new HashMap<Integer, Double>();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void addTemperatura(int anio, double temp) {
    temperaturasPorAnio.put(anio, temp);
  }

  public double temperaturaPromedio(int anio){
    return temperaturasPorAnio.get(anio);
  }

}
