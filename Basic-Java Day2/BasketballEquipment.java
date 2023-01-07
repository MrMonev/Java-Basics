import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int priceTraining = Integer.parseInt(scanner.nextLine());
        double priceTrainers = priceTraining - 0.4 * priceTraining;
        double princeSuit = priceTrainers - 0.2 * priceTrainers;
        double priceBall = princeSuit / 4;
        double priceAcc = priceBall / 5;
        double expenses = priceTraining + priceTrainers + priceBall + princeSuit + priceAcc;

        System.out.println(expenses);
    }
}