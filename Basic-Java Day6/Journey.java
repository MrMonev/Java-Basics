import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double price = 0.0;

        boolean summer = "summer".equals(season);
        boolean winter = "winter".equals(season);

        if (budget <= 100) {
            destination = "Bulgaria";
            if (winter) {
                price = budget * 0.70;
            } else if (summer) {
                price = budget * 0.30;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
                if (winter) {
                    price = budget * 0.80;
                } else if (summer) {
                    price = budget * 0.40;
                }

        } else {
            destination = "Europe";
            price = budget * 0.90;
        }
        String type = winter || "Europe".equals(destination) ? "Hotel": "Camp";

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, price);
    }
}
