import java.util.Random;
import java.util.Scanner;

public class Pyramid {
    private int righe;

    public Pyramid(int righe) {
        this.righe = righe;
    }

    public static void welcome() {
        System.out.println("Esercizio Piramide");
        Menu.pyramidMenu();
    }
    public void generate() {
        System.out.println("Generazione Piramide");
                for (int i = 1, asterisco = 1; i <= this.righe; i++, asterisco += 2) {
                for (int spazio = this.righe; spazio > i; spazio--)
                    System.out.print(" ");
                for (int j = 1; j <= asterisco; j++)
                    System.out.print("*");
                System.out.println();
            }

    }

}
