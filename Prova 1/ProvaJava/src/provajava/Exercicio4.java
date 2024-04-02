package provajava;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precoFerradura = 5.00;

        System.out.println("Informe a quantidade de ferraduras que deseja comprar para calcular o valor: ");
        int qtdFerraduras = sc.nextInt();

        double valorTotal = precoFerradura * qtdFerraduras;

        System.out.println("Valor total a ser pago por " + qtdFerraduras + " ferraduras: R$" + valorTotal + ".");

    }

}
