package aula9;

import java.util.Scanner;

public class ExercicioSomarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma;
        int total = 0;

        while (true) {
            System.out.print("Diga um numero para somar à sequencia (digite 0 para parar): ");
            soma = sc.nextInt();

            if (soma != 0) {
                total += soma;
            } else {
                break;
            }
        }
        System.out.println("-----");
        System.out.println("O total deu " + total);

    }

}
