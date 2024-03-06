/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author fabio.santos1
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salario;

        System.out.println("Diga o salário para calcular o acréscimo de 30%: ");
        salario = sc.nextInt();

        System.out.println("O acréscimo ficou: " + salario / 100 * 30);
        System.out.println("O salário com acrécimo de 30% ficou: " + (salario + (salario / 100 * 30)));
    }

}
