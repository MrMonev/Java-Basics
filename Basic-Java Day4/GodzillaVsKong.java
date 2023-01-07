import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetFim = Double.parseDouble(scanner.nextLine());
        int  numberOfExtras = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());



        double decorMoney = budgetFim * 0.10;
        double price = priceClothing * numberOfExtras;

        if (numberOfExtras > 150) {
            price = price - price * 10 / 100;

        }
        price += decorMoney;

        if (price > budgetFim) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", price - budgetFim);
        } else {
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", budgetFim - price);
        }
    }
}