import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double priceForOne = Double.parseDouble(scanner.nextLine());
        double budgetDesi = Double.parseDouble(scanner.nextLine());

        double totalPrice;
        double totalPrice1;



        if (guests >= 10 && guests <= 15) {
            priceForOne *= 0.85;
        } else if (guests >= 15 && guests <= 20) {
            priceForOne *= 0.80;
        } else if (guests > 20) {
            priceForOne *= 0.75;
        }
        double priceCake = budgetDesi * 0.10;

        totalPrice = guests * priceForOne + priceCake;
        totalPrice1 = totalPrice - budgetDesi;


     if (budgetDesi > totalPrice) {
         System.out.printf("It is party time! %.2f leva left.",Math.abs(totalPrice1));
     } else {
         System.out.printf("No party! %.2f leva needed.",Math.abs(totalPrice1));
     }


    }
}
