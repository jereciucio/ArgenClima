# ArgenClima

Repositorio del TPO1 de la materia **Laboratorio de Programación**, correspondiente al **Grupo 14**.

## Requisitos

- **JDK 21** o superior (el proyecto usa la toolchain de Java de Gradle).
- No es necesario instalar Gradle aparte.

## Cómo correr el proyecto

Dentro de la raíz del repositorio:

```bash
# Ejecutar la aplicación
./gradlew run

# Compilar el proyecto
./gradlew build
```

En **Windows**, usar `gradlew.bat` en lugar de `./gradlew`.

## Informe

El informe en LaTeX se encuentra en [`docs/informe/`](docs/informe/). Para compilarlo:

```bash
cd docs/informe
make        # compila el PDF con lualatex y latexmk
make clean  # elimina los temporales y el PDF
```

Ver [`docs/informe/README.md`](docs/informe/README.md) para más detalles.

## Licencia

Ver el archivo `LICENSE`.
