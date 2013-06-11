package com.ciklum.javatrain.xo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/5/13
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private String name;
    private int score;
    private String mark;
    private int move;
    private boolean winner = false;

    public void register() {
        System.out.println("Please enter your name:");

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            setName(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        addScore(0);
    }

    public String getInfo() {
        return getName() + ",\"" + getMark() + "\"," + getScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Smith";
        }
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int requestMove(String[] arrFreeMoves, int size) {
        int move = 0;
        String freeMoves = "";

        for (int i = 0; i < size; i++) {
            freeMoves += arrFreeMoves[i] + ",";
        }
        if (freeMoves.length() > 0) {
            freeMoves = freeMoves.substring(0, freeMoves.length() - 1);
        }

        while (move == 0) {
            System.out.println(getName() + ", please enter your move (" + freeMoves + "):");
            try {
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();

                try {
                    move = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("It's not a numeric value!");
                    continue;
                }

                boolean allowedmove = false;
                for (int i = 0; i < size; i++) {
                    if (s.equalsIgnoreCase(arrFreeMoves[i])) {
                        allowedmove = true;
                        break;
                    }
                }
                if (!allowedmove) {
                    move = 0;
                    System.out.println("This move is not allowed!");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return move;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
