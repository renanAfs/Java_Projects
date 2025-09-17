package br.com.tabmusic.utils;

public class FiltroUtils {
    public void exibeFiltro(Classificacao classificacaoInter){
        if (classificacaoInter.getClassificacao() == 1) {
            System.out.println("Em Alta");
        } else {
            System.out.println("Para ouvir depois");
        }
    }

}
