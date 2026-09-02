# Informe TPO1

Informe en LaTeX del TPO1 de **Laboratorio de Programación**. Utiliza `lualatex` + `latexmk` para compilar.

## Requisitos

Tener instalado un paquete de TeX completo (por ejemplo, `texlive` o `texlive-full`)

## Compilar

Desde esta carpeta:

```bash
# Compila el PDF y limpia los archivos temporales
make

# Elimina también el PDF generado
make clean
```

O manualmente:

```bash
latexmk -pdf "TPO 1 - Grupo 14.tex"
latexmk -c
```
