package aula13;

import java.util.Scanner;

public class IntroducaoMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas colunas quer criar? ");
        int colunas = sc.nextInt();
        System.out.print("E quantas linhas? ");
        int linhas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Que valor quer por na posição [" + i + "][" + j + "]?");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Na posição [" + i + "][" + j + "] tem o valor " + matriz[i][j]);

            }
        }
    }

}
