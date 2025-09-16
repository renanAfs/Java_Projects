package br.com.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Em Alta");
        } else if (classificacao.getClassificacao() >= 2) {

            System.out.println("Boas recomendações");
        } else {
            System.out.println("Assista mais tarde");
        }

    }
}
