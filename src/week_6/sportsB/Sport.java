package week_6.sportsB;

public class Sport {
    private String name;
    private int numberOfTeamMembers;

    public Sport() {
        this(null, 0);
    }
    public Sport(String name, int numberOfTeamMembers) {
        this.name = name;
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfTeamMembers(int numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }
}
