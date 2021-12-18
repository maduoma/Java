package com.dodemy;

class Country {

    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

}

class Person {

    private String name;
    private Country country; // An instance of Country class

    public Person(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country.getName());
    }

}

class Main {

    public static void main(String[] args) {
        Country myCountry = new Country("Utopia", 1);
        {
            Person user = new Person("Darth Vader", myCountry);
            user.printDetails();
        }
        // The user object's lifetime is over

        System.out.println(myCountry.getName()); // The country object still exists!
    }

}