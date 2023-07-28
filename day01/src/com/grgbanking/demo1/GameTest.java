package com.grgbanking.demo1;

public class GameTest {
    public static void main(String[] args) {

        Game g1 = new Game("甘甘", 100,"女");
        Game g2 = new Game("cjc", 100,"男");

        g1.showgameInfo();
        g2.showgameInfo();


        //回合制游戏
        while (true) {
            g1.attack1(g2);
            if (g2.getBlood() == 0) {
                System.out.println();
                System.out.println(g1.getName() + " K.O了 " + g2.getName());
                break;
            }

            g2.attack2(g1);
            if (g1.getBlood() == 0) {
                System.out.println();
                System.out.println(g2.getName() + " K.O了 " + g1.getName());
                break;
            }
        }

    }
}