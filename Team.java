import java.util.*;

public class Team {

    // Instance variables
    private String teamName;
    private String teamCity;
    private int numPlayers;
    private Captain c1;

    // Default Constructor

    public Team() {
        teamName = "";
        teamCity = "";
        numPlayers = 0;
        c1 = new Captain();

    }

    // Secondary Constructor
    public Team(String tname, String tcity, int tplayers, String cname, int cjersey, int cage, char cpos) {
        teamName = tname;
        teamCity = tcity;
        numPlayers = tplayers;
        c1 = new Captain(cname, cjersey, cage, cpos);
    }

    // Accessor Methods

    public String getTeamName() {
        return teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    // Mutator Methods

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String toString() {
        String str;
        str = "\n-------------------------" +
                "\nTeam Name: " + teamName +
                "\nTeam City: " + teamCity +
                "\nNumber of Players: " + numPlayers +
                c1.toString();

        return str;
    }
}
