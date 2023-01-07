import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoCard * 250;
        double processorPrice = videoPrice * 0.35 * processor;
        double ramPrice = videoPrice * 0.10 * ram;


        double totalPrice = videoPrice + processorPrice + ramPrice;

        if (videoCard > processor) {
            totalPrice = totalPrice - totalPrice * 0.15;

        }

        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }



    }
}