import java.math.BigInteger;
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
        System.out.println("Inserisci un numero per le righe, seguito da invio\nPoi fai lo stesso per le colonne");
        int i = scanner.nextInt();
        System.out.println(i);
        int j = scanner.nextInt();
        System.out.println(j);
        Matrix matrice = new Matrix(new int[i][j]);
        matrice.loadMatrix();
        System.out.println("Seleziona: \n1)Stampa Orizziontale    \n2)Stampa Verticale");
        int selezione = scanner.nextInt();
        switch (selezione) {
            case 1:
                matrice.printHorizontalMatrix();
                break;
            case 2:
                matrice.printVerticalMatrix();
                break;
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                matrixMenu();
        }
    }

    public static void pyramidMenu() {
        System.out.println("Seleziona: \n1)Stampa piramide con numero di righe definito \n2)Stampa piramide con numero di righe casuale");
        int selezione = scanner.nextInt();
        int num;
        switch (selezione) {
            case 1:
                System.out.println("Inserisci il numero di righe");
                num = scanner.nextInt();
                Pyramid pyramid = new Pyramid(num);
                pyramid.generate();
                break;
            case 2:
                Random random = new Random();
                num = random.nextInt(25);
                System.out.println("Il numero di righe è " + num);
                Pyramid pyramidR = new Pyramid(num);
                pyramidR.generate();
                break;
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                pyramidMenu();
        }
    }

    public void calculatorMenu() {
        System.out.println("Seleziona: \n1)Calcolatrice base \n2)Ritorna i numeri primi fino a un numero inserito \n3)Verifica se un numero è primo \n4) Fattoriale             ");
        int selezione = scanner.nextInt();
        Calculator calc = new Calculator();
        switch (selezione) {
            case 1:
                calc.calculator();
                break;
            case 2:
                System.out.println("HAI SCELTO TUTTI I NUMERI PRIMI FINO A \nInserisci un numero");
                calc.num = scanner.nextInt();
                calc.primeNumberRange();
                System.out.println(calc.numbers);
                break;
            case 3:
                System.out.println("HAI SCELTO VERIFICA SE UN NUMERO E' PRIMO \nInserisci un numero");
                calc.num = scanner.nextInt();
                calc.isPrime();
                if (calc.prime) {
                    System.out.println("Il numero è primo");
                } else {
                    System.out.println("Il numero non è primo");
                }
                break;
            case 4:
                System.out.println("HAI SCELTO FATTORIALE \nInserisci un numero ");
                calc.num = scanner.nextInt();
                if (calc.num <= 0) {
                    System.err.println("ERRORE!!!\n Il numero deve essere maggiore di 0!");
                    calculatorMenu();
                    break;
                } else {
                        System.out.println(calc.factorial());
                        break;
                }
            default:
                System.out.println("Errore!! \n A questo numero non è associato nessun esercizio, riprova");
                calculatorMenu();
            }
        }
}

