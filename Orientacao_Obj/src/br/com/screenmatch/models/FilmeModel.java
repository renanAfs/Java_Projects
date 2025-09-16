package br.com.screenmatch.models;

import br.com.screenmatch.calculos.Classificacao;

public class FilmeModel extends TituloModel implements Classificacao {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) getMediaAvaliacoes() /2;
    }
}
