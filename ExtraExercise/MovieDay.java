import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPictures = Integer.parseInt(scanner.nextLine());
        int totalCinema = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        double timeLeft = timeForPictures  * 0.15;
        double neededTime = timeLeft + (totalCinema * time);

        if (timeForPictures >= neededTime) {
            double timeoverLeft = timeForPictures - neededTime;

            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",Math.round(timeoverLeft));

        }else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",Math.round(neededTime -timeForPictures));
        }


    }
}
