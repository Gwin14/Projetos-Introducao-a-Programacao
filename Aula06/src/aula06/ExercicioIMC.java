package aula06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Diga seu nome: ");
        String nome = sc.next();

        System.out.print("Diga seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Diga sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Diga seu sexo (M ou F): ");
        String sexo = sc.next();

        double imc = peso / (altura * altura);

        System.out.println("");

        if ("F".equalsIgnoreCase(sexo)) {
            if (imc < 19.1) {
                System.out.println(nome + ", você está abaixo do peso. IMC: " + df.format(imc));
            } else if (imc < 25.8) {
                System.out.println(nome + ", você está no peso ideal. IMC: " + df.format(imc));
            } else if (imc < 27.3) {
                System.out.println(nome + ", você está um pouco acima do peso. IMC: " + df.format(imc));
            } else if (imc < 32.3) {
                System.out.println(nome + ", você está acima do peso ideal. IMC: " + df.format(imc));
            } else {
                System.out.println(nome + ", você está obesa. IMC: " + df.format(imc));
            }
        } else if ("M".equalsIgnoreCase(sexo)) {
            if (imc < 20.7) {
                System.out.println(nome + ", você está abaixo do peso. IMC: " + df.format(imc));
            } else if (imc < 26.4) {
                System.out.println(nome + ", você está no peso ideal. IMC: " + df.format(imc));
            } else if (imc < 27.8) {
                System.out.println(nome + ", você está um pouco acima do peso. IMC: " + df.format(imc));
            } else if (imc < 31.1) {
                System.out.println(nome + ", você está acima do peso ideal. IMC: " + df.format(imc));
            } else {
                System.out.println(nome + ", você está obeso. IMC: " + df.format(imc));
            }
        }

    }

}
