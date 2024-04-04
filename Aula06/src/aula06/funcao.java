package aula06;

import java.util.Scanner;

public class funcao {

    public void calcular() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para A: ");
        int a = sc.nextInt();

        System.out.print("Digite outro numero inteiro para B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A é maior que B");
        } else if (a < b) {
            System.out.println("B é maior que A");
        } else {
            System.out.println("Números iguais, tente de novo");
            System.out.println("-------------");
            calcular();
        }

    }

}
