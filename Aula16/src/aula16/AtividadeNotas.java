package aula16;

import java.util.Scanner;

public class AtividadeNotas {

    public static void main(String[] args) {
        double notaFinal = fazerMedia();

        System.out.println("Você está " + verificarNota(notaFinal));

    }

    public static double fazerMedia() {
        double notaFinal = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.print("Diga a nota " + i + " do aluno: ");
            double nota = sc.nextDouble();
            notaFinal += nota;
        }

        return notaFinal /= 5;
    }

    public static String verificarNota(double nota) {
        if (6 < nota) {
            return "Aprovado";
        }

        return "Reprovado";
    }

}
