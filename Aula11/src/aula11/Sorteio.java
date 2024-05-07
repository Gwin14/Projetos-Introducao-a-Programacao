package aula11;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(21);
        int tentativas = 1;

        System.out.print("Tente acertar um número de 0 a 20: ");

        while (true) {
            int resposta = sc.nextInt();

            if (resposta == numeroSorteado) {
                break;
            } else {
                tentativas += 1;

                if (resposta < numeroSorteado) {
                    System.out.print("Errado! Tente novamente (tente um numero maior): ");
                } else {
                    System.out.print("Errado! Tente novamente (tente um numero menor): ");
                }
            }
        }
        System.out.println("-------");
        System.out.println("Você acertou! O número era " + numeroSorteado + "!");
        System.out.println("Tentativas: " + tentativas);

    }

}
