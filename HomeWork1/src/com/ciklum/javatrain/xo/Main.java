package com.ciklum.javatrain.xo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/5/13
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        boolean newGame = true;
        String player2 = "1";

        Player p1 = new Player();
        p1.register();
        //p1.setName("");
        p1.setMark("x");

        Player p2 = new Player();
        Player pc = new PlayerComp();

        System.out.println("Do you want play with computer or with human?(type 1 or 2, 1 - by default):");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            player2 = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (player2.equalsIgnoreCase("2")) {
            p2.register();
            p2.setMark("o");
        } else {
            p2 = pc;
            p2.register();
            p2.setMark("o");
        }

        while (newGame) {
            System.out.println("");
            System.out.println(p1.getInfo());
            System.out.println(p2.getInfo());

            p1.setWinner(false);
            p2.setWinner(false);
            boolean gameover = false;

            Field f = new Field();
            f.show();

            boolean playerOne = true;
            while (!gameover) {
                if (playerOne) {
                    p1.setMove(p1.requestMove(f.getMoves(p1, p2), f.getCountFreeMoves()));
                    f.drawMove(p1);
                    f.check(p1);
                    if (f.isDraw()) {
                        System.out.println("Free moves run out. Draw!");
                        gameover = true;
                        newGame = requestNewGame();
                    }
                    if (p1.isWinner()) {
                        System.out.println("The winner is " + p1.getName() + "! Now he has " + p1.getScore() + " scores.");
                        gameover = true;
                        newGame = requestNewGame();
                    }
                } else {
                    p2.setMove(p2.requestMove(f.getMoves(p1, p2), f.getCountFreeMoves()));
                    f.drawMove(p2);
                    f.check(p2);
                    if (f.isDraw()) {
                        System.out.println("Free moves run out. Draw!");
                        gameover = true;
                        newGame = requestNewGame();
                    }
                    if (p2.isWinner()) {
                        System.out.println("The winner is " + p2.getName() + "! Now he has " + p2.getScore() + " scores.");
                        gameover = true;
                        newGame = requestNewGame();
                    }
                }
                playerOne = !playerOne;
            }
        }
    }

    public static boolean requestNewGame() {
        String s = "";
        System.out.println("New game?(y/n):");

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            s = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (s.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }
}
