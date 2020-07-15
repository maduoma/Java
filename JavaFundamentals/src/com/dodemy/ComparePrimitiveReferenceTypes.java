package com.dodemy;

import java.awt.*;
import java.util.Date;

public class ComparePrimitiveReferenceTypes {
    public static void main(String[] args) {
        /*
        Primitive types are independent and stores values in different locations. It is called by value.
         */
        int x = 50;
        int y = x;
        x = 60;
        System.out.println("Primitive types are called by value:");
        System.out.println(y);

        /*
        Objects are reference types and reference types are depende
         */
        System.out.println("Objects are called by reference: ");
        var now = new Date();
        System.out.println(now);
        Point point1 = new Point(2, 4);
        Point point2 = point1;
        point1.x = 8;
        System.out.println(point2);
    }

}
