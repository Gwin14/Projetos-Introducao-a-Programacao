package aula06;

import java.util.Scanner;

public class ExercicioMaiorValor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o numero 1: ");
        int num1 = sc.nextInt();

        System.out.print("Diga o numero 2: ");
        int num2 = sc.nextInt();

        System.out.print("Diga o numero 3: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("Todos iguais");
        } else {
            int numFinal = (num1 > num2) ? num1 : num2;
            numFinal = (numFinal > num3) ? numFinal : num3;

            System.out.println("O maior número digitado é " + numFinal);
        }

    }

}
