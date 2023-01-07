import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String months = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;


        switch (months) {

                case "May":
                case "October":
                priceStudio = 50.0 * days;
                priceApartment = 65.0 * days;
                if (days > 7 && days <= 14) {
                  priceStudio *= 0.95;
                }
                if (days > 14) {
                    priceStudio *= 0.70;
                }
                if (days > 14) {
                    priceApartment *= 0.90;
                }
                break;
                    case "June":
                    case "September":
                priceStudio = 75.20 * days;
                priceApartment = 68.70 * days;

                    if (days > 14) {
                   priceStudio *= 0.80;
                }
                    if (days > 14) {
                        priceApartment *= 0.90;
                }
                break;
                    case "July":
                    case "August":
                priceStudio = 76.0 * days;
                priceApartment = 77.0 * days;

                    if (days > 14) {
                        priceApartment *= 0.90;
                }
                break;
        }
            System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.",Math.abs(priceApartment),Math.abs(priceStudio));
        }

    }


