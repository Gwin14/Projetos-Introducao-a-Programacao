package aula8;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu time? ");
        String time = sc.next();

        switch (time) {

            case "Flamengo":
                System.out.println("É um time carioca");
                break;

            case "Vasco":
                System.out.println("É um time carioca");
                break;

            case "Botafogo":
                System.out.println("É um time carioca");
                break;
            default:
                System.out.println("Nenhum");
                break;
        }
    }

}
