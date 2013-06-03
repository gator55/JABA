package com.ciklum.javatrain.second;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/3/13
 * Time: 6:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Class3 extends Class2{
    public Class3(){
        System.out.println("Class3 constructor");
    }

    public static void main(String[] args) {
        //instance Class1
        Class1 c1 = new Class1();
        c1.show1();
        System.out.println("");

        //instance Class2
        Class2 c2 = new Class2();
        c2.show2();
        System.out.println("");

        //child to parent
        Class1 c12 = new Class2();
        c12.show1();
        System.out.println("");

        //parent to child
        //Class2 c21 = new Class1();

        Class3 c3 = new Class3();
    }
}
