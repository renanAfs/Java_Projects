package br.com.tabmusic.models;

import br.com.tabmusic.utils.Classificacao;

public class PodcastsModel extends GeneralAudioModel implements Classificacao {
    private String host;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void exibeInfosPodcast() {
        exibeInfos();
        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
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
