package aula8;

import java.util.Scanner;

public class ExAno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga um mês: ");
        String mes = sc.next();

        switch (mes) {
            case "janeiro":
                System.out.println("Tem 31 dias");
                break;
            case "fevereiro":
                System.out.println("Tem 28 dias");
                break;
            case "março":
                System.out.println("Tem 31 dias");
                break;
            case "abril":
                System.out.println("Tem 30 dias");
                break;
            case "maio":
                System.out.println("Tem 31 dias");
                break;
            case "junho":
                System.out.println("Tem 30 dias");
                break;
            case "julho":
                System.out.println("Tem 31 dias");
                break;
            case "agosto":
                System.out.println("Tem 31 dias");
                break;
            case "setembro":
                System.out.println("Tem 30 dias");
                break;
            case "outubro":
                System.out.println("Tem 31 dias");
                break;
            case "novembro":
                System.out.println("Tem 30 dias");
                break;
            case "dezembro":
                System.out.println("Tem 31 dias");
                break;
            default:
                System.out.println("Isso não existe cara");
                break;

        }
    }

}
