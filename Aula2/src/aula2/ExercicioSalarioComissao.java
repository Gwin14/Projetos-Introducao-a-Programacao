package aula2;

import java.util.Scanner;

public class ExercicioSalarioComissao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o salário: ");
        double salario = sc.nextDouble();

        System.out.print("Diga o total de vendas: ");
        double totalVendas = sc.nextDouble();

        double taxaComissao = totalVendas * 0.6;

        System.out.println("---------");
        System.out.println("Salario base: " + salario);
        System.out.println("Valor total em vendas: " + totalVendas);
        System.out.println("Taxa de comissão: 6%");
        System.out.println("Valor taxa de comissão: " + taxaComissao);
        System.out.println("Valor total do salário: " + (salario + taxaComissao));

    }

}
