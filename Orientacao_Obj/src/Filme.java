public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
        System.out.println(incluidoNoPlano);
        System.out.println(totalDeAvaliacoes);
    }

    void setAvaliacao(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double getMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
