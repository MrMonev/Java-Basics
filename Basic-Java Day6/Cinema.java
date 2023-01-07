import java.util.Scanner;

public class Cinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double profit = 0.0;
        int seats = r * c;

        switch (projectionType) {
            case "Premiere":
                profit = 12.00 * seats;
                break;
            case "Normal":
                profit = 7.50 * seats;

                break;
            case "Discount":
                profit = 5.00 * seats;

                break;
        }

        System.out.printf("%.2f leva", profit);
    }
}
