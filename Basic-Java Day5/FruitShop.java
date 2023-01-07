import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());



        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        double totalPrice = 2.5 * quantity;
                        System.out.printf("%.2f", totalPrice);
                        break;

                        case "apple":
                            System.out.printf("%.2f", 1.2 * quantity);
                            break;

                        case "orange":
                            System.out.printf("%.2f", 0.85 * quantity);
                            break;

                        case "grapefruit":
                            System.out.printf("%.2f", 1.45 * quantity);
                            break;

                        case "kiwi":
                            System.out.printf("%.2f", 2.70 * quantity);
                            break;

                        case "pineapple":
                            System.out.printf("%.2f", 5.50 * quantity);
                            break;

                        case "grapes":
                            System.out.printf("%.2f", 3.85 * quantity);
                            break;
                    default:
                        System.out.println("error");

                }

                break;
            case "Saturday":
            case "Sunday":

                switch (fruit) {
                    case "banana":
                    double totalPrice = 2.70 * quantity;
                    System.out.printf("%.2f", totalPrice);
                    break;

                    case "apple":
                        System.out.printf("%.2f", 1.25 * quantity);
                        break;

                    case "orange":
                        System.out.printf("%.2f", 0.9 * quantity);
                        break;

                    case "grapefruit":
                        System.out.printf("%.2f", 1.6 * quantity);
                        break;

                    case "kiwi":
                        System.out.printf("%.2f", 3 * quantity);
                        break;

                    case "pineapple":
                        System.out.printf("%.2f", 5.60 * quantity);
                        break;

                    case "grapes":
                        System.out.printf("%.2f", 4.20 * quantity);
                        break;
                    default:
                        System.out.println("error");

                }


                break;
            default:
                System.out.println("error");
                break;
        }

    }
}
