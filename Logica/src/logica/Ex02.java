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
public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Diga um número para fazer o quadrado: ");
        numero = sc.nextInt();

        System.out.println(numero + " ao quadrado é " + (numero * numero));

    }
}
