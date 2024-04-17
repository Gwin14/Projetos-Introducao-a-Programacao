package prova.de.java;

import java.util.Scanner;

public class QuestaoPesoIdeal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu sexo. (M) para masculino e outra resposta para fiminino: ");
        String sexo = sc.next();

        System.out.print("Agora diga sua altura: ");
        double altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Seu peso ideal é: " + (72.7 * altura - 58) + ".");
        } else {
            System.out.println("Seu peso ideal é: " + (62.1 * altura - 44.7) + ".");
        }
    }

}
