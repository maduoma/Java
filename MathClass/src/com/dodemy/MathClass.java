package com.dodemy;

public class MathClass {
    protected int ceilMethod() {
        System.out.println("================= Math.ceil()======================");
        return (int)Math.ceil(1.1);
    }

    protected int floorMethod() {
        System.out.println("================= Math.floor()======================");
        return (int)Math.floor(1.1);
    }

    protected int roundMethod () {
        System.out.println("================= Math.round()======================");
        return (int)(Math.round(1.5));
    }

    protected int maxMethod() {
        System.out.println("================= Math.max()======================");
        return Math.max(3, 7);
    }

    protected int minMethod() {
        System.out.println("================= Math.min()======================");
        return Math.min(3, 7);
    }
    protected double randomMethod() {
        System.out.println("================= Math.random() between 0 and 1======================");
        return Math.random();
    }

    protected int randomMethod2() {
        System.out.println("================= Math.random() between 0 and 100======================");
        return (int) (Math.random() * 100);
    }
}
