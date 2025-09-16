package br.com.screenmatch.models;

public class EpisodioModel {
    private int numero;
    private String nome;
    private SerieModel serie;

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
}
