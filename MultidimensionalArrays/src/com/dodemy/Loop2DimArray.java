package com.dodemy;

// two-dimensional string array in java example
public class Loop2DimArray
{
   protected void loop2DimArray() {
        String[][] animals = {
                { "Lion", "Tiger", "Cheetah" },
                { "Deer", "Jackal", "Bear" },
                { "Hyena", "Fox", "Elephant" } };
       for (String[] animal : animals) {
           System.out.print(animal[0] + " ");
           for (int b = 1; b < animal.length; b++) {
               System.out.print(animal[b] + " ");
           }
           System.out.println();
       }

       /*
        for(int a = 0; a < animals.length; a++) {
            System.out.print(animals[a][0] + " ");
            for(int b = 1; b < animals[a].length; b++) {
                System.out.print(animals[a][b] + " ");
            }
            System.out.println();
        }
        */
    }
}
