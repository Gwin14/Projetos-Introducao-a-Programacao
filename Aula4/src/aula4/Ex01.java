package aula4;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Diga seu peso: ");
            double peso = sc.nextDouble();

            System.out.print("Diga sua altura: ");
            double altura = sc.nextDouble();

            System.out.print("Diga seu gênero (M) ou (F): ");
            String genero = sc.next();

            double imc = peso / (altura * altura);

            boolean pesoIdealHomem = imc >= 19.1 && imc <= 25.8;
            boolean pesoIdealMulher = imc >= 20.8 && imc <= 26.4;

            if (genero.equalsIgnoreCase("M")) {
                if (pesoIdealHomem) {
                    System.out.println("\nVocê está no peso ideal");
                } else {
                    System.out.println("\nVocê não está no peso ideal");
                }
            } else if (genero.equalsIgnoreCase("F")) {
                if (pesoIdealMulher) {
                    System.out.println("\nVocê está no peso ideal");
                } else {
                    System.out.println("\nVocê não está no peso ideal");
                }
            } else {
                System.out.println("Não informou gênero");
            }

            if (pesoIdealHomem && pesoIdealMulher) {
                System.out.println("O IMC é ideal tanto para homem quanto para mulher\n");
            } else {
                System.out.println("O IMC não é ideal tanto para homem quanto para mulher\n");
            }

            if (pesoIdealHomem || pesoIdealMulher) {
                if (pesoIdealHomem) {
                    System.out.println("Tem o peso ideal pra homem");
                }
                if (pesoIdealMulher) {
                    System.out.println("Tem o peso ideal pra mulher");
                }
            }

            System.out.println("-----------------------------------");
            System.out.println("IMC: " + imc);

        } catch (Exception e) {
            System.out.println("------------");
            System.out.println("Faz certo aí");
        }

    }

}
