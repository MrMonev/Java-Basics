import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double requiredAmount = Double.parseDouble(scanner.nextLine());
        double price;
        double discount = 0.18;
        double finalPrice;

        price = requiredAmount * 7.61;

        discount = discount * price;

        finalPrice = price - discount;

        System.out.println(finalPrice + " lv.");
        System.out.println(discount + " lv.");

    }
}