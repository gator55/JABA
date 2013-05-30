/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 5/30/13
 * Time: 5:38 PM
 * To change this template use File | Settings | File Templates.
 */
import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.io.*;

public class SwitchTest {
    public static void main(String[] args) {
        int x=0;
        boolean again=false;

        while (again){

        System.out.println("Please enter x:");

        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();

            System.out.println(s);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        switch (x){
            case 0: {
                System.out.println("0");
            }
            case 1: {
                System.out.println("1");
                break;
            }
            case 2:{
                System.out.println("2");
            }
            default:{
                System.out.println("default");
            }
        }
    }
    }
}
