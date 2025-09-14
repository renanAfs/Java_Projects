import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Giovana Vitoria de Freitas";
        String tipoConta = "Corrente";
        double saldo = 10000.00;
        double valorRecebido = 0;
        double valorTranferido = 0;
        int menu = 0;

        while (menu >= 0) {

            System.out.println("");
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1- Consultar dados");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("");

            System.out.println("Digite a sua opção: ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.println(nome);
                System.out.println(tipoConta);
                System.out.println(saldo);
                System.out.println("");
            } else if (menu == 2) {
                System.out.println("Quanto irá receber:");
                valorRecebido = input.nextDouble();
                saldo += valorRecebido;
                System.out.println("Você recebeu: " + valorRecebido);
                System.out.println("Agora o seu saldo é de: " + saldo);
                System.out.println("");
            } else if (menu == 3) {
                System.out.println("Quanto irá transferir: " );
                valorTranferido = input.nextDouble();
                saldo -= valorTranferido;
                System.out.println("Você transferiu: " + valorTranferido);
                System.out.println("Agora o seu saldo é de: " + saldo);
            } else if (menu == 4) {
                System.out.println("Atendimento finalizado");
                break;
            } else {
                System.out.println("Opção errada, tente novamente");
            }

        }




    }
}
