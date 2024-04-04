package aula3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Diga seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Diga sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é: " + df.format(imc));

    }

}
