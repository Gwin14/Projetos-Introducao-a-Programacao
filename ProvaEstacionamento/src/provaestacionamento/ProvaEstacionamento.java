package provaestacionamento;

import java.util.Scanner;

public class ProvaEstacionamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] estacionamento = new String[10];

        for (int i = 0; i < estacionamento.length; i++) {
            System.out.print("Diga a placa do carro " + i + " que vai estacionar: ");
            String placa = sc.next();

            while (true) {
                boolean igual = false;

                for (int j = 0; j < estacionamento.length; j++) {
                    if (placa.equals(estacionamento[j])) {
                        igual = true;
                    }
                }

                if (igual) {
                    System.out.print("Esse carro já está estacionado! Tente outro: ");
                    placa = sc.next();
                    continue;
                }

                System.out.println("Carro adicionado!\n");
                estacionamento[i] = placa;

                break;
            }
        }

        System.out.println("\n------------\n");

        for (int i = 0; i < estacionamento.length; i++) {
            System.out.println("Placa do carro na posição [" + i + "]: " + estacionamento[i]);

        }
    }

}
