package aula3;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //primeiro preco perguntado
        double preco1 = 5;
        //segundo preco perguntado
        double preco2 = 8;
        //terceiro preco perguntado
        double preco3 = 12;
        //media dos precos
        double mediaPreco = (preco1 + preco2 + preco3) / 3;

        System.out.println("Preço 1: R$" + preco1 + " Preço 2: R$" + preco2 + " Preço 3: R$" + preco3 + ". Média dos preços: " + mediaPreco);

    }

}
