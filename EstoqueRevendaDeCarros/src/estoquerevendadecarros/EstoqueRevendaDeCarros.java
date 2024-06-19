package estoquerevendadecarros;

import java.util.Scanner;

public class EstoqueRevendaDeCarros {

    public static void main(String[] args) {
        boolean ativo = true;

        String[] estoque = new String[50];

        while (ativo) {

            menuInicial(ativo, estoque);

        }
    }

    private static void preencherEstoque(String[] estoque) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] != null) {
                continue;
            }

            System.out.print("Diga o nome do carro " + (i + 1) + " para botar no estoque: ");
            estoque[i] = sc.next();

            if (i > 4) {
                System.out.print("Deseja continuar a botar carros no estoque? ('Sim' ou 'não') ");
                String resposta = sc.next();
                if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
                    break;
                }
            }
        }
    }

    private static void comprarCarro(String[] estoque) {
        Scanner sc = new Scanner(System.in);
        boolean carroExiste = false;

        System.out.print("Deseja comprar algum carro? ('Sim' ou 'não') ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("sim")) {

            while (true) {
                System.out.print("Diga o nome do carro que deseja comprar: ");
                String nomeCarro = sc.next();

                for (String carro : estoque) {
                    if (nomeCarro.equalsIgnoreCase(carro)) {
                        carroExiste = true;
                    }
                }

                if (!carroExiste) {
                    System.out.println("Esse carro não está no estoque, tente novamente.");
                    continue;
                }

                System.out.print("Deseja dar o seu carro na troca? ('Sim' ou 'não') ");
                String respostaTroca = sc.next();
                if (respostaTroca.equalsIgnoreCase("sim")) {
                    System.out.print("Diga o nome do seu carro: ");
                    String carroCliente = sc.next();

                    for (int i = 0; i < estoque.length; i++) {
                        if (nomeCarro.equalsIgnoreCase(estoque[i])) {
                            System.out.println(estoque[i] + " comprado com sucesso!");
                            estoque[i] = carroCliente;
                            break;
                        }
                    }
                } else {
                    for (int i = 0; i < estoque.length; i++) {
                        if (nomeCarro.equalsIgnoreCase(estoque[i])) {
                            System.out.println(estoque[i] + " comprado com sucesso!");
                            estoque[i] = null;
                            break;
                        }
                    }
                }

                break;
            }

        }
    }

    private static void mostrarEstoque(String[] estoque) {
        System.out.println("CARROS EM ESTOQUE");
        for (String carro : estoque) {

            if (carro != null) {
                System.out.println(carro + ";");
            }
        }
    }

    private static boolean verificarEstoque(String[] estoque) {
        for (String carro : estoque) {
            if (carro != null) {
                return false;
            }
        }
        return true;
    }

    private static boolean menuInicial(boolean ativo, String[] estoque) {
        Scanner sc = new Scanner(System.in);

        if (verificarEstoque(estoque)) {
            System.out.println("=====================");
            System.out.println("MENU INICIAL: o que deseja fazer?");
            System.out.println("1 -> Preencher estoque");
            System.out.println("2 -> Sair");
            System.out.print("Resposta: ");
            String resposta = sc.next();

            switch (resposta) {
                case "1":
                    preencherEstoque(estoque);
                    break;

                case "2":
                    System.out.println("Sistema encerrado.");
                    ativo = false;
                    break;

                default:
                    System.out.println("Resposta inválida, tente novamente.");
                    break;
            }
            System.out.println("=====================");
        } else {
            System.out.println("=====================");
            System.out.println("MENU INICIAL: o que deseja fazer?");
            System.out.println("1 -> Preencher estoque");
            System.out.println("2 -> Comprar carro");
            System.out.println("3 -> Mostrar estoque");
            System.out.println("4 -> Sair");
            System.out.print("Resposta: ");
            String resposta = sc.next();

            switch (resposta) {
                case "1":
                    preencherEstoque(estoque);
                    break;

                case "2":
                    comprarCarro(estoque);
                    break;

                case "3":
                    mostrarEstoque(estoque);
                    break;

                case "4":
                    System.out.println("Sistema encerrado.");
                    ativo = false;
                    break;

                default:
                    System.out.println("Resposta inválida, tente novamente.");
                    break;

            }
            System.out.println("=====================");
        }

        return ativo;
    }

}
