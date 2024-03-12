package aula2;

import java.util.Scanner;

public class ExercicioSalarioProfessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Diga suas horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.print("Diga suas horas extras trabalhadas: ");
        double horasExtras = sc.nextDouble();

        double valorHora = salario / horas;
        double valorHoraExtra = valorHora * 1.5;
        double salarioTotal = salario + (valorHora * horas) + (valorHoraExtra * horasExtras);

        System.out.println("---------------");
        System.out.println("Seu salário é de: " + salario);
        System.out.println("Sua quantidade de horas trabalhadas: " + horas);
        System.out.println("Valor da hora regular: " + valorHora);
        System.out.println("Horas extras trabalhadas: " + horasExtras);
        System.out.println("Valor hora extra: " + valorHoraExtra);
        System.out.println("Salário total: " + salarioTotal);

    }

}
