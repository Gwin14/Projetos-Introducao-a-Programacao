package aula16;

import java.util.Scanner;

public class ExercicioRefatorarIMC {

    public static void pesoIdeal(char sexo, double altura) {
        double pesoIdeal = 0;

        if (sexo == 'm' || sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga seu sexo (M ou F): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Diga sua altura: ");
        double altura = sc.nextDouble();

        pesoIdeal(sexo, altura);

    }
}
