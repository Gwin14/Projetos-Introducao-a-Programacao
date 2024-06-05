package aula15;

import java.util.Scanner;

public class Exerciciofuncao {

    public static void solicitarNumero() {
        System.out.println("Digite um número");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("O número informado é: " + numero);
    }

    public static void main(String[] args) {
        solicitarNumero();
    }

}
