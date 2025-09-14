public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "Standard";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento de " + anoDeLancamento);
        } else {
            System.out.println("Filme antigo de " + anoDeLancamento);
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Acesso liberado");
            System.out.println("Tipo do plano: " + tipoPlano);
        } else {
            System.out.println("Acesso negado, atualize a assinatura");
            System.out.println("Tipo do plano: " + tipoPlano + ", deveria ser plus");
        }


    }
}
