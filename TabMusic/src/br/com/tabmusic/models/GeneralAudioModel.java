package br.com.tabmusic.models;

public class GeneralAudioModel {
    private String titulo;
    private int duracaoSegundos;
    private int qntReproducoes;
    private int likes;


    public void curte() {
        this.likes++;
    }

    public void reproduz() {
        this.qntReproducoes++;
    }

    public int getLikes() {
        return likes;
    }

    public int getQntReproducoes() {
        return qntReproducoes;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public void exibeInfos() {
        System.out.println("=================================");
        System.out.println("Nome: " + this.titulo);
        System.out.println("Duração: " + this.duracaoSegundos + "s");
        System.out.println("Likes: " + this.likes);
        System.out.println("Reproduções: " + this.qntReproducoes);
    }
}
