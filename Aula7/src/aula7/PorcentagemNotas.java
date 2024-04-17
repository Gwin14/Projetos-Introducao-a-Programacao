package aula7;

import java.util.Scanner;

public class PorcentagemNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga a nota de matemática (de 0 a 10): ");
        double notaMat = sc.nextDouble();

        System.out.print("Diga a nota de física (de 0 a 10): ");
        double notaFis = sc.nextDouble();

        System.out.print("Diga a nota de química (de 0 a 10): ");
        double notaQui = sc.nextDouble();

        System.out.print("Diga a nota de biologia (de 0 a 10): ");
        double notaBio = sc.nextDouble();

        System.out.print("Diga a nota de informática (de 0 a 10): ");
        double notaInf = sc.nextDouble();

        float media = (float) ((notaMat + notaFis + notaQui + notaBio + notaInf) / 5);

        if (media >= (10 * 0.9)) {
            System.out.println("A");
        } else if (media >= (10 * 0.8)) {
            System.out.println("B");
        } else if (media >= (10 * 0.7)) {
            System.out.println("C");
        } else if (media >= (10 * 0.6)) {
            System.out.println("D");
        } else if (media >= (10 * 0.4)) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        System.out.println("Média: " + media);

    }

}
