import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String seasons = scanner.nextLine();
        int numberOfFishman = Integer.parseInt(scanner.nextLine());

        double priceBoat = 0.0;
        double priceBoat1 = 0.0;


        if ("Spring".equals(seasons)) {
            priceBoat1 = 3000;

            if (numberOfFishman <= 6) {
                priceBoat = priceBoat1 * 0.10;
            } else if (numberOfFishman > 7 && numberOfFishman <= 11) {
                priceBoat = priceBoat1 * 0.15;
            } else if (numberOfFishman >= 12) {
                priceBoat = priceBoat1 * 0.25;
            }

        } else if ("Summer".equals(seasons) || ("Autumn".equals(seasons))) {
            priceBoat1 = 4200;

            if (numberOfFishman <= 6) {
                priceBoat = priceBoat1 * 0.10;
            } else if (numberOfFishman > 7 && numberOfFishman <= 11) {
                priceBoat = priceBoat1 * 0.15;
            } else if (numberOfFishman >= 12) {
                priceBoat = priceBoat1 * 0.25;
            }

        } else if ("Winter".equals(seasons)) {
            priceBoat1 = 2600;

            if (numberOfFishman <= 6) {
                priceBoat = priceBoat1 * 0.10;
            } else if (numberOfFishman > 7 && numberOfFishman <= 11) {
                priceBoat = priceBoat1 * 0.15;
            } else if (numberOfFishman >= 12) {
                priceBoat = priceBoat1 * 0.25;

            }
        }

        double totalPriceBoat = priceBoat1 - priceBoat;



        if (numberOfFishman % 2 == 0 && !"Autumn".equals(seasons)) {
            totalPriceBoat *= 0.95;
        }

        double diff = budget - totalPriceBoat;
        diff = Math.abs(diff);
        if (budget >= totalPriceBoat) {
            System.out.printf("Yes! You have %.2f leva left.",diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }

    }
}


