package aula2;

import java.util.Scanner;

public class ExercicioNomeSobrenome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Diga seu sobrenome: ");
        String sobreNome = sc.nextLine();

        System.out.println("Seu nome é: " + nome + " " + sobreNome + ".");

    }

}
