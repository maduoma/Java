package com.dodemy;

public class StringDemo {
    /*
    To demonstrate numerous methods in String class. We can't exhaust it here
     */
    public static void main(String[] args){
        String message = "Hello World" + "!!";
        System.out.println(message);
        //Check if the message ends with a character or sequence of characters
        System.out.println(message.endsWith("!!"));
        //Check if the message starts with a character or sequence of characters
        System.out.println(message.startsWith("!!"));
        //You can use the length() to limit the number of characters or password a user can input
        System.out.println(message.length());
        //Returns the first appearance of character or string passed
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("Hello"));
        /*What if the character or string is not found?
        It can be used to check if a strings contains certain character, or words or sentence, etc
        */
        System.out.println(message.indexOf("sky"));
        /*
        Any method that modifies a string will always return a new string object while the
        original string is still intact.
         */
        System.out.println(message.replace("!", "*"));
        //Strings are immutable, it can't be mutated or changed or or modified
        System.out.println(message);
        //
        System.out.println(message.toLowerCase());
        //To get rid of white spaces at the beginning and the end
        System.out.println(message.trim());
    }
}
