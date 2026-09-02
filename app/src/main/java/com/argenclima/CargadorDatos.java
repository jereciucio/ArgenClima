package com.argenclima;

import java.io.InputStream;
import java.io.InputStreamReader;

import com.opencsv.CSVReader;

public class CargadorDatos implements Runnable {
  private Provincia provincia;
  public CargadorDatos(Provincia provincia) {
    this.provincia = provincia;
  }

  /**
   * Inicia hilo que carga los datos de la provincia <p> Carga en la provincia de la instancia los
   * datos del .csv en la carpeta resources del proyecto con el mismo nombre que la provincia dada
   * al objeto cuando se creó. </p>
   */
  @Override
  public void run() {
    String nombreArchivo = provincia.getNombre() + ".csv";
    InputStream archivo = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
    CSVReader lector = new CSVReader(new InputStreamReader(archivo));

    String[] lineaActual = new String[3];
    String nombreLocActual = "";
    int anio = 0;
    Double temperatura = 0.0;
    Localidad localidad;

    try {
      // Leer la primera línea, que es la cabecera de la tabla
      lineaActual = lector.readNext();

      // Ahora si leer la primera línea de datos
      lineaActual = lector.readNext();
    } catch (Exception e) {
      System.out.println("Error al leer el archivo " + nombreArchivo);
    }

    localidad = new Localidad(lineaActual[0]);
    while(lineaActual != null) {
      if (!nombreLocActual.equals(lineaActual[0])) {
        // Si el nombre es distinto, significa que pasamos a una localidad siguiente
        nombreLocActual = lineaActual[0];
        localidad = new Localidad(nombreLocActual);
        // Añadir la nueva localidad a la provincia
        provincia.addLocalidad(localidad);
      }

      // Convertir los datos de String a numéricos
      anio = Integer.parseInt(lineaActual[1]);
      temperatura = Double.parseDouble(lineaActual[2]);

      // Añadir el registro de temperatura a la localidad
      localidad.addTemperatura(anio, temperatura);

      try {
        lineaActual = lector.readNext();
      } catch (Exception e) {
        System.out.println("Error al leer el archivo " + nombreArchivo);
      }
    }
  }
}
