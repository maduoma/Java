package com.dodemy;

/*
Syntax:
    returnType methodName(){
    //code to be executed
    methodName();//calling same method
    }
 */

/**
 * Recursion is the technique of making a function call itself. This technique provides a way to break complicated
 * problems down into simple problems which are easier to solve. For example, adding two numbers is easy to do but
 * adding a range of numbers is more complicated. In this example, recursion is used to add a range of numbers
 * together by breaking it down into the simple task of adding two numbers.
 */

/*
When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:
10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

Since the function does not call itself when k is 0, the program stops there and returns the result.
 */
public class Recursion {
    //Here recursion is used to add all of the numbers up to 10
    public static int sum1(int k) {
        if (k > 0) {
            return k + sum1(k - 1);
        } else {
            return 0;
        }
    }
}

// Use recursion to add all of the numbers between 5 to 10.
class Recursion2 {
    public static int sum2(int start, int end) {
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }
}

//Infinite times
class Recursion30 {
    static void p() {
        System.out.println("hello");
        p();
    }
}


//Finite times
class Recursion31 {
    static int count = 0;

    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("hello " + count);
            p();
        }
    }
}

/*
factorial(5)
   factorial(4)
      factorial(3)
         factorial(2)
            factorial(1)
               return 1
            return 2*1 = 2
         return 3*2 = 6
      return 4*6 = 24
   return 5*24 = 120
 */
//Factorial Number
class Recursion4 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}

//Fibonacci Series
class Recursion5 {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibo(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibo(count - 1);
        }
    }
}