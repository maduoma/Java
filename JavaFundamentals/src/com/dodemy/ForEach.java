package com.dodemy;

import java.util.Arrays;

public class ForEach {
    String forEachDemo() {
        String[] fruits = {"Apple", "Orange", "Mango"};
        for (String fruit: fruits) {
            //Arrays.toString(new String[]{fruit}) //prints the fruits in array format
            System.out.println(fruit);
        }
        return "Thank you";
    }
}
