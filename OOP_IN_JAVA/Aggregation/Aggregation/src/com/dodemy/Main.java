package com.dodemy;
//OPP Aggregation in Java: Aggregation follows the has-A model. This creates a parent-child relationship between two classes, with one class owning the object of another.
//What makes Aggregation unique is Independent LifeTimes.
// In aggregation, the lifetime of the owned object does not depend on the lifetime of the owner.

// The owner object could get deleted, but the owned object can continue to exist in the program. In aggregation, the parent only contains a reference to the child, which removes the child's dependency.
//What should we call it when an object has its own lifecycle and child object cannot belong to another parent object?
//Aggregation is when objects have their own life cycle and child object can associate with only one parent object

//OPP Aggregation in Java: The object has its own lifecycle and child cannot belong to another parent object.
import java.util.ArrayList;
import java.util.List;

class Player {

    String name;
    int id;
    String team;

    Player(String name, int id, String team) {
        this.name = name;
        this.id = id;
        this.team = team;
    }

}

/* Team class contains a list of Player
Objects.*/
class Team {

    String name;
    private final List<Player> players;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() { // This function returns the "players"
        return players;
    }

}

/* School class contains a list of Team
Objects.*/
class School {

    String schoolName;
    private final List<Team> teams;

   public School(String schoolName, List<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }

    /* Count total players of all teams
      in a given school */
    public int getTotalPlayersInSchool() {
        int noOfPlayers = 0;
        List<Player> players;

        for (Team team : teams) {
            players = team.getPlayers();
            noOfPlayers += (long) players.size();
        }
        return noOfPlayers;
    }

}

// Main class
class Main {
    public static void main(String[] args) {
        // Write your code here
        /* Declaring all the players */
        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

    /* Making a List of
        "Red" team Players. */
        List<Player> red_players = new ArrayList<Player>();
        red_players.add(p1);
        red_players.add(p2);

    /* Making a List of
        "Blue" team Players. */
        List<Player> blue_players = new ArrayList<Player>();
        blue_players.add(p3);
        blue_players.add(p4);

        /* Declaring Team objects */
        Team red = new Team("Red", red_players);
        Team blue = new Team("Blue", blue_players);

        // Creating a list of teams and adding "red" and "blue" teams to it.
        List<Team> teams = new ArrayList<Team>();
        teams.add(red);
        teams.add(blue);

        // Creating an instance of School.
        School mySchool = new School("ABC", teams);

        System.out.print("Total players in my school: ");
        // Getting total prayers in the school.
        System.out.println(mySchool.getTotalPlayersInSchool());
    }
}