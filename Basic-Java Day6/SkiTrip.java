import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int residence = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        double night = residence - 1;
        double price = 0.0;

        switch (roomType) {
            case "room for one person":
                price = night * 18;

                break;

            case "apartment":

                price = night * 25;
                if (night < 10) {
                    price *= 0.70;
                } else if (night <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.50;
                }
                break;
            case "president apartment":
                price = night * 35;

                if (night < 10) {
                    price *= 0.90;
                } else if (night <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.80;

                }
                break;
        }
        {if ("positive".equals(rating)) {
            price *= 1.25;

        } else if ("negative".equals(rating)) {
            price *= 0.90;
        }
        System.out.printf("%.2f", price);

        }
    }
    }

