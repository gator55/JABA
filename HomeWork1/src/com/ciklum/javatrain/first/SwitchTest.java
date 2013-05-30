package com.ciklum.javatrain.first;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 5/30/13
 * Time: 5:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x = 0;
        String new_val="n";
        boolean start_new = true;

        while (start_new) {

            System.out.println("Please enter \"x\" (number):");
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();

                try{
                    x = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("It's not a number! Bye...");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (x) {
                case 0: {
                    System.out.println("case 0");
                }
                case 1: {
                    System.out.println("case 1, break");
                    break;
                }
                case 2: {
                    System.out.println("case 2");
                }
                default: {
                    System.out.println("case default");
                }
            }

            System.out.println("Enter new value for \"x\"?[y/n]:");
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                new_val = bufferRead.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }

            if (!new_val.equalsIgnoreCase("y")) {
                start_new=false;
                System.out.println("Bye!");
            }
        }
    }
}
