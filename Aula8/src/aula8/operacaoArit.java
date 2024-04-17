package aula8;

import java.util.Scanner;

public class operacaoArit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o número inteiro 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Diga o número inteiro 2: ");
        double num2 = sc.nextDouble();

        System.out.print("Diga uma operação entre +, -, * ou /: ");
        String operacao = sc.next();

        switch (operacao) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Uma operação válida cara");
                break;
        }

    }

}
