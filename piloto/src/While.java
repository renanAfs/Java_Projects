import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputNota = 0;
        double inputMedia = 0;
        int inputTotalDeNotas = 0;

        while (inputNota != -1) {
            System.out.println("De 0 a 10, quanto você gostou? Para finalizar digite -1: ");
            inputNota = input.nextDouble();

            if (inputNota != -1) {
                inputMedia += inputNota;
                inputTotalDeNotas++;
            }

        }

        System.out.println("Média: " + inputMedia /inputTotalDeNotas);
    }
}
