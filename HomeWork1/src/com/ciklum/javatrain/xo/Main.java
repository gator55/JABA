package com.ciklum.javatrain.xo;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/5/13
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        //p1.register();
        p1.setName("");
        p1.setMark("x");
        System.out.println(p1.getInfo());

        Player p2 = new Player();
        //p2.register();
        p2.setName("Lucky");
        p2.setMark("o");
        System.out.println(p2.getInfo());

        Field f = new Field();
        f.show();

        p1.setMove(5, p1.getMark());
        p2.setMove(6, p2.getMark());

        while (!f.gameover){
            f.drawMove(p1);
            f.drawMove(p2);
            f.check();
            System.out.println("gameover: " + f.gameover);
        }
    }
}
