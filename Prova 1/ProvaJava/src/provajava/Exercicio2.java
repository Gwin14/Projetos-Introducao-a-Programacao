package provajava;

public class Exercicio2 {

    public static void main(String[] args) {

        double valorLivro = 5.00;
        double acrescimo = 0.75;

        double totalLivros = valorLivro * 10;
        double totalAcrescimo = acrescimo * 3;

        System.out.println("O total de acréscimo: R$" + totalAcrescimo);
        System.out.println("O total da compra: R$" + (totalLivros + totalAcrescimo));
        System.out.println("Quantidade de livros: 10");

    }

}
