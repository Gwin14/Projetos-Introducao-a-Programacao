package aula5;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu nome: ");
        String nome = sc.next();

        System.out.print("Diga sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Diga sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Diga seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Diga seu email: ");
        String email = sc.next();

        System.out.print("Diga seu endereço: ");
        String endereco = sc.next();

        System.out.println("----------------");

        System.out.println("Olá " + nome + ", seu cadastro foi efetuado com sucesso."
                + "\nIdade: " + idade
                + "\nAltura: " + altura
                + "\nPeso: " + peso
                + "\nEmail: " + email
                + "\nEndereço: " + endereco);
    }

}
