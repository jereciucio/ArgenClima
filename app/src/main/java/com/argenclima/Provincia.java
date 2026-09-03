package com.argenclima;
import java.util.HashMap;
import java.util.Iterator;
public class Provincia implements Lugar {
  private String nombre;
  private HashMap<String, Localidad> localidades;

  public Provincia(String nombre) {
    this.nombre = nombre;
    this.localidades = new HashMap<String, Localidad>();
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void addLocalidad(Localidad localidad) {
    localidades.put(localidad.getNombre(), localidad);
  }

  /**
   * Busca y retorna la localidad con el nombre dado.
   *
   * @param nombre el nombre de la localidad a obtener
   * @return el objeto Localidad encontrado, o {@code null} si no se encontró
   */
  public Localidad getLocalidad(String nombre) {
    return localidades.get(nombre);
  }

  public double temperaturaPromedio(int anio) {
    double sum = 0;
    int  cantidad = 0;
    double promedio = 0;
    Iterator it = localidades.values().iterator();
    while (it.hasNext()) {
      Localidad sig = (Localidad) it.next();
      sum = sum + sig.temperaturaPromedio(anio);
      cantidad++;
    }
    if (cantidad > 0) {
      promedio = sum / cantidad;
    }
    return promedio;
  }
}
