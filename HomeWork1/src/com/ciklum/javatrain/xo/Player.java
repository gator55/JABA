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

    public void register(){
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

    public String getInfo(){
        return getName() + "," + getMark() + "," + getScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else {
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

    public void setMove(int move, String mark) {
        this.move = move;
        this.mark = mark;
    }
}
