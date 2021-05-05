import java.util.Random;
import java.util.Scanner;

public class Pyramid {
    public static void welcome() {
        System.out.println("Esercizio Piramide");
    }
    public static void generate() {
        System.out.println("Generazione con input");
        Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci un numero \nIl numero massimo è 25");
        int righe = scanner.nextInt();
        if (righe <= 25) {
            for (int i = 1, asterisco = 1; i <= righe; i++, asterisco += 2) {
                for (int spazio = righe; spazio > i; spazio--)
                    System.out.print(" ");
                for (int j = 1; j <= asterisco; j++)
                    System.out.print("*");
                System.out.println();
            }
        }   else {
            System.out.println("Numero troppo grande \n Riprova");
            generate();
        }

    }
    public static void generate(int num) {
        System.out.println("\nNumero di righe casuale\n ");
        int righe = num;
        for (int i = 1, asterisco = 1; i <= righe; i++, asterisco += 2) {
            for (int spazio = righe; spazio > i; spazio--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisco; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
