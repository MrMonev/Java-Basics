import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (type) {
            case "Roses":
                price = 5.00 * n;
                if (n > 80) {
                    price *= 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80 * n;
                if (n > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * n;
                if (n > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00 * n;
                if (n < 120) {
                    price = (3.00 * 1.15) * n;
                }
                break;
            case "Gladiolus":
                price = 2.50 * n;
                if (n < 80) {
                    price = (2.50 * 1.20) * n;
                }
                break;
        }

        double diff = Math.abs(price - budget);

        if (price <= budget) {
            System.out.printf
                    ("Hey, you have a great garden with %d %s and %.2f leva left.", n, type, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",diff);
        }
    }
}
