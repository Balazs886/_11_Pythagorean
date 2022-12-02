package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        resultPrint(businessLogic(
                inputPositiveDouble(sc, "Add meg az első befogót (a) cm-ben!"),
                inputPositiveDouble(sc, "Add meg a második befogót (b) cm-ben!")));
        sc.close();
    }

    public static double inputPositiveDouble(Scanner sc, String message) {
        double x;
        do {
            System.out.println(message);
            x = sc.nextDouble();
        } while (!validator(x));
        return x;
    }

    public static boolean validator(double side) {
        if (side <= 0.0d) {
            System.out.println("A háromszög oldala nem lehet 0 vagy annál kisebb.\n");
            return false;
        }
        return true;
    }

    public static double businessLogic(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void resultPrint(double result) {
        System.out.printf("A háromszög átfogója %,.2f cm.", result);
    }
}
