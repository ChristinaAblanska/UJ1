package week_6.sports;

public class SportTest {
    public static void main(String[] args) {
        Sport soccer = new Soccer();
        Sport sport = new Sport();

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
