import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double brashnozaKg = Double.parseDouble(scanner.nextLine());
        double KgNaBrashnoto = Double.parseDouble(scanner.nextLine());
        double KgZahar = Double.parseDouble(scanner.nextLine());
        int KoriSqica = Integer.parseInt(scanner.nextLine());
        int Maq = Integer.parseInt(scanner.nextLine());

        double priceZahar = brashnozaKg * 0.75;
        double priceQica = brashnozaKg * 1.1;
        double priceMaq = priceZahar * 0.2;

        double totalPriceBrashno = brashnozaKg * KgNaBrashnoto;
        double totalPriceZahar = priceZahar * KgZahar;
        double totalPriceQica = priceQica * KoriSqica;
        double totalPriceMaq = priceMaq * Maq;

        double totalPrice = totalPriceBrashno + totalPriceZahar + totalPriceQica + totalPriceMaq;

        System.out.printf("%.2f",totalPrice);
    }
}
