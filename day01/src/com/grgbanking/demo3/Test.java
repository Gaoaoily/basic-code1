package com.grgbanking.demo3;

public class Test {

    public static void main(String[] args) {

        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouth();

        System.out.println("--------------");

        Husky h =new Husky();
        h.eat();
        h.drink();
        h.watchHome();
        h.brekHome();

    }
}
