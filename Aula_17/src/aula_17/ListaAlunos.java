package aula_17;

import java.util.Arrays;
import java.util.Scanner;

public class ListaAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listaAlunos = new String[6];

        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.print("Diga o nome do aluno " + i + ": ");
            listaAlunos[i] = sc.next();
        }

        ordenaArray(listaAlunos);
        imprimeArray(listaAlunos);
    }

    private static void ordenaArray(String[] alunos) {
        Arrays.sort(alunos);
    }

    private static void imprimeArray(String[] listaAlunos) {
        for (String listaAluno : listaAlunos) {
            System.out.println(listaAluno);
        }
    }

}
