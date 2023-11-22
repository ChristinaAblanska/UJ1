package week_6.sportsB;

import week_6.sports.Soccer;
import week_6.sports.Sport;

public class SportBTest {
    public static void main(String[] args) {
        week_6.sports.Sport soccer = new Soccer();
        week_6.sports.Sport sport = new Sport();

        System.out.println("Soccer name: " + soccer.getName());
        System.out.println("Soccer n of players: " + soccer.getNumberOfTeamMembers());
        System.out.println("Soccer class: " + soccer.getClass());
        System.out.println("Soccer superclass: " + soccer.getClass().getSuperclass());

        System.out.println();
        System.out.println("Sport name: " + sport.getName());
        System.out.println("Sport n of players: " + sport.getNumberOfTeamMembers());
        System.out.println("Sport class: " + sport.getClass());
        System.out.println("Sport superclass: " + sport.getClass().getSuperclass());
    }
}
