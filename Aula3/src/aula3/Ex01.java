package aula3;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga o nome de um produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Diga o preço deste produto: ");
        double preco = sc.nextDouble();

        double precoFinal = preco * 1.65;

        System.out.println("O valor de venda de " + nomeProduto + ", aplicando um aumento de 65%, é de R$" + precoFinal + ".");
    }

}
