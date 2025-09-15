public class Main {
    public static void main(String[] args) {
        Filme filmeStarWarsTerceiro = new Filme();

        filmeStarWarsTerceiro.nome = "Star Wars III: A Vingança dos Sith";
        filmeStarWarsTerceiro.anoDeLancamento = 2010;
        filmeStarWarsTerceiro.duracaoEmMinutos = 180;
        filmeStarWarsTerceiro.incluidoNoPlano = true;

        filmeStarWarsTerceiro.exibeFichaTecnica();
        filmeStarWarsTerceiro.setAvaliacao(8);
        filmeStarWarsTerceiro.setAvaliacao(10);
        filmeStarWarsTerceiro.setAvaliacao(7);

        System.out.println(filmeStarWarsTerceiro.getMediaAvaliacoes());

    }
}
