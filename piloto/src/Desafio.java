import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);

        int inputNumero = 0;
        int numeroTentativas = 0;
        int tentativas = 9;

        System.out.println("Você tem 10 tentativas!");

        while (tentativas > 0) {

            System.out.println("Digite o numero: ");
            inputNumero = input.nextInt();

            if (inputNumero == numeroGerado) {
                System.out.println("Voce acertou!");
                break;
            } else if (inputNumero < numeroGerado) {
                System.out.println("O número gerado é maior! Tentativas restantes: " + tentativas);
                tentativas--;
            } else {
                System.out.println("O número gerado é menor! Tentativas restantes: " + tentativas);
                tentativas--;
            }


        }

    }
}



