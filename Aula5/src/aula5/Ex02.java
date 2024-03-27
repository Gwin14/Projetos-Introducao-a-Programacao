package aula5;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Diga um número inteiro para dizer se é par ou ímpar: ");
            int numero = sc.nextInt();

            String num = (numero % 2 == 0) ? "O número é par" : "O número é impar";
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("DIGA UM NÚMERO INTEIRO");
        }
    }

}
