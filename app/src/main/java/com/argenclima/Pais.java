package com.argenclima;

import java.util.HashMap;
import java.util.Iterator;

public class Pais implements Lugar {

  private HashMap<String, Provincia> provincias;
  private String nombre;

  public Pais(String nombre) {
    this.nombre = nombre;
    this.provincias = new HashMap<String, Provincia>();
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

  /**
   * Busca y retorna la provincia con el nombre dado.
   *
   * @param nombre el nombre de la provincia a obtener
   * @return el objeto Provincia encontrado, o {@code null} si no se encontró
   */
  public Provincia getProvincia(String nombre) {
    return provincias.get(nombre);
  }

  public void addProvincia(Provincia provincia) {
    provincias.put(provincia.getNombre(), provincia);
  }
}
