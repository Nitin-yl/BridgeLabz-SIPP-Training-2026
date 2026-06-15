package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level2_practice_question;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    public static String[][] getStatistics(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", (playerWins * 100.0) / totalGames);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / totalGames);

        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("\nResult Summary");
        System.out.println("");
        System.out.println("Name\tWins\tWin %");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][4];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }

        System.out.println("\nGame Results");
        System.out.println();
        System.out.println("Game\tPlayer\t\tComputer\tWinner");

        for (int i = 0; i < games; i++) {
            System.out.println(results[i][0] + "\t" +
                    results[i][1] + "\t\t" +
                    results[i][2] + "\t\t" +
                    results[i][3]);
        }

        String[][] stats = getStatistics(playerWins, computerWins, games);

        displayStats(stats);

        sc.close();
    }
}
