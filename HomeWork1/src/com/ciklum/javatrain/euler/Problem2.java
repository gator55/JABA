package com.ciklum.javatrain.euler;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/3/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 * <p/>
 * Even Fibonacci numbers
 * under 4,000,000
 * sum of even numbers
 */
public class Problem2 {
    private static int fib = 1;

    public static void main(String[] args) {
        int max = 4000000;
        int start = 1;
        int fib_sum = 0;

        while (true) {
            start = fib - start;
            fib += start;

            if (fib >= max){
                break;
            }
            System.out.println("start = " + start + ",fib = " + fib);

            if(fib%2 == 0){
                fib_sum += fib;
            }
        }

        System.out.println(fib_sum);
    }

}
