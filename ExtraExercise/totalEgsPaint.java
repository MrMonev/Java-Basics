import java.util.Scanner;

public class totalEgsPaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEggs = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;


        int maxCount = Integer.MIN_VALUE;
        String maxCountColor = "";
        for (int i = 0; i < numberOfEggs ; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redCount++;
                    if (redCount > maxCount) {
                        maxCount = redCount;
                        maxCountColor = color;
                    }
                    break;
                case "orange":
                    orangeCount++;
                    if (orangeCount > maxCount) {
                        maxCount = orangeCount;
                        maxCountColor = color;
                    }
                    break;
                case "blue":
                    blueCount++;
                    if (blueCount > maxCount) {
                        maxCount = blueCount;
                        maxCountColor = color;
                    }
                    break;
                case "green":
                    greenCount++;
                    if (greenCount > maxCount) {
                        maxCount = greenCount;
                        maxCountColor = color;
                    }
                    break;

            }
        }
        System.out.printf("Red eggs: %d%n", redCount);
        System.out.printf("Orange eggs: %d%n", orangeCount);
        System.out.printf("Blue eggs: %d%n", blueCount);
        System.out.printf("Green eggs: %d%n", greenCount);
        System.out.printf("Max eggs: %d -> %s",maxCount, maxCountColor );
    }
}
