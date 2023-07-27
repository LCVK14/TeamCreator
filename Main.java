
/**
 * Lucas Cajamarca Verdugo
 * June 16 2022
 * ISU
 * This code creates a sports team with a team captain
 */

import java.io.FileReader;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    static Team[] teams;

    public static void main(String[] args) {

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Create Teams (Max 6)
        teams = new Team[5];

        // Declare variables
        int choice = 0, numTeams = 0, numPlayers, capJersey, capAge;
        String teamName, teamCity, capName;
        char capPos;

        // Output menu for User Input
        while (choice != 5) {
            System.out.println("*******Team Creator*******");
            System.out.println("-------------------------");
            System.out.println("1. Create a Team");
            System.out.println("2. List all teams");
            System.out.println("3. Edit a Team");
            System.out.println("4. Remove a Team");
            System.out.println("5. EXIT");
            System.out.println("--------------------------");
            System.out.println("Select an option: ");
            choice = input.nextInt();

            // option 1 - Create a team
            if (choice == 1) {

                // User inputs values to create a team

                input.nextLine(); // dummy line

                System.out.println("What is your Team's name: ");
                teamName = input.nextLine();

                System.out.println("Where is your Team Located: ");
                teamCity = input.nextLine();

                System.out.println("How many players are in your main roster: ");
                numPlayers = input.nextInt();

                input.nextLine(); // dummy line

                System.out.println("What is the name of your team captain: ");
                capName = input.nextLine();

                System.out.println("What is your team captain's jersey number: ");
                capJersey = input.nextInt();

                System.out.println("What is your team captain's age: ");
                capAge = input.nextInt();

                System.out.println("What is your team captain's position (One Letter): ");
                capPos = input.next().charAt(0);

                numTeams++;

                // A team is created

                teams[numTeams] = new Team(teamName, teamCity, numPlayers, capName, capJersey, capAge, capPos);

                if (numTeams > 5) {
                    System.out.println("You can only make a maximum of 5 teams.");
                }

            }

            // option 2 - list all teams
            else if (choice == 2) {
                listAll();
                if (numTeams == 0)
                    System.out.println("\n\n\n\n*******************" +
                            "\nThere are no teams\n\n\n\n");
            }

            // Option 3 - edit team
            else if (choice == 3) {
                if (numTeams <= 0) {
                    System.out.println("There are no teams, please go back to create one.");
                    continue;
                }
                for (int i = 0; i < teams.length; i++) {
                    if (teams[i] != null)
                        System.out.println(i + ": " + teams[i].getTeamName());
                }
                System.out.println("Which team do you want to edit: ");
                int slotNum = input.nextInt();
                listOne(slotNum);

                System.out.println("\n\nWhich option do you want to edit?");
                for (int i = 0; i < 7; i++) {
                    System.out.println();
                }

                input.nextLine(); // dummy line

                System.out.println("\nWhat is your Team's name: ");
                teamName = input.nextLine();

                System.out.println("Where is your Team Located: ");
                teamCity = input.nextLine();

                System.out.println("How many players are in your main roster: ");
                numPlayers = input.nextInt();

                input.nextLine(); // dummy line

                System.out.println("What is the name of your team captain: ");
                capName = input.nextLine();

                System.out.println("What is your team captain's jersey number: ");
                capJersey = input.nextInt();

                System.out.println("What is your team captain's age: ");
                capAge = input.nextInt();

                System.out.println("What is your team captain's position (One Letter): ");
                capPos = input.next().charAt(0);

                // team is overwritten

                teams[slotNum] = new Team(teamName, teamCity, numPlayers, capName, capJersey, capAge, capPos);

            }

            // Option 4 - Remove team
            else if (choice == 4) {
                for (int i = 0; i < teams.length; i++) {
                    if (teams[i] != null)
                        System.out.println(i + ": " + teams[i].getTeamName());
                }
                System.out.println("Which team do you want to remove: ");
                int slotNum = input.nextInt();
                listOne(slotNum);

                System.out.println("\nTeam " + slotNum + " removed\n");
                teams[slotNum] = null;
                numTeams--;

            }

            // Option 5 - END
            else if (choice == 5) {
                System.out.println("Thanks for playing LLLL!");
            }

            // Loop continues if choices are not 1-5
            else if (choice < 0 || choice > 5)
                System.out.println("Valid numbers only 1-5\n");

        }
    }

    // list all method
    public static void listAll() {
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                System.out.println("\nTeam: " + i + teams[i].toString() + "\n");
            }
        }
    }

    // list one method
    public static void listOne(int slot) {
        if (teams[slot] != null) {
            System.out.print(teams[slot].toString());
        }
    }

    public void edit() {
        for (int i = 0; i < 7; i++) {
            System.out.println(i + 1 + ". ");
        }
    }

}
