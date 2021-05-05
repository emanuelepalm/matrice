import java.util.Scanner;

public class Calculator {
    static int result = 0;
    static int a, b;
    static Scanner scanner = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Esercizio Calcolatrice");
        Menu.calculatorMenu();
    }

    public static void calculator() {
        boolean cond = true;
        System.out.println("HAI SCELTO LA CALCOLATRICE");
        while (cond) {
            System.out.println("Premi un tasto qualsiasi seguito da invio per continuare \nq per uscire ");
            char stroke = scanner.next().charAt(0);
            if (stroke == 'q') {
                cond = false;
                break;
            }
            if (result != 0) {
                System.out.println("Premi un tasto qualsiasi seguito da invio per usare il risultato come primo numero \nc per azzerarlo");
                stroke = scanner.next().charAt(0);
                if (stroke != 'c') {
                    a = result;
                    System.out.println(result);
                } else {
                    System.out.println("Inserisci il primo numero");
                    a = scanner.nextInt();
                }
            } else {
                System.out.println("Inserisci il primo numero");
                a = scanner.nextInt();
            }

            System.out.println("Inserisci il Secondo Numero");
            b = scanner.nextInt();
            System.out.println("Inserisci l'operatore \n+ addizione \n* moltiplicazione \n- sottrazione \n\\ divisione ");
            char operator = scanner.next().charAt(0);
            switch (operator) {

                case '+' :
                    result = sum(a, b);
                    System.out.println(a + " + " + b + " = " + result);
                    break;
                case '*' :
                    result = mul(a, b);
                    System.out.println(a + " * " + b + " = " + result);
                    break;
                case '-' :
                    result = sub(a, b);
                    System.out.println(a + " - " + b + " = " + result);
                    break;
                case '\\' :
                    result = div(a, b);
                    System.out.println(a + " \\ " + b + " = " + result);
                    break;
                default:
                    System.out.println("Errore tasto non riconosciuto!!!");
            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static String primeNumberRange(int num) {
        String numbers = "";
        while (num > 1) {
            if (isPrime(num)) {
                numbers += num + "\n";
            }
            num -= 1;
        }
        return numbers;

    }

    public static boolean isPrime(int num) {
        boolean result = true;
        if (num == 1) {
            result = false;
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static long factorial(int num) {
            if (num == 0) {
                return 1;
            } else {
                return (num * factorial(num - 1));
            }
        }

    }

