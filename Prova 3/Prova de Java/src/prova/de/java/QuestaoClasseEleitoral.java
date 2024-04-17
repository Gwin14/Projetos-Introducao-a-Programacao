package prova.de.java;

import java.util.Scanner;

public class QuestaoClasseEleitoral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga sua idade, para saber sua classe eleitoral: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não é eleitor.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Você é eleitor obrigatório.");
        } else {
            System.out.println("Você é eleitor facultativo.");
        }
    }

}
