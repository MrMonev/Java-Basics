import java.util.Scanner;

public class Darc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String input = scanner.nextLine();

        int remainingPoints = 301;
        int succsesfullCount = 0;
        int failedCount = 0;
        boolean won = false;
        while (!"Retire".equals(input)) {
            String sector = input;
            int points = Integer.parseInt(scanner.nextLine());

            if ("Single".equals(sector)) {
                points  *= 1;
            } else if ("Double".equals(sector)) {
                points *= 2;
            } else if ("Triple".equals(sector)) {
                points *= 3;
            }

            if (points > remainingPoints) {
                failedCount++;
            } else if (points < remainingPoints) {
                succsesfullCount++;
                remainingPoints -= points;
            } else if (points == remainingPoints) {
                succsesfullCount++;
                remainingPoints -= points;
                won = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (won) {
            System.out.printf("%s won the leg with %d shots.", name,succsesfullCount);
        }else  {
            System.out.printf("%s retired after %d unsuccessful shots.",name,failedCount);
        }
    }
}
