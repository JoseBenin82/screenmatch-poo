package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    int temporadas;
    int espisodioPorTemeporada;
    int minutosPorEspisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas*espisodioPorTemeporada*minutosPorEspisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspisodioPorTemeporada() {
        return espisodioPorTemeporada;
    }

    public void setEspisodioPorTemeporada(int espisodioPorTemeporada) {
        this.espisodioPorTemeporada = espisodioPorTemeporada;
    }

    public int getMinutosPorEspisodio() {
        return minutosPorEspisodio;
    }

    public void setMinutosPorEspisodio(int minutosPorEspisodio) {
        this.minutosPorEspisodio = minutosPorEspisodio;
    }
}
