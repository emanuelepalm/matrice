import java.util.Random;

public class Main {
    public static void main(String[] args) {
       int[][] matrix = new int[5][5];
        loadMatrix(matrix, 100);
        printHorizontalMatrix(matrix);
        printVerticalMatrix(matrix);

    }
    /**
     loadMatrix() Genera una matrice con parametro impostato da noi
     @param matrix matrice
     @param bound  valore del parametro random
     */
    public static void loadMatrix(int[][] matrix, int bound) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(bound);
            }
        }
    }
    /**
        loadMatrix() Genera una matrice con parametro = 20
        @param matrix matrice
     */
    public static void loadMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
    }

    public static void printVerticalMatrix(int[][] matrix) {
        System.out.println("\n Verticale ");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("[" + (row + 1) + "][" + (col + 1) + "] => " + matrix[row][col]);
            }
        }
    }

    public static void printHorizontalMatrix(int[][] matrix) {
        System.out.println("Orizzontale \n");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[0].length; col++) {
                if ((matrix[row][col]) >= 10) {
                    System.out.print("|" + (matrix[row][col]) + "|");
                } else {
                    System.out.print("| " + (matrix[row][col]) + "|");
                }
            }
        }
    }
}