import java.util.Scanner;

public class Repaint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double Bags = Double.parseDouble(scanner.nextLine());
        double needPaint = Double.parseDouble(scanner.nextLine());
        double Thinner = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double priceBills;
        double allPrince;
        double Workers;

        double priceSaveBag = (Bags + 2) * 1.50;
        double pricePaint = (needPaint + needPaint * 0.10) * 14.50;
        double priceForPaintThinner = (Thinner * 5);
        double smallBags = 0.40;

        allPrince = priceSaveBag + pricePaint + priceForPaintThinner + smallBags;
        Workers = (allPrince * 0.3) * hours;
        priceBills = allPrince + Workers;
        System.out.println(priceBills);

    }
}