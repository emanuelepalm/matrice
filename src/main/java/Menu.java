import java.util.Random;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static int num;

    public static void menu() {
        System.out.println("MENU \n 1) Esercizio Matrici \n 2) Esercizio Piramide \n 3) Calcolatrice \n 0) Esci");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 0:
                System.out.println("Grazie e arrivederci");
                break;
            case 1:
                Matrix.welcome();
                System.out.println("\nEsercizio terminato \n");
                menu();
                break;
            case 2:
                Pyramid.welcome();
                System.out.println("\nEsercizio terminato \n");
                menu();
                break;
            case 3:
                Calculator.welcome();
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
                pyramidMenu();
        }
    }

    public static void calculatorMenu() {
        System.out.println("Seleziona: \n1)Calcolatrice base \n2)Ritorna i numeri primi fino a un numero inserito \n3)Verifica se un numero è primo \n4) Fattoriale             ");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 1:
                Calculator.calculator();
                break;
            case 2:
                System.out.println("HAI SCELTO TUTTI I NUMERI PRIMI FINO A \nInserisci un numero");
                num = scanner.nextInt();
                System.out.println(Calculator.primeNumberRange(num));
                break;
            case 3:
                System.out.println("HAI SCELTO VERIFICA SE UN NUMERO E' PRIMO \nInserisci un numero");
                num = scanner.nextInt();
                if (Calculator.isPrime(num)) {
                    System.out.println("Il numero è primo");
                } else {
                    System.out.println("Il numero non è primo");
                }
                break;
            case 4:
                System.out.println("HAI SCELTO FATTORIALE \nInserisci un numero fino a 49");
                num = scanner.nextInt();
                if (num > 49) {
                    System.out.println("ERRORE!!!\n Il numero è troppo grande!");
                    calculatorMenu();
                    break;
                } else {
                    long result = Calculator.factorial(num);
                    if (result > 0) {
                        System.out.println(Calculator.factorial(num));
                        break;
                    }
                }
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                calculatorMenu();
            }
        }
}

