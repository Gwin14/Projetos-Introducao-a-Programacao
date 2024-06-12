package aula_17;

public class ExemploParametroReferencia {

    public static void main(String[] args) {
        String[] nomes = new String[10];

        for (String nome : nomes) {
            System.out.println(nome);
        }

        adicionaElemento(nomes, "Maria");
        System.out.println("----");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    private static void adicionaElemento(String[] nomes, String elemento) {
        nomes[0] = elemento;
    }

}
