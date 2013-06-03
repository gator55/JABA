package com.ciklum.javatrain.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 5/30/13
 * Time: 6:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuadEq {
    public static void main(String[] args) {
        Double[] arrABC = new Double[3];
        int i = 0;

        System.out.println("A quadratic equation in the form: a*x^2 + b*x + c = 0");
        System.out.println("Please enter values for constants \"a\", \"b\" and \"c\" (\"a\" <> 0):");

        for (; i != 3; i++) {
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();

                try {
                    arrABC[i] = Double.parseDouble(s);
                } catch (NumberFormatException e) {
                    quit("It's not a numeric value!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*for (i = 0; i != 3; i++) {
            System.out.println(arrABC[i]);
        }*/

        Double a = arrABC[0];
        Double b = arrABC[1];
        Double c = arrABC[2];

        if (a == 0) {
            Double x = -c/b;
            quit("So, it's not a quadratic equation but Linear and root is: x = " + x + ". ");
        }

        Double d = b * b - 4 * a * c;
        System.out.println("Discriminant: " + d);

        if (d < 0) {
            quit("Equation doesn't have real roots!\n");
        } else if (d == 0) {
            Double x = -b / 2 * a;
            quit("Roots are: x1 = x2 = " + x + "\n");
        } else {
            Double x1 = (-b + Math.sqrt(d)) / (2 * a);
            Double x2 = (-b - Math.sqrt(d)) / (2 * a);
            quit("Roots are: x1 = " + x1 + " and x2 = " + x2 + "\n");
        }

    }

    public static void quit(String s) {
        System.out.println(s + " Bye...");
        System.exit(1);
    }
}
