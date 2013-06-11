package com.ciklum.javatrain.xo;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/5/13
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Field {
    private int size;
    private int defSize = 9;
    String[] arrField = new String[defSize];
    private int countFreeMoves;
    private boolean draw = false;

    public Field() {
        size = defSize;
        init();
    }

    //tododo
    /*public Field(int size) {
        if (size > 0) {
            this.size = size;
            init();
        } else {
            this.size = defSize;
            init();
        }
    }*/

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
            if ((i == 0) || (i == 3) || (i == 6)) {
                System.out.print("│ " + arrField[i] + "│");
            } else if ((i == 1) || (i == 4) || (i == 7)) {
                System.out.print(" " + arrField[i] + "│");
            } else {
                System.out.println(" " + arrField[i] + "│");
            }
        }
        System.out.println("└─┴─┴─┘");
    }

    public void drawMove(Player p) {
        if (p.getMove() > 0 && p.getMove() <= size) {
            arrField[p.getMove() - 1] = p.getMark();
        }
        show();
    }

    public void check(Player p) {

        if (arrField[0].equalsIgnoreCase(p.getMark())) {
            if (arrField[1].equalsIgnoreCase(p.getMark()) && arrField[2].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            } else if (arrField[3].equalsIgnoreCase(p.getMark()) && arrField[6].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            } else if (arrField[4].equalsIgnoreCase(p.getMark()) && arrField[8].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            }
        }
        if (arrField[1].equalsIgnoreCase(p.getMark())) {
            if (arrField[4].equalsIgnoreCase(p.getMark()) && arrField[7].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            }
        }
        if (arrField[2].equalsIgnoreCase(p.getMark())) {
            if (arrField[4].equalsIgnoreCase(p.getMark()) && arrField[6].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            } else if (arrField[5].equalsIgnoreCase(p.getMark()) && arrField[8].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            }
        }
        if (arrField[3].equalsIgnoreCase(p.getMark())) {
            if (arrField[4].equalsIgnoreCase(p.getMark()) && arrField[5].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            }
        }
        if (arrField[6].equalsIgnoreCase(p.getMark())) {
            if (arrField[7].equalsIgnoreCase(p.getMark()) && arrField[8].equalsIgnoreCase(p.getMark())) {
                setWinner(p);
                return;
            }
        }
        for (int i = 0; i < size; i++) {
            if (arrField[i].matches("\\d")) {
                setDraw(false);
                break;
            } else {
                setDraw(true);
            }
        }

    }

    public void setWinner(Player p) {
        p.setWinner(true);
        p.addScore(1);
    }

    public String[] getMoves(Player p1, Player p2) {
        countFreeMoves = 0;
        String s = "";

        for (int i = 0; i < size; i++) {
            if ((!arrField[i].equalsIgnoreCase(p1.getMark())) && (!arrField[i].equalsIgnoreCase(p2.getMark()))) {
                countFreeMoves++;
                s += arrField[i] + ",";
            }
        }
        //System.out.println(countFreeMoves);

        String[] arrFreeMoves; //= new String[countFreeMoves];
        arrFreeMoves = s.split(",");
        return arrFreeMoves;
    }

    public int getCountFreeMoves() {
        return countFreeMoves;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}
