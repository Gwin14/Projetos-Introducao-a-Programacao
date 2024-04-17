package prova.de.java;

import java.util.Scanner;

public class QuestaoContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos criar uma conta bancária para você.");

        System.out.print("Diga seu nome: ");
        String nome = sc.next();

        System.out.print("Diga o saldo que deseja depositar na conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Agora, deseja realizar um saque da sua conta? (S) para sim e outra resposta para não: ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Diga o valor: ");
            double valorSaque = sc.nextDouble();

            if (valorSaque <= saldo) {
                saldo -= valorSaque;
                System.out.println("Saque concluído, seu saldo agora é de R$" + saldo + ".\nSaque: " + valorSaque);
            } else {
                System.out.println("\n" + nome + ". Saldo insuficiente para realizar o saque. \nValor do saque: R$" + valorSaque + "\nSaldo disponível: R$" + saldo + ".");
            }
        } else {
            System.out.println("Obrigado " + nome + ". Atendimento encerrado.");
        }
    }

}
