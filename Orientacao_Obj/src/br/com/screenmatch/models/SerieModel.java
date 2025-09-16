package br.com.screenmatch.models;

public class SerieModel extends TituloModel {
    private int temporadas;
    private int epsPorTemp;
    private boolean status;
    private int minutosPorEpisodio;


    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setEpsPorTemp(int epsPorTemp) {
        this.epsPorTemp = epsPorTemp;
    }

    public int getEpsPorTemp() {
        return epsPorTemp;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsPorTemp * minutosPorEpisodio;
    }
}
