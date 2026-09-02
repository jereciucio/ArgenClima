package com.argenclima;

import java.util.HashMap;
import java.util.Iterator;

public class Pais implements Lugar {

  private HashMap<String, Provincia> provincias;
  private String nombre;

  public Pais(String nombre, HashMap<String, Provincia> provincias) {
    this.nombre = nombre;
    this.provincias = provincias;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double temperaturaPromedio(int anio) {
    double sum = 0;
    int cantidad = 0;
    double promedio = 0;
    Iterator it = provincias.entrySet().iterator();
    while (it.hasNext()) {
      Provincia sig = (Provincia) it.next();
      sum = sum + sig.temperaturaPromedio(anio);
      cantidad++;
    }
    if (cantidad > 0) {
      promedio = sum / cantidad;
    }
    return promedio;
  }
}
