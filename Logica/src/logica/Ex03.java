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
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3, nota4;

        System.out.println("Diga 4 notas para fazer a média delas: ");

        System.out.println("Diga a nota 1: ");
        nota1 = sc.nextInt();

        System.out.println("Diga a nota 2: ");
        nota2 = sc.nextInt();

        System.out.println("Diga a nota 3: ");
        nota3 = sc.nextInt();

        System.out.println("Diga a nota 4: ");
        nota4 = sc.nextInt();

        System.out.println("A média das notas é: " + (nota1 + nota2 + nota3 + nota4) / 4);
    }

}
