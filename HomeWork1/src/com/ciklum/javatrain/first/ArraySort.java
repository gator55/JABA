package com.ciklum.javatrain.first;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 5/30/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int i;
        int max=100;

        Random rand = new Random();

        for(i=0;i!=arrInt.length;i++){
            arrInt[i] = rand.nextInt(max);
        }

        System.out.print("Initial array: ");
        for(i=0;i!=arrInt.length-1;i++){
            System.out.print(arrInt[i] + ",");
        }
        System.out.println(arrInt[i]);

        arraySortBubble(arrInt);
        System.out.print("Sorted array: ");
        for(i=0;i!=arrInt.length-1;i++){
            System.out.print(arrInt[i] + ",");
        }
        System.out.println(arrInt[i]);

    }

    public static void arraySortBubble(int[] arrInt) {
        int n=arrInt.length;

        for (int i=n-1;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if(arrInt[j]>arrInt[j+1])
                {
                    int tmp=arrInt[j];
                    arrInt[j]=arrInt[j+1];
                    arrInt[j+1]=tmp;
                }
            }
        }
    }
}
