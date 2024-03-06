package logica;

import java.util.Scanner;

public class Logica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2, resultado;

        System.out.println("Diga um número: ");
        numero1 = sc.nextInt();

        System.out.println("Diga outro número: ");
        numero2 = sc.nextInt();

        resultado = numero1 + numero2;

        System.out.println("O resultado da soma dois números é: " + resultado);

    }

}
