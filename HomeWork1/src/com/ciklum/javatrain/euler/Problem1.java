package com.ciklum.javatrain.euler;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/3/13
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 * <p/>
 *
 * Calculate the sum of all multiples of 3 or 5 bellow 1000
 */
public class Problem1 {
    public static void main(String[] args) {
        int count = 1000;
        int sum = 0;

        for (int i = 1; i < count; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
