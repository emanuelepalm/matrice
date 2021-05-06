import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    float result = 0;
    float a;
    float b;
    int num;
    BigInteger bigResult;
    String numbers = "";
    boolean prime = true;

    public float getResult() {
        return result;
    }

    Scanner scanner = new Scanner(System.in);
    public Calculator() {
        this.result = 0;
    }
    public Calculator(int num) {
        this.num = num;
    }

    public static void welcome() {
        System.out.println("Esercizio Calcolatrice");
        Menu menu = new Menu();
        menu.calculatorMenu();
    }

    public void calculator() {
        Calculator calc = new Calculator();
        boolean cond = true;
        System.out.println("HAI SCELTO LA CALCOLATRICE");
        while (cond) {
            System.out.println("Premi un tasto qualsiasi seguito da invio per continuare \nq per uscire ");
            char stroke = scanner.next().charAt(0);
            if (stroke == 'q') {
                cond = false;
                break;
            }
            if (calc.result != 0) {
                System.out.println("Premi un tasto qualsiasi seguito da invio per usare il risultato come primo numero \nc per azzerarlo");
                stroke = scanner.next().charAt(0);
                if (stroke != 'c') {
                    calc.a = calc.result;
                    System.out.println(calc.result);
                } else {
                    System.out.println("Inserisci il primo numero");
                   calc.a = scanner.nextFloat();
                }
            } else {
                System.out.println("Inserisci il primo numero");
                calc.a = scanner.nextFloat();
            }

            System.out.println("Inserisci il Secondo Numero");
            calc.b = scanner.nextFloat();
            System.out.println("Inserisci l'operatore \n+ addizione \n* moltiplicazione \n- sottrazione \n\\ divisione ");
            char operator = scanner.next().charAt(0);
            switch (operator) {

                case '+' :
                    calc.result = calc.sum();
                    System.out.println(calc.a + " + " + calc.b + " = " + calc.result);
                    break;
                case '*' :
                    calc.result = calc.mul();
                    System.out.println(calc.a + " * " + calc.b + " = " + calc.result);
                    break;
                case '-' :
                    calc.result = calc.sub();
                    System.out.println(calc.a + " - " + calc.b + " = " + calc.result);
                    break;
                case '\\' :
                    calc.result = calc.div();
                    System.out.println(calc.a + " \\ " + calc.b + " = " + calc.result);
                    break;
                default:
                    System.out.println("Errore tasto non riconosciuto!!!");
            }
        }
    }

    public float sum() {
        return this.a + this.b;
    }

    public float sub() {
        return this.a - this.b;
    }

    public float div() {
        return this.a / this.b;
    }

    public float mul() {
        return this.a * this.b;
    }

    public String primeNumberRange() {
        while (this.num > 1) {
            this.prime = true;
            this.isPrime();
            if (this.prime) {
                this.numbers += this.num + "\n";
            }
            this.num -= 1;
        }
        return this.numbers;

    }

    public boolean isPrime() {
        if (this.num == 1) {
            this.prime = false;
        }
        for (int i = 2; i <= this.num / 2; ++i) {
            if (this.num % i == 0) {
                this.prime = false;
            }
        }
        return this.prime;
    }

    public BigInteger factorial() {
        this.bigResult = BigInteger.valueOf(1);

        for (long factor = 2; factor <= num; factor++) {
            this.bigResult = this.bigResult.multiply(BigInteger.valueOf(factor));
        }

        return this.bigResult;
    }


}

