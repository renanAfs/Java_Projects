import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.2;

        double media = (9.8 + 6.3 + 8.0) /3;
        String sinopse;
        sinopse = """
                Filme de aventura
                Anos 80
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);




    }
}
