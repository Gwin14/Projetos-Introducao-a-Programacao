package provajava;

public class Exercicio3 {

    public static void main(String[] args) {

        double kmEstrada = 100;
        double kmCidade = 50;

        double kmLitroEstrada = 8;
        double kmLitroCidade = 6;

        double valorCombustivel = 6.31;

        double totalLitros = (kmEstrada / kmLitroEstrada) + (kmCidade / kmLitroCidade);
        double totalValor = totalLitros * valorCombustivel;

        System.out.println("Distância na estrada percorrida: " + kmEstrada + "Km.");
        System.out.println("Distância na cidade percorrida: " + kmCidade + "Km.");
        System.out.print("Média de consumo na estrada: " + kmLitroEstrada + "Km. ");
        System.out.println("Média de consumo na cidade: " + kmLitroCidade + "Km.");
        System.out.println("Total de litros de combustível: " + totalLitros + ".");
        System.out.println("Valor total de abastecimento: R$" + totalValor + ".");

    }

}
