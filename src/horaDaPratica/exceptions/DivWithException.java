package horaDaPratica.exceptions;

import java.util.Scanner;

public class DivWithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number (Dividend): ");
        double a = sc.nextDouble();
        System.out.print("Insert a number (Divisor): ");
        double b = sc.nextDouble();
        double result;
        /*
        * double variables don't get division by zero error.
        * The result will be (a>0) plus infinity, (a<0) minos infinity or (a && b==0) NaN (Not a Number) not
        * resulting in exception.
        * */
        try{
            System.out.println("\nUsing double type variables:");
            result = a/b;
            System.out.printf("Result: %.2f / %.2f = %.2f%n", a, b, result );
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Error: "+e.getMessage());
        }
        var aInt = (int) a;
        var bInt = (int) b;
        int resultInt;

        try{
            System.out.println("\nUsing int type variables:");
            resultInt = aInt/bInt;
            System.out.printf("Result: " + aInt +" / "+ bInt+ " = " + resultInt );
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Error: "+e.getMessage());
        }
        sc.close();
    }
}
