import java.util.Scanner;

public class Guests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int kozunak = 4;
        double Eg = 0.45;
        int people = 3;

        double totalKozunaks = guests / Math.ceil(people);

        int totalEg = guests * 2;
        double totalPriceKozunaks = Math.ceil(totalKozunaks) * kozunak;

        double totalPriceEg = totalEg * Eg;
        double totalPrice = totalPriceKozunaks + totalPriceEg;
        double finalPrice = totalPrice - budget;

        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %s Easter bread and %d eggs.%n", (int)Math.ceil(totalKozunaks), totalEg);
            System.out.printf("He has %.2f lv. left.",Math.abs(finalPrice));
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",(finalPrice));
        }

    }
}
