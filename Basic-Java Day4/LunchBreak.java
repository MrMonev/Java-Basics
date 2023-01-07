import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvNameMovie = scanner.nextLine();
        int showTime = Integer.parseInt(scanner.nextLine());
        int breakMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakMinutes / 8.0;
        double timeRelax = breakMinutes / 4.0;

        double remaining = breakMinutes - lunchTime - timeRelax;

        double difference = Math.abs(remaining - showTime);
        if (remaining >= showTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time."
                    , tvNameMovie, Math.ceil(difference));
        }else  {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    tvNameMovie, Math.ceil(difference));
        }



    }
}