MAIN := TPO\ 1\ -\ Grupo\ 14
TEX  := $(MAIN).tex
PDF  := $(MAIN).pdf

all: $(PDF)

$(PDF): $(TEX) $(wildcard figuras/*)
	latexmk -lualatex -interaction=nonstopmode $(TEX)
	latexmk -c $(TEX)

clean:
	latexmk -C $(TEX)

distclean: clean

.PHONY: all clean distclean
