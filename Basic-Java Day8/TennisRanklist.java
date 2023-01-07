import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int victories = 0;

        for (int iteration = 0; iteration < tournaments; iteration++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    victories++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d%n", points + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((double) points / tournaments));
        System.out.printf("%.2f%%%n", 100.0 * victories / tournaments);
    }
}