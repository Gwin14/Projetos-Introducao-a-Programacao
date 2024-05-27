package tarefasmatrizes;

public class Calendario {

    static void main(String[] args) {
        int[][] calendario = new int[12][];

        calendario[0] = new int[31];
        calendario[1] = new int[28];
        calendario[2] = new int[31];
        calendario[3] = new int[30];
        calendario[4] = new int[31];
        calendario[5] = new int[30];
        calendario[6] = new int[31];
        calendario[7] = new int[31];
        calendario[8] = new int[30];
        calendario[9] = new int[31];
        calendario[10] = new int[30];
        calendario[11] = new int[31];

        for (int i = 0; i < calendario.length; i++) {
            System.out.println("Mês " + (i + 1) + " tem " + calendario[i].length + " dias.");
        }
    }

}
