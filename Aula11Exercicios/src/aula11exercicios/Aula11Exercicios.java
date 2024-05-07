package aula11exercicios;

import java.util.Scanner;

public class Aula11Exercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas deseja fazer a média? ");
        int quantidadeNotas = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Diga o numero " + i + " para adicionar à média final: ");
            double resposta = sc.nextDouble();
            soma += resposta;
        }

        System.out.println("-----");
        System.out.println("A média total é " + soma / quantidadeNotas + ".");
    }

}
