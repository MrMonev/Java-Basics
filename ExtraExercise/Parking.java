import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double totalCharge = 0.0;
        double hoursCharge = 0.0;
        double dayCharge = 0.0;
        int hourCount = 0;

        for (int i = 1; i < totalDays; i++) {

            for (int j = 1; j <= totalDays; j++) {

                hourCount++;

                if (i % 2 == 0 && j % 2 != 0) {

                    hoursCharge = 2.50;

                } else if (i % 2 != 0 && j % 2 == 0) {

                    hoursCharge = 1.25;
                } else {

                    hoursCharge = 1;
                }
                totalCharge += hoursCharge;
                dayCharge += hoursCharge;


                if (hourCount == hours) {
                    System.out.printf("Day: %d - %.2f leva%n", i, dayCharge);
                    hourCount = 0;
                    dayCharge = 0;

                }
            }
        }
        System.out.printf("Total: %.2f leva", totalCharge);

    }
}
