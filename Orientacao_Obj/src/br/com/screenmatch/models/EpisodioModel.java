package br.com.screenmatch.models;

import br.com.screenmatch.calculos.Classificacao;

public class EpisodioModel implements Classificacao {
    private int numero;
    private String nome;
    private SerieModel serie;
    private int totalViews;


    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public SerieModel getSerie() {
        return serie;
    }

    public void setSerie(SerieModel serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
