import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kuzinak = Integer.parseInt(scanner.nextLine());
        int koriZaQica = Integer.parseInt(scanner.nextLine());
        int kilogramiKurabii = Integer.parseInt(scanner.nextLine());

        double totalPriceKozunak;
        double totalPriceKoriZaQica;
        double totalPriceKurabii;
        double totalPriceBoq;
        double totalPrice;


        double priceKozuak = 3.20;
        double priceQica = 4.35;
        double priceKurabii = 5.40;
        double priceBoq = 0.15;

        totalPriceKozunak = kuzinak * priceKozuak;
        totalPriceKoriZaQica = koriZaQica * priceQica;
        totalPriceKurabii = kilogramiKurabii * priceKurabii;
        totalPriceBoq = koriZaQica * 12 * priceBoq;
        totalPrice = totalPriceKozunak + totalPriceKoriZaQica + totalPriceKurabii +totalPriceBoq;

        System.out.printf("%.2f",totalPrice);




    }
}
