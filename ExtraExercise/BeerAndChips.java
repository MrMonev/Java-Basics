import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int totalBeers = Integer.parseInt(scanner.nextLine());
        int totalChips = Integer.parseInt(scanner.nextLine());

        double beer = 1.20;

        double totalPriceBeers = beer * totalBeers;
        double totalPriceForOneChips = 0.45 * totalPriceBeers;
        double totalPriceChips = Math.ceil(totalPriceForOneChips * totalChips);
        double totalPrice = totalPriceBeers + totalPriceChips;

        double finalPrice = budget - totalPrice;

        if (totalPrice <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.",name,finalPrice);
        } else  {
            System.out.printf("%s needs %.2f more leva!",name, Math.abs(finalPrice));
        }



    }
}
