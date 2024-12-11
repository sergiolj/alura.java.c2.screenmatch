package horaDaPratica;

import java.util.Scanner;

public class Calculator {
    double number1;

    public double calculateDouble(double number1) {
        return 2 * this.number1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Insert a number: ");

        calc.number1 = sc.nextDouble();
        System.out.println("Double of "+ calc.number1+ " = " + calc.calculateDouble(calc.number1));
    }
}
