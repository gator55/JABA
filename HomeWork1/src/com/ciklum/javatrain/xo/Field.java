package com.ciklum.javatrain.xo;

import com.sun.media.jfxmedia.events.PlayerStateEvent;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/5/13
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Field {
    private int size = 9;
    String[] arrField = new String[size];
    boolean gameover = false;

    public Field(){
        init();
        size = 9;
    }

    public Field(int size) {
        this.size = size;
        init();
    }

    public void init() {

        for (int i = 0; i < size; i++) {
            Integer n = i + 1;
            arrField[i] = n.toString();
        }
    }

    public void show() {
        System.out.println("Game field:");
        System.out.println("┌─┬─┬─┐");

        for (int i = 0; i < size; i++) {
            if((i == 0)||(i == 3)||(i == 6)){
                System.out.print("│ " + arrField[i] + "│");
            }else if((i == 1)||(i == 4)||(i == 7)) {
                System.out.print(" " + arrField[i] + "│");
            }else {
                System.out.println(" " + arrField[i] + "│");
            }
        }
        System.out.println("└─┴─┴─┘");
    }

    public void drawMove(Player p){
        if (p.getMove() > 0 && p.getMove() < size){
            arrField[p.getMove() - 1] = p.getMark();
            show();

        }
    }

    public void check(){
        for(int i = 0;i < size; i++){
            if(arrField[i].matches("\\d")){
                gameover = true;
            }
        }
    }

}
