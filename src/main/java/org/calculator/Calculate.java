package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        Calculator calculator = new Calculator(logger);

        try {
            while (true) {
                Scanner sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                System.out.println("Operation select");
                System.out.println("================");
                System.out.println("ADD            1");
                System.out.println("SUB            2");
                System.out.println("MUL            3");
                System.out.println("DIV            4");
                System.out.println("================");
                
                int operation;
                double a;
                double b;

                operation = sc.nextInt();

                sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                System.out.print("Enter a: ");
                a = sc.nextDouble();

                sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                System.out.print("Enter b: ");
                b = sc.nextDouble();

                switch (operation) {
                    case 1 -> {
                        calculator.add(a, b);
                    }
                    case 2 -> {
                        calculator.subtract(a, b);
                    }
                    case 3 -> {
                        calculator.multiply(a, b);
                    }
                    case 4 -> {
                        calculator.divide(a, b);
                    }
                }

                System.out.println("Enter q for exit");
                String tmp = sc.next();
                if (Objects.equals(tmp, "q")) {
                    break;
                }
            }
        }
        catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
