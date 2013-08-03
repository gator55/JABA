package com.ciklum.javatrain.third;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/13/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashCode {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.setId(123);
        c2.setId(123);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
