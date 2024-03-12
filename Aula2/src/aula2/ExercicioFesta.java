package aula2;

class ExercicioFesta {

    public static void main(String[] args) {

        int gramasPessoa = 350;
        int amigos = 23;

        int kilo = 40;

        double totalKilos = (gramasPessoa * amigos) / 1000;
        double valorTotal = totalKilos * kilo;
        double valorIndividual = valorTotal / amigos;

        System.out.println("Quantidade de kilos de carne comprada: " + totalKilos);
        System.out.println("Valor total gasto: " + valorTotal);
        System.out.println("Valor individual: " + valorIndividual);

    }

}
