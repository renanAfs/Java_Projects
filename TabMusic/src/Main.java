import br.com.tabmusic.models.MusicModel;
import br.com.tabmusic.models.PodcastsModel;
import br.com.tabmusic.utils.FiltroUtils;

public class Main {
    public static void main(String[] args) {
        MusicModel muPerfect = new MusicModel();
        muPerfect.setTitulo("Perfect");
        muPerfect.setDuracaoSegundos(120);
        for (int i = 0; i < 20; i++) {
            muPerfect.reproduz();
        }
        for (int i = 0; i < 5; i++) {
            muPerfect.curte();
        }
        muPerfect.setAlbum("+");
        muPerfect.setArtista("Ed Sheeran");
        muPerfect.setGenero("Pop");
        muPerfect.exibeInfosMusica();
        FiltroUtils filtroPerfect = new FiltroUtils();
        filtroPerfect.exibeFiltro(muPerfect);
        System.out.println("=================================");


        MusicModel muColdCoffe = new MusicModel();
        muColdCoffe.setTitulo("Cold Coffee");
        muColdCoffe.setDuracaoSegundos(140);
        for (int i = 0; i < 100; i++) {
            muColdCoffe.reproduz();
        }
        for (int i = 0; i < 51; i++) {
            muColdCoffe.curte();
        }
        muColdCoffe.setAlbum("-");
        muColdCoffe.setArtista("Ed Sheeran");
        muColdCoffe.setGenero("Pop");
        muColdCoffe.exibeInfosMusica();
        FiltroUtils filtroColdCoffee = new FiltroUtils();
        filtroColdCoffee.exibeFiltro(muColdCoffe);
        System.out.println("=================================");

        PodcastsModel podSpace = new PodcastsModel();
        podSpace.setTitulo("PodSpace");
        podSpace.setDescricao("PodCast sobre astronomia");
        podSpace.setHost("Renan");
        podSpace.setDuracaoSegundos(3600);
        for (int i = 0; i < 1050; i++) {
            podSpace.reproduz();
        }
        for (int i = 0; i < 737; i++) {
            podSpace.curte();
        }
        podSpace.exibeInfosPodcast();
        FiltroUtils filtropodSpace = new FiltroUtils();
        filtropodSpace.exibeFiltro(podSpace);
        System.out.println("=================================");






    }
}
