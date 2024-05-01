package aula10;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numspar = 0;
        int numsimpar = 0;
        String escolha;

        do {
            System.out.print("Diga um número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                numspar += numero;
            } else {
                numsimpar += numero;
            }

            System.out.print("Quer adicionar mais números? S para sim e outra resposta para não: ");
            escolha = sc.next();

        } while (escolha.equalsIgnoreCase("s"));

        System.out.println("-----------------");
        System.out.println("Soma dos números pares: " + numspar);
        System.out.println("Soma dos números ímpares: " + numsimpar);

    }

}
