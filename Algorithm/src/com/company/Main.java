package com.company;

public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        /*final int WHITE = 1;
        final int BLACK = 2;
        final int BLOCKED = 3;
        final int WHITE_CAT = -1;
        final int BLACK_CAT = -2;*/

        GameBoard g = new GameBoard();
        GameJFrame.buildFrame();
        //Mover m = new Mover();
        g.print();
    }
}
