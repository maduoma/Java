package com.dodemy;

import java.awt.*;
import java.util.Date;

public class ComparePrimitiveReferenceTypes {
    public static void main(String[] args) {
        /*
        Primitive types are used to store simple values while reference types are use to store complex objects.
        Primitive types are independent of each other and are stored in different locations. If one value is changed,
        the other is not affected. Primitive types are copied by their values and these values are independent of each other.
         */
        int x = 50;
        int y = x;
        x = 60;
        System.out.println("Primitive types are called by value:");
        System.out.println(y);

        /*
        Objects are reference types and reference types are dependent of each other and are copied by their references.
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
