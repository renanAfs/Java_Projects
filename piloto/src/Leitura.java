import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String inputFilme = input.nextLine();
        System.out.println("Qual é o ano de lançamento? ");
        int inputAnoDeLancamento = input.nextInt();
        System.out.println("De 0 a 10, quanto você gostou? ");
        int inputNota = input.nextInt();

        System.out.println("");
        System.out.println("Resumo:");
        System.out.println("Seu filme favorito: " + inputFilme);
        System.out.println("Ano de lancamento: " + inputAnoDeLancamento);
        System.out.println("Sua nota: " + inputNota);
    }
}
