package com.dodemy;

public class Main {

    public static void main(String[] args) {
        DivisibleDemo demo = new DivisibleDemo();
        System.out.println(demo.scanDemo());
        System.out.println(demo.scanDemo2());

        System.out.println(new WhileDemo().whileDem());
        System.out.println(new WhileDemo().whileDem2());
    }
}
