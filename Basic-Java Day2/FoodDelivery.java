import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVeg = Integer.parseInt(scanner.nextLine());

        double priceChicken = countChicken * 10.35;
        double priceFish = countFish * 12.40;
        double priceVeg = countVeg * 8.15;
        double priceAllMenus = priceChicken + priceFish + priceVeg;

        double priceDessert = 0.2 * priceAllMenus;
        double priceDelivery = 2.50;

        double totalPrice = priceAllMenus + priceDessert + priceDelivery;
        System.out.print(totalPrice);




    }
}