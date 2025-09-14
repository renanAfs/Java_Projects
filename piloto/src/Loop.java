import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputNota = 0;
        double inputMedia = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De 0 a 10, quanto você gostou? ");
            inputNota = input.nextDouble();
            inputMedia += inputNota /3;

        }

        System.out.println("Média: " + inputMedia);




    }
}
