package com.ciklum.javatrain.xo;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 6/11/13
 * Time: 12:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerComp extends Player {
    int maxmove = 9;

    public void register() {
        setName("Gandroid");
        addScore(0);
    }

    public int requestMove(String[] arrFreeMoves, int size) {
        Integer move = 0;

        while (move == 0) {
            move = (int) (1 + Math.random() * maxmove);
            boolean allowedmove = false;
            for (int i = 0; i < size; i++) {
                if (move.toString().equalsIgnoreCase(arrFreeMoves[i])) {
                    allowedmove = true;
                    break;
                }
            }
            if (!allowedmove) {
                move = 0;
            }
        }
        return move;
    }

}
