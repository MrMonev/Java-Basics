import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statutPrice =  rent - (rent * 0.30);
        double KeteringPrice = statutPrice - (statutPrice * 0.15);
        double soundPrice = KeteringPrice / 2;

        double totalPrice = rent + statutPrice + KeteringPrice + soundPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
