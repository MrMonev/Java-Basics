import java.util.Scanner;

public class PaingEg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sizeEgs = scanner.nextLine();
        String paintEgs = scanner.nextLine();
        int totalBatch = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int totalPrice = 0;
        double  expenses = 0;

        switch (sizeEgs) {
            case "Large":
                if (paintEgs.equals("Red"))
                    price = 16;
                else if (paintEgs.equals("Green")) {
                    price = 12;
                } else if (paintEgs.equals("Yellow")) {
                    price = 9;
                }
                break;

            case "Medium":
                if (paintEgs.equals("Red"))
                    price = 13;
                else if (paintEgs.equals("Green")) {
                    price = 9;
                } else if (paintEgs.equals("Yellow")) {
                    price = 7;
                }
                break;

            case "Small":
                if (paintEgs.equals("Red"))
                    price = 9;
                else if (paintEgs.equals("Green")) {
                    price = 8;

                } else if (paintEgs.equals("Yellow")) {
                    price = 5;
                }
                break;
        }

        totalPrice = totalBatch * price;
        expenses = totalPrice * 0.35;
        double finalPrice = totalPrice - expenses;

        System.out.printf("%.2f leva.", expenses);

    }
}
