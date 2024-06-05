package aula15;

import java.util.Scanner;

public class ExercicioCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Que operação deseja realizar? (+, -, *, /): ");
        String resposta = sc.next();

        System.out.print("Diga o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Diga o segundo número: ");
        double num2 = sc.nextDouble();

        switch (resposta) {
            case "+":
                somar(num1, num2);
                break;

            case "-":
                subtrair(num1, num2);
                break;

            case "*":
                multiplicar(num1, num2);
                break;

            case "/":
                dividir(num1, num2);
                break;

            default:
                System.out.println("Diga uma das operações.");
                break;
        }
    }

    public static void somar(double num1, double num2) {
        System.out.println("A soma dos números é igual a " + (num1 + num2));
    }

    public static void subtrair(double num1, double num2) {
        System.out.println("A subtração dos números é igual a " + (num1 - num2));
    }

    public static void multiplicar(double num1, double num2) {
        System.out.println("A multiplicação dos números é igual a " + (num1 * num2));
    }

    public static void dividir(double num1, double num2) {
        System.out.println("A divisão dos números é igual a " + (num1 / num2));
    }

}
