package aula10;

import java.util.Scanner;

public class UsuarioESenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga seu usuário: ");
        String usuario = sc.next();

        System.out.print("Diga sua senha: ");
        String senha = sc.next();

        while (senha.equals(usuario)) {
            System.out.print("Senha não pode ser igual ao usuário, tente novamente: ");
            senha = sc.next();

        }

        System.out.println("Registro feito com sucesso!");
    }

}
