import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int remaining, total;
        int teams = 0;
        float avg;
        Scanner in = new Scanner(System.in);
        Scanner in_id = new Scanner(System.in);
        Scanner in_win = new Scanner(System.in);
        Scanner in_lose = new Scanner(System.in);

        System.out.println("Enter the ID number of a team:\n(To exit, type a negative number)");
        int id = in_id.nextInt();
        while (id > 0){
            System.out.println("Enter the number of wins:");
            int wins = in_win.nextInt();
            System.out.println("Enter the number of loses:");
            int loses = in_lose.nextInt();
            System.out.println("Team: " + id);
            System.out.println("Wins: " + wins + "   Loses: " + loses);
            total = wins + loses;
            System.out.println("Total number of games played: " + total);
            remaining = 25 - total;
            if (remaining == 0){
                System.out.println("The season is finished.");
            }
            else {
                System.out.println("Number of games remaining: " + remaining);
            }
            avg = (float)wins/total;
            System.out.println("Winning average: " + String.format("%.4f", avg));
            if (remaining >= wins){
                System.out.println("Number of games remaining is greater than or equal to the number of wins.");
            }
            else {
                System.out.println("Number of games remaining is not greater than or equal to the number of wins.");
            }

            if (remaining > loses){
                System.out.println("Number of games remaining is greater than the number of loses.");
            }
            else {
                System.out.println("Number of games remaining is not greater than the number of loses.");
            }
            teams++;

            System.out.println("\n\n\n");

            System.out.println("Enter the ID number of a team:\n(To exit, type a negative number)\n");
            id = in_id.nextInt();
        }
        System.out.println("Total number of teams: " + teams);
    }
}