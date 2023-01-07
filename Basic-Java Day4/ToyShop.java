import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());


        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int mignon = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzle + talkingDoll + teddyBear + mignon + truck;

        double puzzlePrice = puzzle * 2.60;
        double dollsPrice = talkingDoll * 3;
        double teddyBearPrice = teddyBear * 4.10;
        double mignonPrice = mignon * 8.20;
        double truckPrice = truck * 2;

        double profit = puzzlePrice + dollsPrice + teddyBearPrice + mignonPrice + truckPrice;

        if (totalToys >= 50) {
            profit = profit - (profit * 0.25);
        }

        double totalProfit = profit - (profit * 0.10);
        if (totalProfit >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - holidayPrice);
        }else  {
            System.out.printf("Not enough money! %.2f lv needed.",holidayPrice - totalProfit);
        }
    }
}