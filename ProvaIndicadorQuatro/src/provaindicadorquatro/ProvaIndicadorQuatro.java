package provaindicadorquatro;

import java.util.Scanner;

public class ProvaIndicadorQuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saques = 0;

        System.out.println("Bem vindo(a) ao seu aplicativo de operações bancárias!");
        System.out.print("Qual o seu nome? ");
        String nome = sc.next();
        System.out.print("Perfeito " + nome + "! Agora, diga o valor que deseja depositar na sua conta: ");
        double saldo = sc.nextDouble();
        System.out.println("----------------------------------");

        System.out.println("Etapa inicial concluída!");
        System.out.println("Seu saldo: R$" + saldo + ".");
        System.out.println("----------------------------------");

        while (saldo > 0) {
            saques++;

            System.out.print(nome + ". Diga o valor que deseja sacar: ");
            double saque = sc.nextDouble();

            if (saque <= saldo) {
                saldo -= saque;
                System.out.println("Saque concluído!");
                System.out.println(nome + ". Seu saldo atual é de: R$" + saldo + ".");
            } else {
                System.out.println("Impossível sacar essa quantia! O saque foi efetuado no valor restante do saldo. (" + saldo + ").");
                saldo -= saldo;
                System.out.println("Saldo atual: " + saldo);
            }

            System.out.println("----------------------------------");
        }

        System.out.println("Programa encerrado.");
        System.out.println("Total de saques: " + saques + ".");
    }

}
