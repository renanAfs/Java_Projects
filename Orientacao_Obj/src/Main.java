import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.models.FilmeModel;
import br.com.screenmatch.models.SerieModel;

public class Main {
    public static void main(String[] args) {

        FilmeModel filmeStarWarsTerceiro = new FilmeModel();
        filmeStarWarsTerceiro.setNome("Star Wars III: A Vingança dos Sith");
        filmeStarWarsTerceiro.setTipo("Filme");
        filmeStarWarsTerceiro.setAnoDeLancamento(2010);
        filmeStarWarsTerceiro.setDuracaoEmMinutos(180);
        filmeStarWarsTerceiro.setIncluidoNoPlano(true);
        filmeStarWarsTerceiro.setAvaliacao(8);
        filmeStarWarsTerceiro.setAvaliacao(10);
        filmeStarWarsTerceiro.setAvaliacao(7);
        filmeStarWarsTerceiro.getFichaTecnica();
        System.out.println("Duração em minutos: " + filmeStarWarsTerceiro.getDuracaoEmMinutos());
        System.out.println("Nota: " + filmeStarWarsTerceiro.getMediaAvaliacoes());
        System.out.println("Total de avaliações: " + filmeStarWarsTerceiro.getTotalDeAvaliacoes());
        System.out.println("=================================");

        SerieModel serieDark = new SerieModel();
        serieDark.setNome("Dark");
        serieDark.setTipo("Série");
        serieDark.setTemporadas(5);
        serieDark.setAnoDeLancamento(2018);
        serieDark.setEpsPorTemp(8);
        serieDark.setStatus(true);
        serieDark.setMinutosPorEpisodio(60);
        serieDark.setIncluidoNoPlano(true);
        serieDark.setAvaliacao(10);
        serieDark.setAvaliacao(9);
        serieDark.setAvaliacao(7);
        serieDark.setAvaliacao(9.5);
        serieDark.setAvaliacao(8.5);
        serieDark.getFichaTecnica();
        System.out.println("Duração em minutos: " + serieDark.getDuracaoEmMinutos());
        System.out.println("Nota: " + serieDark.getMediaAvaliacoes());
        System.out.println("Total de avaliações: " + serieDark.getTotalDeAvaliacoes());
        System.out.println("=================================");

        CalculadoraDeTempo calcTempo = new CalculadoraDeTempo();
        calcTempo.putInclui(filmeStarWarsTerceiro);
        calcTempo.putInclui(serieDark);
        System.out.println("Tempo total para assistir essa lista: " + calcTempo.getTempoTotal());
        System.out.println("Lista detalhada:");
        System.out.println(calcTempo.getItemName() + "; Tipo: " + calcTempo.getItemType() + "; Duração: " + calcTempo.getItemTime());
    }
}
