package aula8;

import java.util.Scanner;

public class SexoSalario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu sexo M ou F: ");
        String sexo = sc.next();

        System.out.print("Diga seu tempo de serviço: ");
        int tempo = sc.nextInt();

        System.out.print("Diga se é graduado G ou tem pós graduação PG: ");
        String gradu = sc.next();

        int salario = 0;

        if (tempo >= 10 && gradu.equals("G")) {
            salario = 15000;
        } else if ((tempo >= 10 && gradu.equals("G")) || (tempo < 10 && gradu.equals("PG"))) {
            salario = 10000;
        } else if (tempo < 10 && gradu.equals("G")) {
            salario = 7000;
        }

        if (sexo.equals("F")) {
            salario += 500;
        }

        System.out.println("Salario de R$" + salario);

    }

}
