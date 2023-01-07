import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int littersPrep = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceLitterPrep = littersPrep * 1.20;

        double sum = priceMarkers + pricePens + priceLitterPrep;

        int x = 100;
        double result = sum - (sum * percent / x);

        System.out.println(result);


    }
}