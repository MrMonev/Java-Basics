import java.util.Scanner;
import java.util.function.DoubleFunction;

public class futball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTshirt = Double.parseDouble(scanner.nextLine());
        double totalWinBall = Double.parseDouble(scanner.nextLine());

        double shorts = 0.0;
        double socks = 0.0;
        double butons = 0.0;

        shorts = priceTshirt * 0.75;
        socks = shorts * 0.20;
        butons = (priceTshirt + shorts) * 2;
        double totalPrice = priceTshirt + shorts + socks + butons;

        double discount = totalPrice - (totalPrice * 0.15);
        double finalPrice = discount - totalWinBall;

        if (discount >= totalWinBall) {
            System.out.printf("Yes, he will earn the world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.", discount);

        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n");
            System.out.printf("He needs %.2f lv. more.",Math.abs(finalPrice));
        }
    }
}

