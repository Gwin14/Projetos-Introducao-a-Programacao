package aula_17;

public class AtividadeRefatorar {

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Antes de chamar o método: " + x);
        aumentaValor(x);
        System.out.println("Depois de chamaro método: " + x);
    }

    public static void incrementa(int num) {
        num++;
        System.out.println("Dentro do método: " + num);
    }

    public static void aumentaValor(int num) {
        num += 5;
        System.out.println("Dentro do método: " + num);
    }

}
