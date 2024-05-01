package aula9;

public class Exerciciowhiledoido {

    public static void main(String[] args) {
        int n = 8095;

        System.out.println(n);
        System.out.println("--------------");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3 + 1) / 2;
            }

            System.out.println(n);
        }
    }

}
