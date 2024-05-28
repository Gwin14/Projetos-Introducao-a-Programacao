package aula14;

import java.util.Random;

public class ArrayMaiorNumero {

    public static void main(String[] args) {
        int[] array = new int[8];
        int maiorNumero = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = random.nextInt(101);

            array[i] = numeroAleatorio;

            if (numeroAleatorio > maiorNumero) {
                maiorNumero = numeroAleatorio;
            }
        }

        System.out.println("O maior número dentro do array é " + maiorNumero);
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }

}
