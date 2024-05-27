package tarefasmatrizes;

import java.util.Scanner;

public class SomandoMatrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] soma = new int[linhas][colunas];

        System.out.println("Preencha a primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Primeira matriz [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha a segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Segunda matriz [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A matriz resultante da soma é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
