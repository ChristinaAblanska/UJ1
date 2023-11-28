package week_6.sportsB;

public class Soccer extends Sport {
    private final String name = "Soccer";
    private final int numberOfTeamPlayers = 11;

//    public Soccer() {
//        name = "Soccer";
//        numberOfTeamPlayers = 11;
//    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getNumberOfTeamMembers() {
        return this.numberOfTeamPlayers;
    }
}
