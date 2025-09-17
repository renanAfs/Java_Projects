package br.com.tabmusic.models;

import br.com.tabmusic.utils.Classificacao;

public class MusicModel extends GeneralAudioModel implements Classificacao {
    private String album;
    private String artista;
    private String genero;
    private String fama;

    public String getAlbum() {
        return album;
    }


    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFama() {
        return fama;
    }

    public void setFama(String fama) {
        this.fama = fama;
    }

    public void exibeInfosMusica(){
        exibeInfos();
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Genero: " + getGenero());
    }

    @Override
    public int getClassificacao() {
        int likes = getLikes();
        int reproducoes = getQntReproducoes();
        int status;

        if (likes > (reproducoes/2)) {
            status = 1;
            return status;
        } else {
            status = 0;
            return status;
        }
    }
}
