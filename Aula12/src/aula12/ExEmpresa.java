package aula12;

import java.util.Arrays;
import java.util.Scanner;

public class ExEmpresa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja adicionar? ");
        int qntProdutos = sc.nextInt();

        String[] produtos = new String[qntProdutos];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Diga o nome de um produto: ");
            produtos[i] = sc.next();
        }

        Arrays.sort(produtos);

        System.out.println("--------------------");
        System.out.println("Produtos:\n");

        for (String x : produtos) {
            System.out.println(x);
        }
    }

}
