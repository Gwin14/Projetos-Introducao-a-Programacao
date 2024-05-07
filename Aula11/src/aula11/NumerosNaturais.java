package aula11;

public class NumerosNaturais {

    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println(total + " + " + i + " = " + (total + i));
            total += i;
        }

        System.out.println("----");
        System.out.println("Soma: " + total);

    }

}
