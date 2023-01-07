import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String month = scan.nextLine();
        double countDaysSpend = Double.parseDouble(scan.nextLine());
        double countPeopleInGroup = Double.parseDouble(scan.nextLine());
        String timeOfDay = scan.nextLine();

        double price = 0.0;
        double totalMoney = 0.0;

        switch (month) {

            case "march":
            case "may":
            case "april":
                if (timeOfDay.equals("day")) {

                    price = 10.50;
                } else if (timeOfDay.equals("night")) {
                    price = 8.40;
                }

                if (countPeopleInGroup >= 4) {
                    price = price * 0.90;
                }
                if (countDaysSpend >= 5) {
                    price = price * 0.50;

                }
                totalMoney = totalMoney + (price * countDaysSpend) * countPeopleInGroup;
                System.out.printf("Price per person for one hour: %.2f%n", price);
                System.out.printf("Total cost of the visit: %.2f%n", totalMoney);
                break;


            case "june":

            case "july":

            case "august":
                if (timeOfDay.equals("day")) {
                    price = 12.60;
                } else if (timeOfDay.equals("night")) {
                    price = 10.20;
                }

                if (countPeopleInGroup >= 4) {
                    price = price * 0.50;


                }
                if (countDaysSpend >= 5) {
                    price = price * 0.90;

                }

                totalMoney = totalMoney + (price * countDaysSpend) * countPeopleInGroup;

                System.out.printf("Price per person for one hour: %.2f%n", price);
                System.out.printf("Total cost of the visit: %.2f%n", totalMoney);

                break;


        }
    }
}
