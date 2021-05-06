import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    };


    public static void welcome() {
        System.out.println("Esercizio Matrici");
        Menu.matrixMenu();
    }

    /**
     loadMatrix() Genera una matrice con parametro = 20
     @param matrix matrice
     */
    public void loadMatrix() {
        Random random = new Random();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = random.nextInt(20);
            }
        }
    }
    /**
     printVerticalMatrix() stampa matrice verticale
     */
    public void printVerticalMatrix() {
        System.out.println("\n Verticale ");
        for (int row = 0; row < this.matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < this.matrix[row].length; col++) {
                System.out.println("[" + (row + 1) + "][" + (col + 1) + "] => " + this.matrix[row][col]);
            }
        }
    }

    public void printHorizontalMatrix() {
        System.out.println("Orizzontale \n");
        for (int row = 0; row < this.matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < this.matrix[0].length; col++) {
                if ((matrix[row][col]) >= 10) {
                    System.out.print("|" + (this.matrix[row][col]) + "|");
                } else {
                    System.out.print("| " + (this.matrix[row][col]) + "|");
                }
            }
        }
    }
}
