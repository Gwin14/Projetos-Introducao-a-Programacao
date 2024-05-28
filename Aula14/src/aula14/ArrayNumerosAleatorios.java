package aula14;

import java.util.Random;

public class ArrayNumerosAleatorios {

    public static void main(String[] args) {

        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = random.nextInt(101);

            array[i] = numeroAleatorio;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array na posição " + i + ": " + array[i]);
        }

        System.out.println("\n--------\n");

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array na posição " + i + " multiplicado por 2: " + array[i]);
        }
    }

}
