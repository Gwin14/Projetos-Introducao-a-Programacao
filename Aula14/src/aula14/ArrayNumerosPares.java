package aula14;

import java.util.Random;

public class ArrayNumerosPares {

    public static void main(String[] args) {
        int[] array = new int[10];
        int numerosPares = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = random.nextInt(101);

            array[i] = numeroAleatorio;

            if (array[i] % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println("Os números pares dentro do array são " + numerosPares);
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\nNúmeros pares:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
