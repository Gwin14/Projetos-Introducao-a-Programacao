package aula16;

import java.util.Scanner;

public class CalculadoraComReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Que operação deseja realizar? (+, -, *, /): ");
        String resposta = sc.next();

        System.out.print("Diga o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Diga o segundo número: ");
        double num2 = sc.nextDouble();

        switch (resposta) {
            case "+":
                resultado = somar(num1, num2);
                break;

            case "-":
                resultado = subtrair(num1, num2);
                break;

            case "*":
                resultado = multiplicar(num1, num2);
                break;

            case "/":
                resultado = dividir(num1, num2);
                break;

            default:
                System.out.println("Diga uma das operações.");
                break;
        }

        System.out.println("O resultado é " + resultado);
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

}
