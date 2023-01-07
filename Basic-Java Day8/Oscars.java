import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int numOfJudges = Integer.parseInt(scanner.nextLine());

        double points = 0.0;
        boolean isNominated = false;

        for (int i = 0; i < numOfJudges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            points += judgeName.length() * judgePoints / 2;

            if (points + startPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName, points + startPoints);
                isNominated = true;
                break;
            }
        }
        if (!isNominated) {
            System.out.printf("Sorry, %s you need %.1f more!",actorName, 1250.50 - (points + startPoints));
        }
    }
}
