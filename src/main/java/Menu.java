import java.util.Random;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("MENU \n 1) Esercizio Matrici \n 2) Esercizio Piramide \n 0) Esci");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 0:
                System.out.println("Grazie e arrivederci");
                break;
            case 1:
                Main.exMatrix();
                System.out.println("\nEsercizio terminato \n");
                menu();
                break;
            case 2:
                Main.exPyramid();
                System.out.println("\nEsercizio terminato \n");
                menu();
                break;
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                menu();
        }
    }

    public static void matrixMenu() {
        int[][] matrix = new int[5][5];
        Matrix.loadMatrix(matrix, 100);
        System.out.println("Seleziona: \n1)Stampa Orizziontale    \n2)Stampa Verticale");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 1:
                Matrix.printHorizontalMatrix(matrix);
                break;
            case 2:
                Matrix.printVerticalMatrix(matrix);
                break;
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                matrixMenu();
        }
    }

    public static void pyramidMenu() {
        System.out.println("Seleziona: \n1)Stampa piramide con numero di righe definito \n2)Stampa piramide con numero di righe casuale");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 1:
                Pyramid.generate();
                break;
            case 2:
                Random random = new Random();
                int num = random.nextInt(25);
                Pyramid.generate(num);
                break;
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                matrixMenu();
        }
    }
}