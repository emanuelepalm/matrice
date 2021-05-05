import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu.menu();
    }


    public static void exMatrix() {
        Matrix.welcome();
        Menu.matrixMenu();
    }

    public static void exPyramid() {
        Pyramid.welcome();
        Menu.pyramidMenu();
    }
    public static void exCalculator() {
        Calculator.welcome();
        Menu.calculatorMenu();
    }
}